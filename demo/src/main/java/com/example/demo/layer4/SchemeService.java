package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.model.Scheme;

@Service
public interface SchemeService {
 
	List<Scheme> findAllSchemeService();
	Scheme findSchemeById(int id);
   void insertScheme(Scheme ref);
   void updateScheme(Scheme ref);
   void deleteScheme(int ref);
   Scheme getSchemeByName(String name);
}
