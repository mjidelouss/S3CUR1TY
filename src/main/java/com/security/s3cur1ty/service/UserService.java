package com.security.s3cur1ty.service;

import com.security.s3cur1ty.domain.AppUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {
    UserDetailsService userDetailsService();
    Long getUserIdByUsername(String username);

    AppUser getUserByUsername(String username);

    AppUser getUserById(Long id);
}
