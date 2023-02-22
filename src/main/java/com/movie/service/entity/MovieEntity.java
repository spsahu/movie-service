package com.movie.service.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name = "tbl_movie", schema = "movie_details")
@Entity
public class MovieEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;

	@Column
	private String moviename;

	@Column
	private Double runtime;

	@Column
	private String language;

	@Column
	private Integer runTimeDuration;

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

	

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
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
