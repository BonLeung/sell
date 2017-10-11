package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 商品（包含类目）
 * Created by liangweibang on 2017/10/11.
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String productName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
