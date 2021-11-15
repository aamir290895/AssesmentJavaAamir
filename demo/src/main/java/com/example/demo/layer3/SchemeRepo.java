package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.model.*;

@Repository
public interface SchemeRepo {
	void insertScheme(Scheme ref);
	Scheme selectSchemeBySchemeId(int SchemeId);
	List<Scheme> selectAllScheme();
	void updateScheme(Scheme ref);
	void deleteScheme(int SchemeId);
    Scheme getSchemeByName(String name);
}
