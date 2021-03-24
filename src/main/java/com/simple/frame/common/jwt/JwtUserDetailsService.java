package com.simple.frame.common.jwt;

import com.simple.frame.common.code.Role;
import com.simple.frame.entity.MngrVo;
import com.simple.frame.repository.MngrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private PasswordEncoder passwordEncoder;

    @Autowired
    private MngrRepository mngrRepository;

    @Override
    public UserDetails loadUserByUsername(String mngrId) throws UsernameNotFoundException {

        MngrVo mngrVo = mngrRepository.findByMngrId(mngrId);
        Set<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        grantedAuthoritySet.add(new SimpleGrantedAuthority(Role.SUPPER.name()));

        return new User(mngrVo.getMngrId(), mngrVo.getMngrPassWord(), grantedAuthoritySet);
    }

    public MngrVo authenticateByEmailAndPassword(String mngrId, String password) {
        MngrVo mngrVo = mngrRepository.findByMngrId(mngrId);

        if(!passwordEncoder.matches(password, mngrVo.getMngrPassWord())) {
            throw new BadCredentialsException("Password not matched");
        }

        return mngrVo;
    }


}
