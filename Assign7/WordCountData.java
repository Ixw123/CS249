/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T420
 */
public class WordCountData {
    private int charCnt,wordCnt,lineCnt;
    public WordCountData(int chars,int words, int lines)
    {
        this.charCnt = chars;
        this.wordCnt = words;
        this.lineCnt = lines;
    }
    public int getcharCnt()
    {
        return(this.charCnt);
    }
    public int getwordCnt()
    {
        return(this.wordCnt);
    }
    public int getlineCnt()
    {
        return(this.lineCnt);
    }
}
