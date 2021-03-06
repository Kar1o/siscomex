package com.kar1o.springsecurity.dao;

import java.io.Serializable;

import java.lang.reflect.ParameterizedType;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

<<<<<<< HEAD
import com.kar1o.springsecurity.model.Xml;

=======
>>>>>>> 4bfc8b899b399f5e7e5b9248caf37f9b5edf7439
public abstract class AbstractDao<PK extends Serializable, T> {

	private final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) {
		getSession().persist(entity);
	}

	public void delete(T entity) {
		getSession().delete(entity);
	}

	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(persistentClass);
	}

}
