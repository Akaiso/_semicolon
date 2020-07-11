/*import javax.swing.JOptionPane;

public class Dialog1{
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"ACCESS DENIED!...Follow the prompt");
		String name = JOptionPane.showInputDialog("PLEASE ENTER YOUR PASSWORD:");
		JOptionPane.showMessageDialog(null,"YOU BE THIEF!...na your password be that?");
		
		
	}
}
*/

import javax.swing.JOptionPane;
public class Dialog1{
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("WHAT IS YOUR REALNAME");
		String newa = String.format("thank you %s for signing up", name);
		JOptionPane.showMessageDialog(null,newa);

	}
}