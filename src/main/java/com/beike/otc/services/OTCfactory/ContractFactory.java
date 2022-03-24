package com.beike.otc.services.OTCfactory;

import com.beike.otc.pojo.ContractsBean;


import com.beike.otc.mapper.ContractEstateBaseMapper;
import com.beike.otc.mapper.ContractInsuranceBaseMapper;
import com.beike.otc.mapper.ContractNewEstateBaseMapper;
import com.beike.otc.pojo.ContractsBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//
///**
// * @author: yefeirong
// * @date: 2021/7/18 16:13
// * @describe:
// * /**
// *      *代码值	BU名称  bu
// *      * P006	保险    6
// *      * P005	信用    5
// *      * P004	租赁    4
// *      * P003	新房    3
// *      * P002	装修    2
// *      * P001	房产    1
// *      */
//
public class ContractFactory {
//    @Autowired
//    private ContractNewEstateBaseMapper contractNewEstateBaseMapper;
//    @Autowired
//    private ContractEstateBaseMapper contractEstateBaseMapper;
//    @Autowired
//    private ContractInsuranceBaseMapper contractInsuranceBaseMapper;
    public Contract getContract(String bu){
//        if(bu == null){
//            return null;
//        }
//        if(bu.equals("3")){
//            return new EstateContract();
//        } else if(bu.equals("1")){
//            return new EstateContract();
//        } else if(bu.equals("6")){
//            return new InsuranceContract();
//        }
        return null;
    }
    public List<ContractsBean> getContractDB(String bu){
//        if(bu == null){
//            return null;
//        }
//        switch (bu) {
//            case "3":
//                return contractNewEstateBaseMapper.selectAllOfContract();
//            case "1":
//                return contractEstateBaseMapper.selectAllOfContract();
//            case "6":
//                return contractInsuranceBaseMapper.selectAllOfContract();
//        }
        return null;
    }
}
