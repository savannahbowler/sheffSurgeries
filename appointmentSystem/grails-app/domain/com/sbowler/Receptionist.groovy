package com.sbowler

class Receptionist {

	String recepName 
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	static belongsTo = [surgery:Surgery]

    static constraints = {

	recepName blank:false, nullable:false
	recepEmail blank:false, nullable:false, email:true
	recepUsername blank:false, nullable:false
	recepPassword blank:false, nullable:false, password:true
	recepPhone blank:false, nullable:false, maxSize:11
    }

}
