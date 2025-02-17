package org.esdpracticals.academicerp.Controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.esdpracticals.academicerp.dto.LoginRequest;
import org.esdpracticals.academicerp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> loginCustomer(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(loginService.loginUser(request));

    }
}
