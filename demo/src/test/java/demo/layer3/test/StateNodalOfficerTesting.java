package demo.layer3.test;



import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.demo.layer3.StateNodalOfficerRepoImpl;
import com.example.demo.layer2.model.*;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:springConfig.xml"})
public class StateNodalOfficerTesting {
     @Autowired
	StateNodalOfficerRepoImpl staterepo;
     
     @Test
     public void findAllStates()
     {
    	 List<Statenodalofficer> list=staterepo.selectAllStatenodalofficer();
    	 for(Statenodalofficer off :list)
    	 {
    		 System.out.println(off.getStateName());
    		 System.out.println(off.getOfficerName());
    		 System.out.println(off.getEmailId());
    		 System.out.println(off.getMobileNumber());
    		 System.out.println(off.getPassword());
    	 }
     }
     
     @Test
     public void findStateByName()
     {
    	 Statenodalofficer off=staterepo.selectStatenodalofficerByState("Telangana");
    	 System.out.println(off.getStateName());
		 System.out.println(off.getOfficerName());
		 System.out.println(off.getEmailId());
		 System.out.println(off.getMobileNumber());
		 System.out.println(off.getPassword());
	 
     }
     
     @Test
     public void updateState()
     {
    	 Statenodalofficer off=staterepo.selectStatenodalofficerByState("Telangana");
    	 off.setEmailId("rav@gmail.com");
    	 System.out.println("Value set");
    	 staterepo.updateStatenodalofficer(off);
    	 
     }
     
     @Test
     public void deleteState()
     {
    	 try
 		{
 			
 			staterepo.deleteStatenodalofficer("XYZ");;
 			System.out.println("Object deleetd");
 		}
 		catch(Exception e)
 		{
 			System.out.println(e.getMessage());
 		}
     }
}
