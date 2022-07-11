package com.movie.service.daoI;

import java.util.List;

import com.movie.service.entity.MovieEntity;

public interface MovieDaoI {
	
	String addMovie(MovieEntity movieEntity);
	
	String deleteMovie(MovieEntity movieEntity);

	String updateMovie(MovieEntity movieEntity);
	
	List<MovieEntity> getAllMovie();
}
