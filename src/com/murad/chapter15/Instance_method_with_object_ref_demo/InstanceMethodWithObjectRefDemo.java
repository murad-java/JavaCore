package com.murad.chapter15.Instance_method_with_object_ref_demo;

/**
 * @author Murad Salmanov (legenda)
 * @created 17/04/2021 - 7:06
 * @project JavaCore
 */
public class InstanceMethodWithObjectRefDemo {

    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;

        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayhighs = {new HighTemp(89), new HighTemp(82),
                                   new HighTemp(90), new HighTemp(89),
                                   new HighTemp(89), new HighTemp(91),
                                   new HighTemp(84), new HighTemp(83)};
        count = counter(weekDayhighs, HighTemp::sameTemp,
                        new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была 89: "+count);

        HighTemp[] weekDayhigh2 = {new HighTemp(32), new HighTemp(12),
                                   new HighTemp(24), new HighTemp(19),
                                   new HighTemp(18), new HighTemp(12),
                                   new HighTemp(-1), new HighTemp(12)};
        count = counter(weekDayhigh2,HighTemp::sameTemp,new HighTemp(12));
        System.out.println("Дней, когда максимальная температура была 12: "+count);

        count=counter(weekDayhighs,HighTemp::lassThanTemp,new HighTemp(89));
        System.out.println("Дней, когда максимальная температура была меньше 89: "+count);

        count=counter(weekDayhigh2,HighTemp::lassThanTemp,new HighTemp(19));
        System.out.println("Дней, когда максимальная температура была меньше 19: "+count);
    }
}
