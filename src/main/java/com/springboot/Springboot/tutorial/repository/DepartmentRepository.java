package com.springboot.Springboot.tutorial.repository;

import com.springboot.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Department findDepartmentByDepartmentId(Long id);
    Department findDepartmentByDepartmentName(String name);
}
