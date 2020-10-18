package com.itheima.service.Impl;

import com.itheima.daoTest.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}
