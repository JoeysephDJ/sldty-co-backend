package co.sldty.backend.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["*"], maxAge = 3600)
@RestController
class HomeController {

    @GetMapping("/")
    fun home(): ResponseEntity<String> {
        return ResponseEntity.ok("hi justin")
    }

    @GetMapping("/huah")
    fun HUAH(): ResponseEntity<String> {
        return ResponseEntity.ok("bruh")
    }

}