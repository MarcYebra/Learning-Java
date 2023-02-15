import javax.swing.*
// Swing is a sophisticated toolkit for building graphical user interfaces

public class HelloWorld {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello World!");
    JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
    frame.add(label);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}

// We first declare a class called HelloWorld and a method called main()

// The main() method is the entry point for applications. Every Java application includes at 
// least one class with a main() method that performs neccessary actions to start the rest of the program.


