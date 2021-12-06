#!/usr/bin/env	groovy

import groovy.json.*
def call(body){
	def mapvars = [:]
	body.resolveStrategy = Closure.DELEGATE_FIRST
	body.delegate = mapvars
	
	def var1 = mapvars.var1
	def var2 = mapvars.var2
	
	println(var1 + " ----------- " + var2)
}
