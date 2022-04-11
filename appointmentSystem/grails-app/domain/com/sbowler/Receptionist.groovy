package com.sbowler

class Receptionist {

	String recepName 
	String recepEmail
	String username
	String password
	String recepPhone

	static belongsTo = [Surgery]
	static hasOne = [surgery:Surgery]

    static constraints = {

	recepName blank:false, nullable:false
	recepEmail blank:false, nullable:false, email:true
	username blank:false, nullable:false
	password blank:false, nullable:false, password:true
	recepPhone blank:false, nullable:false, maxSize:11
    }

}
