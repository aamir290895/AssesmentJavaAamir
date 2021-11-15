package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.*;

@Service
public interface StatenodalofficerService {
	List<Statenodalofficer> findAllStatenodalofficerService();
	Statenodalofficer findStatenodalofficerByName(String name);
    void insertStatenodalofficer(Statenodalofficer ref);
    void updateStatenodalofficer(Statenodalofficer ref);
    void deleteStatenodalofficer(String ref);
    Statenodalofficer getStateByempw(String email,String password);
    Statenodalofficer getStateByEmail(String email);
}
