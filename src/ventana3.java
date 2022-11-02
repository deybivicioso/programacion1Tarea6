import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ventana3 extends JFrame {
    componentes2 acces = new componentes2();

    public ventana3() {
        setVisible(true);
        setTitle("mini encuesta/ejercicio3");
        setSize(385, 575);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(acces);
    }
}

class componentes2 extends JPanel implements ChangeListener, ActionListener {
    // titulo de los botones
    JLabel selectSystem = new JLabel();
    JLabel selectskill = new JLabel();
    JLabel selecthours = new JLabel();
    // botones del programa
    JRadioButton firstRadio = new JRadioButton("Windows");
    JRadioButton secondRadio = new JRadioButton("Linux");
    JRadioButton thirdRadio = new JRadioButton("Mac");
    JCheckBox fourthbBox = new JCheckBox(" Programacion ");
    JCheckBox fifth = new JCheckBox(" Diseño grafico ");
    JCheckBox sixth = new JCheckBox(" Administracion ");
    // jseparator
    JSeparator separador1 = new JSeparator();
    JSeparator separador2 = new JSeparator();
    // jslider y su JLabel
    JSlider horas = new JSlider(0, 24, 0);
    JLabel horas2 = new JLabel();
    // boton para generar el resultado de la encuesta
    JButton generar = new JButton();
    // lamina JPanel
    JPanel papelDraw = new JPanel();

    public componentes2() {// constructor
        setLayout(null);
        titulos();
        buttonProgram();
        separador();
        lamina3();
    }

    public void actionPerformed(ActionEvent e) {
        String informacion = "tu sistema predilecto es: ";
        JRadioButton[] botonesRadio = { firstRadio, secondRadio, thirdRadio };
        for (int i = 0; i < botonesRadio.length; i++) {
            if (botonesRadio[i].isSelected()) {
                informacion += botonesRadio[i].getText()+"";
            }
        }
        JCheckBox[] boxchek = { fourthbBox, fifth, sixth };
        informacion += " , tu skill es: ";
        for (int i = 0; i < boxchek.length; i++) {
            if (boxchek[i].isSelected()) {
                informacion += boxchek[i].getText() + "";
            }
        }
        informacion += " las horas que pasas en el computaor es un  total de: " + horas.getValue();
        JOptionPane.showMessageDialog(this, informacion, "muestra de resultados", JOptionPane.INFORMATION_MESSAGE);
    }

    public void stateChanged(ChangeEvent e) {
        horas2.setText("" + horas.getValue());
    }

    public void titulos() {
        // titulos principales
        selectSystem.setBounds(15, 20, 208, 20);
        selectSystem.setText("selecione un sistema operativo");
        selectSystem.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        selectskill.setBounds(15, 165, 208, 20);
        selectskill.setText("elige tu especialidad");
        selectskill.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        selecthours.setBounds(15, 300, 235, 20);
        selecthours.setText("horas que dedicas en el ordenador");
        selecthours.setFont(new Font("Times New Roman", Font.ITALIC, 16));        
    }

    public void buttonProgram() {
        // instruction of raioButton
        firstRadio.setBounds(15, 50, 90, 20);
        firstRadio.setFont(new Font("Times New Roman", Font.ITALIC, 14));
        secondRadio.setBounds(15, 80, 90, 20);
        secondRadio.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        thirdRadio.setBounds(15, 110, 90, 20);
        thirdRadio.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        ButtonGroup group1 = new ButtonGroup();
        group1.add(firstRadio);
        group1.add(secondRadio);
        group1.add(thirdRadio);
        // instruction of buttoncheck
        fourthbBox.setBounds(10, 200, 130, 20);
        fourthbBox.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        fifth.setBounds(10, 230, 130, 20);
        fifth.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        sixth.setBounds(10, 260, 130, 20);
        sixth.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        // JSlider y Jlabel
        horas.setBounds(70, 330, 120, 20);
        horas.addChangeListener(this);
        horas2.setBounds(15, 330, 30, 15);
        // boton generar
        generar.setText("generar");
        generar.setFont(new Font("Times New Roman", Font.ITALIC, 14));
        generar.setBounds(90, 370, 100, 25);
        generar.addActionListener(this);
    }

    public void separador() {
        separador1.setForeground(Color.GRAY);
        separador1.setBounds(20, 170, 260, 350);
        add(separador1);
        separador2.setForeground(Color.GRAY);
        separador2.setBounds(20, 310, 260, 350);
        add(separador2);
    }

    public void lamina3() {
        papelDraw.setLayout(null);
        papelDraw.setBounds(10, 20, 300, 430);
        papelDraw.setBorder(BorderFactory.createEtchedBorder());
        papelDraw.add(selectSystem);
        papelDraw.add(firstRadio);       
        papelDraw.add(secondRadio);       
        papelDraw.add(thirdRadio);       
        papelDraw.add(selectskill);
        papelDraw.add(fourthbBox);        
        papelDraw.add(fifth);        
        papelDraw.add(sixth);      
        papelDraw.add(selecthours);
        papelDraw.add(horas);
        papelDraw.add(horas2);
        papelDraw.add(generar);
        add(papelDraw);
    }
}
