package com.example.udemyjavacourse.udemy_section_nine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TheArraysListChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        List<String> items = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 0: System.out.println("Shutting down.");
                break;
                case 1 : add(items);
                break;
                case 2 : delete(items);
                break;
                default : flag = false;
            }
            items.sort(Comparator.naturalOrder());
            System.out.println(items);
        }
    }

    private static void printActions() {

        System.out.println("Available actions:");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to add items(s) to list (comma delimited list)");
        System.out.println("2 - to remove any items (comma delimited list)");
        System.out.println("Enter a number for which action you want to do:" + " ");
    }

    private static void add(List<String> items) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] itemsToAdd = scanner.nextLine().trim().split(",");

        for (String item : itemsToAdd) {
            if (!items.contains(item.trim())) {
                items.add(item);
            }
        }
    }

    private static void delete(List<String> items) {
        System.out.println("Delete item(s) [separate items by comma]:");
        String[] itemsToDelete = scanner.nextLine().trim().split(",");

        items.removeAll(List.of(itemsToDelete));
    }
}
