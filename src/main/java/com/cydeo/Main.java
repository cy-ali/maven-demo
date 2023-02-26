package com.cydeo;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
//        FileInputStream myExcelFile = new FileInputStream("/src/main/resources/demoExcel.xlsx");
//
//        Workbook workbook = WorkbookFactory.create(myExcelFile);

        System.out.println(isPalindrome(" Marge, let's \"[went].\" I await {news} telegram."));

    }

    public static int[] findThreeLargestNumbers(int[] array) {

        int[] largestNums = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        for (int each : array) {
            if (each > largestNums[0]) {
                largestNums[0] = each;
                if (largestNums[0] > largestNums[1]) {
                    largestNums[0] = largestNums[1];
                    largestNums[1] = each;
                }
                if (largestNums[1] > largestNums[2]) {
                    largestNums[1] = largestNums[2];
                    largestNums[2] = each;
                }
            }


        }

        return largestNums;
    }

    public static boolean isPalindrome(String str) {
        str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                str = str.replace(""+str.charAt(i) , "");
            }
        }

        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;

            }
        }
        return true;
    }
}