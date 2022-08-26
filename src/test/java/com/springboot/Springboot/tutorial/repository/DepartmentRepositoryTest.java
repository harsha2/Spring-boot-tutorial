package com.springboot.Springboot.tutorial.repository;

import com.springboot.Springboot.tutorial.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    public DepartmentRepository departmentRepository;

    @Autowired
    public TestEntityManager testEntityManager;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("Computer Science")
                        .departmentCode("CS-009")
                        .departmentAddress("Kerala")
                        .build();
        testEntityManager.persist(department);
    }

    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRepository.findDepartmentByDepartmentId(1L);
        assertEquals(department.getDepartmentName(),"Computer Science");
    }
}