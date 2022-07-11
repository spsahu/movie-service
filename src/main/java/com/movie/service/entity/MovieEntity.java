package com.movie.service.entity;



@Entity
@Table(name = "tbl_movie", schema = "movie_details")
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer movieId;
	
	@Column
	private String movieName;
	
	@Column
	private Double runtime;
	
	@Column
	private String language;
	
	@Column
	private Integer runTimeDuration;
	
	@ManyToOne
	@JoinColumn(name="showId")
	private ShowEntity showEntity;

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
