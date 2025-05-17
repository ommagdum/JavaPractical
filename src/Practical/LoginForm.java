package Practical;

import org.postgresql.Driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginForm extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel user_label, password_label, message;
    private JTextField username_text;
    private JPasswordField password_text;
    private JButton submit, cancel;

    LoginForm(){
        user_label = new JLabel();
        user_label.setText("Username : ");
        username_text = new JTextField();

        password_label = new JLabel();
        password_label.setText("Password : ");
        password_text = new JPasswordField();

        submit = new JButton("Submit");
        panel = new JPanel(new GridLayout(3,1));
        panel.add(user_label);
        panel.add(username_text);
        panel.add(password_label);
        panel.add(password_text);

        message = new JLabel();
        panel.add(message);
        panel.add(submit);

        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Registration Page");
        setSize(450,350);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        String username = username_text.getText();
//        String password = password_text.getText();
//        if(username.trim().equals("admin") && password.trim().equals("admin123")){
//            message.setText("Hello "+ username + " " );
//        } else {
//            message.setText("Invalid User");
//        }

        String jdbc_url = "jdbc:postgresql://localhost:5432/testdb";
        String username = "postgres";
        String password = "soundcloud";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbc_url, username, password);
            Statement statement = connection.createStatement();

//            String createTable = "CREATE TABLE IF NOT EXISTS student(id NUMERIC, username VARCHAR(20), password VARCHAR(20))";
//            statement.execute(createTable);

            String usernameText = username_text.getText();
            String passwordText = password_text.getText();
            String insertQuery = "INSERT INTO student(username, password) VALUES("+"'"+usernameText.trim()+"'"+"," + "'"+passwordText.trim()+"'"+ ")";
            statement.executeUpdate(insertQuery);
            message.setText("Student Registered");
            connection.close();

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static void main(String[] args){
        new LoginForm();
    }
}
