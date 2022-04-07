package com.sbowler

class Patient {

	String patientName 
	String patientAddress
	String patientResidence
	Date patientDob 
	String patientID
	Date dateRegistered 
	String patientPhone
	
	static belongTo = [Doctor, Surgery, Appointment]
	static hasMany = [doctors:Doctor, surgeries:Surgery, prescriptions:Prescription, appointments:Appointment]

    static constraints = {

	patientName blank:false, nullable:false
	patientAddress blank:false, nullable:false 
	patientResidence blank:false, nullable:false 
	patientDob blank:false, nullable:false
	patientID blank:false, nullable:false
	dateRegistered blank:false, nullable:false 
	patientPhone blank:false, nullable:false, maxSize:11
    }
}
