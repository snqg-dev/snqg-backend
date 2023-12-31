package com.snqg.domain.response.chat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FriendVO {

    @ApiModelProperty(value = "好友id", example = "1")
    private String id;

    @ApiModelProperty(value = "好友用户名", example = "caesar")
    private String username;

    @ApiModelProperty(value = "好友头像", example = "https://smms.app/image/XnFAaDcvLwtyB2M")
    private String avatar;

}
