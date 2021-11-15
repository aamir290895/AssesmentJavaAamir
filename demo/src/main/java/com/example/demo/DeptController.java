package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
	List<Dept> list=new ArrayList<Dept>();
	
	

	public DeptController() {
		super();
		
		list.add(new Dept(101,"Sales","New York"));
		list.add(new Dept(102,"Marketing","New York"));
		list.add(new Dept(103,"Sales","London"));
		
	}

	@RequestMapping(path="/greet")
	public String greetMessage()
	{
		return "Hello everyone";
	}
	
	@RequestMapping(path="/greet1")
	public String greeting1()
	{
		System.out.println("Hello greet1");
		return "Greeting1()";
	}
	
	@RequestMapping(path="/getDept/{dno}")
	public Dept getDepartment(@PathVariable("dno") int deptNumToFind)throws DeptNotFoundException
	{
		System.out.println("greeting2()");
		Dept dept=null;
		for(Dept d:list)
		{
			if(d.getDeptno()==deptNumToFind)
			{
				dept=d;
				break;
			}
		}
		if(dept==null)
			throw new DeptNotFoundException("Dept Not Found");
		return dept;
	}
	
	@RequestMapping(path="/getDepts")
	public List<Dept> getDepartments()
	{
		System.out.println("greeting3()");
		return list;
	}
	
	@RequestMapping(path="/addDept/{dno}/{dname}/{dloc}")
	public void addDept(@PathVariable("dno") int deptNum,@PathVariable("dname") String deptName,@PathVariable("dloc") String deptLoc)
	{
		list.add(new Dept(deptNum,deptName,deptLoc));
	}
	
	@RequestMapping(path="/addDept2")
	public void addDepartment2(@RequestBody Dept dept)
	{
		list.add(dept);
	}
	
	@RequestMapping(path="/updateDept")
	public void updateDepartment(@RequestBody Dept dept)throws DeptNotFoundException
	{
		boolean found=false;
		for(int i=0;i<list.size();i++)
		{
			Dept d=list.get(i);
			
			if(d.getDeptno()==dept.getDeptno())
			{
				list.set(i, dept);
				found=true;
				break;
			}
		}
		if(found==false)
			throw new DeptNotFoundException("Dept no found");
	}
	
	@RequestMapping(path="/deleteDept/{dno}")
	public void deleteDepartment(@PathVariable("dno") int deptNum)throws DeptNotFoundException
	{
		boolean found=false;
		for(int i=0;i<list.size();i++)
		{
			Dept d=list.get(i);
			
			if(d.getDeptno()==deptNum)
			{
				list.remove(i);
				found=true;
				break;
			}
		}
		if(found==false)
			throw new DeptNotFoundException("Dept no found");
		
	}
}
