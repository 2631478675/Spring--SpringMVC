package com.smart.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cashier")
public class CashierImpl implements Cashier {
    @Autowired
    private BookService bookService;


    @Override
    public void checkout(String username, List<String> isbns) {
        for(String isbn:isbns){
            bookService.purchase(username, isbn);
        }
    }
}
