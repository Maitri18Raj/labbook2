package com.capg.app.dao;

import com.capg.app.entities.Employee;

public interface IEmployeeDao
{
	Employee fetchById(int id);
}
