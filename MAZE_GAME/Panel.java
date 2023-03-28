import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 


public class Panel extends JPanel implements ActionListener { 

    private Timer timer; 
    
    private Chart lab; 
    
 
    private Competitor ply; 
    

    private boolean is_win = false; 
    private boolean is_lose = false; 
 
    private String Message_for_winner = " "; 
    private String Message_for_loser = " "; 
    
    private Font font_of_message = new Font("Serif", Font.BOLD, 40); 
    
 
    private Image emoji; 
    
    
    private int score_of_player = 0;
    
   
    private boolean[][] collected = new boolean[45][25];
    

    private boolean is_prize_collected = false;
    
  
    public Panel() { 
        // Initialize the Chart and Competitor objects
        lab = new Chart();
        ply = new Competitor(); 
        
        // Add a KeyListener to the panel
        addKeyListener(new Al()); 
        
        // Set the panel to be focusable
   

	    	setFocusable(true); //!!!!!!!

	   	 
	        // Initialize the Timer object and start it
	        timer = new Timer(25, this);
	        timer.start();
	    } 

	    /**
	     * Method called by the Timer object at regular intervals to update the game state
	     */
	    public void actionPerformed(ActionEvent e) { 
	        // Check if the player has collected the prize
	        if (lab.getChart(ply.getTileX(), ply.getTileY()).equals("p")) { 
	            is_prize_collected = true;
	        }
	        
	        // Check if the player has encountered a monster
	        if (lab.getChart(ply.getTileX(), ply.getTileY()).equals("m")) { 
	            // Reset the player's score
	            score_of_player = 0;
	            // Set the message for the player
	            Message_for_loser = "You Lost!" + " score = " + score_of_player; 
	            // Set the game status to lose
	            is_lose = true; 
	            // Reset the player's position
	            ply.resetPosition();
	            // Stop the Timer
	            timer.stop(); 
	        } 
	        
	        // Check if the player has reached the finish line
	        if (lab.getChart(ply.getTileX(), ply.getTileY()).equals("f")) { 
	            // Set the message for the player
	            Message_for_winner = "winner" + " score = " + score_of_player; 
	            // Set the game status to win
	            is_win = true; 
	            // Stop the Timer
	            timer.stop(); 
	        } 
	        
	        // Repaint the panel
	        repaint();  
	    } 

