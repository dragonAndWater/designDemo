package com.reflect;

import java.awt.print.Book;
import java.math.BigDecimal;

class BookInfo {
    //静态变量
    private static final String REMARK = "图书信息";
    static final String NAME = "静态Name";
    //私有属性
    private String bookName;
    //共有属性
    public BigDecimal bookPrice;

    public BookInfo() {
    }

    //构造方法
    public BookInfo(String bookName, BigDecimal bookPrice) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    //私有的构造方法
    private BookInfo(String bookName){
        this.bookName = bookName;
    }


    //私有方法
    private String getBookInfo(String bookName,BigDecimal bookPrice){
        return "有参私有方法："+bookName+","+bookPrice;
    }
    //私有方法
    private String getBookInfo(){
        return "无参私有方法："+bookName+","+bookPrice;
    }

    //静态方法
    private static String getREMARK() {
        return REMARK;
    }


    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }
}
