package com.beike.otc.services.OTCservices;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.mapper.ContractNewEstateBaseMapper;
import com.beike.otc.pojo.ContractsBean;
import com.beike.otc.services.OTCfactory.Contract;
import com.beike.otc.services.OTCfactory.ContractFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yefeirong
 * @date: 2021/7/7 15:27
 * @describe:
 */
@Service
public class CreateContractServicesImpl implements CreateContractServices {
    @Autowired
    private ContractNewEstateBaseMapper contractBaseMapper;
    /**
     *代码值	BU名称  bu
     * P006	保险    6
     * P005	信用    5
     * P004	租赁    4
     * P003	新房    3
     * P002	装修    2
     * P001	房产    1
     */
    @Override
    public ContractsBean createContractData(ContractParam contractParam) {
        String bu = contractParam.getBu();
        ContractFactory contractFactory = new ContractFactory();
        Contract contract = contractFactory.getContract(bu);
        return contract.create(contractParam);
    }

    @Override
    public int add(ContractsBean contractsBean) {
        return contractBaseMapper.add(contractsBean);
    }

    @Override
    public int add(List<ContractsBean> contractsBeanList) {
        return contractBaseMapper.add(contractsBeanList);
    }

    @Override
    public List<ContractsBean> selectAllOfContract() {


        return contractBaseMapper.selectAllOfContract();
    }

}
