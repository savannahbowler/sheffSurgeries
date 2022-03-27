package com.sbowler

class Appointment {

	Date appDate 
	String appTime
	int appDuration
	int roomNumber

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank: false, nullable: false
	appDuration blank:false, nullable: false, maxSize: 90
	roomNumber blank: false, nullable: false
    }
}
