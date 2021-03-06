package com.ipaylinks.cmp.css.facade.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class ChannelCostDto implements Serializable{
    private static final long serialVersionUID = -1864797542110269891L;
    /**
     * 渠道号
     */
    private String orgCode;
    /**
     * 子渠道号
     */
    private String orgSubCode;
    /**
     * 渠道流水号
     */
    private String channelOrderId;
    /**
     * 支付方式
     */
    private String payMethod;

    /**
     * 交易类型
     */
    private String transType;
    /**
     * 交易状态
     */
    private String transStatus;
    /**
     * 交易币种
     */
    private String payCurrency;
    /**
     * 交易金额
     */
    private BigDecimal payAmount;
    /**
     * 比例费金额
     */
    private BigDecimal percentFeeAmount;
    /**
     * 固定费币种
     */
    private String fixedFeeCurrency;
    /**
     * 固定费金额
     */
    private BigDecimal fixedFeeAmount;
    /**
     * 处理费币种
     */
    private String feeCurrency;
    /**
     * 处理费金额
     */
    private BigDecimal feeAmount;
    /**
     * 费用收取方式
     */
    private String chargeCostMethod;
    /**
     * 费用结算币种
     */
    private String costSettleCurrency;
    /**
     * 费用结算日期
     */
    private String costSettleDate;
    /**
     * 交易完成时间
     */
    private String channelCompleteTime;

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgSubCode() {
        return orgSubCode;
    }

    public void setOrgSubCode(String orgSubCode) {
        this.orgSubCode = orgSubCode;
    }

    public String getChannelOrderId() {
        return channelOrderId;
    }

    public void setChannelOrderId(String channelOrderId) {
        this.channelOrderId = channelOrderId;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getTransStatus() {
        return transStatus;
    }

    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus;
    }

    public String getPayCurrency() {
        return payCurrency;
    }

    public void setPayCurrency(String payCurrency) {
        this.payCurrency = payCurrency;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getPercentFeeAmount() {
        return percentFeeAmount;
    }

    public void setPercentFeeAmount(BigDecimal percentFeeAmount) {
        this.percentFeeAmount = percentFeeAmount;
    }

    public String getFixedFeeCurrency() {
        return fixedFeeCurrency;
    }

    public void setFixedFeeCurrency(String fixedFeeCurrency) {
        this.fixedFeeCurrency = fixedFeeCurrency;
    }

    public BigDecimal getFixedFeeAmount() {
        return fixedFeeAmount;
    }

    public void setFixedFeeAmount(BigDecimal fixedFeeAmount) {
        this.fixedFeeAmount = fixedFeeAmount;
    }

    public String getFeeCurrency() {
        return feeCurrency;
    }

    public void setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
    }

    public String getChargeCostMethod() {
        return chargeCostMethod;
    }

    public void setChargeCostMethod(String chargeCostMethod) {
        this.chargeCostMethod = chargeCostMethod;
    }

    public String getCostSettleCurrency() {
        return costSettleCurrency;
    }

    public void setCostSettleCurrency(String costSettleCurrency) {
        this.costSettleCurrency = costSettleCurrency;
    }

    public String getCostSettleDate() {
        return costSettleDate;
    }

    public void setCostSettleDate(String costSettleDate) {
        this.costSettleDate = costSettleDate;
    }

    public String getChannelCompleteTime() {
        return channelCompleteTime;
    }

    public void setChannelCompleteTime(String channelCompleteTime) {
        this.channelCompleteTime = channelCompleteTime;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }
}
