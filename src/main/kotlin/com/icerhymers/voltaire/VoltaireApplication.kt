package com.icerhymers.voltaire

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class VoltaireApplication

fun main(args: Array<String>) {
	runApplication<VoltaireApplication>(*args)
}
