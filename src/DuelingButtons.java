/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton c = new JButton();
	JButton d = new JButton();
	
	Dimension big = new Dimension(400,400);
	Dimension small = new Dimension(200,200);
	
	JFrame a = new JFrame();
	JPanel b = new JPanel();

	private void createUI() {
		// 1. Add the panel to the frame
a.add(b);
		// 2. Make the frame visible
a.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
c.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
d.setText("Click me!");
		// 5. Add an action listener to the leftButton
c.addActionListener(null);
		// 6. Add an action listener to the rightButton
d.addActionListener(null);

		// 7. Add the leftButton to the panel
b.add(c);
		// 8. Add the rightButton to the panel
b.add(d);
		// 9. Pack the frame
a.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
a.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed == c) {
			d.setText("No, click Me!");
			d.setSize(big);
			c.setSize(small);
		}else if(buttonPressed == d) {
			c.setText("No, click Me!");
			c.setSize(big);
			d.setSize(small);
		}else {
			
		}
		
		/* If the buttonPressed was the leftButton....*/
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		a.pack();
	}
}


