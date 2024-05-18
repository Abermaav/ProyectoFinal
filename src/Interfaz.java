import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame implements ActionListener {
        private JButton b1, b2, b3;
    Interfaz() {
        setTitle("Arcontes :D");
        setSize(660, 353);
        getContentPane().setBackground(new Color(202, 191, 222));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        ImageIcon icon1 = new ImageIcon("src/Zhongli.png");
        ImageIcon icon2 = new ImageIcon("src/Nahida.png");
        ImageIcon icon3 = new ImageIcon("src/venti.png");

        Image imagen1 = icon1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image imagen2 = icon2.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Image imagen3 = icon3.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);

        ImageIcon b1icon = new ImageIcon(imagen1);
        ImageIcon b2icon = new ImageIcon(imagen2);
        ImageIcon b3icon = new ImageIcon(imagen3);



        b1=new JButton();
        b1.setBounds(20, 50, 200, 200);
        b1.setBackground(Color.WHITE);
        b1.setIcon(b1icon);
        b1.setBorderPainted(true);
        b1.setOpaque(true);
        b1.setBackground(new Color(126, 60, 30));
        b1.addActionListener(this);
        add(b1);

        b2=new JButton();
        b2.setBounds(230, 50, 200, 200);
        b2.setBackground(Color.WHITE);
        b2.setIcon(b2icon);
        b2.setBackground(new Color(135, 185, 128));
        b2.setBorderPainted(true);
        b2.setOpaque(true);
        b2.addActionListener(this);
        add(b2);

        b3=new JButton();
        b3.setBounds(440, 50, 200, 200);
        b3.setBackground(Color.WHITE);
        b3.setIcon(b3icon);
        b3.setBackground(new Color(93, 201, 160));
        b3.setBorderPainted(true);
        b3.setOpaque(true);
        b3.addActionListener(this);
        add(b3);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == b1){new Zhongli();}
        if (evento.getSource() == b2){new Nahida();}
        if (evento.getSource() == b3){new Venti();}

    }
}
