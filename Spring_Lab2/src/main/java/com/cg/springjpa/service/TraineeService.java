package com.cg.springjpa.service;

import java.util.List;

import com.cg.springjpa.model.Trainee;


public interface TraineeService {
	public void create(Trainee trianee);

	public List<Trainee> reterive();

	public Trainee findById(int id);

	public void delete(int id);

	public void update(int id,String name,String domain,String location);

}