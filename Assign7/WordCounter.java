/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
import java.io.FileInputStream;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.Scanner;
public class WordCounter {
    private static Scanner scanner,input;
    private static LineNumberReader lnr;
    private static String buffer = "";
    private static String buffer_2 = "";
    public static WordCountData count(String path)throws Exception
    {
        int i, chcnt, wordcnt, linecnt;
        chcnt = 0;
        i = 0;
        wordcnt = 0;
        linecnt = 0;
        //scanner = new Scanner(path);
        try
        {
        if(path.contains("http"))
        {
            URL url = new URL(path);
            scanner = new Scanner (url.openStream());
        }
        else 
        {
            scanner = new Scanner (new FileInputStream(path));

        }
        }
        catch(Exception e)
        {
            throw e;
        }
        
        while(scanner.hasNextLine())
        {
            linecnt++;
            buffer = scanner.nextLine();
            if(!buffer.isEmpty())
            {
                chcnt += buffer.length();
                String[] parts = buffer.split("\\s+");
                wordcnt += parts.length;
            }
            
        }
        scanner.close();
        WordCountData wcd = new WordCountData(chcnt, wordcnt, linecnt);
        return wcd;
    }
    
}
