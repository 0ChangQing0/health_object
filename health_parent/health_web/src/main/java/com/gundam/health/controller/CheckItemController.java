package com.gundam.health.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gundam.health.common.MessageConstant;
import com.gundam.health.pojo.CheckItem;
import com.gundam.health.pojo.PageResult;
import com.gundam.health.pojo.QueryPageBean;
import com.gundam.health.pojo.Result;
import com.gundam.health.service.CheckItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkitem")
public class CheckItemController {

    @Reference
    private CheckItemService checkItemService;

    /**
     * 查询所有检查项
     * @return
     */
    @GetMapping("/findAll")
    public Result findAll() {
        //调用服务查询所有检查项
        List<CheckItem> list = checkItemService.findAll();
        //封装返回结果
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, list);
    }

    /**
     * 分页条件查询
     * @param queryPageBean
     * @return
     */
    @PostMapping("/findPage")
    public Result findPage(@RequestBody QueryPageBean queryPageBean) {
        //调用业务层方法，获取分页结果
        PageResult<CheckItem> pageResult = checkItemService.findPage(queryPageBean);
        //封装结果，返回给页面
        return new Result(true, MessageConstant.QUERY_CHECKITEM_SUCCESS, pageResult);
    }
}
