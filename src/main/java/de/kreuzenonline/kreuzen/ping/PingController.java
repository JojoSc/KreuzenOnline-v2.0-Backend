package de.kreuzenonline.kreuzen.ping;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PingController {

    @GetMapping("/ping")
    public ResponseEntity<String> pingEndpoint() {
        return ResponseEntity.ok("pong");
    }
}
