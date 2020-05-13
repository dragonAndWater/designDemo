package com.company.strategy策略模式.util;

import com.company.strategy策略模式.model.RealTimePayModel;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class ModelUtil {
    /**
     * @Describe 使用反射获取对象的属性名称
     * 此方法不适用，应为极可能存在两个字段值相同，但是两个字段的长度检查不一致
     *
     **/
    public static String getParamNamesAndValues(Object o,String value) {
        try {
            Field[] fields = o.getClass().getDeclaredFields();
            String[] fieldNames = new String[fields.length];
            for (int i = 0; i < fields.length; i++) {
                fieldNames[i] = fields[i].getName();
                Field f = o.getClass().getDeclaredField(fieldNames[i]);
                f.setAccessible(true);
                String s = (String)f.get(o);
                if(value == s){
                    return fieldNames[i];
                }
            }
        }catch (NoSuchFieldException e){
            System.out.println("没有对应的属性名");
        }catch (IllegalAccessException e){
            System.out.println(".....");
        }
        return "";
    }

    /**
     * @Describe 使用反射获取对象的属性名称
     **/
    public static String[] getParamNames(Object o){
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
            System.out.println(fieldNames[i]);
        }
        return fieldNames;
    }

    /**
     * @Describe 使用反射获取对象的属性值
     **/
    public static String getParamValue(Object o) throws NoSuchFieldException, IllegalAccessException {
        Field f = o.getClass().getDeclaredField("payeeAcctName");
        f.setAccessible(true);
        return (String)f.get(o);
    }
//    public static void main(String[] args) {
//        try {
//            RealTimePayModel model = new RealTimePayModel();
//            model.setPmcNo("Allinpay");
//            model.setPmcName("平安支付");
//            model.setRefNo("202005130199308120001");
//            model.setPayerAcctNo("6210253100030056578");
//            model.setPayerAcctName("付款人张三");
//            model.setPayeeAcctNo("6303456070009039125");
//            model.setPayeeAcctName("收款人李四");
//            model.setAmount(new BigDecimal(100.00));
//            //反射获取model的所有属性名
//            String[] params = getParamNames(model);
//            //反射获取私有属性值
//            System.out.println(getParamValue(model));
//            //反射获取get方法的属性名
//            System.out.println("11111 = :"+getParamNamesAndValues(model,model.getPayeeAcctName()));
//          }
//        }catch (Exception e){
//        }
//    }

}
