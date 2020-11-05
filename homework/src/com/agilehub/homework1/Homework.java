package com.agilehub.homework1;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import com.hubspot.jinjava.Jinjava;

import java.io.IOException;

import java.time.LocalDate;
import java.util.*;


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
        maxExempleWithOf().put(maxExempleWithOf().size() + 1, newThing); // Don`t run because collection is immutable and don`t accept new thing in map
        mapExemple().put(mapExemple().size() + 1, newThing); // Works, because collection is not immutable

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
    public void checkRandomOptionalGen() {
        randomOptionalGenerator().ifPresentOrElse(System.out::println,
                () -> {
                    throw new RuntimeException("Value is not found.");
                }
        );
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
        randomOptionalGeneratorTwo().ifPresentOrElse(System.out::println, () -> System.out.println("You`re reached the end of INT"));
    }


    // EX 4
    public int calculateDifference(List<Integer> listNumbers) {
        var max = listNumbers.stream().mapToInt(n -> n).max();
        var min = listNumbers.stream().mapToInt(n -> n).min();
        return max.getAsInt() - min.getAsInt();
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
    public String generateViewTemplate(Map<String, String> context) throws IOException {
        Jinjava jinjava = new Jinjava();
        String template = Resources.toString(Resources.getResource("index.html"), Charsets.UTF_8);

        String renderedTemplate = jinjava.render(template, context);
        return renderedTemplate;

    }

    // EX 7
    public String getTypeOfDay(String today) {
        enum DaysOfWeek {
            MONDAY("1"), TUESDAY("2"), WEDNESDAY("3"), THURSDAY("4"), FRIDAY("5"), SATURDAY("6"), SUNDAY("7");

            DaysOfWeek(String i) {
            }
        }

        return switch (DaysOfWeek.valueOf(today)) {
            case MONDAY -> "Work day";
            case TUESDAY -> "Work day";
            case WEDNESDAY -> "Work day";
            case THURSDAY -> "Work day";
            case FRIDAY -> "Work day";
            case SATURDAY -> "Weekend day";
            case SUNDAY -> "Weekend day";

        };
    }

    // EX 8
    public boolean checkResult(Addition addition, Subtraction subtraction) {
        int result = addition.calculate(addition.firstNumber(), addition.secondNumber());
        int result2 = subtraction.calculate(subtraction.firstNumber(), subtraction.secondNumber());
        return result == result2;
    }


}

