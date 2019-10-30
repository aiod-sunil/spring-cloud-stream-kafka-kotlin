package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringCloudFunctionApplication {

	@Bean
	 fun kotlinConsumer(): (String) -> Unit {
		return { "sunil".toUpperCase() }
	}
}

fun main(args:Array<String>) {
	runApplication<SpringCloudFunctionApplication>(*args)
}