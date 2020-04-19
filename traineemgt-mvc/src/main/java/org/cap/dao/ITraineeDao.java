package org.cap.dao;

import org.cap.entities.Trainee;

public interface ITraineeDao {

    Trainee findTraineeById(int id);

    void save(Trainee trainee);


}
