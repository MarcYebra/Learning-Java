import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorld2 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("HelloWorld2");
    frame.add(new HelloComponent2("Hello, World!"));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}

//   Our HelloWorld2 class is an entire Java application in a single class. It defines just one method, main(), which 
// holds the body of our program. The main() method that is first called when the application starts.

//   String[] args - allows us to pass command-line arguments to the application.

//   Line 7 - main() creates a JFrame, the window that will hold our example. JFrame is the name of a class, but the 
// class itself is a template. By using the 'new' keyword, we tell Java to distribute memory and actually create a 
// JFrame object.

//   Line 10 - an example of invoking a method on a particular object. The 'setSize()' method is defined by the 
// JFrame class, and it affects the particular JFrame object we've placed in the variable frame.

//   Line 11 - 'main()' has the final task to show the frame window and its contents, which otherwise would be invisible. 
// we use the 'setVisible' method to true to achieve this.
