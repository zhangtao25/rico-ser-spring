package com.rico.ser.converter;

//import com.mangostreet.mangostreetserspring.dataobject.User;
//import com.mangostreet.mangostreetserspring.dto.TokenDTO;

import com.rico.ser.dataobject.User;
import com.rico.ser.dto.TokenDTO;

public class User2TokenDTOConverter {

    public static TokenDTO convert(User user) {

        TokenDTO tokenDTO = new TokenDTO();
        tokenDTO.setToken(user.getUserToken());
        return tokenDTO;
    }
}