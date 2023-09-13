package trichy1;
public class Pasanga1 extends AmmaAppa1
{
public Pasanga1()
{
 System.out.println("Pasanga1- const");
}

public Pasanga1(int no)
{
 super(no);
 System.out.println("Pasanga1 - OneArg - const");
}

public static void main(String[] args)
{

 Pasanga1  pp = new Pasanga1(10);
 
 pp.meetRelatives();
}

}