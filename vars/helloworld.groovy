#!/usr/bin/env	groovy

import groovy.json.*
def call(body){
	def mapVars = [:]
	body.resolveStrategy = Closure.DELEGATE_FIRST
	body.delegate = mapVars
	
	def var1 = mapvars.var1
	def var2 = mapvars.var2
	
	println(var1 + " ----------- " + var2)
}
