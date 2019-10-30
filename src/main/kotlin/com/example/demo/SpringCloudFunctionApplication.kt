package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SpringCloudFunctionApplication {

	@Bean
	 fun kotlinConsumer(): (String) -> Unit {
		return {
			println(it.toUpperCase())
			}
	}
//	@Bean
//	 fun transform(): (String) -> String {
//		return { "How are you ".plus(it) }
//	}
}

fun main(args:Array<String>) {
	runApplication<SpringCloudFunctionApplication>(*args)
}