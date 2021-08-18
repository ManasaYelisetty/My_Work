package com.sbdatajpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sbdatajpa.model.Employee;
//reduced boiler code
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("SELECT emp.designation  FROM Employee emp where emp.empId=:id")
	String getByDesignation(@Param("id") Integer id);
	
	/*@Query(value = "select * from  employeejpa  where emp_id=?0 and emp_desig=?1",
            nativeQuery=true
    )*/
	 @Query("from Employee  order by salary")
    List<Employee> sortBySalary();

	 @Query("from Employee  order by salary desc")
	    List<Employee> sortBySalaryDesc();
	 
	 @Query(" from Employee as e where e.empId=:id")
	    List<Employee> getNameById(@Param("id") Integer id);
	 
	 @Query(value="select e.emp_name from employeejpa as e where e.emp_id=:id",nativeQuery=true)
	    List<String> getName(@Param("id") Integer id);
	 
	 @Query(value="select * from employeejpa as e where e.emp_id=:id and e.salary=:salary",nativeQuery=true)
	    Employee getValues(@Param("id") Integer id,@Param("salary") float salary);
}
