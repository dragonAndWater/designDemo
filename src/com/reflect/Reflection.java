package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;

public class Reflection {
    public static void main(String[] args) {
        BookInfo book = new BookInfo("java", new BigDecimal("59.50"));

        try {
            //获取静态属性值 -- newInstance
            getStaticValue();

            //获取有值bean的私有属性
            getPrivateName(book);

            //获取有值bean的私有方法
            getPrivateMethodNoParam(book);
            getPrivateMethodWithParam(book);

            //获取属性/方法/类的修饰符
            getModifier(book);

            //获取所有属性--数组
            getArrayField(book);

            getPrivateMethodNew();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //获取静态属性值
    public static String getStaticValue() throws Exception {
        Class<?> bookClass = Class.forName("com.reflect.BookInfo");
        Object book = bookClass.newInstance();//创建一个实例，静态变量在创建实例时就存在值了。

        Field bookName = bookClass.getDeclaredField("REMARK");
        bookName.setAccessible(true);//设置是否可以得到

        String name = (String) bookName.get(book);

        System.out.println("------------------------------");
        System.out.println("获取私有静态变量属性 = " + bookName);
        System.out.println("获取私有静态变量属性的值= " + name);

        return name;
    }

    //获取有值bean的私有属性
    public static void getPrivateName(BookInfo bookInfo) throws Exception {
        Class<?> bookClass = bookInfo.getClass();

        Field field = bookClass.getDeclaredField("bookName");
        field.setAccessible(true);

        String bookName = (String) field.get(bookInfo);

        System.out.println("------------------------------");
        System.out.println("获取有值bean的私有属性 = " + field);
        System.out.println("获取有值bean的私有属性 = " + bookName);
    }


    //获取有值bean的私有方法
    public static void getPrivateMethodNoParam(BookInfo bookInfo) throws Exception {
        Class<?> bookClass = bookInfo.getClass();
        //不需要newInstence()
        Method method = bookClass.getDeclaredMethod("getBookInfo");
        method.setAccessible(true);

        String str = (String) method.invoke(bookInfo);

        System.out.println("------------------------------");
        System.out.println("获取有值bean的无参私有方法 = " + method);
        System.out.println("获取有值bean的无参私有方法返回值 = " + str);
    }

    //获取有值bean的私有方法
    public static void getPrivateMethodWithParam(BookInfo bookInfo) throws Exception {
        Class<?> bookClass = bookInfo.getClass();
        //不需要newInstence()
        Method method = bookClass.getDeclaredMethod("getBookInfo",String.class,BigDecimal.class);
        method.setAccessible(true);

        String str = (String) method.invoke(bookInfo,"C++",new BigDecimal("66.60"));

        System.out.println("------------------------------");
        System.out.println("获取有值bean的有参私有方法 = " + method);
        System.out.println("获取有值bean的有参私有方法返回值 = " + str);
    }

    //获取属性/方法/类的修饰符
    public static void getModifier(BookInfo bookInfo) throws Exception {
        Class<?> bookClass = bookInfo.getClass();
        //不需要newInstence()
        int i = bookClass.getDeclaredField("NAME").getModifiers();
        String modifier = Modifier.toString(i);

        System.out.println("------------------------------");
        System.out.println("属性/方法/类名的修饰符值 = " + i);
        System.out.println("属性/方法/类名的修饰符值,对应的修饰符为 = " + modifier);
//        PUBLIC: 1
//        PRIVATE: 2
//        PROTECTED: 4
//        STATIC: 8
//        FINAL: 16
//        SYNCHRONIZED: 32
//        VOLATILE: 64
//        TRANSIENT: 128
//        NATIVE: 256
//        INTERFACE: 512
//        ABSTRACT: 1024
//        STRICT: 2048
    }

    //遍历所有属性
    public static void getArrayField(BookInfo bookInfo) throws Exception {
        Class<?> bookClass = bookInfo.getClass();
        Field[] fields = bookClass.getDeclaredFields();
        System.out.println("------------------------------");
        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println("遍历循环属性名 = " + f);

            String modifer = Modifier.toString(f.getModifiers());
            System.out.println("遍历循环属性名对应的修饰符 = "+ modifer);

            Object str = f.get(bookInfo);//此处应用Obeject,因为有String,BigDecimal等
            System.out.println("遍历循环属性名对应的值 = " + str);
        }

        //getDeclareField()和getField()的区别：getField只获取pubic的,底层privateGetDeclaredFields（false）
        System.out.println("------------------------------");
        Field[] fields1 = bookClass.getFields();
        for(Field f:fields1){
//            f.setAccessible(true);//public 可以不使用setAccessible
            System.out.println("遍历循环属性名 = " + f);

            String modifer = Modifier.toString(f.getModifiers());
            System.out.println("遍历循环属性名对应的修饰符 = "+ modifer);

            Object str = f.get(bookInfo);//此处应用Obeject,因为有String,BigDecimal等
            System.out.println("遍历循环属性名对应的值 = " + str);
        }
    }




    //获取私有方法
    public static void getPrivateMethodNew() throws Exception {
        Class<?> bookClass = Class.forName("com.reflect.BookInfo");
        Object object = bookClass.newInstance();

        System.out.println("bookClass.getSimpleName() = "+bookClass.getSimpleName());//获取类名
        Method method = bookClass.getDeclaredMethod("getBookInfo", String.class, BigDecimal.class);
        method.setAccessible(true);

        String str = (String) method.invoke(object, "C++", new BigDecimal("99.50"));

        System.out.println("------------------------------");
        System.out.println("获取私有属性名称 = " + method);
        System.out.println("获取私有属性的值 = " + str);
    }

}
