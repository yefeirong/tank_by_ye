package com.beike.otc.services.OTCservices;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.pojo.ContractsBean;
import com.beike.otc.pojo.UserLogin;

import java.util.List;

public interface CreateContractServices {
    //生成合同表数据信息
    ContractsBean createContractData(ContractParam contractParam);

    int add(ContractsBean contractsBean);
    int add(List<ContractsBean> contractsBeanList);
    List<ContractsBean> selectAllOfContract();
}
