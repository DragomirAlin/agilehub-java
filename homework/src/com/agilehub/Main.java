package com.agilehub;

import com.agilehub.homework1.Addition;
import com.agilehub.homework1.Homework;
import com.agilehub.homework1.Subtraction;

import java.io.IOException;
import java.sql.Array;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Homework homework = new Homework();

        // EX 1
        //homework.addNewKnowledge("C++");

        // EX 2
        //homework.checkRandomOptionalGen();

        // EX 3
        //homework.printResultOfRandomMethod();

        // EX 4
        var result = homework.calculateDifference(List.of(8,3,12,5,2,6,5));
        System.out.println(result);

        // EX 5
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("java");
//        arrayList.add("python");
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("md5");
//        linkedList.add("sha");
//
//        LinkedList<String> emptyList = new LinkedList<>();
//
//        homework.printElements(arrayList);
//        homework.printElements(emptyList);


        // EX 6
//        String htmlTemplate = homework.generateViewTemplate(Map.of("name","Alin","greeting","Ola!"));
//        System.out.println(htmlTemplate);

        // EX 7
//        String typeOfDay = homework.getTypeOfDay("SATURDAY");
//        System.out.println(typeOfDay);

        // EX 8
//        boolean res = homework.checkResultOperation(new Addition(2,2), new Subtraction(6,2));
//        System.out.println(res);

    }
}
