package com.beike.otc.controller.otcController;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.pojo.ContractsBean;
import com.beike.otc.services.OTCservices.CreateContractServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author: yefeirong
 * @date: 2021/7/7 14:52
 * @describe:
 *
 *
 *      *代码值	BU名称  bu
 *      * P006	保险    6
 *      * P005	信用    5
 *      * P004	租赁    4
 *      * P003	新房    3
 *      * P002	装修    2
 *      * P001	房产    1
 *
 */
@Controller
public class CreateContractController {
    /**
     *创建合同
     */
    @Autowired
    private CreateContractServices createContractServices;
    @RequestMapping(value = {"/createContract"}, method = {RequestMethod.POST})
    @ResponseBody
    public void createContract(@RequestBody ContractParam contractParam)  {

        ContractsBean contractData = createContractServices.createContractData(contractParam);
        int add = createContractServices.add(contractData);
        System.out.println(add);
    }
}
