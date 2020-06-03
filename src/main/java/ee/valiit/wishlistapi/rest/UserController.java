package ee.valiit.wishlistapi.rest;

import ee.valiit.wishlistapi.dto.GenericResponseDto;
import ee.valiit.wishlistapi.dto.JwtRequestDto;
import ee.valiit.wishlistapi.dto.JwtResponseDto;
import ee.valiit.wishlistapi.dto.UserRegistrationDto;
import ee.valiit.wishlistapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public GenericResponseDto register(@RequestBody UserRegistrationDto userRegistration) {
        return userservice.register(userRegistration);
    }

    @PostMapping("/login")
    public JwtResponseDto login(@RequestBody JwtRequestDto request) throws Exception {
        return userservice.authenticate(request);
    }
}
