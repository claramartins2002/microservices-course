package com.clara.hroauth.services;

import com.clara.hroauth.entity.User;
import com.clara.hroauth.feignclient.UserFeignClient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private final UserFeignClient client;

    public UserService(UserFeignClient client) {
        this.client = client;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = client.findByEmail(email).getBody();
        if(user==null){
            throw  new UsernameNotFoundException("Email not found");
        }
        else {
            return user;
        }    }
}
