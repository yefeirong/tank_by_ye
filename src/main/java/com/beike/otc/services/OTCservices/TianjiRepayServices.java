package com.beike.otc.services.OTCservices;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.pojo.ContractsBean;
import com.beike.otc.pojo.TianjiRepayBean;

public interface TianjiRepayServices {
    //生成tianji 付款单表数据信息
    TianjiRepayBean tianjiRepay(String bu);
}
