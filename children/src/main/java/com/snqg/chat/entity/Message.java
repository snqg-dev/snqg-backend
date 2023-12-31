package com.snqg.chat.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 消息表
 * @TableName message
 */
@TableName(value ="message")
@Data
public class Message implements Serializable {
    /**
     * 主键
     */
    @TableId
    private Integer id;

    /**
     * 发送者id
     */
    private String senderId;

    /**
     * 发送者用户名
     */
    private String sender;

    /**
     * 接受者id
     */
    private String receiverId;

    /**
     * 接受者用户名
     */
    private String receiver;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 发送时间
     */
    private Date sendTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}