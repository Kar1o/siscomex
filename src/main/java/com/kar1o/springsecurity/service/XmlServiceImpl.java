package com.kar1o.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import com.kar1o.springsecurity.dao.XmlDao;
import com.kar1o.springsecurity.model.Xml;

@Service("xmlService")
@Transactional
public class XmlServiceImpl implements XmlService{

	@Autowired
	private XmlDao dao;

	public Xml findById(int id) {
		return dao.findById(id);
	}

	/*public Xml findByUser(String userName) {
	    return dao.findByUser(userName);
	}*/

}
