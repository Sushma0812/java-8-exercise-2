package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StringFormat {
    public static String findStringFormat(List<Integer> list) {
        System.out.println(list);
        //checks whether list is empty
        if (list.isEmpty()) {
            System.out.println("Give proper input not empty list");
        }
        //checks whether negative numbers are present in a list
        for (Integer number : list) {
            if (number < 0) {
                System.out.println("Give proper input not negative values");
            }
        }
        //even number is preceded with even and odd number is preceded with odd
        String result = list.stream().map(number1 -> number1 % 2 == 0 ? "even" + number1 : "odd" + number1).collect(joining(","));
        System.out.println(result);
        return null;
    }
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter size of the list");
        int listSize = reader.nextInt();
        //reads elements from the user
        System.out.println("Add numbers to list");
        for (int i = 0; i < listSize; i++) {
            Integer number = reader.nextInt();
            arrayList.add(number);
        }
        findStringFormat(arrayList);
    }
}
