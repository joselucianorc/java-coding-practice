package br.com.joselucianorc.exercises;

import java.util.*;

public class Solution001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        string = string.replace("'"," ")
        .replace(","," ")
        .replace("?"," ")
        .replace("!"," ");

        StringTokenizer tokenizer = new StringTokenizer(string, " ");
        System.out.println(tokenizer.countTokens());

        while(tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }
        scan.close();
    }
}