package com.beike.otc.services.OTCfactory;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.pojo.ContractsBean;
import com.beike.otc.utils.DateUtils;

import java.util.Date;

/**
 * @author: yefeirong
 * @date: 2021/7/18 16:10
 * @describe:
 */
public class NewEstateContract implements Contract {
    @Override
    public ContractsBean create(ContractParam contractParam) {
        //合同创建日期 为空则默认当前日期
        Date contractTime = contractParam.getContractTime();
        if (null==contractTime){
            String currentDateTimeString14 = DateUtils.getCurrentDateTimeString14();
            System.out.println(currentDateTimeString14);
            contractTime = DateUtils.string2date(currentDateTimeString14);

        }
        contractParam.setContractTime(contractTime);

        ContractsBean contractsBean = new ContractsBean();
        //合同接口固定字段
        //新房
        contractsBean.setTianjiCompanyCode("19");
        contractsBean.setTianjiCompanyName("中嘉国泰商业保理（深圳）有限公司");
        contractsBean.setTianjiProductCode("XFBL20190625001");
        contractsBean.setTianjiProductName("新房垫佣贝2.0");
        contractsBean.setFactoringContractId("BLHT"+ System.currentTimeMillis());
        contractsBean.setCityCompanyId("V2015029");
        contractsBean.setCityCompanyName("长江V2015029房江湖信息科技有限公司");
        contractsBean.setChannelName("北京万邦保屏科技有限公司");
        contractsBean.setChannelNo("C2104000233");
        contractsBean.setTradeNo("JYBM"+System.currentTimeMillis());
        contractsBean.setContractId("JRDBH"+System.currentTimeMillis());
    return contractsBean;
    }

    @Override
    public ContractsBean findList(String bu) {
        return null;
    }
}
