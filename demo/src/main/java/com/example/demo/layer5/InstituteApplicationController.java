package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.model.Instituteapplication;
import com.example.demo.layer2.model.Ministry;
import com.example.demo.layer4.InstituteApplicationService;
import com.example.demo.layer4.MinistryService;

@CrossOrigin
@RestController

public class InstituteApplicationController {

	@Autowired
	InstituteApplicationService minser;
	
	@RequestMapping(path="/getInstituteApplication")
	public List<Instituteapplication> getAllInstituteApplication()
	{
		return minser.findAllInstituteapplicationService();
	}
	
	@RequestMapping(path="/getInstituteApplication/{id}")
	public Instituteapplication getInstituteApplicationById(@PathVariable("id") int id)
	{
		return minser.findInstituteapplicationById(id);
	}
	
	@PostMapping
	@RequestMapping(path="/insertInstituteapplication")
	public void insertInstituteapplication(@RequestBody Instituteapplication ref)
	{
		Instituteapplication i=new Instituteapplication();
		i.setAppliedDate(ref.getAppliedDate());
		i.setCity(ref.getCity());
		i.setDiseCode(ref.getDiseCode());
		i.setDistrict(ref.getDistrict());
		i.setInstituteName(ref.getInstituteName());
		i.setMinistryAcceptedDate(ref.getMinistryAcceptedDate());
		i.setPassword(ref.getPassword());
		i.setPinCode(ref.getPinCode());
		i.setPrincipal(ref.getPrincipal());
		i.setStateAcceptedDate(ref.getStateAcceptedDate());
		i.setStatenodalofficer(ref.getStatenodalofficer());
		i.setStatus(ref.getStatus());
		i.setStudents(ref.getStudents());
		i.setTelephone(ref.getTelephone());
		i.setUniversityName(ref.getUniversityName());
		minser.insertInstituteapplication(i);
	}
	
	@PostMapping
	@RequestMapping(path="/updateInstituteapplication")
	public void updateInstituteapplication(@RequestBody Instituteapplication ref)
	{
		minser.updateInstituteapplication(ref);
	}
	
	@PostMapping
	@RequestMapping(path="/deleteInstituteapplication")
	public void deleteInstituteapplication(@RequestBody Instituteapplication ref)
	{
		minser.deleteInstituteapplication(ref.getInstituteCode());
	}
	
	@RequestMapping(path="/findByempw/{email}/{password}")
	public Instituteapplication findBy(@PathVariable("email") int email,@PathVariable("password") String password )
	{
		return minser.findBy(email, password);
	}
	
	@RequestMapping(path="/findBycode/{email}")
	public Instituteapplication findBy(@PathVariable("email") int email )
	{
		return minser.findById(email);
	}
}
