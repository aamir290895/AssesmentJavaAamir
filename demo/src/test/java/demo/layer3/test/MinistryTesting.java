package demo.layer3.test;
import com.example.demo.layer2.model.*;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.layer3.MinistryRepoImpl;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:springConfig.xml"})
public class MinistryTesting {

	@Autowired
	MinistryRepoImpl minrepo;
	
	@Test
	public void findAllRecords()
	{
		List<com.example.demo.layer2.model.Ministry> list=minrepo.selectAllMinistry();
		for(Ministry min:list)
		{
			System.out.println(min.getMinistryId());
			System.out.println(min.getOfficerName());
			System.out.println(min.getEmailId());
			System.out.println(min.getMobileNumber());
			System.out.println(min.getPassword());
		}
	}
	
	@Test
	public void addRecord()
	{
		Ministry m=new Ministry();
		m.setEmailId("santhu@gmail.com");
		m.setMobileNumber("9874561234");
		m.setOfficerName("Santhosh");
		m.setPassword("san156");
		minrepo.insertMinistry(m);
	}
	
	@Test
	public void findMinisterById()
	{
		Ministry min=minrepo.selectMinistryByMinistryId(1);
		System.out.println(min.getMinistryId());
		System.out.println(min.getOfficerName());
		System.out.println(min.getEmailId());
		System.out.println(min.getMobileNumber());
		System.out.println(min.getPassword());
	
	}
	
	@Test
	public void updateMinistry()
	{
		Ministry min=minrepo.selectMinistryByMinistryId(1);
		min.setOfficerName("Vijay");
		minrepo.updateMinistry(min);
	}
	
	@Test
	public void removeMinistry()
	{
		try
		{
			
			minrepo.deleteMinistry(61);;
			System.out.println("Object deleetd");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
