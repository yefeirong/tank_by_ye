package com.beike.otc.services.OTCservices;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.pojo.TianjiRepayBean;
import org.springframework.stereotype.Service;

/**
 * @author: yefeirong
 * @date: 2021/7/16 17:39
 * @describe:
 */
@Service
public class TianjiRepayServicesImpl implements TianjiRepayServices{
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
    public TianjiRepayBean tianjiRepay(String bu) {
        //  1.根据BU选出对应contract sql 进行查询
        //  2.拿sql实体，对repay需要的字段进行提取
        //  3.提出的字段放入tianji repay bean实体
        //  4.写入tianji repay 表

        return null;
    }

}
