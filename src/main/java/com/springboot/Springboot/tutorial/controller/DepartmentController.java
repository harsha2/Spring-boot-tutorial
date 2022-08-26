package com.springboot.Springboot.tutorial.controller;

import com.springboot.Springboot.tutorial.entity.Department;
import com.springboot.Springboot.tutorial.error.DepartmentNotFoundException;
import com.springboot.Springboot.tutorial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;//property based object creation

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
       return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long Id) throws DepartmentNotFoundException {
        return departmentService.getDepartmentById(Id);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long Id){
        departmentService.deleteDepartmentById(Id);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                      @Valid @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);

    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String name){
        return departmentService.fetchDepartmentByName(name);
    }
}
