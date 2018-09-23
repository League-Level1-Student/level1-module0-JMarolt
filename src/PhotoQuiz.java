/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String i = "https://lifesaveressays.com/wp-content/files/2016/09/Fingers-are-not-equal.jpg";
//URL url = new URL("https://lifesaveressays.com/wp-content/files/2016/09/Fingers-are-not-equal.jpg");
		// 2. create a variable of type "Component" that will hold your image
Component comp;
		// 3. use the "createImage()" method below to initialize your Component
comp = createImage(i);
		// 4. add the image to the quiz window
quizWindow.add(comp);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String w = JOptionPane.showInputDialog("How many fingers are there?");
int e = Integer.parseInt(w);
		// 7. print "CORRECT" if the user gave the right answer
if(e == 5) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");

}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line of code)
String pic = "https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjJ6I-4m9LdAhXVqYMKHUxqApMQjRx6BAgBEAU&url=https%3A%2F%2Fwww.deviantart.com%2Fjustass%2Fart%2FRandom-nature-scene-414016598&psig=AOvVaw1_giYYf7NLANrG6Kw-1wta&ust=1537829454756239";
Component comp2;
comp2 = createImage(pic);
quizWindow.add(comp2);
quizWindow.pack();
		
		// 13. ask another question
String q = JOptionPane.showInputDialog("How many characters are there?");
int s = Integer.parseInt(q);
		// 7. print "CORRECT" if the user gave the right answer
if(s == 2) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");

}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





