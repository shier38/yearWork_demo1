package com.bawei.service;

import java.util.List;

import com.bawei.entity.Department;
import com.bawei.entity.Plan;

public interface PlanService {

	void addPlan(List<Plan> planList);

	List<Plan> list(Plan p);

	Plan show(Plan p);

	List<Department> dlist();

	void update(Plan p);

	void delAll(Integer[] ids);



}
