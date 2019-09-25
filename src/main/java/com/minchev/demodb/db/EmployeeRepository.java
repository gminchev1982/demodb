package com.minchev.demodb.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    @Query(
            value = "SELECT * FROM employees e WHERE e.salary > ?1",
            nativeQuery = true)
    List<EmployeeEntity> findBySalary(Integer salary);

}
