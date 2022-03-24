package com.beike.otc.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: yefeirong
 * @date: 2021/7/16 16:38
 * @describe:
 */
@Data
public class TianjiRepayBean  extends BaseRowModel implements Serializable {
    @ExcelProperty(value = "来源系统代码",index = 0)
    private String originSystem = "TIANJI";
    @ExcelProperty(value = "接口名称",index = 1)
    private String interfaceName = "TIANJI_REPAY";
    @ExcelProperty(value = "*天玑公司编码",index = 2)
    private String tianjiCompanyCode;
    @ExcelProperty(value = "*天玑公司名称",index = 3)
    private String tianjiCompanyName;
    @ExcelProperty(value = "*金融编号",index = 4)
    private String contractId;
    @ExcelProperty(value = "*业务系统唯一编号",index = 5)
    private String systemNo;
    @ExcelProperty(value = "*收款方式",index = 6)
    private String transferWay="银行转账";
    @ExcelProperty(value = "*天玑收费项目",index = 7)
    private String feeItem;
    @ExcelProperty(value = "*付款金额",index = 8)
    private String payAmount="9999999.99";
    @ExcelProperty(value = "*付款日期",index = 9)
    private String payDate;
    @ExcelProperty(value = "*业务日期",index = 10)
    private String busDate;
    @ExcelProperty(value = "*付款状态",index = 11)
    private String payStatus="付款完成";
    @ExcelProperty(value = "合同约定缴款方",index = 12)
    private String paymentRole="客户";
    @ExcelProperty(value = "金融顾问填写缴款方",index = 13)
    private String consultRole="客户";
    @ExcelProperty(value = "*天玑产品编码",index = 14)
    private String tianjiProductCode;
    @ExcelProperty(value = "*产品名称",index = 15)
    private String productName;
    @ExcelProperty(value = "POS终端号",index = 16)
    private String posNo;
    @ExcelProperty(value = "POS参考号",index = 17)
    private String posBakNo;
    @ExcelProperty(value = "理房通流水号",index = 18)
    private String ehomepayNo;
    @ExcelProperty(value = "*对方账户",index = 19)
    private String account;
    @ExcelProperty(value = "*对方户名",index = 20)
    private String accountName;
    @ExcelProperty(value = "操作人",index = 21)
    private String operator;
    @ExcelProperty(value = "*币种",index = 22)
    private String currencyType="CNY";
    @ExcelProperty(value = "*天玑城市编码",index = 23)
    private String cityCode="110000";
    @ExcelProperty(value = "*天玑城市名称",index = 24)
    private String cityName="北京";
    @ExcelProperty(value = "银行账户",index = 25)
    private String bankAccount;
    @ExcelProperty(value = "*序号",index = 26)
    private String no;
    @ExcelProperty(value = "*是否一次性预收",index = 27)
    private String taxWay;
    @ExcelProperty(value = "账单期数",index = 28)
    private String billNums;
    @ExcelProperty(value = "天玑业务线编码",index = 29)
    private String busCode;
    @ExcelProperty(value = "垫佣金额",index = 30)
    private String capitalAmount;



















}
