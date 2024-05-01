package jp.eightbit.exam.UserEntity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_data")
public class UserEntity {
	
	@Id
	@Column(name = "id")
	private int id;

	@NotNull
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "email")
	private String email;

	@NotNull
	@Column(name = "password")
	private String password;
	
	@Column(name = "num_of_play")
	private int numOfPlay;
	
	@Column(name = "total")
	private int total;

	@Column(name = "shortest_clear")
	private int shortestClear;

	@Column(name = "longest_clear")
	private int longestClear;

	@Column(name = "last_play")
	private String lastPlay;
	
	@Column(name = "num_of_clear")
	private int numOfClear;
	
	@Column(name = "average")
	private String average;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getNumOfPlay() {
		return numOfPlay;
	}

	public void setNumOfPlay(int numOfPlay) {
		this.numOfPlay = numOfPlay;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getShortestClear() {
		return shortestClear;
	}

	public void setShortestClear(int shortestClear) {
		this.shortestClear = shortestClear;
	}

	public int getLongestClear() {
		return longestClear;
	}

	public void setLongestClear(int longestClear) {
		this.longestClear = longestClear;
	}

	public String getLastPlay() {
		return lastPlay;
	}

	public void setLastPlay(String lastPlay) {
		this.lastPlay = lastPlay;
	}

	public int getNumOfClear() {
		return numOfClear;
	}

	public void setNumOfClear(int numOfClear) {
		this.numOfClear = numOfClear;
	}

	public String getAverage() {
		return average;
	}

	public void setAverage(String average) {
		this.average = average;
	}
	
}
