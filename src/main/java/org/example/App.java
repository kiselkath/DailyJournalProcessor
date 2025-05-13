package org.example;

/**
 * Demo class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String sentence = new String("Hello Java Team!");
        System.out.println(sentence.length());
        sentence = "Hi";
        System.out.println(sentence.length());
        String newSentence = sentence.replace("i", "ello");
        System.out.println(sentence); //"Hi": string is immutable;
        System.out.println(newSentence);
    }
}
