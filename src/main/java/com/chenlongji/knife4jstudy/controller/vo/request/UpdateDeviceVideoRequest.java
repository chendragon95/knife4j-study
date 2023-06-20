package com.chenlongji.knife4jstudy.controller.vo.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;


/**
 * Description:描述 请求对象
 * @author clj 【clj_java@163.com】
 * @date 2023年03月10日
 */
@Data
@ApiModel(value = "更新设备视频请求对象", description = "更新的描述")
public class UpdateDeviceVideoRequest {
    @ApiModelProperty(value = "设备唯一标识", required = true, example = "860535065286282")
    @NotBlank(message = "设备唯一标识不能为空")
    private String sn;

    @ApiModelProperty(value = "开始时间. 格式 yyyy-MM-dd HH:mm:ss", example = "2023-01-01 08:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    @ApiModelProperty(value = "结束时间. 格式 yyyy-MM-dd HH:mm:ss", example = "2023-01-01 12:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

    @ApiModelProperty(value = "视频存储路径", required = true, example = "/video/123.mp4")
    @NotBlank(message = "视频存储路径不能为空")
    private String fileUrl;

    @ApiModelProperty(value = "看护瞬间状态", example = "AUDIT_PASS")
    private String status;

    /**
     * 注: example中尽量不要使用 [ 和 {, 这个ui无法处理, 通过前端JSON.parse()方法转换成JSON对象的时候会报错
     */
    @ApiModelProperty(value = "敏感片段", example = "[120, 230]", notes = "空字符串表示置空")
    private String sensitiveFragment;

}
