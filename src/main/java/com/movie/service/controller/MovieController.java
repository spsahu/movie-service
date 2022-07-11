package com.movie.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.service.model.MovieModel;
import com.movie.service.serviceI.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/addMovie")
	public ResponseEntity<String> addMovie(MovieModel movie) {
		String addMovie = movieService.addMovie(movie);
		if (addMovie != null) {
			return new ResponseEntity<String>(addMovie, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}
	
	@PostMapping("/deleteMovie")
	public ResponseEntity<String> deleteMovie(MovieModel movie){
		
		String deleteMovie = movieService.deleteMovie(movie);
		if (deleteMovie != null) {
			return new ResponseEntity<String>(deleteMovie, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
	}
	
	@PostMapping("/updateMovie")
	public ResponseEntity<String> updateMovie1(MovieModel movie){
		
		String updateMovie = movieService.updateMovie(movie);
		if (updateMovie != null) {
			return new ResponseEntity<String>(updateMovie, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
	}
	
	@GetMapping("/getAllMovie")
	public ResponseEntity<List<MovieModel>> getAllMovie(){
		
		List<MovieModel> allMovie = movieService.getAllMovie();
		if(allMovie != null) {
			return new ResponseEntity<List<MovieModel>>(allMovie, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
	}
	
	

}
