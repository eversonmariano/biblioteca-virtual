package com.everson.biblioteca.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "Firstname cannot be empty")
    @NotBlank(message = "Firstname cannot be blank")
    private String firstname;
    @NotEmpty(message = "Lastname name cannot be empty")
    @NotBlank(message = "Lastname cannot be blank")
    private String lastname;
    @Email(message = "Email is not valid")
    @NotEmpty(message = "Email name cannot be empty")
    @NotBlank(message = "Email cannot be blank")
    private String email;
    @NotEmpty(message = "Password name cannot be empty")
    @NotBlank(message = "Password cannot be blank")
    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;
}
