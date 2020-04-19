package org.cap.dao;

import org.cap.entities.Trainee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TraineeDaoImpl implements ITraineeDao {
    private Map<Integer, Trainee> store = new HashMap<>();

    @Override
    public Trainee findCustomerById(int id) {
        Trainee trainee = store.get(id);
        return trainee;
    }

    @Override
    public void save(Trainee trainee) {
        store.put(trainee.getTraineeId(), trainee);
    }
}
