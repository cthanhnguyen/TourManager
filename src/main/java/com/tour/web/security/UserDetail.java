package com.tour.web.security;


import com.tour.web.model.MyUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 13/06/2015.
 */
public class UserDetail implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {

        MyUser demo = new MyUser("thanh","123456");
        List<GrantedAuthority> authorities = buildUserAuthority(demo);

        return buildUserForAuthentication(demo, authorities);


    }

    private User buildUserForAuthentication(MyUser demo, List<GrantedAuthority> authorities) {
        return new User(demo.getUserName(),demo.getPassword(),true,true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(MyUser demo) {
        Set<GrantedAuthority> grantedAuthors = new HashSet<GrantedAuthority>();
        grantedAuthors.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        grantedAuthors.add(new SimpleGrantedAuthority("ROLE_USER"));
        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(grantedAuthors);
        return Result;
    }
}
