package com.gundam.health.service;

import com.gundam.health.pojo.CheckItem;
import com.gundam.health.pojo.PageResult;
import com.gundam.health.pojo.QueryPageBean;

import java.util.List;

public interface CheckItemService {
    /**
     * 查询所有检查项
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 分页条件查询
     * @param queryPageBean
     * @return
     */
    PageResult<CheckItem> findPage(QueryPageBean queryPageBean);
}
