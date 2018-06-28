package com.documendation.designpatterns.common;

/**
 * 字符串的应用
 */
public class StringApplication {

    public static void main(String[] args){
        //(1)创建一个字符串
        //creatString();

        //（2）获取字符串的长度
        //getStringLength();

        //(3)获取字符串某个位置的字符
        //getStringOption();

        //(4)提取字符串
        //getsubString();

        //（5）字符串的比较
        //compareTo();

        //(6)字符串的连接
        //StringContat();

        //(7)字符串的查找
       // queryString();
        //(8)字符串的替换
        // replaceString();
        //(9)字符串的数组
       // spiltString();
        //(10)字符串去掉空格,去掉前后两端的空格
      //  delTirm();
        //(11)字符串的转换
       // parse();
        //(12)字符串的转换
        //BytetoString();

        //(13)stringbuffer
        getStringbuffer();
    }
    //创建字符串对象
    public static void creatString(){
        String str="abc";
        String str1=new String(str);
        System.out.println("---->equals:"+str.equals(str1));//比较的是字符串的内存存放地址
        System.out.println("----->=="+str==str1);//比较的是字符串的值
    }
    //获取字符串的长度
    public static void getStringLength(){
        String str2="wenjie is a good student";
        System.out.println("------>"+str2.length());
    }

    /**
     * 获取字符串某个位置的字符
     */
    public static void getStringOption(){
        String str2="wenjie is a good student";
        System.out.println("---->获取字符串的某个字符的位置："+str2.charAt(7));
    }

public static  void getsubString(){
    String str2="wenjie is a good student";
    String str3=str2.substring(7,20);
    System.out.println("从某个位置到另一个位置字符串的提取："+str3);
    //从某个字符串起开始提取
    System.out.println("---->"+str3.substring(7));
}

    /**
     * 字符串的比较
     */
    public static void compareTo(){
        String  name="wangmingr";
        String name1="wangmdng";
        System.out.println("字符串比较："+name.compareTo(name1));
}

    /**
     * 字符串的连接
     */
    public static  void StringContat(){
        String firstName="wang";
        String lastName="ming";
    System.out.println("字符串的链接："+firstName.concat(lastName));

}

    /**
     * 字符串的查找
     */
    public  static  void  queryString(){
        String userName="wenjie2018";
        int num=userName.indexOf("jie");
        System.out.println("--->查找返回的位置："+num);
}

    /**
     * 字符串的替换
     */
    public static  void replaceString(){
        String userName="zhangwenjie";
        String userName1=userName.replace("wen","xiao");
        System.out.println("替换前："+userName);
        System.out.println("替换后："+userName1);

        String time="2018-06-22 12:30:00";
        String time1=time.replace("-","");
        String time2=time1.replace(" ","");
        String time3=time2.replace(":","");
        System.out.println("time替换前:"+time);
        System.out.println("time替换后:"+time3);

}

    /**
     * 字符串的分开
     */
    public static void spiltString(){
    String time="2018-06-22 12:30:00";
    String[] times=new String[20];
    times=time.split("-");
    for (int i = 0; i <times.length ; i++) {
        System.out.println("分开后的字符串："+times[i]);
    }
}

    /**
     * 去掉字符串的空格
     */
    public static void delTirm(){
       String passwd=" 123 4 56 ";
       String pwd=passwd.trim();
        System.out.println("去掉空格前："+passwd);
        System.out.println("去掉空格后："+pwd);
}

public static  void parse(){
        String str="7";
        int str1=Integer.valueOf(str);
        int str3=str1+2;
    System.out.println("--->"+str3);
    String str4=str+2;
    System.out.println("String不强转："+str4);
}

    /**
     * 字节与字符串的转换
     */
    public static void BytetoString(){
        byte[] buf={(byte)97,(byte) 256};

        String str=new String(buf);
        System.out.println("-->字节："+buf[0]);
        System.out.println("-->字符："+str);
}

public static  void getStringbuffer(){
        String str="wen";
        StringBuffer sb=new StringBuffer(str);
        sb.append("xml");
    System.out.println("---->stringbuffer:"+sb);
}

}