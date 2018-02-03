package com.smart.tx;

import java.util.List;

public interface Cashier {
    //一个顾客买多本书：最后结账
    public void checkout(String username, List<String> isbns);
}
