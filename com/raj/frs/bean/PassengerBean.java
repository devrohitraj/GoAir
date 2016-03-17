
package com.raj.frs.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FRS_TBL_Passenger")
public class PassengerBean {
    @Id
	private String reservationID;

	private String name;

	private String gender;

	private String age;

	private int seatNo;

	
	public String getReservationID() {
		return reservationID;
	}

	
	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getGender() {
		return gender;
	}

	
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getAge() {
		return age;
	}

	
	public void setAge(String age) {
		this.age = age;
	}

	
	public int getSeatNo() {
		return seatNo;
	}

	
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	

}
