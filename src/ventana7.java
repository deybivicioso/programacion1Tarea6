import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class ventana7 extends JFrame {
    components7 as=new components7();
    public ventana7(){
        setVisible(true);
        setTitle("ventana espejo/ejercicio1");
        setSize(700, 575);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(as);
    }
}
class components7 extends JPanel{
    //los diferentes jpanels
    JPanel lamina1=new JPanel();
    JPanel lamina2=new JPanel();
    JPanel lamina3=new JPanel();
    JPanel lamina4=new JPanel();
    //los diferentes Jlabels
    JLabel titulo=new JLabel("Resgistro de socios");
    JLabel nombre=new JLabel("Nombre");
    JLabel apellido=new JLabel("Apellido");
    JLabel edad=new JLabel("Edad");
    //los diferentes jtextfield
    JTextField nombre2=new JTextField();
    JTextField apellido2=new JTextField();
    JTextField edad2=new JTextField();
    //los diferentes radiobuttons
    JRadioButton homnbre=new JRadioButton("Hombre");
    JRadioButton mujer=new JRadioButton("Mujer");
    //los diferentes botones
    JButton añadir=new JButton("Añadir");
    JButton modificar=new JButton("Modificar");
    JButton eleminar=new JButton("Eleminar");
    public components7(){
        setLayout(null);
        encabezados();
        laminaMain();
        //recuerda hacer la base de datos al final antes de los eventos 
    }
    public void encabezados(){
        titulo.setBounds(10,20,50,20);
        titulo.setFont(new Font("Arial",Font.PLAIN,14));
        //codigo del campo nombre del formulario
        nombre.setBounds(10, 15, 75, 20);        
        nombre.setFont(new Font("Arial",Font.PLAIN,13));
        nombre2.setBounds(65, 15, 135, 20);
        //codigo del campo apellido del formulario
        apellido.setBounds(10, 50, 75, 20);   
        apellido.setFont(new Font("Arial",Font.PLAIN,13));
        apellido2.setBounds(65, 50, 135, 20); 
        //hasta aqui llegaste....continuar con edad y lo demas

    }
    public void laminaMain(){
        //lamina principar donde iran las demas lamians y sus componentes...
       lamina1.setLayout(null);
        lamina1.setBounds(10, 10, 670, 520);
        lamina1.setBorder(BorderFactory.createEtchedBorder());
        lamina1.add(lamina2);
        lamina1.add(lamina3);
        add(lamina1);
        //seguna lamina donde ira el titulo, esta se agrega a la lamina1       
        lamina2.setBounds(250, 20, 200, 30);
        lamina2.setBorder(BorderFactory.createEtchedBorder());
        lamina2.add(titulo);
        //tercer lamina donde iran los campos para llenar la tabla
        lamina3.setLayout(null);
        lamina3.setBounds(10, 75, 215, 190);
        lamina3.setBorder(BorderFactory.createEtchedBorder());
        lamina3.add(nombre);
        lamina3.add(nombre2);
        lamina3.add(apellido);
        lamina3.add(apellido2);

        
    }
}
