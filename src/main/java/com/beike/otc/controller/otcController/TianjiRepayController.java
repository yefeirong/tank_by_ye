package com.beike.otc.controller.otcController;

import com.beike.otc.bean.otcBean.ContractParam;
import com.beike.otc.services.OTCservices.CreateContractServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: yefeirong
 * @date: 2021/7/16 16:34
 * @describe:
 */
@Controller
public class TianjiRepayController {
    @Autowired
    private CreateContractServices createContractServices;
    @RequestMapping(value = {"/tianjiRepay"}, method = {RequestMethod.POST})
    @ResponseBody
    public void tianjiRepay(@RequestBody ContractParam contractParam)  {





    }
}
