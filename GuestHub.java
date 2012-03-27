import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GuestHub extends JFrame {

  private JPanel panel1 = new JPanel();
  private JPanel panel2 = new JPanel();
  private JPanel panel3 = new JPanel();
  private JPanel panel4 = new JPanel();
  private JPanel panel5 = new JPanel();
  private JPanel panel6 = new JPanel();
  private JPanel panel7 = new JPanel();
  private JPanel panel8 = new JPanel();
  private JPanel panel9 = new JPanel();
  private JPanel panel10 = new JPanel();
  private JPanel panel11 = new JPanel();
  private JPanel panel12 = new JPanel();
  private JPanel panel13 = new JPanel();
  private JPanel panel14 = new JPanel();
  private JPanel panel15 = new JPanel();
  private JPanel panel16 = new JPanel();
  private JPanel panel17 = new JPanel();
  private JPanel panel18 = new JPanel();
  private JPanel panel19 = new JPanel();
  private JPanel panel20 = new JPanel();
  private JPanel panel21 = new JPanel();
  private JPanel panel22 = new JPanel();
  private JPanel panel23 = new JPanel();
  private JPanel panel24 = new JPanel();
  private JPanel panel25 = new JPanel();
  private JPanel panel26 = new JPanel();
  private JPanel panel27 = new JPanel();
  private JPanel panel28 = new JPanel();
  private JLabel message1;
  private JLabel message2;
  private JLabel message3;
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JButton button4;
  private JButton button5;
  private JButton button6;
  private JButton button7;
  private JButton cButton;
  private JButton mButton;
  private JButton fButton;
  private int stylePref;
  private Font f;
  private Font g;
  private Font h;
  
  public GuestHub(int a) {
    
    stylePref = a;
    setTitle("Guest Main");
	 setSize(350, 1000);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(new GridLayout(7,4));
	 
    message1 = new JLabel("Welcome guest1234!");
	 message2 = new JLabel("Please select an option.");
	 message3 = new JLabel("Style Chooser");
	 button1 = new JButton("Order Room Service");
	 button2 = new JButton("Request Wake-up Call");
	 button3 = new JButton("Order Maintenance Request");
	 button4 = new JButton("Request Room Change");
	 button5 = new JButton("Extend Reservation");
	 button6 = new JButton("Pay Tab");
	 button7 = new JButton("Logout");
	 cButton = new JButton("Classic");
	 mButton = new JButton("Midnight");
	 fButton = new JButton("Femme");
	 f = new Font("Arial", Font.BOLD, 12);
	 g = new Font("Verdana", Font.BOLD, 12);
	 h = new Font("Comic Sans MS", Font.ITALIC, 12);
	 
	 button1.addActionListener(new RoomServiceButtonListener());
	 button2.addActionListener(new WakeUpButtonListener());
	 button3.addActionListener(new MaintenanceButtonListener());
	 button4.addActionListener(new RoomChangeButtonListener());
	 button5.addActionListener(new ExtendButtonListener());
	 button6.addActionListener(new PayTabButtonListener());
	 button7.addActionListener(new LogoutButtonListener());
	 cButton.addActionListener(new ClassicButtonListener());
	 mButton.addActionListener(new MidnightButtonListener());
	 fButton.addActionListener(new FemmeButtonListener());
	 
	 panel1.add(message1);
	 panel4.add(button1);
	 panel8.add(button2);
	 panel9.add(message2);
	 panel12.add(button3);
	 panel16.add(button4);
	 panel20.add(button5);
	 panel21.add(message3);
	 panel24.add(button6);
	 panel25.add(cButton);
	 panel26.add(mButton);
	 panel27.add(fButton);
	 panel28.add(button7);
	 
	 add(panel1);
	 add(panel2);
	 add(panel3);
	 add(panel4);
	 add(panel5);
	 add(panel6);
	 add(panel7);
	 add(panel8);
	 add(panel9);
	 add(panel10);
	 add(panel11);
	 add(panel12);
	 add(panel13);
	 add(panel14);
	 add(panel15);
	 add(panel16);
	 add(panel17);
	 add(panel18);
	 add(panel19);
	 add(panel20);
	 add(panel21);
	 add(panel22);
	 add(panel23);
	 add(panel24);
	 add(panel25);
	 add(panel26);
	 add(panel27);
	 add(panel28);
	 
	 pack();
	 setVisible(true);
  
    if (stylePref == 1) {
	   
		buildPanelClassic();
		
	 }
	 
	 else if (stylePref == 2) {
	   
		buildPanelMidnight();
		
	 }
	 
	 else if (stylePref == 3) {
	   
		buildPanelFemme();
		
	 }
	 
	 else {
	   
		buildPanelClassic();
	 
	 }
	 
  }
  
  private class ClassicButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		buildPanelClassic();
		stylePref = 1;
		
	 }
	 
  }
	 
  private class MidnightButtonListener implements ActionListener {
	   
    public void actionPerformed(ActionEvent e) {
		  
		buildPanelMidnight();
		stylePref = 2;
				
	 }
	 
  }
	 
  private class FemmeButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		buildPanelFemme();
		stylePref = 3;
				
	 }
	 
  }
  
  private class RoomServiceButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  private class WakeUpButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  private class MaintenanceButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  private class RoomChangeButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  private class ExtendButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  private class PayTabButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  private class LogoutButtonListener implements ActionListener {
	   
	 public void actionPerformed(ActionEvent e) {
		  
		//Handle the selection of this button
				
	 }
	 
  }
  
  public void buildPanelClassic() {

	 panel1.setBackground(new Color(238, 238, 238));
	 panel2.setBackground(new Color(238, 238, 238));
	 panel3.setBackground(new Color(238, 238, 238));
	 panel4.setBackground(new Color(238, 238, 238));
	 panel5.setBackground(new Color(238, 238, 238));
	 panel6.setBackground(new Color(238, 238, 238));
	 panel7.setBackground(new Color(238, 238, 238));
	 panel8.setBackground(new Color(238, 238, 238));
	 panel9.setBackground(new Color(238, 238, 238));
	 panel10.setBackground(new Color(238, 238, 238));
	 panel11.setBackground(new Color(238, 238, 238));
	 panel12.setBackground(new Color(238, 238, 238));
	 panel13.setBackground(new Color(238, 238, 238));
	 panel14.setBackground(new Color(238, 238, 238));
	 panel15.setBackground(new Color(238, 238, 238));
	 panel16.setBackground(new Color(238, 238, 238));
	 panel17.setBackground(new Color(238, 238, 238));
	 panel18.setBackground(new Color(238, 238, 238));
	 panel19.setBackground(new Color(238, 238, 238));
	 panel20.setBackground(new Color(238, 238, 238));
	 panel21.setBackground(new Color(238, 238, 238));
	 panel22.setBackground(new Color(238, 238, 238));
	 panel23.setBackground(new Color(238, 238, 238));
	 panel24.setBackground(new Color(238, 238, 238));
	 panel25.setBackground(new Color(238, 238, 238));
	 panel26.setBackground(new Color(238, 238, 238));
	 panel27.setBackground(new Color(238, 238, 238));
	 panel28.setBackground(new Color(238, 238, 238));
	 
	 button1.setForeground(Color.black);
	 button1.setBackground(new Color(201, 218, 235));
	 button1.setFont(f);
	 button2.setForeground(Color.black);
	 button2.setBackground(new Color(201, 218, 235));
	 button2.setFont(f);
	 button3.setForeground(Color.black);
	 button3.setBackground(new Color(201, 218, 235));
	 button3.setFont(f);
	 button4.setForeground(Color.black);
	 button4.setBackground(new Color(201, 218, 235));
	 button4.setFont(f);
	 button5.setForeground(Color.black);
	 button5.setBackground(new Color(201, 218, 235));
	 button5.setFont(f);
	 button6.setForeground(Color.black);
	 button6.setBackground(new Color(201, 218, 235));
	 button6.setFont(f);
	 button7.setForeground(Color.black);
	 button7.setBackground(new Color(201, 218, 235));
	 button7.setFont(f);
	 cButton.setForeground(Color.black);
	 cButton.setBackground(new Color(201, 218, 235));
	 cButton.setFont(f);
	 mButton.setForeground(Color.black);
	 mButton.setBackground(new Color(201, 218, 235));
	 mButton.setFont(f);
	 fButton.setForeground(Color.black);
	 fButton.setBackground(new Color(201, 218, 235));
	 fButton.setFont(f);
	 
	 message1.setFont(f);
	 message1.setForeground(Color.black);
	 message2.setFont(f);
	 message2.setForeground(Color.black);
	 message3.setFont(f);
	 message3.setForeground(Color.black);
	 
  }
  
  public void buildPanelMidnight() {
  
  	 panel1.setBackground(Color.black);
	 panel2.setBackground(Color.black);
	 panel3.setBackground(Color.black);
	 panel4.setBackground(Color.black);
	 panel5.setBackground(Color.black);
	 panel6.setBackground(Color.black);
	 panel7.setBackground(Color.black);
	 panel8.setBackground(Color.black);
	 panel9.setBackground(Color.black);
	 panel10.setBackground(Color.black);
	 panel11.setBackground(Color.black);
	 panel12.setBackground(Color.black);
	 panel13.setBackground(Color.black);
	 panel14.setBackground(Color.black);
	 panel15.setBackground(Color.black);
	 panel16.setBackground(Color.black);
	 panel17.setBackground(Color.black);
	 panel18.setBackground(Color.black);
	 panel19.setBackground(Color.black);
	 panel20.setBackground(Color.black);
	 panel21.setBackground(Color.black);
	 panel22.setBackground(Color.black);
	 panel23.setBackground(Color.black);
	 panel24.setBackground(Color.black);
	 panel25.setBackground(Color.black);
	 panel26.setBackground(Color.black);
	 panel27.setBackground(Color.black);
	 panel28.setBackground(Color.black);
	 
	 button1.setForeground(Color.white);
	 button1.setBackground(Color.darkGray);
	 button1.setFont(g);
	 button2.setForeground(Color.white);
	 button2.setBackground(Color.darkGray);
	 button2.setFont(g);
	 button3.setForeground(Color.white);
	 button3.setBackground(Color.darkGray);
	 button3.setFont(g);
	 button4.setForeground(Color.white);
	 button4.setBackground(Color.darkGray);
	 button4.setFont(g);
	 button5.setForeground(Color.white);
	 button5.setBackground(Color.darkGray);
	 button5.setFont(g);
	 button6.setForeground(Color.white);
	 button6.setBackground(Color.darkGray);
	 button6.setFont(g);
	 button7.setForeground(Color.white);
	 button7.setBackground(Color.darkGray);
	 button7.setFont(g);
	 cButton.setForeground(Color.white);
	 cButton.setBackground(Color.darkGray);
	 cButton.setFont(g);
	 mButton.setForeground(Color.white);
	 mButton.setBackground(Color.darkGray);
	 mButton.setFont(g);
	 fButton.setForeground(Color.white);
	 fButton.setBackground(Color.darkGray);
	 fButton.setFont(g);
	 
	 message1.setFont(g);
	 message1.setForeground(Color.white);
	 message2.setFont(g);
	 message2.setForeground(Color.white);
	 message3.setFont(g);
	 message3.setForeground(Color.white);
  
  }
  
  public void buildPanelFemme() {
    
    panel1.setBackground(new Color(255, 138, 211));
	 panel2.setBackground(new Color(255, 138, 211));
	 panel3.setBackground(new Color(255, 138, 211));
	 panel4.setBackground(new Color(255, 138, 211));
	 panel5.setBackground(new Color(255, 138, 211));
	 panel6.setBackground(new Color(255, 138, 211));
	 panel7.setBackground(new Color(255, 138, 211));
	 panel8.setBackground(new Color(255, 138, 211));
	 panel9.setBackground(new Color(255, 138, 211));
	 panel10.setBackground(new Color(255, 138, 211));
	 panel11.setBackground(new Color(255, 138, 211));
	 panel12.setBackground(new Color(255, 138, 211));
	 panel13.setBackground(new Color(255, 138, 211));
	 panel14.setBackground(new Color(255, 138, 211));
	 panel15.setBackground(new Color(255, 138, 211));
	 panel16.setBackground(new Color(255, 138, 211));
	 panel17.setBackground(new Color(255, 138, 211));
	 panel18.setBackground(new Color(255, 138, 211));
	 panel19.setBackground(new Color(255, 138, 211));
	 panel20.setBackground(new Color(255, 138, 211));
	 panel21.setBackground(new Color(255, 138, 211));
	 panel22.setBackground(new Color(255, 138, 211));
	 panel23.setBackground(new Color(255, 138, 211));
	 panel24.setBackground(new Color(255, 138, 211));
	 panel25.setBackground(new Color(255, 138, 211));
	 panel26.setBackground(new Color(255, 138, 211));
	 panel27.setBackground(new Color(255, 138, 211));
	 panel28.setBackground(new Color(255, 138, 211));
	 
	 button1.setForeground(Color.yellow);
	 button1.setBackground(new Color(245, 33, 203));
	 button1.setFont(h);
	 button2.setForeground(Color.yellow);
	 button2.setBackground(new Color(245, 33, 203));
	 button2.setFont(h);
	 button3.setForeground(Color.yellow);
	 button3.setBackground(new Color(245, 33, 203));
	 button3.setFont(h);
	 button4.setForeground(Color.yellow);
	 button4.setBackground(new Color(245, 33, 203));
	 button4.setFont(h);
	 button5.setForeground(Color.yellow);
	 button5.setBackground(new Color(245, 33, 203));
	 button5.setFont(h);
	 button6.setForeground(Color.yellow);
	 button6.setBackground(new Color(245, 33, 203));
	 button6.setFont(h);
	 button7.setForeground(Color.yellow);
	 button7.setBackground(new Color(245, 33, 203));
	 button7.setFont(h);
	 cButton.setForeground(Color.yellow);
	 cButton.setBackground(new Color(245, 33, 203));
	 cButton.setFont(h);
	 mButton.setForeground(Color.yellow);
	 mButton.setBackground(new Color(245, 33, 203));
	 mButton.setFont(h);
	 fButton.setForeground(Color.yellow);
	 fButton.setBackground(new Color(245, 33, 203));
	 fButton.setFont(h);
	 
	 message1.setFont(h);
	 message1.setForeground(new Color(155, 32, 35));
	 message2.setFont(h);
	 message2.setForeground(new Color(155, 32, 35));
	 message3.setFont(h);
	 message3.setForeground(new Color(155, 32, 35));
  
  }
  
}
