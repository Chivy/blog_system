package com.mjelen.blog.account.user;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@NoArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return UserPrincipal.create(
                userRepository.findByUsernameOrEmail(username, username)
                        .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + "not found.")));
    }

    @Transactional
    public UserDetails loadUserById(Long id) {
        return UserPrincipal.create(
                userRepository.findById(id).orElseThrow(
                        () -> new UsernameNotFoundException("User with id: " + id + "not found.")
                )
        );
    }
}
