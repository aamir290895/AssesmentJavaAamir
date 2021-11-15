package com.example.demo.layer3;
import com.example.demo.layer2.model.*;
import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public interface StateNodalOfficerRepo {
	void insertStatenodalofficer(Statenodalofficer ref);
	Statenodalofficer selectStatenodalofficerByState(String Statename);
	List<Statenodalofficer> selectAllStatenodalofficer();
	void updateStatenodalofficer(Statenodalofficer ref);
	void deleteStatenodalofficer(String Statename);
    Statenodalofficer findStateByempw(String email,String password);
    Statenodalofficer findStateByEmail(String email);
}
