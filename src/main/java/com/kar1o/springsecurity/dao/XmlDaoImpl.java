package com.kar1o.springsecurity.dao;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.kar1o.springsecurity.model.User;
=======
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
import com.kar1o.springsecurity.model.Xml;

@Repository("xmlDao")
public class XmlDaoImpl extends AbstractDao<Integer, Xml> implements XmlDao {

	public Xml findById(int id) {
		return getByKey(id);
	}

<<<<<<< HEAD
	@Override
	public void save(Xml xml) {
		persist(xml);		
	}

	@Override
	public List<Xml> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
=======
	/*public Xml findByUser(String userName) {
	    return getByKey(userName);
	}*/

>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

}
