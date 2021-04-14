package cn.edu.xjtlu.cpt105.week5;

import java.util.Scanner;

public class IA {
    static Scanner scanner = new Scanner(System.in);

//    static double func(double n) {
//        return
//    }

    public static int calcNetIncome(String input) {

        // 判断第一个数字字符前是否为 '-' 的负数标识
        boolean negativeFlag = false;

        // 总和的变量
        int sum = 0;

        for (int i = 0,
             tempSum = 0 /*缓存和变量*/;
             i < input.length(); i++) {

            // 如果当前符号为数字 '0' ~ '9'：
            if (Character.isDigit(input.charAt(i))) {
                // 缓存和 = 缓存和 * 10 + 字符的数字
                tempSum = (tempSum*10) + Integer.parseInt(String.valueOf(input.charAt(i)));

                // 判断是否数字前有'-' 如果为真将负数标识设为真
                if (i != 0/*如果第一个字符是数字这个数字前不可能有'-'*/ && input.charAt(i-1) == '-') {
                    negativeFlag = true;
                }

            // 如果当前符号非数字：
            } else {
                if (negativeFlag) tempSum *= -1; // 当负数标识为真时将缓存和设为负数
                negativeFlag = false;         // 重置负数标识
                sum += tempSum;                  // 将缓存和加入总和
                tempSum = 0;                     // 缓存和清零
            }

            // 如果字符串以数字结尾则没有下一个非数字符号来吧缓存加入总和
            // 因此要再在最后一个符号是运行加入将缓存和总和&判断负数
            // 如果结尾是复数个非数字字符串也无所谓因为届时缓存和必定为0
            if (i == input.length()-1) {
                if (negativeFlag) tempSum *= -1;
                sum += tempSum;
            }
        }
        // 回传总和
        return sum;
    }


    public static void main(String[] args) {
        System.out.print("Enter a ratio (in decimal):");
        double ratio = scanner.nextDouble();

    }
}
