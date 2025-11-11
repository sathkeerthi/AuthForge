package com.sathkeerthi.authforge.authforge_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String verifyOtp;
    private Boolean isAccountVerified;
    private Long verifyOtpExpiresAt;
    private String resetOtp;
    private Long resetOtpExpiresAt;
}
