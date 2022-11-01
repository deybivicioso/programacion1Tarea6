import java.awt.Font;
import java.awt.event.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ventana2 extends JFrame {
    componentes1 gadyeds=new componentes1();
    public ventana2(){
        setVisible(true);
        setTitle("generador de numero/ejercicio2");
        setSize(325, 280);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(gadyeds);
    }    
}
class componentes1 extends JPanel implements ActionListener,ChangeListener{
    //variables del programa
    JLabel tex=new JLabel();
    JLabel tex1=new JLabel();
    JLabel tex2=new JLabel();
    JSpinner espin1=new JSpinner();
    JSpinner espin2=new JSpinner();
    JTextField resultado=new JTextField();
    JButton generar=new JButton("generar");
    public componentes1(){ //constructor de la clase 
        setLayout(null);
        textox();
        buttons();
        lamina();
    }
    public void actionPerformed(ActionEvent e){
        int valor1=(Integer)espin1.getValue();
        int valor2=(Integer)espin2.getValue();
        int result=(int) Math.floor(Math.random()*(valor1-valor2+1)+valor2);
        resultado.setText(""+result);
      

    }
    public void stateChanged(ChangeEvent e){
        
    }
    public void textox(){
        //primer texto
         tex=new JLabel("numero 1");
        tex.setBounds(10,50,60,20);
        tex.setFont(new Font("arial",Font.ITALIC,12));
        //segundo texto
        tex1=new JLabel("numero 2");
        tex1.setBounds(10, 90, 60, 20);
        tex1.setFont(new Font("arial",Font.ITALIC,12));
        //tercer texto
        tex2=new JLabel("numero generado");
        tex2.setBounds(10, 130, 100, 12);
        tex2.setFont(new Font("arial",Font.ITALIC,12));
    }
    public void buttons(){
        //priemr jSpinner
        espin1=new JSpinner();
        espin1.setBounds(120, 50, 75, 20);
        //segundo JSpinner
        espin2=new JSpinner();
        espin2.setBounds(120, 90, 75, 20); 
        //cuadro de texto (JTextField) al lado de "numero generado"    
        resultado.setBounds(120,130,75,20);
        //boton "generar"
        generar.setBounds(120, 180, 90, 30);
        generar.setFont(new Font("arial",Font.ITALIC,12));
        generar.addActionListener(this);
    }
    public void lamina(){
        JPanel lamina2=new JPanel();
        lamina2.setLayout(null);
        lamina2.setBounds(10, 5, 295, 225);
        lamina2.setBorder(BorderFactory.createEtchedBorder());
        lamina2.add(tex);
        lamina2.add(tex1);
        lamina2.add(tex2);
        lamina2.add(espin1);
        lamina2.add(espin2);
        lamina2.add(resultado);
        lamina2.add(generar);
        add(lamina2);
    }
}
