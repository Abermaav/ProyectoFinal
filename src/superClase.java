import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class superClase extends JFrame {
    Border bordo = BorderFactory.createLineBorder(Color.BLACK, 2);
private JTextArea texto;


superClase (){
    setTitle("Zhongli :D");
    setSize(600, 550);
    getContentPane().setBackground(new Color(153, 123, 255));
    setLocationRelativeTo(null);
    setLayout(null);
    setResizable(false);

    texto = new JTextArea();
    texto.setBounds(25,25,150,150);
    texto.setBorder(bordo);
    texto.setBackground(Color.white);
    texto.setOpaque(true);
    texto.setEditable(false);
    add(texto);


    setVisible(true);
}
}

