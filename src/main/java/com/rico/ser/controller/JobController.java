package com.rico.ser.controller;

import com.rico.ser.VO.ResultVO;
import com.rico.ser.dataobject.Userinfo;
import com.rico.ser.utils.ResultVOUtil;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/job")
public class JobController {


    @GetMapping("/test")
    public ResultVO detail (){
        return ResultVOUtil.success("sssss");
    }
}
