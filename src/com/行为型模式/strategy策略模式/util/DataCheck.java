package com.行为型模式.strategy策略模式.util;

import com.行为型模式.strategy策略模式.definedException.DataCheckException;

public class DataCheck {
    /**
     * @Author longtao
     * @Date   2020/5/13
     * @Describe 非空检查--字符串
     **/
    public static void checkEmpty(String dataName,String data) throws DataCheckException{
        if(null == data || "".equals(data.trim())){
           throw new DataCheckException("字段[ "+dataName+" ]不能为空");
        }
    }
    /**
     * @Author longtao
     * @Date   2020/5/13
     * @Describe 长度检查--字符串
     **/
    public static void checkLength(String dataName,String data,int minLength,int maxLength) throws DataCheckException{
        checkEmpty(dataName,data);
        if(!checkLength(data,minLength)){
            //未达到最小长度
            throw new DataCheckException("字段[ "+dataName+" ]未达最小长度");
        }
        if(checkLength(data,maxLength)){
            //超出了最大长度
            throw new DataCheckException("字段[ "+dataName+" ]超出最大长度");
        }
    }
    /**
     * @Author longtao
     * @Date   2020/5/13
     * @Describe 最大长度检查--字符串
     **/
    public static void checkLength(String dataName,String data,int maxLength)throws DataCheckException{
        if(checkLength(data,maxLength)){
            //超出了最大长度
            throw new DataCheckException("字段[ "+dataName+" ]超出最大长度");
        }
    }
    /**
     * @Author longtao
     * @Date   2020/5/13
     * @Describe 字符串是否大于某长度
     **/
    private static Boolean checkLength(String dataName,int length){
        if(dataName.length() > length){
            return true;
        }
        return false;
    }

}
