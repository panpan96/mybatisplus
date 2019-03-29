package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author zhangyuchen
 * @since 2019-03-25
 */
@Data
@TableName("QD_JIED")
public class QdJied  {


    private String daim;
    private String mingc;
    private String jianc;
    private String shangj;
    private String shunx;
    private String zhuangt;
    private String leix;
    /**
     * 时间戳
     */
    private Date ts;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 创建时间
     */
    private Date creationTime;
    /**
     * 修改人
     */
    private String modifier;
    /**
     * 修改时间
     */
    private Date modifiedTime;


}
