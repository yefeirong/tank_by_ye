package com.beike.otc.mapper;

import com.beike.otc.pojo.ContractsBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: yefeirong
 * @date: 2021/7/9 14:01
 * @describe:
 */
@Mapper
@Repository
public interface ContractInsuranceBaseMapper {
    //添加数据
    int add(ContractsBean contractsBean);
    int add(List<ContractsBean> contractsBeanList);
    List<ContractsBean> selectAllOfContract();

}
