
//********************************************************************
//  RollingDice.java       Author: Lewis/Loftus
//********************************************************************
public class RollingDice
{


public static void main (String[] args)
{
   Die die1, die2;
   int sum;
   die1 = new Die();
   die2 = new Die();
   die1.roll();
   die2.roll();
   System.out.println ("Die One: " + die1.getFaceValue() +
                       ", Die Two: " + die2.getFaceValue());
   die1.roll();
   die2.setFaceValue(4);
   System.out.println ("Die One: " + die1.getFaceValue() +
                       ", Die Two: " + die2.getFaceValue());
   sum = die1.getFaceValue() + die2.getFaceValue();
   System.out.println ("Sum: " + sum);
   sum = die1.roll() + die2.roll();//rollu çağırdım sonrasında facevalue de değişti
   System.out.println ("Die One: " + die1.getFaceValue() +
                       ", Die Two: " + die2.getFaceValue());
   System.out.println ("New sum: " + sum);
}}