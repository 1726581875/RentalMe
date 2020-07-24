package com.util;

import java.util.Random;

import com.pojo.Item;
import com.pojo.Orders;

public class MyTools {

    public static final boolean isStringEmpty(String... strArray) throws Exception {
        for (String str : strArray)
            if (str == null || str.equals("") || str.equals("null"))
                return true;
        return false;
    }

//    计算时间 判断时间是否大于/小于借时, 不合法返回-1
    public static int countCheckoutTime(Item item, long diff) {
        int time = -1;
        if (item.getCounttype().equals(CommonsState.ITEM_COUNTTYPE_HOUR)) {
            time = (int) (diff / 1000 / (60 * 60));
        } else if (item.getCounttype().equals(CommonsState.ITEM_COUNTTYPE_DAY)) {
            time = (int) (diff / 1000 / (60 * 60 * 24));
        }
        if (time > item.getMaxtime() || time < item.getMintime()) {
            return -1;
        }
        return time < 0 ? -1 : time;
    }

//    生成四位随机数
    public static String getFourRandom() {
        Random random = new Random();
        String fourRandom = random.nextInt(10000) + "";
        int randLength = fourRandom.length();
        if (randLength < 4) {
            for (int i = 1; i <= 4 - randLength; i++)
                fourRandom = "0" + fourRandom;
        }
        return fourRandom;
    }

//    因为续借没有详细做,这里就简单做一下计算实际要付的钱, 如果有续借和超时则实际情况比
//    这个复杂得多
    public static int countRealPay(Orders orders, Item item) {
        // TODO Auto-generated method stub
        long realRentalTimestamp = orders.getReturnconfirmdate().getTime() - 
                orders.getLoanconfirmdate().getTime();
        int realRentalTime = 0;
        if (item.getCounttype().equals(CommonsState.ITEM_COUNTTYPE_HOUR)) {
            realRentalTime = (int)(realRentalTimestamp / 1000 / (60 * 60));
        } else if (item.getCounttype().equals(CommonsState.ITEM_COUNTTYPE_DAY)) {
            realRentalTime = (int)(realRentalTimestamp / 1000 / (60 * 60 * 24));
        } 
        int realPay = realRentalTime * item.getBasepayment();
        return realPay;
    }
    
    
    
    
    
    
    
    
    
    
    

}
