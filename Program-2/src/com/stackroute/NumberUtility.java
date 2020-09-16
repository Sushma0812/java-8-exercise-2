package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberUtility {
    //this method is used to calculate count of even numbers in a list
    public static long getEvenNumberCount(List<Integer> list) {
        long count = 0;
        if (list.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            count = list.stream().filter(number -> number % 2 == 0).count();
            System.out.println("The count of even numbers is:" + count);
        }
        return count;
    }

    //this method is used to calculate even multiples of three in a list
    public static List<Integer> getEvenMultiplesOfThree(List<Integer> list) {
        List<Integer> evenMultiplesOfThreeList = new ArrayList<>();
        if (list.isEmpty() || list.equals(null)) {
            System.out.println("The list is empty");
        } else {
            Stream<Integer> stream = list.stream().filter(number -> number % 2 == 0).filter(number -> number % 3 == 0);
            evenMultiplesOfThreeList = stream.collect(Collectors.toList());
            System.out.println("List of even multiples of three: " + evenMultiplesOfThreeList);
        }
        return evenMultiplesOfThreeList;
    }

    //this method is used to calculate maximum odd number in a list
    public static Integer getMaximumOfOddNumbers(List<Integer> list) {
        Integer result = 0;
        if (list.isEmpty() || list.equals(null)) {
            System.out.println("The list is empty");
        } else {
            result = list.stream().filter(number -> number % 2 != 0).max(Integer::compare).get();
            System.out.println("Maximum odd number of a list is: " + result);
        }
        return result;
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
        getEvenNumberCount(arrayList);
        getEvenMultiplesOfThree(arrayList);
        getMaximumOfOddNumbers(arrayList);
    }
}
