package com.sbowler

class Doctor {

	String fullName
	String qualification 
	String position 
	String email
	String password
	int doctorOffice
	String doctorPhone
	String bio

	static hasOne = [surgery:Surgery]

	static hasMany = [prescriptions:Prescription, patients:Patient, nurses:Nurse, appointments:Appointment]

    static constraints = {

	fullName blank:false, nullable:false
	qualification blank:false, nullable:false
	position blank:false, nullable:false
	email blank:false, nullable:false, email:true
	password blank:false, nullable:false, minSize:7, password:true
	doctorOffice blank:false, nullable:false
	doctorPhone blank:false, nullable:false, maxSize:11
	bio blank:false, nullable:false 

    }
}
