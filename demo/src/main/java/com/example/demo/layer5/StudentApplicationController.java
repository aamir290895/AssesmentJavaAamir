package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.model.Studentapplication;
import com.example.demo.layer3.StudentApplicationRepo;
import com.example.demo.layer4.StudentApplicationService;

@CrossOrigin
@RestController
public class StudentApplicationController {
	@Autowired
     StudentApplicationService stuapplser; 
	
	
	@RequestMapping(path="/getStudentApplications")
	public List<Studentapplication> getAllApplication()
	{
		return stuapplser.findAllApplicationsService();
	}
	
	@RequestMapping(path="/getStudentApplication/{id}")
	public Studentapplication getStudentApplicationById(@PathVariable("id") int id)
	{
		return stuapplser.findStudentAppliccationById(id);
	}
	
	@PostMapping
	@RequestMapping(path="/insertStudentapplication")
	public void insertStudentapplication(@RequestBody Studentapplication ref)
	{
		Studentapplication st=new Studentapplication();
		st.setAppliedDate(ref.getAppliedDate());
		st.setCommunity(ref.getCommunity());
		st.setCourse(ref.getCourse());
		st.setDisablility(ref.getDisablility());
		st.setFatherName(ref.getFatherName());
		st.setIncome(ref.getIncome());
		st.setInstituteAcceptedDate(ref.getInstituteAcceptedDate());
		st.setMinistryAcceptedDate(ref.getMinistryAcceptedDate());
		st.setMotherName(ref.getMotherName());
		st.setReligion(ref.getReligion());
		st.setScheme(ref.getScheme());
		st.setStateAccepteDdate(ref.getStateAccepteDdate());
		st.setStatus(ref.getStatus());
		st.setStudent(ref.getStudent());
		st.setTenthPercentage(ref.getTenthPercentage());
		st.setTwelvthPercentage(ref.getTwelvthPercentage());
		stuapplser.insertStudentapplication(st);
	}
	
	@PostMapping
	@RequestMapping(path="/updateStudentapplication")
	public void updateStudentapplication(@RequestBody Studentapplication ref)
	{
		stuapplser.updateStudentapplication(ref);
	}
	
	@PostMapping
	@RequestMapping(path="/deleteStudentapplication")
	public void deleteStudentapplication(@RequestBody Studentapplication ref)
	{
		stuapplser.deleteStudentapplication(ref.getApplicationId());
	}
	
	
	
	
}
