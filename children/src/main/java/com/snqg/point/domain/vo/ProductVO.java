package com.snqg.point.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ProductVO {

    @ApiModelProperty(value = "商品Id", example = "8saw7")
    private Integer id;

    @ApiModelProperty(value = "商品名称", example = "老人与海")
    private String name;

    @ApiModelProperty(value = "商品描述", example = "这是一本很有趣的书")
    private String describ;

    @ApiModelProperty(value = "商品价格", example = "898")
    private Integer price;

    @ApiModelProperty(value = "商品剩余个数", example = "3")
    private Integer count;

    @ApiModelProperty(value = "商品类型", example = "1")
    private Integer type;

    @ApiModelProperty(value = "商品图片", example = "https://baidu.com/book.png")
    private String picture;
}
