package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.function.Consumer

@SpringBootApplication
class SpringCloudFunctionApplication {

	@Bean
	 fun kotlinConsumer(): (String) -> Unit {
		return {
			println(it.toUpperCase())
			}
	}

//	@Bean
//	fun kotlinConsumer(): Consumer<String> = Consumer {
//		println("hello :${it}")
//	}
//	@Bean
//	 fun transform(): (String) -> String {
//		return { "How are you ".plus(it) }
//	}
}

fun main(args:Array<String>) {
	runApplication<SpringCloudFunctionApplication>(*args)
}