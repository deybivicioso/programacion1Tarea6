import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ventana1 extends JFrame {
    componentes code = new componentes();

    public ventana1() {
        setVisible(true);
        setTitle("ventana espejo/ejercicio1");
        setSize(385, 575);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(code);
    }

}

class componentes extends JPanel implements ActionListener,ChangeListener{    
    // texto de cabecera y su espejo...
    JLabel texto1 = new JLabel();
    JLabel texto2=new JLabel();//espejo..
    // radiobuttons de la parte superior izquierda y su espejo
    JRadioButton B1 = new JRadioButton("opcion 1");
    JRadioButton B2 = new JRadioButton("opcion 2");
    JRadioButton B3 = new JRadioButton("opcion 3");
    JRadioButton B4=new JRadioButton("opcion 1");//espejo..
    JRadioButton B5=new JRadioButton();//espejo...
    JRadioButton B6=new JRadioButton();//espejo..
    // checkbox y su espejo
    JCheckBox check1 = new JCheckBox("opcion 4");
    JCheckBox check2 = new JCheckBox("opcion 5");
    JCheckBox check3 = new JCheckBox("opcion 6");
    JCheckBox check4=new JCheckBox();//espejo...
    JCheckBox check5=new JCheckBox();//espejo...
    JCheckBox check6=new JCheckBox();//espejo...
    //area de texto (primer textfield) y su espejo
    JTextField text = new JTextField();
    JTextField text2=new JTextField();//espejo...
    //comboBjox y su espejo
    JComboBox combo = new JComboBox<>();
    JComboBox combo2=new JComboBox<>();//espejo
    //spiner superior y su espejo
    JSpinner spin1=new JSpinner();
    JSpinner spin2=new JSpinner();//espejo

    // constructor de la clase.....
    public componentes() {
        setLayout(null);
        botonesRadio();
        botonesCheck();
        texto();
        areaText();
        comboBoxx();
        spinnerr();
        linea();        
        laminasx();      
    }
    public void actionPerformed(ActionEvent e){
        //eventos de botones radios        
        this.B4.setSelected(this.B1.isSelected());
        this.B5.setSelected(this.B2.isSelected());
        this.B6.setSelected(this.B3.isSelected());
        //eventos de los botones check
        this.check4.setSelected(this.check1.isSelected());
        this.check5.setSelected(this.check2.isSelected());
        this.check6.setSelected(this.check3.isSelected());
        //eventos de area texto
        this.text2.setText(this.text.getText());
        //eventos de combo box
        this.combo2.setSelectedItem(this.combo.getSelectedItem());        
    }
    public void stateChanged(ChangeEvent e){
        this.spin2.setValue((Integer)this.spin1.getValue());
    }
   

    public void botonesRadio() {
        B1.setBounds(10, 38, 75, 15);
        B1.addActionListener(this);
        B2.setBounds(10, 65, 75, 15);
        B2.addActionListener(this);
        B3.setBounds(10, 90, 75, 15);
        B3.addActionListener(this);
        ButtonGroup grupo1 = new ButtonGroup();
        grupo1.add(B1);
        grupo1.add(B2);
        grupo1.add(B3);
        //componentes espejo...       
        B4.setBounds(10,38,75,15);
        B4.setEnabled(false);
        B5=new JRadioButton("opcion 2");
        B5.setBounds(10, 65, 75, 15);
        B5.setEnabled(false);
        B6=new JRadioButton("opcion 3");
        B6.setBounds(10,90,75,15);
        B6.setEnabled(false);
        ButtonGroup grupo2=new ButtonGroup();
        grupo2.add(B4);
        grupo2.add(B5);
        grupo2.add(B6);
    }

    public void botonesCheck() {
        check1.setBounds(130, 38, 75, 15);
        check1.addActionListener(this);
        check2.setBounds(130, 65, 75, 15);
        check2.addActionListener(this);
        check3.setBounds(130, 90, 75, 15);
        check3.addActionListener(this);
        //componentes espejo..
        check4=new JCheckBox("opcion 4");
        check4.setBounds(130, 38, 75, 15);
        check4.setEnabled(false);
        check5=new JCheckBox("opcion 5");
        check5.setBounds(130, 65, 75, 15);
        check5.setEnabled(false);
        check6=new JCheckBox("opcion 6");
        check6.setBounds(130, 90, 75, 15);
        check6.setEnabled(false);

    }

    public void areaText() {
        
        text.setBounds(230, 38, 90, 25);
        text.addActionListener(this);
        //componentes espejo....
        text2=new JTextField();
        text2.setBounds(230, 38, 90, 25);
        text2.setEnabled(false);
    }

    public void comboBoxx() {
        String[] items = { " item 1", " item2", " item3", "  item4", " item5" ," item6" };
        combo = new JComboBox<>(items);
        combo.setBounds(230, 75, 90, 25);
        combo.addActionListener(this);
        //componentes espejo....
        combo2=new JComboBox<>(items);
        combo2.setBounds(230, 75, 90, 25);
        combo2.setEnabled(false);

    }

    public void spinnerr() { 
        spin1=new JSpinner();
        spin1.setBounds(230, 115, 90, 25);
        spin1.addChangeListener(this);
        //componente espejo....
        spin2=new JSpinner();
        spin2.setBounds(230, 115, 90, 25);
        spin2.setEnabled(false);
        
    }

    public void texto() {

        texto1.setText("original");
        texto1.setBounds(10, 8, 45, 25);
        //componente espejo...
        
        texto2.setText("espejo");
        texto2.setBounds(10,8,45,25);
    }
    public void linea (){
        JSeparator line1=new JSeparator();
        line1.setForeground(Color.GRAY.brighter());
        line1.setBounds(10, 200, 350, 15);

        add(line1);
    }

    public void laminasx() {
        JPanel lamina1 = new JPanel();
        lamina1.setLayout(null);
        lamina1.setBounds(10, 10, 345, 180);
        lamina1.setBorder(BorderFactory.createEtchedBorder());
        lamina1.add(texto1);
        lamina1.add(B1);
        lamina1.add(B2);
        lamina1.add(B3);
        lamina1.add(check1);
        lamina1.add(check2);
        lamina1.add(check3);
        lamina1.add(combo);
        lamina1.add(spin1);
        lamina1.add(text);
        add(lamina1);
        //jpanel espejo..
        JPanel lamina2=new JPanel();
        lamina2.setLayout(null);
        lamina2.setBounds(10, 210, 345, 180);
        lamina2.setBorder(BorderFactory.createEtchedBorder());
        lamina2.add(texto2);
        lamina2.add(B4);
        lamina2.add(B5);
        lamina2.add(B6);
        lamina2.add(check4);
        lamina2.add(check5);
        lamina2.add(check6);
        lamina2.add(text2);
        lamina2.add(combo2);
        lamina2.add(spin2);
        add(lamina2);

    }  
}


