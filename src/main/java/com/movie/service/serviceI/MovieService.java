package com.movie.service.serviceI;

import java.util.List;

import com.movie.service.model.MovieModel;

public interface MovieService {

	String addMovie(MovieModel movieModel);

	String deleteMovie(MovieModel movieModel);

	String updateMovie(MovieModel movieModel);

	List<MovieModel> getAllMovie();

}
