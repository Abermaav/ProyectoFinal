import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zhongli extends JFrame implements ActionListener {
    Border bordo = BorderFactory.createLineBorder(Color.BLACK, 2);
    private final JCheckBox arconte, fuerte, lanza, arco, catalizador, contratos, sabiduria, libertad;
    private final JButton aceptarBtn, salirBtn, superclaseBtn;
    private final JLabel etiResultado;
    private final JLabel etiResultado2;

    Zhongli() {
        setTitle("Zhongli :D");
        setSize(600, 550);
        getContentPane().setBackground(new Color(126, 60, 30));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        ImageIcon icon = new ImageIcon("src/Zhongli.png");
        Image imagen = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        ImageIcon icono = new ImageIcon(imagen);

        JLabel foto = new JLabel();
        foto.setBounds(25,25,150,150);
        foto.setBorder(bordo);
        foto.setOpaque(true);
        foto.setIcon(icono);
        add(foto);

        JLabel descripcion = new JLabel("<html>Morax<br>mejor conocido como Zhongli es el arconte de Liyue y dios de los contratos<br>Domina el elemento geo y utiliza una lana para luchar</html>");
        descripcion.setBounds(205,25,370,150);
        descripcion.setBorder(bordo);
        descripcion.setBackground(Color.white);
        descripcion.setOpaque(true);
        add(descripcion);

        etiResultado= new JLabel();
        etiResultado.setBounds(205,255,370,120);
        etiResultado.setBorder(bordo);
        etiResultado.setBackground(Color.white);
        etiResultado.setOpaque(true);
        add(etiResultado);

        etiResultado2= new JLabel();
        etiResultado2.setBounds(205,385,370,120);
        etiResultado2.setBorder(bordo);
        etiResultado2.setBackground(Color.white);
        etiResultado2.setOpaque(true);
        add(etiResultado2);



        aceptarBtn=new JButton("<html><font color='green'>Aceptar</font></html>");
        aceptarBtn.setBounds(205, 185, 120, 65);
        aceptarBtn.addActionListener(this);
        add(aceptarBtn);

        salirBtn=new JButton("<html><font color='red'>Salir</font></html>");
        salirBtn.setBounds(330, 185, 120, 65);
        salirBtn.addActionListener(this);
        add(salirBtn);

        superclaseBtn=new JButton("<html><font color='rgb(254, 185, 0)'>¡¡Super Class!!</font></html>");
        superclaseBtn.setBounds(455, 185, 120, 65);
        superclaseBtn.addActionListener(this);
        add(superclaseBtn);


        arconte=new JCheckBox();
        arconte.setBounds(25, 190, 150, 20);
        arconte.setBorderPainted(true);
        arconte.setOpaque(true);
        arconte.setText("Arconte");
        add(arconte);

        fuerte=new JCheckBox();
        fuerte.setBounds(25, 225, 150, 20);
        fuerte.setBorderPainted(true);
        fuerte.setOpaque(true);
        fuerte.setText("Fuerte");
        add(fuerte);

        lanza=new JCheckBox();
        lanza.setBounds(25, 260, 150, 20);
        lanza.setBorderPainted(true);
        lanza.setOpaque(true);
        lanza.setText("Lanza");
        add(lanza);

        arco=new JCheckBox();
        arco.setBounds(25, 295, 150, 20);
        arco.setBorderPainted(true);
        arco.setOpaque(true);
        arco.setText("Arco");
        add(arco);

        catalizador=new JCheckBox();
        catalizador.setBounds(25, 330, 150, 20);
        catalizador.setBorderPainted(true);
        catalizador.setOpaque(true);
        catalizador.setText("Catalizador");
        add(catalizador);


        contratos=new JCheckBox();
        contratos.setBounds(25, 390, 150, 20);
        contratos.setBorderPainted(true);
        contratos.setOpaque(true);
        contratos.setText("Contratos");
        add(contratos);

        sabiduria=new JCheckBox();
        sabiduria.setBounds(25, 425, 150, 20);
        sabiduria.setBorderPainted(true);
        sabiduria.setOpaque(true);
        sabiduria.setText("Sabiduria");
        add(sabiduria);

        libertad=new JCheckBox();
        libertad.setBounds(25, 460, 150, 20);
        libertad.setBorderPainted(true);
        libertad.setOpaque(true);
        libertad.setText("Libertad");
        add(libertad);




        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource()==salirBtn){this.dispose();}

        if (evento.getSource()==superclaseBtn){new SPInterfaz();}

        if (evento.getSource() == aceptarBtn){
            String msj= "Atributos elegidos: ";
            String msj2= "Metodo elegido: ";

            if (arconte.isSelected()){
                msj+= "arconte ";
            }
            if (fuerte.isSelected()) {
                msj += "fuerte ";
            }
            if (lanza.isSelected()) {
                msj+= "lanza ";
            }
            if (arco.isSelected()) {
                msj +="arco ";
            }
            if (catalizador.isSelected()) {
                msj += "catalizador ";
            }


            if (contratos.isSelected()) {
                msj2 += "contratos ";
            }
            if (sabiduria.isSelected()) {
                msj2 += "sabiduria ";
            }
            if (libertad.isSelected()) {
                msj2 += "libertad ";
            }
            etiResultado.setText(msj);
            etiResultado2.setText(msj2);
        }

    }



}
