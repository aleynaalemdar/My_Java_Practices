import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Competitor {

Scanner keyboard = new Scanner(System.in);

// tileX and tileY store the position of the player on the game board
private int tileX, tileY;
// competitor stores the image of the player icon
private Image competitor;

public Competitor() {

System.out.println("Please select a player icon...");
System.out.println("For triangle enter 1");
System.out.println("For circle enter 2");
System.out.println("For rectangle enter 3");

//Read the users selection
int select = keyboard.nextInt();

//Set the player icon based on the users selection
if (select == 1) {
ImageIcon img = new ImageIcon("/Users/berx/Desktop/triangle.png");
competitor = img.getImage();
}
if (select == 2) {
ImageIcon img = new ImageIcon("/Users/berx/Desktop/circle.png");
competitor = img.getImage();
}
if (select == 3) {
ImageIcon img = new ImageIcon("/Users/berx/Desktop/rect.png");
competitor = img.getImage();
}

tileX = 1;
tileY = 1;

	}

public void resetPosition() {
tileX = 1;
tileY = 1;
}


public Image getCompetitor() {
return competitor;
}

//getTileX returns the x coordinate of the player's position on the game board
public int getTileX() {
return tileX;
}

//getTileY returns the y coordinate of the player's position on the game board
public int getTileY() {
return tileY;
}

void go(int dx, int dy) {
//dx is the amount to move in the x direction (left or right)
//dy is the amount to move in the y direction (up or down)
tileX += dx;
tileY += dy;
}
}
