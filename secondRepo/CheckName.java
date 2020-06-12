//package pl.samouczekprogramisty.commandline;


import java.util.Scanner;
//import org.apache.commons.lang3.StringUtils; 

public class CheckName {
    public static void main(String ... args) {
		

        System.out.println("Type a sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
/*
        if (StringUtils.containsIgnoreCase(sentence, "Raki")) {
            System.out.println("Is your name!");
        }
        else { */
            System.out.println("The sentence do not contain your name" + sentence);
        //}
    }
}