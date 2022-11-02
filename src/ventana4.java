import java.awt.Font;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana4 extends JFrame {
    components4 as=new components4();
    public ventana4(){
        setVisible(true);
        setTitle("peliculas/ejercicio4");
        setSize(510, 380);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(as);        
    }    
}
class components4 extends JPanel  implements ActionListener{
    //titulos
    JLabel title1=new JLabel("Escribe el titulo de una pelicula");
    JLabel title2=new JLabel("Peliculas");
    //textfield and combobox
    JTextField scuard=new JTextField();
    JComboBox scuard2=new JComboBox<>();
    //boton
    JButton boto1=new JButton("Añadir");
    //jpanel
    JPanel hoja=new JPanel();   
    public components4(){ //constructor
        setLayout(null);
        titleMian();
        dates();
        lamina4();
    }
    public void actionPerformed(ActionEvent e){
        String movies=scuard.getText();
        scuard.setText("");
        scuard2.addItem(movies);
    }
    public void titleMian(){
        title1.setFont(new Font("Arial",Font.PLAIN,14));
        title1.setBounds(25, 20, 205, 20);
        //aplicando titulo2
        title2.setFont(new Font("Arial",Font.PLAIN,14));
        title2.setBounds(295, 20, 100, 20);
    }
    public void dates(){
        //aplicando el JTextField
        scuard.setBounds(38, 50, 185, 20);
        //aplicando el boton
        boto1.setFont(new Font("Arial",Font.PLAIN,12));
        boto1.setBounds(47, 80, 94, 20);
        boto1.addActionListener(this);
        //aplicando el combobox
        scuard2.setBounds(275, 50, 180, 20);
        
    }
    public void lamina4(){
        hoja.setLayout(null);
        hoja.setBounds(10, 10, 475, 300);
        //hoja.setBorder(BorderFactory.createEtchedBorder());
        hoja.add(title1);
        hoja.add(scuard);
        hoja.add(boto1);
        hoja.add(title2);
        hoja.add(scuard2);
        add(hoja);
    }
}
