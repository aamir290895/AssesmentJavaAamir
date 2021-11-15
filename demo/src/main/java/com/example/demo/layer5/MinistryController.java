package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.model.Ministry;
import com.example.demo.layer2.model.Statenodalofficer;
import com.example.demo.layer4.MinistryService;

@CrossOrigin
@RestController
public class MinistryController {

	@Autowired
	MinistryService minser;
	
	@RequestMapping(path="/getMinistry")
	public List<Ministry> getAllStatenodalofficer()
	{
		return minser.findAllMinistryService();
	}
	
	@RequestMapping(path="/getMinistry/{id}")
	public Ministry getMinistryById(@PathVariable("id") int id)
	{
		return minser.findMinistryById(id);
	}
	
	@PostMapping
	@RequestMapping(path="/addMinistry")
	public void addMinistry(@RequestBody Ministry ministry)
	{
		Ministry newMinistry=new Ministry();
		newMinistry.setOfficerName(ministry.getOfficerName());
		newMinistry.setEmailId(ministry.getEmailId());
		newMinistry.setMobileNumber(ministry.getMobileNumber());
		newMinistry.setPassword(ministry.getPassword());
		minser.insertMinistry(newMinistry);
	}
	
	@PostMapping
	@RequestMapping(path="/updateMinistry")
	public void updateMinistry(@RequestBody Ministry ministry)
	{
		minser.updateMinistry(ministry);
	}
	
	@PostMapping
	@RequestMapping(path="/deleteMinistry")
	public void deleteMinistry(@RequestBody Ministry ministry)
	{
		minser.deleteMinistry(ministry.getMinistryId());
	}
	
	@RequestMapping(path="/findMinistryByempw/{email}/{password}")
	public Ministry findMinistryByempw(@PathVariable("email") String email,@PathVariable("password") String password)
	{
		return minser.findMinistryByempw(email, password);
	}
	
	@RequestMapping(path="/findMinistryByEmail/{email}")
	public Ministry findMinistryByEmail(@PathVariable("email") String email)
	{
		return minser.findMinistryEmail(email);
	}
}
