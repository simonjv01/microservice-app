package com.vargasoftware.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
