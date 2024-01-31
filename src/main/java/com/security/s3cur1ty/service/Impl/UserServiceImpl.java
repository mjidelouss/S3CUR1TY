package com.security.s3cur1ty.service.Impl;

import com.security.s3cur1ty.domain.AppUser;
import com.security.s3cur1ty.repository.UserRepository;
import com.security.s3cur1ty.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByEmail(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            }
        };
    }

    public Long getUserIdByUsername(String username) {
        AppUser appUser = userRepository.findByUsername(username);
        return (appUser != null) ? appUser.getId() : null;
    }

    @Override
    public AppUser getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public AppUser getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
