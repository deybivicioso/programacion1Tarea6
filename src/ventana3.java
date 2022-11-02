import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class ventana3 extends JFrame {
    componentes2 acces=new componentes2();
    public ventana3(){
        setVisible(true);
        setTitle("mini encuesta/ejercicio3");
        setSize(385, 575);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        add(acces);     
    }  
}
class componentes2 extends JPanel{
    //titulo de los botones
    JLabel selectSystem=new JLabel();
    JLabel selectskill=new JLabel();
    JLabel selecthours=new JLabel();
    //texto al lado de los radiobuttons y checkbox
    JLabel textButton1=new JLabel();
    JLabel textButton2= new JLabel();
    JLabel textButton3=new JLabel();
    JLabel textButton4=new JLabel();
    JLabel textButton5=new JLabel();
    JLabel textButton6=new JLabel();
    //botones del programa
    JRadioButton firstRadio=new JRadioButton();
    JRadioButton secondRadio=new JRadioButton();
    JRadioButton thirdRadio=new JRadioButton();
    JCheckBox fourthbBox=new JCheckBox();
    JCheckBox fifth=new JCheckBox();
    JCheckBox sixth=new JCheckBox();
    //jseparator
    JSeparator separador1=new JSeparator();
    JSeparator separador2=new JSeparator();
    //lamina JPanel
    JPanel papelDraw=new JPanel();
    public componentes2(){//constructor
        setLayout(null);
        titulos();
        buttonProgram();
        separador();
        lamina3();
    }
    public void titulos(){
        //titulos principales
        selectSystem.setBounds(15, 20, 208, 20);
        selectSystem.setText("selecione un sistema operativo");
        selectSystem.setFont(new Font("Times New Roman",Font.ITALIC,16));
        selectskill.setBounds(15, 165, 208, 20);
        selectskill.setText("elige tu especialidad");
        selectskill.setFont(new Font("Times New Roman",Font.ITALIC,16));
        selecthours.setBounds(15, 300, 235, 20);
        selecthours.setText("horas que dedicas en el ordenador");
        selecthours.setFont(new Font("Times New Roman",Font.ITALIC,16));
        //texto al lado de los radiobuttons
        textButton1.setText("Windows");   
        textButton1.setFont(new Font("Times New Roman",Font.ITALIC,14));     
        textButton1.setBounds(50, 50, 50, 20);
        textButton2.setText("Linux");  
        textButton2.setFont(new Font("Times New Roman",Font.ITALIC,14)); 
        textButton2.setBounds(50, 80, 50, 20);
        textButton3.setText("Mac");
        textButton3.setFont(new Font("Times New Roman",Font.ITALIC,14));
        textButton3.setBounds(50, 110, 50, 20);
        //texto al lado de los checkbox
        textButton4.setText("programador");
        textButton4.setFont(new Font("Times New Roman",Font.ITALIC,14));
        textButton4.setBounds(40, 200, 95, 20);
        textButton5.setText("diseñador grafico");
        textButton5.setFont(new Font("Times New Roman",Font.ITALIC,14));
        textButton5.setBounds(40, 230, 130, 20);
        textButton6.setText("administracion");
        textButton6.setFont(new Font("Times New Roman",Font.ITALIC,14));
        textButton6.setBounds(40, 260, 95, 20);

    }
    public void buttonProgram(){
        //instruction of raioButton        
        firstRadio.setBounds(15, 50, 20, 20);
        secondRadio.setBounds(15, 80, 20, 20);
        thirdRadio.setBounds(15, 110, 20, 20);
        ButtonGroup group1=new ButtonGroup();
        group1.add(firstRadio);
        group1.add(secondRadio);
        group1.add(thirdRadio);
        //instruction of buttoncheck
        fourthbBox.setBounds(10, 200, 20, 20);
        fifth.setBounds(10, 230, 20, 20);
        sixth.setBounds(10, 260, 20, 20);
    }
    public void separador(){
        separador1.setForeground(Color.GRAY);
        separador1.setBounds(20, 170, 260, 350);
        add(separador1);
        separador2.setForeground(Color.GRAY);
        separador2.setBounds(20, 310, 260, 350);
        add(separador2);

    }
    public void lamina3(){
        papelDraw.setLayout(null);
        papelDraw.setBounds(10, 20, 300, 400);
        papelDraw.setBorder(BorderFactory.createEtchedBorder());
        papelDraw.add(selectSystem);
        papelDraw.add(firstRadio);
        papelDraw.add(textButton1);
        papelDraw.add(secondRadio);
        papelDraw.add(textButton2);
        papelDraw.add(thirdRadio);
        papelDraw.add(textButton3);
        papelDraw.add(selectskill); 
        papelDraw.add(fourthbBox);
        papelDraw.add(textButton4); 
        papelDraw.add(fifth);  
        papelDraw.add(textButton5);  
        papelDraw.add(sixth);
        papelDraw.add(textButton6);
        papelDraw.add(selecthours);
        add(papelDraw);
    }
}
