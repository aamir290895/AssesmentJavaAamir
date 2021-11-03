package com.example.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.layer2.Employee;
@Repository
public class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository{
	
	

	public EmployeeRepositoryImpl() {
			System.out.println("EmployeeRepositoryImpl ..");	
	}
	
    @Transactional
	public void insertEmployee(Employee eobj) {
		// TODO Auto-generated method stub
		super.persist(eobj); // invoking the dummy persist of the super class
		System.out.println("employee inserted...");
	}

	@Override
	public Employee selectEmployee(int eno) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRepositoryImpl : selecting employee by empNo");
		Employee emp = super.find(Employee.class, eno);
		
		return emp;
	}

	@Override
	public List<Employee> selectEmployes() {
		// TODO Auto-generated method stub
		List<Employee>  empList = new ArrayList<Employee>();
		
		System.out.println("EmployeeRepositoryImpl : Selecting all employees...");
		return super.findAll("Employee");
	
	}
    @Transactional
	@Override
	public void updateEmployee(Employee eObj) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeRepositoryImpl : Updating employee...");
		super.merge(eObj);
	}
    @Transactional
	@Override
	public void deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentRepositoryImpl : Deleting department");
		super.remove(Employee.class, eno);
	}

}
