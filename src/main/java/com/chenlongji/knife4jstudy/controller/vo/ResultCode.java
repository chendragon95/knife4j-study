package com.chenlongji.knife4jstudy.controller.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用响应状态
 *
 * @author chc
 * @date 2020-11-18
 */
@AllArgsConstructor
@Getter
public enum ResultCode {

    /* 成功状态码 */
    SUCCESS(200,"操作成功"),

    /* 错误状态码 */
    FAIL(500,"操作失败"),

    /* (旧)参数错误：1001-1099 */
    MOBILE_IS_INVALID(1001, "手机号码或模板类型无效"),
    PARAM_IS_BLANK(1002, "参数为空"),
    PARAM_NOT_COMPLETE(1004, "参数缺失"),
    /* (旧)用户错误：2001-2999*/
    USER_LOGIN_ERROR(2002, "账号不存在或密码错误"),
    USER_NOT_EXIST(2004, "用户不存在"),
    USER_HAS_EXISTED(2005, "用户已存在"),
    USER_OLDPASSWORD_SAME(2006, "新密码和旧密码不能相同"),
    USER_OLDPASSWORD_ERROR(2007, "旧密码密码错误"),
    USER_SMS_LOGIN_ERROR(2010, "账号不存在或短信验证码错误"),
    /* (旧)：4001-4999*/
    INVITE_CODE_ERROR(4014, "邀请码错误"),
    SLEEPLOG_NOT_EXIST(4015,"睡眠记录不存在"),
    BINDING_CODE_ERROR(4016, "绑定码错误或失效"),
    /* (旧)家庭错误：10001-19999*/
    FAMILY_NOT_EXIST(10007, "家庭组不存在"),
    NOT_JOIN_FAMILY(10008, "您还没加入家庭"),
    /* (旧)权限错误：20001-29999 */
    PERMISSION_TOKEN_INVALID(20001, "登录已过期"),
    /* (旧)用户密码错误：40001-49999*/
    USER_PASSWORD_NULL(40052, "密码不能为空"),
    USER_NOT_SAME(40053, "密码与确认密码不一致"),

    /* (旧)用户密码错误：500001-59999*/
    GARDEDER_HAS(500001, "受监护人已存在"),
    DEVICE_HAS(500002, "设备已存在"),
    GARDEDER_SET(500003, "请先设置受护人"),
    PWD_ERRO(500004, "6-12位纯数字或纯字母或数字与字母组合"),
    DEVICE_NOT_HAS(500005, "设备不存在"),
    DEVICE_UPDATE_DOWN(500006, "下载升级包中"),
    DEVICE_UPDATE_ONGOING(500007, "设备升级中"),
    DEVICE_UPDATE_COMPLETE(500008, "设备升级完成"),
    CARE_MOMENT_NOT_EXIST(500009, "看护瞬间不存在"),
    DEVICE_UPDATE_FAIL(500010, "设备升级失败"),
    DEVICE_HAS_BOUND(500011, "设备已被绑定"),
    /* (旧)用户密码错误：600001-69999*/
    DEVICE_VIDEO_BUSY(600001, "用户正在视频通话中, 请稍后"),
    FAMILY_MEMBER_OVER_THRESHOLD(600002, "加入亲友团人数已达上限"),

    /* 参数: 100001-109999*/

    /* 用户: 200001-209999*/

    /* 设备: 300001-309999*/

    /* 设备: 400001-409999*/

    /* 体征数据/其他数据: 700001-709999*/

    /* 其他: 800001-809999*/

    /* 公共业务错误码 999999 */
    BUSINESS_ERROR(999999, "业务错误")
    ;


    private int code;
    private String message;

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
