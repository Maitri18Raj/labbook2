package org.cap.service;

import org.cap.entities.Trainee;

public interface ITraineeService {
    Trainee findTraineeById(int id);

    void save(Trainee trainee);


}
