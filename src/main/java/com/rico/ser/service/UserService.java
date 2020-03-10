package com.rico.ser.service;

//import com.mangostreet.mangostreetserspring.dataobject.User;
//import com.mangostreet.mangostreetserspring.dataobject.Userinfo;
//import com.mangostreet.mangostreetserspring.dto.TokenDTO;
import com.rico.ser.dataobject.User;
import com.rico.ser.dataobject.Userinfo;
import com.rico.ser.dto.TokenDTO;

public interface UserService {
    User addUser(User user);
    User findOne (String userId);
    TokenDTO findByUserPhoneAndPwd (String userPhone, String userPassword);
    Userinfo findByUserPhoneAndUserToken (String userPhone, String userToken);
}
