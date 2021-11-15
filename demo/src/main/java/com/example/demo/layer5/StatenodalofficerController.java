package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.model.Statenodalofficer;
import com.example.demo.layer2.model.Studentapplication;
import com.example.demo.layer4.StatenodalofficerService;

@CrossOrigin
@RestController
public class StatenodalofficerController {
	@Autowired
   StatenodalofficerService stateser;
	
	@RequestMapping(path="/getStatenodalofficer")
	public List<Statenodalofficer> getAllStatenodalofficer()
	{
		return stateser.findAllStatenodalofficerService();
	}
	
	@RequestMapping(path="/getStatenodalofficer/{id}")
	public Statenodalofficer getStatenodalofficerByName(@PathVariable("id") String name)
	{
		return stateser.findStatenodalofficerByName(name);
	}
	
	@PostMapping
	@RequestMapping(path="/insertStatenodalofficer")
	public void insertStatenodalofficer(@RequestBody Statenodalofficer ref)
	{
		Statenodalofficer st=new Statenodalofficer();
		st.setStateName(ref.getStateName());
		st.setOfficerName(ref.getOfficerName());
		st.setPassword(ref.getPassword());
		st.setEmailId(ref.getEmailId());
		st.setMobileNumber(ref.getMobileNumber());
		st.setInstituteapplications(ref.getInstituteapplications());
		stateser.insertStatenodalofficer(st);
	}
	
	@PostMapping
	@RequestMapping(path="/updateStatenodalofficer")
	public void updateStatenodalofficer(@RequestBody Statenodalofficer ref)
	{
		stateser.updateStatenodalofficer(ref);
	}
	
	@PostMapping
	@RequestMapping(path="/deleteStatenodalofficer")
	public void deleteStatenodalofficer(@RequestBody Statenodalofficer ref)
	{
		stateser.deleteStatenodalofficer(ref.getStateName());
	}
	
	@RequestMapping(path="/findByStateempw/{email}/{password}")
	public Statenodalofficer getStatebyEmPw(@PathVariable("email") String email,@PathVariable("password") String password)
	{
		return stateser.getStateByempw(email, password);
	}
	
	@RequestMapping(path="/findByStateempw/{email}")
	public Statenodalofficer getStatebyEmail(@PathVariable("email") String email)
	{
		return stateser.getStateByEmail(email);
	}
	
	
}
