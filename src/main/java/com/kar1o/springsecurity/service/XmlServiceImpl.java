package com.kar1o.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
<<<<<<< HEAD

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.kar1o.springsecurity.dao.XmlDao;
import com.kar1o.springsecurity.dao.XmlDaoImpl;
=======
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import com.kar1o.springsecurity.dao.XmlDao;
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
import com.kar1o.springsecurity.model.Xml;

@Service("xmlService")
@Transactional
<<<<<<< HEAD
public class XmlServiceImpl implements XmlService {
=======
public class XmlServiceImpl implements XmlService{
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

	@Autowired
	private XmlDao dao;

	public Xml findById(int id) {
		return dao.findById(id);
	}

<<<<<<< HEAD
	@Override
	public void save(Xml xml) {
		dao.save(xml);

	}

	@Override
	public List<Xml> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
=======
	/*public Xml findByUser(String userName) {
	    return dao.findByUser(userName);
	}*/
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

}
