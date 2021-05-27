package com.micronaut.rest

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.micronaut.rest")
		.start()
}

