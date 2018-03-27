package com.travel.common.util;

import java.util.Calendar;

/**
 * @author suhu
 */
public class DateUtils {
    
    
    /**
     * 当前月份
     * 
     * @return
     */
    public static int getMonth() {
        Calendar cale = Calendar.getInstance();
        int month = cale.get(Calendar.MONTH) + 1; 
        return month;
    }
    
}