	    /**
	     * Method called when the panel needs to be repainted
	     */
	    public void paint(Graphics g) { 
	        super.paint(g); // Call the constructor of the super class
	        
	        // Check if the game is still in progress
	        if (!is_win && !is_lose) { 
	            // Loop through each tile in the map
	            for (int y = 0; y < 25; y++) { // y is the row
	                for (int x = 0; x < 45; x++) { // x is the position
	                    // Check if the current tile is a monster
	                    if (lab.getChart(x, y).equals("m")) {
	                        // Draw the monster image on the panel
	                        g.drawImage(lab.getMonster(), x * 32, y * 32, null); 
	                    }
	                    // Check if the current tile is the finish line
	                    if (lab.getChart(x, y).equals("f")) { 
	                        // Draw the finish line image on the panel
	                        g.drawImage(lab.getFinish_Line(), x * 32, y * 32, null); 
	                    } 
	                    // Check if the current tile is grass
	                    if (lab.getChart(x, y).equals("g")) { 
	                        // Draw the grass image on the panel
	                        g.drawImage(lab.getGrass(), x * 32, y * 32, null); 
	                    } 
	                 


        		  if (lab.getChart(x,y).equals("w")) { 

        			  g.drawImage(lab.getObstacle(),x*32,y*32,null); 

        			  //null yerine this de koyabilirdik , observer 

        		  } 

        		  if(lab.getChart(x,y).equals("p")) { 
        			  
        			  int a = ply.getTileX();
        			   int b = ply.getTileY();
        			   
        			  if (is_prize_collected) {
            			  
            			 
        				  g.drawImage(lab.getGrass(),x*32,y*32,null);
                   		
                 			
                 	}
        			  else {
        				  g.drawImage(lab.getPrize(),x*32,y*32,null); 
        			 

        		  }}
        		  

        	  } 

          } 

          g.drawImage(ply.getCompetitor(),ply.getTileX()*32,ply.getTileY()*32,null); 

        } 
        	
        	if (is_lose) {
        		

                g.setColor(Color.black); 

                

                g.setFont(font_of_message); 

               

                g.drawString(Message_for_loser,500,400); 
        	}
        	

        	if(is_win) { 

          g.setColor(Color.red); 

          

          g.setFont(font_of_message); 

         

          g.drawString(Message_for_winner,500,400); 

          ImageIcon img = new ImageIcon("/Users/berx/Desktop/emoji.png"); 

          emoji=img.getImage(); 


          g.drawImage(getImage(), 10, 10, null);
          g.drawImage(getImage(), 60, 10, null);
          g.drawImage(getImage(), 110, 10, null);
          g.drawImage(getImage(), 160, 10, null);
          g.drawImage(getImage(), 210, 10, null);
          g.drawImage(getImage(), 260, 10, null);
          g.drawImage(getImage(), 310, 10, null);
          g.drawImage(getImage(), 360, 10, null);
          g.drawImage(getImage(), 410, 10, null);
          g.drawImage(getImage(), 460, 10, null);
          g.drawImage(getImage(), 510, 10, null);
          g.drawImage(getImage(), 560, 10, null);
          g.drawImage(getImage(), 610, 10, null);
          g.drawImage(getImage(), 660, 10, null);
          g.drawImage(getImage(), 710, 10, null);
          g.drawImage(getImage(), 760, 10, null);
          g.drawImage(getImage(), 810, 10, null);
          g.drawImage(getImage(), 860, 10, null);
          g.drawImage(getImage(), 910, 10, null);
          g.drawImage(getImage(), 960, 10, null);
          g.drawImage(getImage(), 1010, 10, null);
          g.drawImage(getImage(), 1060, 10, null);
          g.drawImage(getImage(), 1110, 10, null);
          g.drawImage(getImage(), 1160, 10, null);
          g.drawImage(getImage(), 1210, 10, null);
          g.drawImage(getImage(), 1260, 10, null);
          g.drawImage(getImage(), 1310, 10, null);
          g.drawImage(getImage(), 1360, 10, null);
          g.drawImage(getImage(), 1400, 10, null);
     

          g.drawImage(getImage(), 10, 740, null);
          g.drawImage(getImage(), 60, 740, null);
          g.drawImage(getImage(), 110, 740, null);
          g.drawImage(getImage(), 160, 740, null);
          g.drawImage(getImage(), 210, 740, null);
          g.drawImage(getImage(), 260, 740, null);
          g.drawImage(getImage(), 310, 740, null);
          g.drawImage(getImage(), 360, 740, null);
          g.drawImage(getImage(), 410, 740, null);
          g.drawImage(getImage(), 460, 740, null);
          g.drawImage(getImage(), 510, 740, null);
          g.drawImage(getImage(), 560, 740, null);
          g.drawImage(getImage(), 610, 740, null);
          g.drawImage(getImage(), 660, 740, null);
          g.drawImage(getImage(), 710, 740, null);
          g.drawImage(getImage(), 760, 740, null);
          g.drawImage(getImage(), 810, 740, null);
          g.drawImage(getImage(), 860, 740, null);
          g.drawImage(getImage(), 910, 740, null);
          g.drawImage(getImage(), 960, 740, null);
          g.drawImage(getImage(), 1010, 740, null);
          g.drawImage(getImage(), 1060, 740, null);
          g.drawImage(getImage(), 1110, 740, null);
          g.drawImage(getImage(), 1160, 740, null);
          g.drawImage(getImage(), 1210, 740, null);
          g.drawImage(getImage(), 1260, 740, null);
          g.drawImage(getImage(), 1310, 740, null);
          g.drawImage(getImage(), 1360, 740, null);
          g.drawImage(getImage(), 1400, 740, null);

       
        	}

       } 

