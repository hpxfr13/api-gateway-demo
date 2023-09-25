package com.microservices.client;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //int nums[] = {2,7,11,15};
        //twoSum(nums,9);

        //System.out.println(palindrome(111121111));
        //System.out.println(romanToInteger("XXVII"));
    }

    public static int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> hashMap = new HashMap<>();

            for(int i=0; i<nums.length; i++){

                Integer diff = target - nums[i];
                if(hashMap.containsKey(diff)){
                    int toReturn[] = {hashMap.get(diff), i};
                    return toReturn;
                }
                hashMap.put(nums[i],i);
            }

            return null;

    }

    public static boolean palindrome (int x) {
        String convertedString = String.valueOf(x);
        String reversedNum;
        for(int i=0;i<convertedString.length(); i++){
            if(convertedString.charAt(i) != convertedString.charAt(convertedString.length() - i - 1)){
                    return false;
            }
        }
        return true;
    }

    int M = 1000;

    public static int romanToInteger(String romanNum){
        int num = 0;
/*
        for (int i=0; i<romanNum.length(); i++) {
            if(romanNum.toUpperCase().charAt(i) = "M"){
                num += 1000;
            } else if (romanNum.contains("D")) {
                num += 500;
            }else if (romanNum.contains("C")) {
                num += 100;
            }else if (romanNum.contains("L")) {
                num += 50;
            }else if (romanNum.contains("X")) {
                num += 10;
            }else if (romanNum.contains("V")) {
                num += 5;
            }else if (romanNum.contains("I")) {
                num += 1;
            }else {
                System.out.printf("Invalid roman character!");
            }
        }
*/
        return num;

    }

}
