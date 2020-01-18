package com.bawei.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.entity.Department;
import com.bawei.entity.Plan;
import com.bawei.mapper.PlanMapper;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Resource
	private PlanMapper mapper;

	@Override
	public void addPlan(List<Plan> planList) {
		// TODO 
		mapper.addPlan(planList);
	}

	@Override
	public List<Plan> list(Plan p) {
		// TODO 
		return mapper.list(p);
	}

	@Override
	public Plan show(Plan p) {
		// TODO 
		return mapper.show(p);
	}

	@Override
	public List<Department> dlist() {
		// TODO 
		return mapper.dlist();
	}

	@Override
	public void update(Plan p) {
		// TODO 
		mapper.update(p);
	}

	@Override
	public void delAll(Integer[] ids) {
		// TODO 
		mapper.delAll(ids);
	}




}
