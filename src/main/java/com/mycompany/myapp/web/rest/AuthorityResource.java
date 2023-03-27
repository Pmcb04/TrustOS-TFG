package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.service.AuthorityService;
import com.mycompany.myapp.service.dto.AuthorityDTO;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class AuthorityResource {

    private final AuthorityService authorityService;

    public AuthorityResource(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }

    /**
     * {@code GET /api/roles} : get all roles in the system
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body all roles
     */
    @GetMapping()
    public ResponseEntity<List<AuthorityDTO>> getAll() {
        return new ResponseEntity<>(authorityService.findAll(), HttpStatus.OK);
    }
}
