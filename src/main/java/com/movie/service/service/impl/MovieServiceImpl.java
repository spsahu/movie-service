package com.movie.service.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.service.daoI.MovieDaoI;
import com.movie.service.entity.MovieEntity;
import com.movie.service.model.MovieModel;
import com.movie.service.serviceI.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieDaoI movieDaoI;

	@Override
	public String addMovie(MovieModel movieModel) {

		MovieEntity entity = new MovieEntity();

		BeanUtils.copyProperties(movieModel, entity);

		return movieDaoI.addMovie(entity);
		
	}

	@Override
	public String deleteMovie(MovieModel movieModel) {

		MovieEntity entity = new MovieEntity();

		BeanUtils.copyProperties(movieModel, entity);
		
		return movieDaoI.deleteMovie(entity);

	}

	@Override
	public String updateMovie(MovieModel movieModel) {
		
		MovieEntity entity = new MovieEntity();

		BeanUtils.copyProperties(movieModel, entity);

		return movieDaoI.updateMovie(entity);
	}

	@Override
	public List<MovieModel> getAllMovie() {
		
		List<MovieEntity> allMovie = movieDaoI.getAllMovie();
		
		List<MovieModel> movieModelList = new ArrayList<>();
		
		MovieModel model = null;
		
		for(MovieEntity entity:allMovie) {
			
			model = new MovieModel();
			BeanUtils.copyProperties(entity, model);
			movieModelList.add(model);
			
		}
		
		if(!movieModelList.isEmpty()) {
			
			return movieModelList;
		}
		return null;
	}

}
