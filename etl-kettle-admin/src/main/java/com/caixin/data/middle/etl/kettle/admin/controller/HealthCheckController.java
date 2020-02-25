package com.caixin.data.middle.etl.kettle.admin.controller;

import com.caixin.data.middle.etl.kettle.common.api.resp.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Auther: zhuzhongji
 * @Date: 2019/9/16 14:35
 */
@Api(value = "HealthCheckController", description = "健康检查")
@RestController
@RequestMapping("/api/base")
public class HealthCheckController {

    @ApiOperation("ping操作")
    @GetMapping(value = "/ping")
    public CommonResult<String> ping() {
        return CommonResult.success("pong");
    }
}
