package com.beike.otc.controller.otcController;
 
import com.beike.otc.Exception.ExcelException;
import com.beike.otc.pojo.ContractsBean;
import com.beike.otc.services.OTCservices.CreateContractServices;
import com.beike.otc.utils.ExcelUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
 
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
 
@Controller
public class ExcelController {
 
    @Autowired
    private CreateContractServices createContractServices;

    /**
     * 导入带有表头注解的Java实体类模型
     * 导入单个Excel表
     * 
     * @param excel 上传的Excel文件
     */
    @RequestMapping(value="/uploadExcel")
    public void uploadExcel(@RequestParam(value="file") MultipartFile excel){
 
        InputStream inputStream = null;
 
        try {
            //判断文件后缀是否以.xls 或者 .xlsx 结尾
            boolean flag = ExcelUtils.determineExcelIsFormatted(excel);
            if (!flag){
                throw new ExcelException("文件格式有误");
            }
 
            //获取文件输入流
            inputStream = excel.getInputStream();
            //获得ContractsBean实体类对象集合
            List<ContractsBean> contractsBeansList = (List<ContractsBean>) ExcelUtils.readExcel(inputStream, ContractsBean.class, 1);
            //批量插入到数据库user表中
            createContractServices.add(contractsBeansList);
 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭字节输入流，释放资源
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
 
    
    /**
     * 导出带有表头注解的Java实体类模型
     * 导出模板，用于填写导入数据
     * 
     * @param response HttpServletResponse响应
     */
    @RequestMapping(value="/downLoadExcelTemplate")
    public void downLoadExcelTemplate(HttpServletResponse response){
        //设置Excel表的名称
        String fileName = "导出模板";
        //设置文件响应信息，并获得字节输出流
        OutputStream outputStream = ExcelUtils.setResponse(fileName, response);
        //把数据写入到Excel表格中
        ExcelUtils.writeExcel(outputStream,ContractsBean.class,null);
 
        //关闭字节输入流，释放资源
        if(outputStream != null){
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
    }
 
    
    /**
     * 导出Excel数据表文件
     * 
     * @param response HttpServletResponse响应
     */
    @RequestMapping(value="/downLoadExcel")
    public void downLoadExcel(HttpServletResponse response){
 
        //设置Excel表的名称
        String fileName = "contract信息详情";
        //获得contract实体类对象集合
        List<ContractsBean> contracts = createContractServices.selectAllOfContract();
        //设置文件响应信息，并获得字节输出流
        OutputStream outputStream = ExcelUtils.setResponse(fileName, response);
        //把数据写入到Excel表格中
        ExcelUtils.writeExcel(outputStream,ContractsBean.class,contracts);
 
        //关闭字节输入流，释放资源
        if(outputStream != null){
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
}