package cn.edu.xjtlu.cpt101;

import java.util.Arrays;
import java.util.Stack;

public class IP {

    public static void main(String[] args) {
        long input = 2752186723L;
        String ip = longToIP(input);
        long output = IPtoLong(ip);
        System.out.println(ip);
        System.out.println(output);


    }

    // all possible symbols to represent the input number
    static final char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'A' , 'B' ,
            'C' , 'D' , 'E' , 'F' , 'G' , 'H' ,
            'I' , 'J' , 'K' , 'L' , 'M' , 'N' ,
            'O' , 'P' , 'Q' , 'R' , 'S' , 'T' ,
            'U' , 'V' , 'W' , 'X' , 'Y' , 'Z'
    };

    public static String longToIP(long l) {
        StringBuilder result = new StringBuilder();
        Stack<Long> remaindersQueue = new Stack<>();
        while (l >= 1) {
            remaindersQueue.push(l % 256);
            l /= 256L;
        }
        while (!remaindersQueue.isEmpty()) {
            result.append(remaindersQueue.pop()).append(".");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }

    public static long IPtoLong(String ip) {
        String[] groups = ip.split("\\.");
        System.out.println(Arrays.toString(groups));
        long address = 0;
        for (String group : groups){
            address += Long.parseLong(group);
            address *= 256L;
        }
        return address;
    }
}
