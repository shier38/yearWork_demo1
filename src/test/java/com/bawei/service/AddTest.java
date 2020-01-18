package com.bawei.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bawei.entity.Department;
import com.bawei.entity.Plan;
import com.bawei.utils.StreamUtil;
import com.bawei.utils.StringUtil;

@ContextConfiguration(locations="classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AddTest {

	@Resource
	private PlanService ss;
	
	@Test
	public void addtest() {
		List<Plan> PlanList = new ArrayList<Plan>();
		
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/demo1.txt"));
		for (int i = 1; i < list.size(); i++) {
			String[] s = list.get(i).split("\\==");
			Plan plan = new Plan();
			Department department = new Department();
			
			if(StringUtil.hasText(s[0])) {
				plan.setName(s[0]);
			}
			if(StringUtil.hasText(s[1])) {
				plan.setAmount(s[1]);
			}
			if(StringUtil.hasText(s[2])) {
				plan.setContent(s[2]);
			}
			if(StringUtil.hasText(s[3])) {
				plan.setManager(s[3]);
			}
			if(StringUtil.hasText(s[4])) {
				if(s[4].toString()==department.getName()) {
					plan.setDept_id(department.getId());
				}
			}
			PlanList.add(plan);
		}
		ss.addPlan(PlanList);
	}
}
