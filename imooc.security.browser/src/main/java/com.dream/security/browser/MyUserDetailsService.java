package com.dream.security.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by H.J
 * 2018/7/10
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("用户名 ：" + username);
        return new User(username, passwordEncoder.encode("123456") ,
                true,true,true,false,
                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }


    public static void main(String[] args){

        char[] chars = "pwwkew".toCharArray();
        List<Character> list = new ArrayList<>();
        int length = 0;
        int index = 0;
        for(int i = 0 ; i < chars.length ; i++){
            if (!list.contains(chars[i])){
                list.add(chars[i]);
            }else{
                length = length > i - index ? length : i - index;
                for(Character c : list){
                    list.remove(c);
                    if(c == chars[i]){
                        break;
                    }
                }
                index = i;
                list.add(chars[i]);
            }
        }
        if (list.size() > length){
            length = list.size();
        }

//        char[] chars = "pwwkew".toCharArray();
//        Map<Integer,Character> map = new HashMap<>();
//        int length = 0;
//        int index = 0;
//        for(int i = 0 ; i < chars.length ; i++){
//            if (!map.containsValue(chars[i])){
//                map.put(i,chars[i]);
//            }else{
//                length = length > i - index ? length : i - index;
//                for(int j = i-1 ; j >= index ; j--){
//                    map.remove(j);
//                }
//                index = i;
//                map.put(i,chars[i]);
//            }
//        }
//        if (map.size() > length){
//            length = map.size();
//        }
        System.out.println(length);
    }

}

