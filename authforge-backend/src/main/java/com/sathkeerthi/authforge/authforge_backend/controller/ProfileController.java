package com.sathkeerthi.authforge.authforge_backend.controller;

import com.sathkeerthi.authforge.authforge_backend.io.ProfileRequest;
import com.sathkeerthi.authforge.authforge_backend.io.ProfileResponse;
import com.sathkeerthi.authforge.authforge_backend.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfileResponse register(@RequestBody ProfileRequest profileRequest){
        ProfileResponse response =  profileService.createProfile(profileRequest);
        // Todo: Trigger welcome email
        return response;
    }

}
