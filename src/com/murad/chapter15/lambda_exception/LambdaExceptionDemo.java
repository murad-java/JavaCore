package com.murad.chapter15.lambda_exception;

/**
 * @author Murad Salmanov (legenda)
 * @created 16/04/2021 - 23:56
 * @project JavaCore
 */
public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {904018.0,10.0,45000.0,12.0,45220.0};
        // Вычесление среднего значения из массива
        DoubleNumericArrayFunc average = n -> {
            double result = 0;
            if (n.length == 0) throw new EmptyArrayException();

            for (int i = 0; i < n.length; i++)
                result += n[i];
            return result/n.length ;
        };
        System.out.println("Среднее из массива равно дате моего рождения: "+average.func(values));
        System.out.println("Это приведет к ошибке "+average.func(new double[0]));
    }
}
