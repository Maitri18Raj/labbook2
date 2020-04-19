package org.cap.service;

import java.util.Map;

import org.cap.dao.ITraineeDao;
import org.cap.entities.Trainee;
import org.cap.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeServiceImpl implements ITraineeService {
	private ITraineeDao traineeDao;

	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}
	@Autowired
	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}
	@Override
	public Trainee add(Trainee trainee) {
		trainee = traineeDao.add(trainee);
		return trainee;
	}
	@Override
	public void delete(int traineeId) {
		traineeDao.delete(traineeId);
		
	}
	@Override
	public Trainee modify(Trainee trainee) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Trainee retrieve(int traineeId) {
		Trainee trainee = traineeDao.retrieve(traineeId);
		return trainee;
	}
	public Map<Integer, Trainee> fetchall() {
	 Map<Integer,Trainee>store=traineeDao.fetchall();
	 return store;
		
	}
	@Override
    public  boolean credentialsCorrect(int id, String password){
       boolean correct= traineeDao.credentialsCorrect(id,password);
       return correct;
    }
	@Override
	public User findId(int id) {
		User user1 = traineeDao.findId(id);
		return user1;
	}
}
