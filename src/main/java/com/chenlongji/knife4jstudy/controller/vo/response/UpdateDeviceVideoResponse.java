package com.chenlongji.knife4jstudy.controller.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Description:描述 response
 * @author chenlongji 【clj_java@163.com】
 * @date 2023年06月16日
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "更新设备视频响应对象", description = "我是响应描述")
public class UpdateDeviceVideoResponse {

    @ApiModelProperty(value = "设备sn码", example = "860535065286282")
    private String sn;

    @ApiModelProperty(value = "成功标志", example = "false")
    private boolean successFlag;

}
