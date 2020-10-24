package com.gundam.health.dao;

import com.github.pagehelper.Page;
import com.gundam.health.pojo.CheckItem;

import java.util.List;

public interface CheckItemDao {
    /**
     * 查询所有检查项
     * @return
     */
    List<CheckItem> findAll();

    /**
     * 分页条件查询
     * @param queryString
     * @return
     */
    Page<CheckItem> findPage(String queryString);
}
