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
import com.example.demo.layer2.model.Scheme;
import com.example.demo.layer4.MinistryService;
import com.example.demo.layer4.SchemeService;

@CrossOrigin
@RestController

public class SchemeController {

	@Autowired
	SchemeService schser;
	
	@RequestMapping(path="/getScheme")
	public List<Scheme> getAllScheme()
	{
		return schser.findAllSchemeService();
	}
	
	@RequestMapping(path="/getScheme/{id}")
	public Scheme getSchemeById(@PathVariable("id") int id)
	{
		return schser.findSchemeById(id);
	}
	
	@PostMapping
	@RequestMapping(path="/insertScheme")
	public void insertScheme(@RequestBody Scheme ref)
	{
         Scheme s=new Scheme();
         s.setSchemeName(ref.getSchemeName());
         s.setAmount(ref.getAmount());
         s.setLastDateToApply(ref.getLastDateToApply());
         s.setStudentapplications(ref.getStudentapplications());
         schser.insertScheme(s);
	}
	
	@PostMapping
	@RequestMapping(path="/updateScheme")
	public void updateScheme(@RequestBody Scheme ref)
	{
		schser.updateScheme(ref);
	}
	
	@PostMapping
	@RequestMapping(path="/deleteScheme")
	public void deleteScheme(@RequestBody Scheme ref)
	{
		schser.deleteScheme(ref.getSchemeId());
	}
	
	@RequestMapping(path="/getSchemeByName/{schemename}")
	public Scheme getSchemeByName(@PathVariable("schemename") String name)
	{
		return schser.getSchemeByName(name);
	}
}
