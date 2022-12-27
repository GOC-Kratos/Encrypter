import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Decryption {

    public static void operate(int key) {
    	
    	//To select file
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();

        // file InputStream
        try {
            FileInputStream fis = new FileInputStream(file);

            byte[] data = new byte[fis.available()];
            fis.read(data);
            int i = 0;
            for (byte b : data) {
                System.out.println(b);
                data[i] = (byte) (b ^ key);
                i++;
            }

            //To save the updated data
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data);
            fos.close();
            fis.close();
            JOptionPane.showMessageDialog(null, "Your file Decrypted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    Decryption() {
    	
    	//creating frame
        JFrame f = new JFrame();
        f.setTitle("Decryption");
        f.setSize(400, 155);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\JavaProject\\\\src\\\\logo.png");// create image icon
        f.setIconImage(imageIcon.getImage());// change icon of frame
        f.getContentPane().setBackground(new Color(135, 60, 250));// set background color

        // creating different fonts
        Font font = new Font("Roboto", Font.BOLD, 25);
        Font font1 = new Font("Roboto", Font.ITALIC, 15);

        // creating labels
        JLabel label = new JLabel();
        label.setText("Enter key : ");
        label.setFont(font);

        JLabel Warning = new JLabel();
        Warning.setText("     Enter the key you used while encrypting the file.");
        Warning.setForeground(Color.RED);
        Warning.setFont(font1);

        // creating button
        JButton button = new JButton();
        button.setBounds(100, 100, 280, 120);
        button.setText("Decrypt");
        button.setFont(font);

        // creating text field
        JTextField textField = new JTextField(10);
        button.setBorder(BorderFactory.createEtchedBorder());
        textField.setFont(font);

      //To make button work
        button.addActionListener(e -> {
            System.out.println("Success");
            String text = textField.getText();
            int temp = Integer.parseInt(text);
            operate(temp);
        });

        f.setLayout(new FlowLayout());

      //adding elements to frame
        f.add(label);
        f.add(textField);
        f.add(Warning);
        f.add(button);
        f.setVisible(true);
    }

}
