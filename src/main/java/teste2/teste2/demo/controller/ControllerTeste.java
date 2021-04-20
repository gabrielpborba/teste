package teste2.teste2.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTeste {

    @GetMapping
    private ResponseEntity<String> teste() {
        return ResponseEntity.ok("teste");
    }
}
