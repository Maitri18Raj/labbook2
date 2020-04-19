package org.cap.controller;

import java.util.HashMap;
import java.util.Map;
import org.cap.entities.Trainee;
import org.cap.entities.User;
import org.cap.service.ITraineeService;
import org.cap.util.SessionDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;





@Controller
public class TraineeController {
	private ITraineeService traineeService;

	public ITraineeService getTraineeService() {
		return traineeService;
	}
	@Autowired
	public void setTraineeService(ITraineeService traineeService) {
		this.traineeService = traineeService;
	}
	@Autowired
	private SessionDetails sessionDetails;
	
	 @GetMapping("/")
	    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
	    public ModelAndView homePage() {
	        return new ModelAndView("homepage");
	    }
	 
	
	 @GetMapping("/add")
	    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
	    public ModelAndView addTrainee() {
		 int id=sessionDetails.getId();
	        if(id==-1){
	         return new ModelAndView("/login");
	        }
	        return new ModelAndView("addtrainee");
	    }
	 @GetMapping("/processadd")
	    public ModelAndView addTrainee(@RequestParam("traineeid") int traineeId,
	                                         @RequestParam("traineename") String traineeName,
	                                         @RequestParam("traineedomain") String traineeDomain,
	                                         @RequestParam("traineelocation") String traineeLocation) {
	        Trainee trainee = new Trainee(traineeId,traineeName,traineeDomain,traineeLocation);
	        getTraineeService().add(trainee);
	        return new ModelAndView("traineedetails",  "trainee", trainee);
	    }

	 
	 
	 
	    @GetMapping("/retrieve")
	    public ModelAndView retrieveTrainee() {
	    	 int id=sessionDetails.getId();
	         if(id==-1){
	          return new ModelAndView("/login");
	         }
	        return new ModelAndView("retrieve");
	    }
	    @GetMapping("/processretrieve")
	    public ModelAndView addingTrainee(@RequestParam("traineeid") int traineeId) {
	        Trainee trainee = getTraineeService().retrieve(traineeId);
	        return new ModelAndView("retrievedetails",  "trainee", trainee);
	    }
	    
	    
	    
	    
	    @GetMapping("/delete")
	    public ModelAndView deleteTrainee() {
	    	 int id=sessionDetails.getId();
	         if(id==-1){
	          return new ModelAndView("/login");
	         }
	        return new ModelAndView("delete");
	    }
	    @GetMapping("/processdelete")
	    public ModelAndView deleteTrainee(@RequestParam("traineeid") int traineeId) {
	        getTraineeService().delete(traineeId);
	        return new ModelAndView("deletedetails");
	    }
	    
	    
	    @GetMapping("/fetchall")
	    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
	    public ModelAndView fetchallTrainee() {
	    	 int id=sessionDetails.getId();
	         if(id==-1){
	          return new ModelAndView("/login");
	         }
	    	 Map<Integer,Trainee> store1=getTraineeService().fetchall();
	        return new ModelAndView("fetchall","fetch",store1);
	    }
	    
	    @GetMapping("/login")
	    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
	    public ModelAndView LogIn() {
	        return new ModelAndView("login");
	    }
	    @GetMapping("/processlogin")
	    public ModelAndView login(@RequestParam("userid")int id , @RequestParam("userpassword") String password){
	        //check id and password is correct
	    	User user1 = new User(id,"password");
	        boolean correct=traineeService.credentialsCorrect(id,password);
	        if(!correct){
	         return new ModelAndView("/login");
	        }
	        sessionDetails.setId(1);
	       User user=traineeService.findId(id);
	        ModelAndView modelAndView= new ModelAndView("operations",  "user", user);
	        return modelAndView;
	    }
	    @GetMapping("/logout")
	    public ModelAndView logout(){
	        sessionDetails.setId(-1);
	        return new ModelAndView("/login");
	    }
	    @GetMapping("/operations")
	    public ModelAndView operation(){
	    	int id=sessionDetails.getId();
	         if(id==-1){
	          return new ModelAndView("/login");
	         }
	        return new ModelAndView("/operations");
	    }
	    @GetMapping("/processregister")
	    public ModelAndView registerEmployee(@RequestParam("userid") String userName
	                                         ) {
	        String username = userName;
	       
	        return new ModelAndView("operations",  "user", userName);
	    }
	   
	    

	   
}
