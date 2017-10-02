package conditionals;

import javax.swing.JOptionPane;

public class userSKER {
public static void main(String[] args) {
String asker=JOptionPane.showInputDialog("Enter First Number");
String user=JOptionPane.showInputDialog("Enter Second Number");	
int ask=Integer.parseInt(asker);
int use=Integer.parseInt(user);
if(ask>use){
System.out.println(use +" " +ask);
}
else{
	System.out.println(ask +" " +use);
	
}
}
}

