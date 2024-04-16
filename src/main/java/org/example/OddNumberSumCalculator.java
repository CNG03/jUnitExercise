package org.example;

public class OddNumberSumCalculator {
    public static int sumOfOddNumbers(int n) {
        if ( !(n == (int)n) ) {
            throw new IllegalArgumentException("n phải là một số nguyên");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n phải là một số không âm");
        }
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("n quá lớn để tính toán");
        }
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i%2 != 0) {
                sum += i;
            }
        }
        if (sum > Integer.MAX_VALUE) {
            throw new ArithmeticException("Tổng vượt quá giới hạn của kiểu int");
        }
        return (int)sum;
    }
//    public static void main(String[] args) {
//        System.out.println(OddNumberSumCalculator.sumOfOddNumbers(1));
//    }
}
