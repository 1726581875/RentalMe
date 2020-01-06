package com.util;

public class MyTools {

    public static final boolean isStringEmpty(String... strArray) throws Exception{
        for (String str : strArray)
            if (str == null || str.equals("") || str.equals("null"))
                return true;
        return false;
}
    
}
