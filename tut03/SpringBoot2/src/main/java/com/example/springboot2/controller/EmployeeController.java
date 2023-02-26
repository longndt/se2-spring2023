package com.example.springboot2.controller;

import com.example.springboot2.model.Employee;
import com.example.springboot2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(value = "/list")
    public String getAllEmployee(Model model) {
        List<Employee> employees = employeeRepository.findAll();
        model.addAttribute("employees", employees);
        return "employeeList";
    }

    @RequestMapping(value = "/{id}")
    public String getEmployeeById(
            @PathVariable(value = "id") Long id, Model model) {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute("employee", employee);
        return "employeeDetail";
    }

    @RequestMapping(value = "/add")
    public String addEmployee (Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employeeAdd";
    }

    @RequestMapping (value = "/update/{id}")
    public String updateEmployee(
            @PathVariable (value = "id") Long id, Model model)  {
        Employee employee = employeeRepository.getById(id);
        model.addAttribute(employee);
        return "employeeUpdate";
    }

    @RequestMapping(value = "/save")
    public String saveUpdate(
            @RequestParam(value = "id", required = false) Long id, @Valid Employee employee, BindingResult result)
    {
        if (result.hasErrors()) {
            if (id == null) {
                return "employeeAdd";
            } else {
                return "employeeUpdate";
            }
        }
        employee.setId(id);
        employeeRepository.save(employee);
        return "redirect:/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteEmployee(
            @PathVariable(value = "id") Long id) {
        Employee employee = employeeRepository.getById(id);
        employeeRepository.delete(employee);
        return "redirect:/list";
    }
}
