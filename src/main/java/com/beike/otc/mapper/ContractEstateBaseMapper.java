package com.beike.otc.mapper;

import com.beike.otc.pojo.ContractsBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ContractEstateBaseMapper {
    //添加数据
    int add(ContractsBean contractsBean);
    int add(List<ContractsBean> contractsBeanList);
    List<ContractsBean> selectAllOfContract();
}
