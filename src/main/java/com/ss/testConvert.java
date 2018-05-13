package com.ss;


import java.text.SimpleDateFormat;
import java.util.Date;

public class testConvert {

    //@Test
    public void testTime() {
        //Date date;
        SimpleDateFormat spfmt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(spfmt.format(1525486977928L));

    }
}
