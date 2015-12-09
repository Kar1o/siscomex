package com.kar1o.springsecurity.service;

import java.util.List;

import com.kar1o.springsecurity.model.Xml;

public interface XmlService {

	Xml findById(int id);

	List<Xml> findAll();
	
	void save(Xml xml);


}