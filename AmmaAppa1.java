package trichy1;
public class AmmaAppa1
{
public AmmaAppa1()
{
 this(10); // new AmmaAppa(10);
 System.out.println("AmmaAppa1 - const"); 
}
 
public AmmaAppa1(int no)
{
 System.out.println("AmmaAppa1 -oneArg - const"); 
}
 
protected void meetRelatives()
{
 System.out.println("meeting with relatives"); 
}
 
}