import javax.swing.JOptionPane;
public class Mainzo{
    public static void main(String [] args) {
        String username;
        String usernameq;
        String passwordq;
      boolean checkUsername = true;
       // int sessionToken = 1;
        boolean usernameAccess = false;
        String userkey;
        boolean userCert = false;
        boolean numberFlag = false;
        boolean capitalFlag = false;
        boolean speshalFlag = false;
        boolean checkFirstPassword = false;
    
 //User Inputs first and last name

        String name1 = JOptionPane.showInputDialog(null, "Enter First Name");
        String surname1 = JOptionPane.showInputDialog(null, "Enter Last name");

// User creates Username and Program Validates if created username is allowed   

username = "";
while (checkUsername = true) {
    username = JOptionPane.showInputDialog(null, "Create a Username");
        if (username.length() > 5 || (!username.contains("_"))) { JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");}
        else if (username.length() < 5 && (username.contains("_"))) {JOptionPane.showMessageDialog(null, "Username Successfully Captured");userCert = true; break;}

   
    
}
     
// User Creates password and program validates if created password is allowed

      int i;
      char ch;
      String password1 = "";
      String password2 = "";
      while( userCert = true ) {
        password1 = JOptionPane.showInputDialog(null, "Create Password");
        for (i = 0; i < password1.length(); i++){ ch = password1.charAt(i);

        if( Character.isDigit(ch)){ numberFlag = true; System.out.println(numberFlag);}

        else if (Character.isUpperCase(ch)){capitalFlag = true;}

        else if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isWhitespace(ch))
        {speshalFlag = true;}}
        if (password1.length() < 8 || numberFlag == false || capitalFlag == false || speshalFlag == false )
        {checkFirstPassword = false; JOptionPane.showMessageDialog(null, "Password not correctly formatted, please ensure that the password contains atleast 8 characters, a number and a special character");}
        else {checkFirstPassword = true;}
         System.out.println(checkFirstPassword);
    
  //Program prompts User to type created password again to make sure that no typing errors were made
        
            if (checkFirstPassword) {password2 = JOptionPane.showInputDialog(null, "ReType Password");
            
            if ( !password1.equals(password2)) {JOptionPane.showMessageDialog(null, "Passwords Do Not Match");}
            else if (password1.equals(password2)) {break;}

            else if (!checkFirstPassword){ }}}
    
         
         


     // prompts the user to login   

      { JOptionPane.showMessageDialog(null, "Password Successfully Captured"); }

        JOptionPane.showConfirmDialog(null,"Click OK to Login", "Account Created", JOptionPane.DEFAULT_OPTION);



// asks user for created login credentials

    userkey = username.toLowerCase() + password2;
   System.out.println(userkey);

   userCert = true;

while (userCert = true){ 
    usernameq = JOptionPane.showInputDialog(null, "Enter Username");
    passwordq = JOptionPane.showInputDialog(null, "Enter Password" );
    String userkeyq = usernameq.toLowerCase() + passwordq;
    System.out.println(userkeyq);

   usernameAccess = userkey.equals(userkeyq);

   if ( !userkeyq.equals(userkey) ){ JOptionPane.showMessageDialog(null, "Invalid Username & Password Combination");}
   else { JOptionPane.showMessageDialog(null, "Welcome " + name1 + " " + surname1 + " It is great to see you"); break; } }




    }

}

    
   