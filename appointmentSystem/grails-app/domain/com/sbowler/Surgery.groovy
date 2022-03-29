package com.sbowler

class Surgery {
	
	String name 
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime

	static hasMany = [receptionists:Receptionist, doctors:Doctor, nurses:Nurse, patients:Patient, appointments:Appointment]


    static constraints = {

	name blank:false, nullable:false
	address blank:false, nullable:false
	postcode blank:false, nullable:false, minSize:5, maxSize:7
	telephone blank:false, nullable:false, maxSize:11
	numberOfPatients blank:false, nullable:false, maxSize:100
	description blank:false, nullable:false
	openingTime blank:false, nullable:false 


    }
}
