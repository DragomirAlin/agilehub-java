package com.agilehub.homework1;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.hubspot.jinjava.Jinjava;

import java.io.IOException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Homework {

    private Random random = new Random();

    // EX 1
    public Map<Integer, String> maxExempleWithOf() {
        return Map.of(1, "JAVA", 2, "Python", 3, "C#");
    }

    // EX 1
    public Map<Integer, String> mapExemple() {
        var knowlegdeMap = new HashMap<Integer, String>();
        knowlegdeMap.put(1, "JAVA");
        knowlegdeMap.put(2, "Python");
        knowlegdeMap.put(3, "C#");

        return knowlegdeMap;
    }

    // EX 1
    public void addNewKnowledge(String newThing) {
        maxExempleWithOf().put(maxExempleWithOf().size() + 1, newThing); // Don`t run because collection is immutable and it don`t accept new thing into map
        mapExemple().put(mapExemple().size() + 1, newThing); // Works, because it is not immutable

    }

    // EX 2
    public Optional<Integer> randomOptionalGenerator() {
        var randomNumber = getRandomNumber();
        return switch (randomNumber) {
            case 1 -> Optional.of(1);
            default -> Optional.empty();
        };
    }

    // EX 2
    public void checkRandomOptionalGenerator() {
        randomOptionalGenerator().orElseThrow();
    }

    public int getRandomNumber() {
        return random.nextInt(5);
    }

    // EX 3
    public Optional<?> randomOptionalGeneratorTwo() {
        var randomNumber = getRandomNumber();
        return switch (randomNumber) {
            case 1 -> Optional.of(1);
            case 2 -> Optional.of(2);
            case 3 -> Optional.of("ups");
            default -> Optional.empty();
        };
    }

    // EX 3
    public void printResultOfRandomMethod() {
        randomOptionalGeneratorTwo().ifPresentOrElse(System.out::println,
                () -> System.out.println("You`re reached the end of INT"));
    }


    // EX 4
    public int calculateDifference(List<Integer> listNumbers) {
//       var max = listNumbers.stream().reduce(0,Integer::max);;
//       var min = listNumbers.stream().reduce(0,Integer::min);
//       max.getAsInt() - min;     first idea for solve this ex

        var result = listNumbers.stream().collect(Collectors.teeing(
                Collectors.reducing(0, Integer::max),
                Collectors.reducing(0, Integer::min),
                (max, min) -> max - min
        ));
        return result;
    }

    // EX 5
    public void printElements(List<String> listElements) {
        if (listElements instanceof ArrayList) {
            listElements.forEach(System.out::println);
        } else if (listElements instanceof LinkedList linkedList && !linkedList.isEmpty()) {
            linkedList.descendingIterator().forEachRemaining(System.out::println);
        } else {
            System.out.println("Unfortunately, the argument received is not correct.");
        }
    }

    // EX 6
    public String generateViewTemplate(Map<String, String> context) {
        String name = context.get("name");
        String greeting = context.get("greeting");
        String template = """
                        Hello name, gretting!
                        """;

        return template.replace("name", name).replace("gretting", greeting);
    }

    // EX 7
    public String getTypeOfDay(String today) {
        enum DaysOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }

        var work = "Work day";
        var weekend = "Weekend day";

        return switch (DaysOfWeek.valueOf(today)) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> work;
            case SATURDAY, SUNDAY -> weekend;

        };
    }

    // EX 8
    public boolean checkResultOperation() {
        Addition addition = new Addition(2, 3);
        Subtraction subtraction = new Subtraction(7, 2);
        int resultAdd = addition.calculate();
        int resultTra = subtraction.calculate();
        return resultAdd == resultTra;


    }


}

