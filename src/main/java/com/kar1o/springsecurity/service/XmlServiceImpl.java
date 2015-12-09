package com.kar1o.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.kar1o.springsecurity.dao.XmlDao;
import com.kar1o.springsecurity.dao.XmlDaoImpl;
import com.kar1o.springsecurity.model.Xml;

@Service("xmlService")
@Transactional
public class XmlServiceImpl implements XmlService {

	@Autowired
	private XmlDao dao;

	public Xml findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void save(Xml xml) {
		dao.save(xml);

	}

	@Override
	public List<Xml> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
