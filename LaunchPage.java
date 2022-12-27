import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class LaunchPage implements ActionListener{
	
	
	
	public static void main(String[] args) {
		
		LaunchPage launchPage = new LaunchPage();

	}
	
	//creating frames
	JFrame frame = new JFrame();
	
	//creating labels
	JLabel Label1 = new JLabel("Encryption is the process of taking plain text, like a text message or email, and", SwingConstants.CENTER);
	JLabel Label2 = new JLabel("scrambling it into an unreadable format — called “cipher text.” This helps protect the", SwingConstants.CENTER);
	JLabel Label3 = new JLabel("confidentiality of digital data either stored on computer systems or transmitted through", SwingConstants.CENTER);
	JLabel Label4 = new JLabel("a network like the internet.", SwingConstants.CENTER);
	JLabel Label5 = new JLabel("The conversion of encrypted data into its original form is called Decryption. ...", SwingConstants.CENTER);
	JLabel Label6 = new JLabel("Few common items that are encrypted include text files, images, e-mail messages, user", SwingConstants.CENTER);
	JLabel Label7 = new JLabel("data and directories. The recipient ", SwingConstants.CENTER);
	JLabel Label8 = new JLabel("of decryption receives a prompt or window in which a password can be entered to access the encrypted data.", SwingConstants.CENTER);
	
	//creating buttons
	JButton myButton = new JButton("Encrypt");
	JButton myButton1 = new JButton("Decrypt");
	
	// creating different fonts
    Font font = new Font("Roboto", Font.ITALIC, 20);
	
	LaunchPage(){
		
		myButton.addActionListener(this);
		myButton1.addActionListener(this);
		
		
		//To set IconImage
		ImageIcon imageIcon = new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\JavaProject\\src\\logo.png");// create image icon
		frame.setIconImage(imageIcon.getImage());
		
		Label1.setFont(font);
		Label2.setFont(font);
		Label3.setFont(font);
		Label4.setFont(font);
		Label5.setFont(font);
		Label6.setFont(font);
		Label7.setFont(font);
		Label8.setFont(font);
		
		
		
		//adding properties to frame
		myButton.setSize(300,100);
		myButton1.setSize(300,100);
		frame.setSize(1000,300);
		frame.setTitle("Java Project");
		frame.getContentPane().setBackground(new Color(135, 60, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
		//adding elements to frame and panel
		frame.add(Label1);
	    frame.add(Label2);
	    frame.add(Label3);
	    frame.add(Label4);
	    frame.add(Label5);
	    frame.add(Label6);
	    frame.add(Label7);
	    frame.add(Label8);
	    frame.add(myButton);
	    frame.add(myButton1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==myButton) {
			frame.dispose();
			Encryption myWindow = new Encryption();
		}
		
		if(e.getSource()==myButton1) {
			frame.dispose();
			Decryption myWindow = new Decryption();
		}
		
	}

}