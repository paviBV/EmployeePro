package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String HomePage(Model model) {
		List<Employee> listEmployees = service.allEmployees();
		model.addAttribute("listEmployees",listEmployees);
		return "index";
	}
	
	@GetMapping("/new")
	public String showNewEmployeeForm(Model model){
		System.out.println("Hi new");
		Employee employee= new Employee();
		model.addAttribute("employee",employee);
		return "new_employee";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/";
	}
	
	@PutMapping("/saveUpdate")
	public String saveUpdateEmployee(@ModelAttribute("employee") Employee employee) {
		service.saveEmployee(employee);
		return "redirect:/";
	}
	
	@GetMapping("/update/{empId}")
	public ModelAndView showEditEmployeeForm(@PathVariable("empId") int empId) {
		ModelAndView mv = new ModelAndView();
		Employee employee = service.getEmployee(empId);
		mv.addObject("employee",employee);
		mv.setViewName("update_employee");
		return mv;
	}
	
	
//	@GetMapping("/update/{empId}")
//	public String showUpdateEmployeeForm(@PathVariable("empId") int empId, Model model) {
//		Employee employee = service.getEmployee(empId);
//		model.addAttribute("employee",employee);
//		return "update_employee";
//	}
	
	@GetMapping("/delete/{empId}")
	public String deleteEmployee(@PathVariable("empId") int empId) {
		service.deleteEmployee(empId);
		return "redirect:/";
	}


}
