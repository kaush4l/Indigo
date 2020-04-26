package Indigo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IndigoApplication

fun main(args: Array<String>) {
	runApplication<IndigoApplication>(*args)
}
