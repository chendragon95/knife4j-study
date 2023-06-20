package com.chenlongji.knife4jstudy.controller;

import com.chenlongji.knife4jstudy.controller.vo.Result;
import com.chenlongji.knife4jstudy.controller.vo.request.SaveDeviceVideoRequest;
import com.chenlongji.knife4jstudy.controller.vo.request.UpdateDeviceVideoRequest;
import com.chenlongji.knife4jstudy.controller.vo.response.UpdateDeviceVideoResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Description:描述 控制器
 * @author clj 【clj_java@163.com】
 * @date 2023年03月10日
 */
@RestController
@RequestMapping("/api/deviceVideo")
@Validated
@Slf4j
public class DeviceVideoController {

    @ApiOperation(value = "新增设备视频", httpMethod = "POST", notes = "这是个神奇的新增方法", tags = {"tag1", "tag2"})
    @PostMapping("/saveDeviceVideo")
    public Result saveDeviceVideo(@Validated @RequestBody SaveDeviceVideoRequest request) {
        log.info("saveDeviceVideo: request={}", request);
        return Result.SUCCESS();
    }

    @ApiOperation(value = "更新设备视频", httpMethod = "POST")
    @PostMapping("/updateDeviceVideo")
    public Result<UpdateDeviceVideoResponse> updateDeviceVideo(@Validated @RequestBody UpdateDeviceVideoRequest request) {
        log.info("updateDeviceVideo: request={}", request);
        return Result.SUCCESS(new UpdateDeviceVideoResponse());
    }

    @ApiOperation(value = "查询设备视频", httpMethod = "GET")
    @GetMapping("/getDeviceVideo")
    public Result getDeviceVideo(@ApiParam(value = "查询起始时间戳", required = true, example = "1687251227647") @RequestParam(value = "lastDateline") Long lastDateline) {
        return Result.SUCCESS();
    }

}
