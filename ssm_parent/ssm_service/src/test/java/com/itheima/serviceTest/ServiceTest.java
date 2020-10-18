package com.itheima.serviceTest;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-service.xml");
        ItemsService itemsService = (ItemsService)applicationContext.getBean("itemsServiceImpl");
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
