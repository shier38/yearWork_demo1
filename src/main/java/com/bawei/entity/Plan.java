package com.bawei.entity;
/**
 *投资计划表 
 * @author 十二
 */
public class Plan {

	Integer id;
	String name;
	String amount;
	String manager;
	String content;
	Integer dept_id;
	String dname;
	
	
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(Integer id, String name, String amount, String manager, String content, Integer dept_id) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.manager = manager;
		this.content = content;
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", amount=" + amount + ", manager=" + manager + ", content="
				+ content + ", dept_id=" + dept_id + "]";
	}
	
	
	
	
	
}
