package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String doubleChar(String s){
        char[] charArray = s.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for(int i = 0; i < charArray.length;i++) {
            strBuilder.append(charArray[i]);
            strBuilder.append(charArray[i]);
        }
        return strBuilder.toString();
    }
}