package com.murad.chapter15.lamЬdas_as_arguments_demo;


/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 23:18
 * @project JavaCore
 */
public class LambdaAsArgumentsDemo {
    static  String stringOp(StringFunc sf,String str){
        return sf.func(str);
    }

    public static void main(String[] args) {
        String inStr="Лямбда выражения повышают эффективнисть JAVA";
        String outStr;
        System.out.println("Это исходная строка "+inStr);

        outStr=stringOp(str ->str.toUpperCase(),inStr);
        System.out.println("Это строка в вверхнем регистре "+outStr);

        outStr=stringOp(str->{
            String result="";
            int i;
            for(i=0;i<str.length();i++)
                if(str.charAt(i)!=' ')
                    result+=str.charAt(i);
                return result;
        },inStr);
        System.out.println("Это строка с удалеными пробеломи "+ outStr);

        StringFunc revers=str->{
          String result="";
          int i;
          for(i=str.length()-1;i>=0;i--)
              result+=str.charAt(i);
          return result;
        };

        outStr=stringOp(revers,inStr);
        System.out.println("Это перевернутая строка "+outStr);
    }
}
