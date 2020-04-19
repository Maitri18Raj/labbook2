package org.cap.service;

import org.cap.dao.ITraineeDao;
import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements ITraineeService{
    private ITraineeDao traineeDao;

    public ITraineeDao getTraineeDao(){
        return traineeDao;
    }

    @Autowired
    public void setCustomerDao(ITraineeDao dao){
        this.traineeDao=dao;
    }

    @Override
    public Trainee findTraineeById(int id) {
        Trainee trainee= traineeDao.findTraineeById(id);
        return trainee;
    }

    @Override
    public void save(Trainee trainee) {
        traineeDao.save(trainee);
    }
}
