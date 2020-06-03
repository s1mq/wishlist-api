package ee.valiit.wishlistapi.service;

import ee.valiit.wishlistapi.dto.GenericResponseDto;
import ee.valiit.wishlistapi.dto.JwtRequestDto;
import ee.valiit.wishlistapi.dto.JwtResponseDto;
import ee.valiit.wishlistapi.dto.UserRegistrationDto;
import ee.valiit.wishlistapi.model.User;
import ee.valiit.wishlistapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenService jwtTokenService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public GenericResponseDto register(UserRegistrationDto userRegistration){
        GenericResponseDto responseDto = new GenericResponseDto();
        User user = new User(userRegistration.getUsername(), passwordEncoder.encode(userRegistration.getPassword()),
                userRegistration.getName(), userRegistration.getPhoto(), userRegistration.getUuid());
        if (!userRepository.userExists(userRegistration.getUsername())) {
            userRepository.addUser(user);
        } else {
            responseDto.getErrors().add("User with the specified username already exists.");
        }
        return responseDto;
    }

    public JwtResponseDto authenticate(JwtRequestDto request) throws Exception {
        authenticate(request.getUsername(), request.getPassword());
        final User userDetails = userRepository.getUserByUsername(request.getUsername());
        final String token = jwtTokenService.generateToken(userDetails.getUsername());
        return new JwtResponseDto(userDetails.getId(), userDetails.getUsername(), token);
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

}
