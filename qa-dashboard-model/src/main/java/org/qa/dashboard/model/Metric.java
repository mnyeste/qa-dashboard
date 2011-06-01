package org.qa.dashboard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity 
public class Metric {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String sonarId;
	private String sonarName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSonarId() {
		return sonarId;
	}
	public void setSonarId(String sonarId) {
		this.sonarId = sonarId;
	}
	public String getSonarName() {
		return sonarName;
	}
	public void setSonarName(String sonarName) {
		this.sonarName = sonarName;
	}
	
	
}
