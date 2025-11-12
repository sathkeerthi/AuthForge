package com.sathkeerthi.authforge.authforge_backend.service;

import com.sathkeerthi.authforge.authforge_backend.entity.UserEntity;
import com.sathkeerthi.authforge.authforge_backend.io.ProfileRequest;
import com.sathkeerthi.authforge.authforge_backend.io.ProfileResponse;
import com.sathkeerthi.authforge.authforge_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProfileSericeImpl implements ProfileService{

    private final UserRepository userRepository;


    @Override
    public ProfileResponse createProfile(ProfileRequest request) {
        UserEntity newProfile = convertToUserEntity(request);
        newProfile = userRepository.save(newProfile);
        return convertToProfileResponse(newProfile);
    }

    private ProfileResponse convertToProfileResponse(UserEntity newProfile) {
        return ProfileResponse.builder()
                .email(newProfile.getEmail())
                .name(newProfile.getName())
                .userId(newProfile.getUserId())
                .isAccountVerified(newProfile.getIsAccountVerified().toString())
                .build();
    }

    private UserEntity convertToUserEntity(ProfileRequest request) {
        return UserEntity.builder()
                .email(request.getEmail())
                .userId(UUID.randomUUID().toString())
                .name(request.getName())
                .password(request.getPassword())
                .resetOtp(null)
                .resetOtpExpiresAt(0L)
                .isAccountVerified(false)
                .verifyOtp(null)
                .verifyOtpExpiresAt(0L)
                .build();
    }
}
