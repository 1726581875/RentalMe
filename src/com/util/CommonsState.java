package com.util;

import com.pojo.Item;
import com.pojo.User;

public class CommonsState {
//    user role
    public static int USER_ROLE_USER = 0;
    public static int USER_ROLE_ADMIN = 1;
//    user state
    public static int USER_STATE_NORMAL = 0;
    public static int USER_STATE_LOCK = 1;
    public static int USER_STATE_UNPAY = 2;
    public static int USER_STATE_UNCERTIFIED = 3;
    
//    item state
    public static int ITEM_STATE_ENABLE = 1;
    public static int ITEM_STATE_DISABLE = 0;
//    review review
    public static int REVIEW_STATE_PRAISE = 1;
    public static int REVIEW_STATE_BAD = 0;
//    order status
    public static String BUYER_UNPAYMENT = "买家未付款";
    public static String BUYER_CANCELLED = "买家已取消";
    public static String SALLER_CANCELLED = "卖家已取消";
    public static String SALLER_UNLOAN = "卖家未借出";
    public static String BUYER_UNRETURNED = "买家未还";
    public static String UNREVIEW = "未评价";
    public static String BUYER_REVIEW = "买家已评价";
    public static String SALLER_REVIEW = "卖家已评价";
    public static String BUYER_UNPAY_BALANCE = "买家未付尾款";
    public static String BOTH_REVIEW = "双方已评价";
    
    
    
    
    
    
}
