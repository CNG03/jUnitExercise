package org.example;

public class OddNumberSumCalculator {
    public static int sumOfOddNumbers(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException("n phải là một số không âm");
        }
        if (n >= Integer.MAX_VALUE - 1)
        {
            throw new IllegalArgumentException("n quá lớn để tính toán");
        }
        long sum = 0;
        for (int i = 0; i <= n; i++)
        {
            if (i%2 != 0) {
                sum += i;
            }
        }
        if (sum > Integer.MAX_VALUE)
        {
            throw new ArithmeticException("Tổng vượt quá giới hạn của kiểu int");
        }
        return (int)sum;
    }
}
