package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.entity.Department;
import com.bawei.entity.Plan;
import com.bawei.service.PlanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class PlanController {
	
	@Resource
	private PlanService ss;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")int pageNum,Model model,Plan p) {
		PageHelper.startPage(pageNum, 10);
		List<Plan> list = ss.list(p);
		PageInfo<Plan> pageInfo = new PageInfo<Plan>(list);
		model.addAttribute("list", list);
		model.addAttribute("p", p);
		model.addAttribute("pg", pageInfo);
		return "list";
	}

	@RequestMapping("show")
	public String show(Model model,@ModelAttribute("p")Plan p) {
		Plan show = ss.show(p);
		List<Department> dlist = ss.dlist();
		Department department = new Department();
		show.setDname(department.getName());
		model.addAttribute("p", show);
		model.addAttribute("dlist", dlist);
		return "show";
	}
	
	@RequestMapping("update")
	public String update(Plan p) {
		ss.update(p);
		return "redirect:list";
	}
	
	@RequestMapping("delAll")
	public String delAll(Integer[] ids) {
		ss.delAll(ids);
		return "redirect:list";
	}
}
