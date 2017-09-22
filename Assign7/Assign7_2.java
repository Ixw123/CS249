
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class Assign7_2 {
    private static Scanner scanner = new Scanner (System.in);
    private static int chars, words, lines;
    private static String path;
    private static WordCountData wcd;
    public static void main(String[] args)
    {
        try{
            System.out.println("Enter a file path or a URL");
            path = scanner.nextLine();
            wcd = WordCounter.count(path);
            chars = wcd.getcharCnt();
            words = wcd.getwordCnt();
            lines = wcd.getlineCnt();
            PrintWriter printWriter = new PrintWriter ("output.txt");
            printWriter.println ("INPUT: " + path);
            printWriter.println("OUTPUT:");
            printWriter.println ("Number of Characters: " + chars);
            printWriter.println ("Number of words: " + words);
            printWriter.println ("Number of lines: " + lines);
            printWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("OH NO!");
            StackTraceElement [] s = Thread.currentThread().getStackTrace();
            for(StackTraceElement st: s)
                System.out.println(st);
        }
    }
    
}
