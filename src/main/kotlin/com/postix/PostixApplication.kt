package com.postix

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PostixApplication

fun main(args: Array<String>) {
	runApplication<PostixApplication>(*args)
}
