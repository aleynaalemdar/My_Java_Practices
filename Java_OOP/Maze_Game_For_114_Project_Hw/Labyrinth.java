import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.io.File; 
public class Labyrinth {

    public static void main(String[] args) {
       
        new Labyrinth();
        Button button = new Button();
        Button.createButtons();

        try {
            
            File audioFile = new File("/Users/berx/Desktop/dark.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);

            audioClip.start();

            Thread.sleep(audioClip.getMicrosecondLength()/1000);
        } catch (Exception e) {
           
            e.printStackTrace();
        }
    }

 
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
  
    JFrame f = new JFrame();
 
    JFrame f2 = new JFrame();

    public void framee() {
    	
        f.setTitle("LABYRINTH GAME");
      
        
        f.setSize(464, 485);
        // center the first frame on the screen
        f.setLocationRelativeTo(null); 

        JPanel panel = new JPanel();
        

	        panel.setBackground(Color.GREEN);

	        f.add(panel);

	        // set the layout of the panel to BorderLayout
	        panel.setLayout(new BorderLayout());

	        // create the button and add it to the panel
	        JButton button1 = new JButton("PLAY!");
	        
	        // set the preferred size of the button
	        button1.setPreferredSize(new Dimension(80, 100));
	        
	        // add the button to the panel with a CENTER border
	        panel.add(button1,BorderLayout.CENTER);
	     
	        // create a label and add it to the panel
	        label.setFont(new Font("Serif", Font.PLAIN, 12));
	        label.setForeground(Color.WHITE);
	        panel.add(label);

	        // add an action listener to the button
	        button1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // if the button is clicked, create a new Labyrinth object and call the frame2 method
	                if (e.getSource() == button1) {
	                    Labyrinth maze = new Labyrinth();
	                    maze.frame2();
	                }
	            }
	        });

	        // set the first frame to be visible and set its default close operation
	        f.setVisible(true);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }
	    public void frame2() {
	    	
	        f2.setTitle("LABYRINTH GAME");
	      
	      
	        f2.add(new Panel());
	       
	        f2.setVisible(true);
	        // maximize the second frame
	        f2.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        // center the second frame on the screen
	        f2.setLocationRelativeTo(null); 
	        // set the default close operation of the second frame to stop the program
	        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	       
	    }
	}


