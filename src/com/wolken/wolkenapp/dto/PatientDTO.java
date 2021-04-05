package com.wolken.wolkenapp.dto;

public class PatientDTO {
	private String name;
	private int patientId;
	private int cost;
	private String doctorName;
	
	public PatientDTO(String name, int patientId, int cost, String doctorName){ // Constructor
		this.name=name;
		this.patientId=patientId;
		this.cost=cost;
		this.doctorName=doctorName;
		
	}
    
	public String getName() { // getters
		return name;
	}
	
	@Override
	public String toString() {
		return "PatientDTO [name=" + name + ", patientId=" + patientId + ", cost=" + cost + ", doctorName=" + doctorName
				+ "]";
	}

	public void setName(String name){ //setters
		this.name = name;
	}
	
	 public int getPatientId() {
		 return patientId;
	 }
	 
	 public void setPatientId(int patientId) {
		 this.patientId = patientId;
	 }
	 
	 
	 
	public String getDoctorName() {
		return doctorName;
	}
	 
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getCost() {
		 return cost;
	 }
	 
	 public void setCost(int cost) {
		 this.cost = cost;
	 }
}
