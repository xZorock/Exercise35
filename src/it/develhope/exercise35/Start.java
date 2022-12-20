package it.develhope.exercise35;

public class Start {
    public static void main(String[] args) {

        String s1 = "are you able to climb, are you able to swim or are you able to fly?";

        String s2 = s1.replaceAll("(\s+are)","_XYZ");

        System.out.println(s2);
    }
}
