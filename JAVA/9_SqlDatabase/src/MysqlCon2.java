import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class MysqlCon2 {
private static Class<?> forName;
public static void main(String args[]) {
JFrame f = new JFrame("Password Field Example");
final JLabel label = new JLabel();
label.setBounds(20, 150, 200, 50);
final JPasswordField value = new JPasswordField();
value.setBounds(100, 75, 100, 30);
JLabel l1 = new JLabel("Username:");
l1.setBounds(20, 20, 80, 30);
JLabel l2 = new JLabel("Password:");
l2.setBounds(20, 75, 80, 30);
JButton b = new JButton("Login");
b.setBounds(100, 120, 80, 30);
final JTextField text = new JTextField();
text.setBounds(100, 20, 100, 30);
f.add(value);
f.add(l1);
f.add(label);
f.add(l2);
f.add(b);
f.add(text);
f.setSize(300, 300);
f.setLayout(null);
f.setVisible(true);
b.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String data = text.getText();
String password = new String(value.getPassword());
boolean status=false;
try {
forName = Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "");
Statement stmt = con.createStatement();
//"insert into tablename values (" +data+ ",'" + password + "');";
//int row = stmt.executeUpdate("Insert into login values('" + data + "','" + password + "')");
ResultSet rs = stmt.executeQuery("select * from login");
while (rs.next()){
 System.out.println(rs.getString(1) + " " + rs.getString(2));
label.setText(rs.getString(1)+ " "+ rs.getString(2));
if(rs.getString(1).equals(data) && rs.getString(2).equals(password))
status=true; 
}
con.close();
if (status == true) {JOptionPane.showMessageDialog(f,"Login Successful"); 
label.setText("1");}
if (status == false) {JOptionPane.showMessageDialog(f,"Login Unsuccessful"); 
label.setText("1");}
} catch (Exception f) {
System.out.println(f);
} }
});
} }