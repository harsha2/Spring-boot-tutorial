package com.springboot.Springboot.tutorial.service;

import com.springboot.Springboot.tutorial.entity.Department;
import com.springboot.Springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> getAllDepartments();

   public Department getDepartmentById(Long id) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long id);

   Department updateDepartment(Long departmentId, Department department);

   Department fetchDepartmentByName(String name);
}
