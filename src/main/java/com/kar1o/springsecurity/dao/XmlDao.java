package com.kar1o.springsecurity.dao;

import java.util.List;

import com.kar1o.springsecurity.model.Xml;

public interface XmlDao {

	Xml findById(int id);

	List<Xml> findAll();

	void save(Xml xml);

}
