package com.movie.service.daoI.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.movie.service.daoI.MovieDaoI;
import com.movie.service.entity.MovieEntity;

@Repository
public class MovieDaoImpl implements MovieDaoI{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addMovie(MovieEntity movieEntity) {
		
		Session session = null;

		Transaction transaction = null;
		
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			if (!transaction.isActive()) {
				transaction.begin();
			}
			Integer	save =(Integer) session.save(movieEntity);
			
			if(save != null) {
				return "Movie Successfully added";
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
			return null;
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return null;
		
	}

	@Override
	public String deleteMovie(MovieEntity movieEntity) {

		try {
		Session session = sessionFactory.openSession();
		session.delete(movieEntity);
		}catch (Exception e) {
			return null;
		}
		return "Deleted Successfully";
	}

	@Override
	public String updateMovie(MovieEntity movieEntity) {

		try {
			Session session = sessionFactory.openSession();
			session.saveOrUpdate(movieEntity);
			}catch (Exception e) {
				return null;
			}
		return "Movie updated Successfully";
	}

	@Override
	public List<MovieEntity> getAllMovie() {

		List<MovieEntity> movieEntityList = null;
		try {
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from MovieEntity");
			movieEntityList = query.list();
			
			if(movieEntityList!= null && !movieEntityList.isEmpty()) {
				return movieEntityList;
			}
			}catch (Exception e) {
				return null;
			}
		
		return null;
	}

}
