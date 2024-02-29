package org.example.pay.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * <p>
 * 支付交易表
 * </p>
 *
 * @author xxb
 * @since 2024-02-29
 */
@TableName("t_pay")
@Schema(name = "TPay", description = "支付交易表", title = "123")
@Data
public class TPay implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(description = "支付流水号")
    private String payNo;

    @Schema(description = "订单流水号")
    private String orderNo;

    @Schema(description = "用户账号ID")
    private Integer userId;

    @Schema(description = "交易金额")
    private BigDecimal amount;

    @Schema(description = "删除标志，默认0不删除，1删除")
    private Byte deleted;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "更新时间")
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "TPay{" +
            "id = " + id +
            ", payNo = " + payNo +
            ", orderNo = " + orderNo +
            ", userId = " + userId +
            ", amount = " + amount +
            ", deleted = " + deleted +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
