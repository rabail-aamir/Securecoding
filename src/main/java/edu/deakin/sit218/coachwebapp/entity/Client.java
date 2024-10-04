package edu.deakin.sit218.coachwebapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user") 
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "iduser")
	protected int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Column(name = "username")
	protected String username;

	
	@Column(name = "password")
	protected String password;

	
	@Column(name = "age")
	protected int age;

	@Column(name = "workouts")
	protected int workouts = 0;

	public Client() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWorkouts() {
		return workouts;
	}

	public void setWorkouts(int workouts) {
		this.workouts = workouts;
	}
	
	@Override
	public String toString() {
		return "client = [name: "+getUsername()+", age: "+getAge()+
				", workouts: "+ getWorkouts()+"]";
	}

	public void addWorkout() {
		workouts++;
	}
}
