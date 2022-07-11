package com.movie.service.model;

public class MovieModel {

	private Integer movieId;
	
	private String movieName;
	
	private Double runtime;
	
	private String language;
	
	private Integer runTimeDuration;
	

	public enum Genre {
		THIRLLER, HORROR, COMEDY
	}


	/**
	 * @return the movieId
	 */
	public Integer getMovieId() {
		return movieId;
	}


	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}


	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}


	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	/**
	 * @return the runtime
	 */
	public Double getRuntime() {
		return runtime;
	}


	/**
	 * @param runtime the runtime to set
	 */
	public void setRuntime(Double runtime) {
		this.runtime = runtime;
	}


	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}


	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}


	/**
	 * @return the runTimeDuration
	 */
	public Integer getRunTimeDuration() {
		return runTimeDuration;
	}


	/**
	 * @param runTimeDuration the runTimeDuration to set
	 */
	public void setRunTimeDuration(Integer runTimeDuration) {
		this.runTimeDuration = runTimeDuration;
	}

	
	
}
