package com.passport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//from  w ww .j  a v  a  2  s .  c  om
public class DateConversion {

    private static SimpleDateFormat inSDF = new SimpleDateFormat("mm/dd/yyyy");
    private static SimpleDateFormat outSDF = new SimpleDateFormat("yyyy/mm/dd");

    public static String formatDate(String inDate) {
        String outDate = "";
        if (inDate != null) {
            try {
                Date date = inSDF.parse(inDate);
                outDate = outSDF.format(date);
            } catch (ParseException ex){
            }
        }
        return outDate;
    }

    public static void main(String[] args) {
        System.out.println(DateConversion.formatDate("12/10/2013"));
    }

}
