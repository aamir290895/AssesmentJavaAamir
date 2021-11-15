
package demo.layer3.test;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.layer3.InstituteApplicationRepo;
import com.example.demo.layer3.StudentApplicationRepo;
import com.example.demo.layer2.model.*;
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:springConfig.xml"})
public class StudentApplicationTesting {

	@Autowired
	StudentApplicationRepo stuapplrep;
	
	@Test
	public void addNewStudentApplication()
	{
		Studentapplication s=new Studentapplication();
		
		//insert into studentapplication values(1,1,11,'HINDU','SC','VINOD','SARALA',300000,'CSE',90,87,'NA','01-Oct-2021','ACCEPTED','03-Oct-2021','07-Oct-2021','10-Oct-2021');
	}
	
	@Test
	public void findAllStudentApplications()
	{
		List<Studentapplication> list=stuapplrep.selectAllStudentApplications();
		for(Studentapplication app:list)
		{
			System.out.println(app.getApplicationId());
			System.out.println(app.getStudent());
			System.out.println(app.getScheme());
		}
	}
	
	@Test
	public void findStudentApplicationById()
	{
		Studentapplication app=stuapplrep.selectStudentapplicationByApplicationId(1);
		System.out.println(app.getStudent());
		System.out.println(app.getScheme());
	}
	
	@Test
	public void updateStudentApplication()
	{
		Studentapplication app=stuapplrep.selectStudentapplicationByApplicationId(1);
		app.setReligion("Christian");
		stuapplrep.updateStudentApplication(app);
	}
	
	@Test
	public void deleteStudentApplication()
	{
		try
		{
			
			stuapplrep.deleteStudentApplication(5);;
			System.out.println("Object deleetd");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
