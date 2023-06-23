import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Chart {
    private Scanner keyboard;
    
    // Declare a 2D array of strings to store the map information
    private String Chart[] = new String[50];
    private Image grass, obstacle, finish_line, prize, monster;
    
  
    public Chart() {
       
        ImageIcon img = new ImageIcon("/Users/berx/Desktop/grass.jpg");
        grass = img.getImage();
        img = new ImageIcon("/Users/berx/Desktop/siyah.jpg");
        obstacle = img.getImage();
        img = new ImageIcon("/Users/berx/Desktop/finish.png");
        finish_line = img.getImage();
        img = new ImageIcon("/Users/berx/Desktop/prize.png");
        prize = img.getImage();
        img = new ImageIcon("/Users/berx/Desktop/monster.png");
        monster = img.getImage();
        
        openFile();
        readFile();
        closeFile();
    }
    
   
    Image getMonster() {
        return monster;
    }
    
   
    Image getGrass() {
        return grass;
    }
  
    Image getObstacle() {
        return obstacle;
    }
    
    
    Image getFinish_Line() {
        return finish_line;
    }
 
    Image getPrize() {
        return prize;
    }
    
  
    public void openFile() {
        try {
           
            keyboard = new Scanner(new File("/Users/berx/Desktop/map.txt"));
        } catch (Exception e) {
            // If the file cannot be found, print an error message
            System.out.println("The file that you are looking for could not be found.");
        }
    }
    


    String getChart(int x, int y) {
    	// Extract the element at the specified indices by taking a substring of the relevant row
    	String index = Chart[y].substring(x, x + 1);
    	return index;
    	}
  
    void setChart(int x, int y, String value) {
        // Use a StringBuilder to modify the relevant element of the Chart array
        StringBuilder sb = new StringBuilder(Chart[y]);
        sb.setCharAt(x, value.charAt(0));
        Chart[y] = sb.toString();
    }

   
    void readFile() {
        // Read the contents of the text file and store it in the Chart array
        while (keyboard.hasNext()) {
            for (int i = 0; i < 25; i++) {
                Chart[i] = keyboard.next();
            }
        }
    }

    void closeFile() {
        // Close the text file
        keyboard.close();
    }
}