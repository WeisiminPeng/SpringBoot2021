package com.practice.webrestfulcrud.controller;

import com.practice.webrestfulcrud.dao.DepartmentDao;
import com.practice.webrestfulcrud.dao.EmployeeDao;
import com.practice.webrestfulcrud.entities.Department;
import com.practice.webrestfulcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

//    list all the employees
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
//        put data into request content
        model.addAttribute("emps",employees);
//        defaults: thymeleaf will put path together
//        classpath:/templates/xxxxxxx.html
        return "emp/list";
    }

//    go to add employee page
    @GetMapping("/emp")
    public String toAddPage(Model model){
//        go to add page
//        get all the department, and show it on add web page
        Collection<Department> departments = departmentDao.getDepartments();

        model.addAttribute("depts",departments);
        return "emp/add";
    }

//    Spring Boot automatically binds request content to object attributes
//    it requires that the attributes name are the same
    @PostMapping("/emp")
    public String AddEmployee(Employee employee){
//        return to employee list
//        method1: redirect
//        method2: forward
//        differences?
//        System.out.println("employee info: " + employee);
//        save employee
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @GetMapping("/emp/{id}")
    public String toEditedPage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
//        go back to edit page
        return "emp/add";
    }

    @PutMapping("/emp")
    public String UpdateEmployee(Employee employee){
        System.out.println("Modify employee info: " + employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String DeleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
