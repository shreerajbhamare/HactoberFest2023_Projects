package com.demoapp.librarysys.model.request;

import lombok.Data;

@Data
public class AuthorCreationRequest {
    private String firstName;
    private String lastName;
}
