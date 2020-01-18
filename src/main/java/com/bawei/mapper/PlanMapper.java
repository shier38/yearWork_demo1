package com.bawei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bawei.entity.Department;
import com.bawei.entity.Plan;

public interface PlanMapper {


	void addPlan(List<Plan> planList);

	List<Plan> list(Plan p);

	@Select("select p.*,d.name dname from zhunneng_2019plan p\r\n" + 
			"		LEFT JOIN zhunneng_department d on p.dept_id=d.id where p.id=#{id} group by p.id")
	Plan show(Plan p);

	@Select("select * from zhunneng_department ")
	List<Department> dlist();

	@Update("update zhunneng_2019plan  set name=#{name},amount=#{amount},manager=#{manager},content=#{content},dept_id=#{dept_id} where id=#{id}")
	void update(Plan p);

	void delAll(Integer[] ids);


}
