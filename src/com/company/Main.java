package com.company;

import java.lang.String;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static final String sentence = "Climb mountains not so the world can see you, but so you can see the world!";

    public static void main(String[] args) {
        GetNumberOfWords();
        System.out.println("There are " + GetNumberOfWords() + " words in this sentence");
        HowManyThe();
        System.out.println("\nThere are " + HowManyThe() + " 'the' in this sentence");
        HowManyWordsWithS();
        System.out.println("\nThere are " + HowManyWordsWithS() + " words consist of letter 's'");
        MatchingWordThe();
        System.out.println("\nWord 'the' repeated  " + MatchingWordThe() + " times");
        MatchingWordSee();
        System.out.println("\nWord 'see' repeated " + MatchingWordSee() + " times");
        MatchingWordYou();
        System.out.println("\nWord 'you' repeated " + MatchingWordYou() + " times");
        MatchingWordWorld();
        MatchingWordSo();
        String replaceString=sentence.replaceAll("you","You");
        System.out.println();
        System.out.println(replaceString);
    }

    public static int GetNumberOfWords() {
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ')
                counter++;
        }
        return counter + 1;
    }

    public static int HowManyThe() {
        String[] word = sentence.split(" ");

        int the = 0;
        for (String value : word) {
            if (value.contains("the"))
                the++;
        }
        return the;
    }

    public static int HowManyWordsWithS() {
        String[] word = sentence.split(" ");
        int s = 0;
        for (String value : word) {
            if (value.contains("s"))
                s++;
        }
        return s;
    }

    public static int MatchingWordThe() {
        int matchesThe = 0;
        Matcher matcher = Pattern.compile("\\bthe\\b", Pattern.CASE_INSENSITIVE).matcher(sentence);
        while (matcher.find()) matchesThe++;
        return matchesThe;
    }

    public static int MatchingWordSee() {
        int matchesSee = 0;
        Matcher matcher = Pattern.compile("\\bsee\\b", Pattern.CASE_INSENSITIVE).matcher(sentence);
        while (matcher.find()) matchesSee++;
        return matchesSee;

    }

    public static int MatchingWordYou() {
        int matchesYou = 0;
        Matcher matcher = Pattern.compile("\\byou\\b", Pattern.CASE_INSENSITIVE).matcher(sentence);
        while (matcher.find()) matchesYou++;
        return matchesYou;
    }

    public static void MatchingWordWorld() { //another way of counting occurrences
        String regex = "\\bworld\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("\nNumber of occurrences of the word 'world' : " + count);

    }

    public static void MatchingWordSo() {
        String regex = "\\bso\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("\nNumber of occurrences of the word 'so' : " + count);

    }
}





