package com.sbowler

class Appointment {

	Date appDate 
	String appTime
	int appDuration
	int roomNumber
	static hasOne = [patient:Patient] 
	static belongsTo = [Surgery] [doctor:Doctor]
	static hasMany = [surgeries:Surgery]

    static constraints = {
	appDate blank: false, nullable: false
	appTime blank: false, nullable: false
	appDuration blank:false, nullable: false, maxSize: 90
	roomNumber blank: false, nullable: false
    }
}
