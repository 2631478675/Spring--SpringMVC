package com.smart.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class Test {
    private ApplicationContext ctx = null;
    //进行内部的库存等的改动操作
    private BookShopDao bookShopDao = null;
    //进行购买操作
    private BookService bookService = null;
    //验证事物的传播行为
    private Cashier cashier = null;

    {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        bookShopDao = ctx.getBean(BookShopDao.class);
        bookService = ctx.getBean(BookService.class);
        cashier = ctx.getBean(Cashier.class);
    }

    @Test
    public void testTransactionlPropagation(){
        cashier.checkout("AA", Arrays.asList("1001", "1002"));
    }

    @Test
    public void testBookService(){
        bookService.purchase("AA", "1001");
    }

    @Test
    public void testBookShopDaoUpdateUserAccount(){
        bookShopDao.updateUserAccount("AA", 200);
    }

    @Test
    public void testBookShopDaoUpdateBookStock(){
        bookShopDao.updateBookStock("1001");
    }

    @Test
    public void testBookShopDaoFindPriceByIsbn() {
        System.out.println(bookShopDao.findBookPriceByIsbn("1001"));
    }
}
