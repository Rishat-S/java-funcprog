package ru.netology;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Two roads diverged in a yellow wood,");
        list.add("And sorry I could not travel both");
        list.add("And be one traveler, long I stood");
        list.add("And looked down one as far as I could");
        list.add("To where it bent in the undergrowth.");
        list.add("Then took the other, as just as fair,");
        list.add("And having perhaps the better claim,");
        list.add("Because it was grassy and wanted wear;");
        list.add("Though as for that the passing there");
        list.add("Had worn them really about the same.");
        list.add("And both that morning equally lay");
        list.add("In leaves no step had trodden black.");
        list.add("Oh, I kept the first for another day!");
        list.add("Yet knowing how way leads on to way,");
        list.add("I doubted if I should ever come back.");
        list.add("I shall be telling this with a sigh");
        list.add("Somewhere ages and ages hence:");
        list.add("Two roads diverged in a wood, and I");
        list.add("I took the one less traveled by,");
        list.add("And that has made all the difference.");

        Set<String> words = list.stream()
                .map(word -> word.replaceAll("\\p{Punct}", ""))
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .map(word -> word.substring(0, 1).toUpperCase(Locale.ROOT) + word.substring(1).toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        words.forEach(System.out::println);
    }
}
