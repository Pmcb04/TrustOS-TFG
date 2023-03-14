package com.mycompany.myapp.service.mapper;

import com.mycompany.myapp.domain.Authority;
import com.mycompany.myapp.service.dto.AuthorityDTO;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 * Mapper for the entity {@link Authority} and its DTO called {@link AuthorityDTO}.
 *
 * Normal mappers are generated using MapStruct, this one is hand-coded as MapStruct
 * support is still in beta, and requires a manual step with an IDE.
 */
@Service
public class AuthorityMapper {

    public List<AuthorityDTO> authoritiesToAuthoritiesDTOs(List<Authority> authorities) {
        return authorities.stream().filter(Objects::nonNull).map(this::authorityToAuthorityDTO).collect(Collectors.toList());
    }

    public Authority authorityDtoTOAuthority(AuthorityDTO authorityDTO) {
        if (authorityDTO == null) {
            return null;
        } else {
            Authority authority = new Authority();
            authority.setName(authorityDTO.getName());
            authority.setProducts(null);
            return authority;
        }
    }

    public AuthorityDTO authorityToAuthorityDTO(Authority authority) {
        return new AuthorityDTO(authority);
    }

    public List<Authority> authoritiesDtoToAuthorities(List<AuthorityDTO> authoritiesDTO) {
        return authoritiesDTO.stream().filter(Objects::nonNull).map(this::authorityDtoTOAuthority).collect(Collectors.toList());
    }
}
