package com.sathkeerthi.authforge.authforge_backend.service;

import com.sathkeerthi.authforge.authforge_backend.io.ProfileRequest;
import com.sathkeerthi.authforge.authforge_backend.io.ProfileResponse;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest request);

}
