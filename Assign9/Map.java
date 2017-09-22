
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
public class Map implements Loadable{
    
private int mapRows, mapCols;
private char[][] mapData;

public Map()
{
        mapRows = 0;
        mapCols = 0;
        mapData = new char[0][0];
}
public Map(int rows, int cols)
{
        this.mapRows = rows;
        this.mapCols = cols;
        mapData = new char[rows][cols];
        for(int i = 0; i < this.mapRows; i++)
            for(int j = 0; j < this.mapCols; j++)
                mapData[i][j] = '.';
}
public char getMapLocation(int x, int y)
{
    if(x < 0 || y < 0 || x > getColumns() || y > getRows())
    {
        return(' ');
    }
    else
    {
        return(mapData[y][x]);   
    }
}
public boolean canMoveTo(int x, int y)
{
    if(x < 0 || y < 0 || x > getColumns() || y > getRows())
    {
        return(false);
    }
    else if(mapData[y][x] == '.')
    {
        return(true);
    }
    else 
    {
        return(false);
    }
}
public int getRows()
{
    return(this.mapRows);
}
public int getColumns()
{
    return(this.mapCols);
}
public void draw()
{
    for(int i = 0; i < getRows(); i++)
    {
        for(int j = 0; j < getColumns(); j++)
            System.out.print(mapData[i][j]);
        System.out.println();
    }
}
public boolean setMapLocation(int x, int y, char c)
{
    if(x > -1 && y > -1 && x <= getColumns() && y <= getRows())
    {
        this.mapData[y][x] = c;
        return true;
    }
    return false;
}
@Override
public void load(Scanner input)
{
    String line;
    mapData = new char[0][0];
    mapRows = 0;
    mapCols = 0;
    mapRows = Integer.parseInt(input.nextLine());
    mapCols = Integer.parseInt(input.nextLine());
    mapData = new char[getRows()][getColumns()];
    for(int i = 0; i < getRows(); i++)
    {
        line = input.nextLine();
        for(int j = 0; j < getColumns(); j++)
            mapData[i][j] = line.charAt(j);
    }
}

}