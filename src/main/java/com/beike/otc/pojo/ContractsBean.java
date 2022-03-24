package com.beike.otc.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: yefeirong
 * @date: 2021/7/7 17:33
 * @describe:
 * 来源系统代码
 * 接口名称
 * *天玑公司编码
 * *天玑公司名称
 * *金融编号
 * *产品类型
 * *天玑产品编码
 * *天玑产品名称
 * 客户名称
 * 业主名称
 * *合同状态
 * *金融单状态
 * 金融顾问工号
 * 签订日期
 * *合同状态时间
 * *金融单状态时间
 * *序号
 * 资金渠道
 * 营销渠道
 * 业务性质
 * 资方性质
 * 合同创建日期
 * 保理合同号
 * 交易编号
 * 渠道商名称
 * 渠道商编码
 * 新房城市公司名称
 * 新房城市公司编码
 */
@Data
public class ContractsBean extends BaseRowModel implements Serializable {
    @ExcelProperty(value = "来源系统代码",index = 0)
    private String originSystem = "TIANJI";
    @ExcelProperty(value = "接口名称",index = 1)
    private String interfaceName = "TIANJI_CONTRACT";
    @ExcelProperty(value = "*天玑公司编码",index = 2)
    private String tianjiCompanyCode;
    @ExcelProperty(value = "*天玑公司名称",index = 3)
    private String tianjiCompanyName;
    @ExcelProperty(value = "*金融编号",index = 4)
    private String contractId;
    @ExcelProperty(value = "*产品类型",index = 5)
    private String productType="资金";
    @ExcelProperty(value = "*天玑产品编码",index = 6)
    private String tianjiProductCode;
    @ExcelProperty(value = "*天玑产品名称",index = 7)
    private String tianjiProductName;
    @ExcelProperty(value = "客户名称",index = 8)
    private String customerName;
    @ExcelProperty(value = "业主名称",index = 9)
    private String ownerName ="业主";
    @ExcelProperty(value = "*合同状态",index = 10)
    private String contractStatus = "已生效";
    @ExcelProperty(value = "*金融单状态",index = 11)
    private String financialStatus = "已生效";
    @ExcelProperty(value = "金融顾问工号",index = 12)
    private String consultNo;
    @ExcelProperty(value = "签订日期",index = 13)
    private String signingDate = "2021-07-20";
    @ExcelProperty(value = "*合同状态时间",index = 14)
    private String contractStatusDate = "2021-07-20";
    @ExcelProperty(value = "*金融单状态时间",index = 15)
    private String financialStatusDate = "2021-07-20 20:52:09";
    @ExcelProperty(value = "*序号",index = 16)
    private Integer no;
    @ExcelProperty(value = "资金渠道",index = 17)
    private String fundingChannel;
    @ExcelProperty(value = "营销渠道",index = 18)
    private String salesChannel;
    @ExcelProperty(value = "业务性质",index = 19)
    private String businessCharacter;
    @ExcelProperty(value = "资方性质",index = 20)
    private String managerCharacter;
    @ExcelProperty(value = "合同创建日期",index = 21)
    private Date createContractDate;
    @ExcelProperty(value = "保理合同号",index = 22)
    private String factoringContractId;
    @ExcelProperty(value = "交易编号",index = 23)
    private String tradeNo;
    @ExcelProperty(value = "渠道商名称",index = 24)
    private String channelName;
    @ExcelProperty(value = "渠道商编码",index = 25)
    private String channelNo;
    @ExcelProperty(value = "新房城市公司名称",index = 26)
    private String cityCompanyName;
    @ExcelProperty(value = "新房城市公司编码",index = 27)
    private String cityCompanyId;



}
