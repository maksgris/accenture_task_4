package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args) {


        // First exercise

        String[] colors = {"red", "orange", "yellow", "green", "blue", "violet", "magenta"};
        ArrayList<String> colorsList = new ArrayList<String>();
        for (String color : colors)
            colorsList.add(color);
        colorsList.remove(2);
        colorsList.add("black");
        colorsList.add(0, "white");
        for (String color : colorsList)
            System.out.print(String.format("%s ", color));
        System.out.print("\n");
        ArrayList<String> colorsSublist = new ArrayList<String>();
        for (int i = 2; i <= 5; i++)
            colorsSublist.add(colorsList.get(i));
        for (String color : colorsSublist)
            System.out.print(String.format("%s ", color));

        // Second exercise

        System.out.println(String.format("There are %d unique words in text.", Text.textSplit().size()));


    }
}
