import javax.swing.JOptionPane;
public class Assignment3 {
	public static void main(String [] args) {
            String choices [] = {"Admin", "Student", "Staff"};        
	    String username1, password1, username2, password2;
	    int countDown;
	JOptionPane.showMessageDialog(null, "Please create a username and password.");
       	username1 = JOptionPane.showInputDialog("Create a username.");
	password1 = JOptionPane.showInputDialog("Create a password.");
				
	JOptionPane.showMessageDialog(null, "Please log in with your username and password.");
	username2 = JOptionPane.showInputDialog("Enter username.");
	for (countDown = 2; countDown >=0; countDown--)
		if (username1.equals(username2)) {
			break;	
		}else {
			username2 = JOptionPane.showInputDialog("Username incorrect. Please try again.");
		if (countDown ==0) {
			JOptionPane.showMessageDialog(null, "System locked. Contact Admin.");
			return;
		}
		}
		password2 = JOptionPane.showInputDialog("Enter password.");
		for (countDown = 2; countDown >=0; countDown--)
		if (password1.equals(password2)) {
			break;
		}else {
	        	password2 = JOptionPane.showInputDialog("Password incorrect. Please try again.");
		if (countDown == 0 ) {
			JOptionPane.showMessageDialog(null, "System locked. Please contact Admin.");
			return;
		}
		}
	String Input = (String) JOptionPane.showInputDialog(null, "Select an account.","Account Type",
	JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);
	switch (Input) {
	case "Admin":
		JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file." );
		break;
	case "Student":
		JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file." );
		break;
	case "Staff":
		JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file." );
		break;
       	default:
		JOptionPane.showMessageDialog(null, "Authorization denied.");
		}
				
	}
	}
	
