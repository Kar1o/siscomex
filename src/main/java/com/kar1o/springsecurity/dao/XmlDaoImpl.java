package com.kar1o.springsecurity.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.kar1o.springsecurity.model.Xml;

@Repository("xmlDao")
public class XmlDaoImpl extends AbstractDao<Integer, Xml> implements XmlDao {

	public Xml findById(int id) {
		return getByKey(id);
	}

	/*public Xml findByUser(String userName) {
	    return getByKey(userName);
	}*/


}
