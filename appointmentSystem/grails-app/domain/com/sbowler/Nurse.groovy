package com.sbowler

class Nurse {

	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	String nursePhone

    static constraints = {
	nurseName blank: false, nullable: false
	qualifications blank: false, nullable: false
	nurseEmail blank: false, nullable: false, email: true
	nurseOffice blank: false, nullable: false
	nursePhone blank: false, nullable: false, maxSize: 11
    }
}
