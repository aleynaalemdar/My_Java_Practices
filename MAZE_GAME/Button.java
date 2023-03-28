import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Button {
    public static void createButtons() {

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        // set the layout of the panel to GridBagLayout
        panel.setLayout(new GridBagLayout());

        JButton button1 = new JButton("PLAY!");
        
        JButton button2 = new JButton("QUIT");

        button1.setPreferredSize(new Dimension(240, 180));
   
        button2.setPreferredSize(new Dimension(240, 180));

        JLabel label = new JLabel("LABYRINTH GAME!");
        // add the label to the panel
        panel.add(label);
        // create a font with the following properties: serif, bold, size 34
        Font font = new Font("Serif", Font.BOLD, 34);
        // set the foreground color of the label to white
        label.setForeground(Color.WHITE);
        // set the font of the label to the font created above
        label.setFont(font);

        label.setSize(200, 50);

     
        
        
        // create a GridBagConstraints object to specify the constraints for the buttons
        GridBagConstraints constraints = new GridBagConstraints();
  
        
        constraints.insets = new Insets(10, 10, 10, 10);

       
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(button1, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(button2, constraints);

       
        JFrame frame = new JFrame("LABYRINTH GAME!");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add the panel to the frame
        frame.add(panel);
        // pack the frame to the preferred size of its components
        frame.pack();
        // set the frame to be visible
        frame.setVisible(true);
        // set the preferred size of the frame to 800x600 pixels
        frame.setPreferredSize(new Dimension(800, 600));
        // pack the frame again to apply the new preferred size
        frame.pack();

        
        // create a timer to animate the label
        Timer timer1 = new Timer(30, new ActionListener() {
       
            int x = 0;
          
            int direction = 1;

            public void actionPerformed(ActionEvent e) {
                // update the x-coordinate of the label by adding the direction
                x += direction;
                // set the new location of the label
                label.setLocation(x, 0);
                // if the x-coordinate of the label reaches the edges of the panel, change the direction
                if (x == 0 || x == panel.getWidth() - label.getWidth()) {
                    direction *= -1;
                }
            }
        });
        
        timer1.start();

        ActionListener listener = new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                
                if (e.getSource() == button1) {
                    Labyrinth maze= new Labyrinth();
                    frame.setVisible(false);
                    maze.frame2();
                // if the QUIT button is clicked, exit the application
                } else if (e.getSource() == button2) {
                    System.exit(0);
                    //close
                  
                }
            }
        };
     
        button1.addActionListener(listener);
     
        button2.addActionListener(listener);
    }
}

     


