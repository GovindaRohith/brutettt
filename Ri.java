import java.io.*;
import java.sql.*;
class M1
{
    public void say()
    {
        System.out.println("HEllo");
    }
    public void say3()
    {
        System.out.println("HEllo 3333");
    }
}
class Ri
{
    Connection k;
    public static void say51()
    {
        System.out.println("Static");
    }
    public static void say52()
    {
        System.out.println("Static");
    }
    public static void say53()
    {
        System.out.println("Static");
    }
    public static void main(String args[]) throws IOException
    {
        M1 ob=new M1();
        // ob.say(); //uncomment this for problem 1
        say52();
    }
}