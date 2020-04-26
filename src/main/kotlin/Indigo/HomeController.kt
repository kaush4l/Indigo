package Indigo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreeterController {

    @GetMapping("/")
    fun home() = ResponseEntity.ok("Hello Docker World!!!")
}