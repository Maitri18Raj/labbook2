package org.cap.dao;

import java.util.HashMap;
import java.util.Map;
import org.cap.entities.Trainee;
import org.cap.entities.User;
import org.springframework.stereotype.Repository;
@Repository

public class TraineeDaoImpl implements ITraineeDao {
	 private Map<Integer,Trainee>store=new HashMap<>();
	 private Map<Integer,User> userStore = new HashMap<>();
	
	public TraineeDaoImpl() {
		Trainee trainee1 = new Trainee(10,"Vibhor","java","Bhopal");
		Trainee trainee2 = new Trainee(11,"VJ","Angular","pune");
		Trainee trainee3 = new Trainee(12,"kapoor","js","Bhopal");
		Trainee trainee4 = new Trainee(13,"Ritu","Spring","Bhopal");
		Trainee trainee5 = new Trainee(14,"Shreya","java","Bhopal");
		store.put(trainee1.getTraineeId(),trainee1);
		store.put(trainee2.getTraineeId(),trainee2);
		store.put(trainee3.getTraineeId(),trainee3);
		store.put(trainee4.getTraineeId(),trainee4);
		store.put(trainee5.getTraineeId(),trainee5);
		
		User user1=new User(1,"abcd");
		userStore.put(user1.getId(), user1);
	}
	
	
	 @Override
	public Trainee add(Trainee trainee) {
		 store.put(trainee.getTraineeId(),trainee);
	        return trainee;
	}

	@Override
	public void delete(int traineeId) {
		store.remove(traineeId);
		
	}

	@Override
	public Trainee modify(Trainee trainee) {
		return null;
	}

	@Override
	public Trainee retrieve(int traineeId) {
		Trainee trainee=store.get(traineeId);
		return trainee;
	}
	public Map<Integer, Trainee> fetchall() {
		
		return store;
	}
	
	@Override
    public boolean credentialsCorrect(int id, String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }
        User user1 = userStore.get(id);
        if (user1 == null) {
            return false;
        }
        return user1.getPassword().equals(password);
		
    }


	@Override
	public User findId(int id) {
		User user1=userStore.get(id);
		return user1;
	}
}
