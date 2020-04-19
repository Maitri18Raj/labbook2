package org.cap.controller;

import org.cap.entities.Trainee;
import org.cap.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TraineeController {

    @Autowired
    private ITraineeService service;

    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView("registertrainee");
        return mv;
    }

    @GetMapping("processregister")
    public ModelAndView processRegister(@RequestParam("traineeid")int id,
                                        @RequestParam("traineename") String taineename){
        Trainee trainee=new Trainee();
        trainee.setTraineeId(id);
        trainee.setTraineeName(taineename);
        service.save(trainee);
        ModelAndView mv=new ModelAndView("details","trainee",trainee);
        return mv;
    }

    @GetMapping("/gettrainee")
    public ModelAndView findTraineeById(){
       ModelAndView mv=new ModelAndView("gettrainee");
       return mv;
    }

    @GetMapping("/processfindtrainee")
    public ModelAndView processFindTrainee(@RequestParam("traineeid")int id){
       Trainee trainee= service.findTraineeById(id);
       ModelAndView mv=new ModelAndView("details","trainee",trainee);
       return mv;
    }

}
