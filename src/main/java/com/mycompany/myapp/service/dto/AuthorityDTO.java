package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.domain.Authority;

/**
 * A Authority DTO
 */

public class AuthorityDTO {

    public AuthorityDTO() {}

    public AuthorityDTO(Authority authority) {
        this.name = authority.getName();
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AuthorityDTO{" +
            "name='" + name + '\'' +
            "}";
    }
}
