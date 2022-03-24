package com.beike.otc.services.OTCfactory;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.pojo.ContractsBean;

public interface Contract {
    ContractsBean create(ContractParam contractParam);
    ContractsBean findList(String bu);
}
