package com.postix

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<PostixApplication>().with(TestcontainersConfiguration::class).run(*args)
}
