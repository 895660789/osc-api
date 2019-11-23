package com.zwc.base.dto.response.visit;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;


/*
  * @ClassName VisitResponseDTO
  * @Desc TODO  访问记录表响应类
  * @Date 2019/11/1 5:26 PM
  * @Version 1.0
 */
@ApiModel("访问记录表响应类")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class VisitResponseDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 ID
     */
    @ApiModelProperty(value = "主键 ID")
    private Long id;
    /**
     * sessionID
     */
    @ApiModelProperty(value = "sessionID")
    private String sessionId;
    /**
     * 添加时间
     */
    @ApiModelProperty(value = "添加时间")
    private Date createDatetime;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date updateDatetime;

}
