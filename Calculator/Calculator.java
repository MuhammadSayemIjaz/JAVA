import java.awt.*;
import javax.swing.*;

class Cal{
    Container C;
    JFrame F ;
    JPanel P , P1 ;
    JLabel L ;
    JTextField T;
    JButton b0,b1 ,b2 ,b3,b4,b5,b6,b7,b8,b9;
    JButton Plus , Min , Div , Mul , Per , Dot ,Equal ,Clear;
    void Show(){

        // Set Frame of Calculator
    F = new JFrame("Calculator");

        //Create TextArea
    T = new JTextField();
        // Create JPanel
    P1 = new JPanel();
    P1.setLayout(new GridLayout(4,4));
    P = new JPanel();
    P.setLayout(new GridLayout(0,1));
    // P.setBackground(Color.BLUE);
    
         //Create Buttons
    
        //Create NUmber Buttons
    b0   = new JButton("0");
    b1   = new JButton("1");
    b2   = new JButton("2");
    b3   = new JButton("3");
    b4   = new JButton("4");
    b5   = new JButton("5");
    b6   = new JButton("6");
    b7   = new JButton("7");
    b8   = new JButton("8");
    b9   = new JButton("9");
        //Create Symbols of Maths
    Div  = new JButton("/");
    Mul  = new JButton("*");
    Plus = new JButton("+");
    Min  = new JButton("-");
    // Per  = new JButton("%");
    Dot  = new JButton(".");
    Equal  = new JButton("=");
    Clear  = new JButton("C");

        //Add Buttons in the Panel
    //First Row 

    P1.add(b1);
    P1.add(b2);
    P1.add(b3);
    P1.add(Clear);
    // Second Row
    P1.add(b4);
    P1.add(b5);
    P1.add(b6);
    P1.add(Mul);
    //Third Row
    P1.add(b7);
    P1.add(b8);
    P1.add(b9);
    P1.add(Min);
    // Fourth Row
    P1.add(b0);
    P1.add(Dot);
    P1.add(Plus);
    P1.add(Div);
    P.add(Equal);
    // P.add(Per);

    F.add(P1);

        // SetLayout of Container

        C = F.getContentPane();
        C.setLayout(new BorderLayout());

        // Adding Components in the container

        C.add(P1 ,BorderLayout.CENTER);
        C.add(T ,BorderLayout.NORTH);
        C.add(P , BorderLayout.SOUTH);

        F.setSize( 400, 400);
        F.setVisible(true);
    }
}
/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        Cal A = new Cal(); 
        A.Show();
    }
}
