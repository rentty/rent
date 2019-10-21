package com.rent.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static Date toDate(String booktime) throws ParseException {

        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        date = format.parse(booktime);
        return date;
    }
}
