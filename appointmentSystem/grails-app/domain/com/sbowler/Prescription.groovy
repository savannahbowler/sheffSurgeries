package com.sbowler

class Prescription {

	String pharmacyName
	int prescripNumber 
	String medicine 
	float totalCost
	Date dateIssued
	boolean patientPaying 

	static belongsTo = [doctor:Doctor, patient:Patient]

    static constraints = {

	pharmacyName blank:false, nullable:false
	prescripNumber blank:false, nullable:false
	totalCost blank:false, nullable:false, scale:2
	dateIssued blank:false, nullable:false 
	patientPaying blank:false, nullable:false

    }
}
