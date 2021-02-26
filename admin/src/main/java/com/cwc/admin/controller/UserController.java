package com.cwc.admin.controller;


import com.cwc.admin.dto.UserLoginParam;
import com.cwc.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 新世界的神
 * @since 2021-02-25
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户接口")
public class UserController {

//    @PostMapping("/login")
//    @ApiOperation(value = "登录以后返回token")
//    public CommonResult getSupplier(@RequestBody UserLoginParam userLoginParam) {
//        String token = adminService.login(userLoginParam.getUsername(), userLoginParam.getPassword());
//        if (token == null) {
//            return CommonResult.validateFailed("用户名或密码错误");
//        }
//        Map<String, String> tokenMap = new HashMap<>();
//        tokenMap.put("token", token);
//        tokenMap.put("tokenHead", tokenHead);
//        return CommonResult.success(tokenMap);
//    }


}
