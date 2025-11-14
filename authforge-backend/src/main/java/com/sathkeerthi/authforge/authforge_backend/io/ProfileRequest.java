package com.sathkeerthi.authforge.authforge_backend.io;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRequest {
    @NotBlank (message = "Name cannot be blank")
    private String name;
    @Email (message = "Enter a valid email id")
    @NotNull (message = "Email cannot be empty")
    private String email;
    @Size(min=6, message = "Password must have a minimum of 6 digits")
    private String password;
}
