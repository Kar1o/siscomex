package com.kar1o.springsecurity.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.kar1o.springsecurity.model.User;
import com.kar1o.springsecurity.model.Xml;

@Repository("xmlDao")
public class XmlDaoImpl extends AbstractDao<Integer, Xml> implements XmlDao {

	public Xml findById(int id) {
		return getByKey(id);
	}

	@Override
	public void save(Xml xml) {
		persist(xml);		
	}

	@Override
	public List<Xml> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
