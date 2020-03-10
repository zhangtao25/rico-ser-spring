package com.rico.ser.controller;

import com.rico.ser.VO.ResultVO;
import com.rico.ser.dataobject.Userinfo;
import com.rico.ser.dto.TokenDTO;
import com.rico.ser.form.LoginForm;
import com.rico.ser.service.UserService;
import com.rico.ser.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.xml.transform.Result;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public ResultVO detail (
            @RequestParam(value = "userPhone", required = false) String userPhone,
            @RequestParam(value = "userToken", required = false) String userToken){

        Userinfo userinfo = userService.findByUserPhoneAndUserToken(userPhone,userToken);
        return ResultVOUtil.success(userinfo);
    }

    @PostMapping("/login")
    public ResultVO login (@RequestBody LoginForm jsonParam){

        String userPhone = jsonParam.getUserPhone();
        String userPassword = jsonParam.getUserPassword();

        TokenDTO tokenDTO = userService.findByUserPhoneAndPwd(userPhone,userPassword);
        return ResultVOUtil.success(tokenDTO);
    }
}
