import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SPInterfaz extends JFrame implements ActionListener {
    Border bordo = BorderFactory.createLineBorder(Color.BLACK, 2);
    private final JTextArea texto;
    private final JButton salirBtn;
    SPInterfaz() {
         Z1 z1= new Z1("Geo","Perfora Nubes", "Beber té", "Liyue");
        setTitle("Superclase Zhongli");
        setSize(660, 353);
        getContentPane().setBackground(new Color(126, 60, 30));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        texto=new JTextArea();
        texto.setBounds(20, 40, 500, 240);
        texto.setBackground(Color.WHITE);
        texto.setOpaque(true);
        texto.setBackground(new Color(255, 255, 255));
        texto.setEditable(false);
        texto.setBorder(bordo);
        texto.setText(z1.mostrarDatos());
        add(texto);
        salirBtn=new JButton("<html><font color='red'>Salir</font></html>");
        salirBtn.setBounds(530, 40, 120, 65);
        salirBtn.setBackground(Color.WHITE);
        salirBtn.addActionListener(this);
        add(salirBtn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    SPInterfaz(String Buer) {
        N1 n1= new N1("Dendro","Sueño de las mil noches", "Jugar en su columpio onirico", "el bosque de los sueños");
        setTitle("Superclase Nahida");
        setSize(660, 353);
        getContentPane().setBackground(new Color(135, 185, 128));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        texto=new JTextArea();
        texto.setBounds(20, 40, 500, 240);
        texto.setBackground(Color.WHITE);
        texto.setOpaque(true);
        texto.setBackground(new Color(255, 255, 255));
        texto.setEditable(false);
        texto.setBorder(bordo);
        texto.setText(n1.mostrarDatos());
        add(texto);
        salirBtn=new JButton("<html><font color='red'>Salir</font></html>");
        salirBtn.setBounds(530, 40, 120, 65);
        salirBtn.setBackground(Color.WHITE);
        salirBtn.addActionListener(this);
        add(salirBtn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    SPInterfaz( int barbatos) {
        V1 v1= new V1("Anemo","Arco de amos", "una lira llamada Der Himmel", "Manzanas rojas");
        setTitle("Superclase Venti");
        setSize(660, 353);
        getContentPane().setBackground(new Color(93, 201, 160));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        texto=new JTextArea();
        texto.setBounds(20, 40, 500, 240);
        texto.setBackground(Color.WHITE);
        texto.setOpaque(true);
        texto.setBackground(new Color(255, 255, 255));
        texto.setEditable(false);
        texto.setBorder(bordo);

        texto.setText(v1.mostrarDatos());
        add(texto);
        salirBtn=new JButton("<html><font color='red'>Salir</font></html>");
        salirBtn.setBounds(530, 40, 120, 65);
        salirBtn.setBackground(Color.WHITE);
        salirBtn.addActionListener(this);
        add(salirBtn);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource()==salirBtn){this.dispose();}
    }

}