     Image getImage() { 

    	 return emoji; 

     } 

 

     public class Al extends KeyAdapter {
         public void keyPressed(KeyEvent e) {

             int keycode = e.getKeyCode();

             if (keycode == KeyEvent.VK_W || keycode == KeyEvent.VK_UP) {
                 // check if the player has already collected the prize at the current position
                 if (!collected[ply.getTileX()][ply.getTileY() - 1] && lab.getChart(ply.getTileX(), ply.getTileY() - 1).equals("p")) {
                     score_of_player++;
                     lab.setChart(ply.getTileX(), ply.getTileY() - 1, "g");
                     // mark the position as collected
                     collected[ply.getTileX()][ply.getTileY() - 1] = false;
                 }
                 
            
                 if (!lab.getChart(ply.getTileX(), ply.getTileY() - 1).equals("w")) {
                     //-1 çünkü yukarı gidiyor...
                     ply.go(0, -1);
                 }
                /* if (!lab.getChart(ply.getTileX(), ply.getTileY() - 1).equals("m")) {
                 }*/
             }


             
             // create a separate array to track which positions the player has collected the prize from

             if (keycode == KeyEvent.VK_S || keycode == KeyEvent.VK_DOWN) {
                 // check if the player has already collected the prize at the current position
                 if (!collected[ply.getTileX()][ply.getTileY() + 1] && lab.getChart(ply.getTileX(), ply.getTileY() + 1).equals("p")) {
                     score_of_player++;
                     // mark the position as collected
                     lab.setChart(ply.getTileX(), ply.getTileY() + 1, "g");
                     collected[ply.getTileX()][ply.getTileY() + 1] = false;
                 }
                 
               

                 if (!lab.getChart(ply.getTileX(), ply.getTileY() + 1).equals("w")) {
                     ply.go(0, 1);

                 }
                 /*if (!lab.getChart(ply.getTileX(), ply.getTileY() + 1).equals("m")) {

                 }*/
             }
             
             
             if (keycode == KeyEvent.VK_A || keycode == KeyEvent.VK_LEFT) {
                 if (!collected[ply.getTileX() - 1][ply.getTileY()] && lab.getChart(ply.getTileX() - 1, ply.getTileY()).equals("p")) {
                     score_of_player++;
                     lab.setChart(ply.getTileX() - 1, ply.getTileY(), "g");
                     collected[ply.getTileX() - 1][ply.getTileY()] = false;
                 }
               

                 if (!lab.getChart(ply.getTileX() - 1, ply.getTileY()).equals("w")) {

                     ply.go(-1, 0);
                 }

             }
            /* if (!lab.getChart(ply.getTileX() - 1, ply.getTileY()).equals("m")) {


             }*/


             
             if (keycode == KeyEvent.VK_D || keycode == KeyEvent.VK_RIGHT) {

                 if (!collected[ply.getTileX()+1][ply.getTileY()] && lab.getChart(ply.getTileX()+1, ply.getTileY() ).equals("p")) {
                     score_of_player++;
                     lab.setChart(ply.getTileX()+1, ply.getTileY(), "g");
                     collected[ply.getTileX()+1][ply.getTileY() ] = false;

                 }

             


                 if (!lab.getChart(ply.getTileX() + 1, ply.getTileY()).equals("w")) {
                     ply.go(1, 0);

                 }
                /* if (!lab.getChart(ply.getTileX() + 1, ply.getTileY()).equals("m")) {
                 }*/
             }
         }

         public void keyReleased(KeyEvent e) {

         }

         public void keyTyped(KeyEvent e) {

         }

     }


 }










