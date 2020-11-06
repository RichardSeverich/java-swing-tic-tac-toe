import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ConstructorBotones {

  /**Metodo.*/
  public static void anadirPropiedades() {
    ContenedorBotones.miBoton1 = new JButton();
    ContenedorBotones.miBoton1.setName("1");
    ContenedorBotones.miBoton1.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton1.setBounds(0, 0, 232, 225);

    ContenedorBotones.miBoton2 = new JButton();
    ContenedorBotones.miBoton2.setName("2");
    ContenedorBotones.miBoton2.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton2.setBounds(232, 0, 232, 225);

    ContenedorBotones.miBoton3 = new JButton();
    ContenedorBotones.miBoton3.setName("3");
    ContenedorBotones.miBoton3.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton3.setBounds(464, 0, 232, 225);

    ContenedorBotones.miBoton4 = new JButton();
    ContenedorBotones.miBoton4.setName("4");
    ContenedorBotones.miBoton4.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton4.setBounds(0, 225, 232, 225);

    ContenedorBotones.miBoton5 = new JButton();
    ContenedorBotones.miBoton5.setName("5");
    ContenedorBotones.miBoton5.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton5.setBounds(232, 225, 232, 225);

    ContenedorBotones.miBoton6 = new JButton();
    ContenedorBotones.miBoton6.setName("6");
    ContenedorBotones.miBoton6.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton6.setBounds(464, 225, 232, 225);

    ContenedorBotones.miBoton7 = new JButton();
    ContenedorBotones.miBoton7.setName("7");
    ContenedorBotones.miBoton7.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton7.setBounds(0, 450, 232, 225);

    ContenedorBotones.miBoton8 = new JButton();
    ContenedorBotones.miBoton8.setName("8");
    ContenedorBotones.miBoton8.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton8.setBounds(232, 450, 232, 225);

    ContenedorBotones.miBoton9 = new JButton();
    ContenedorBotones.miBoton9.setName("9");
    ContenedorBotones.miBoton9.setFont(new Font("Arial", Font.PLAIN, 255));
    ContenedorBotones.miBoton9.setBounds(464, 450, 232, 225);
  }

  /**Metodo.*/
  public static void anadirBoton(JFrame ventana) {
    ventana.add(ContenedorBotones.miBoton1);
    ventana.add(ContenedorBotones.miBoton2);
    ventana.add(ContenedorBotones.miBoton3);
    ventana.add(ContenedorBotones.miBoton4);
    ventana.add(ContenedorBotones.miBoton5);
    ventana.add(ContenedorBotones.miBoton6);
    ventana.add(ContenedorBotones.miBoton7);
    ventana.add(ContenedorBotones.miBoton8);
    ventana.add(ContenedorBotones.miBoton9);
  }

  /**Metodo.*/
  public static void anadirEventos() {
    Eventos misEventos = new Eventos();
    ContenedorBotones.miBoton1.addActionListener(misEventos);
    ContenedorBotones.miBoton2.addActionListener(misEventos);
    ContenedorBotones.miBoton3.addActionListener(misEventos);
    ContenedorBotones.miBoton4.addActionListener(misEventos);
    ContenedorBotones.miBoton5.addActionListener(misEventos);
    ContenedorBotones.miBoton6.addActionListener(misEventos);
    ContenedorBotones.miBoton7.addActionListener(misEventos);
    ContenedorBotones.miBoton8.addActionListener(misEventos);
    ContenedorBotones.miBoton9.addActionListener(misEventos);
  }

  /**Metodo.*/
  public static void reset() {
    ContenedorBotones.miBoton1.setText("");
    ContenedorBotones.miBoton2.setText("");
    ContenedorBotones.miBoton3.setText("");
    ContenedorBotones.miBoton4.setText("");
    ContenedorBotones.miBoton5.setText("");
    ContenedorBotones.miBoton6.setText("");
    ContenedorBotones.miBoton7.setText("");
    ContenedorBotones.miBoton8.setText("");
    ContenedorBotones.miBoton9.setText("");
  }

  /**Metodo.*/
  public static void resetEnable() {
    ContenedorBotones.miBoton1.setEnabled(true);
    ContenedorBotones.miBoton2.setEnabled(true);
    ContenedorBotones.miBoton3.setEnabled(true);
    ContenedorBotones.miBoton4.setEnabled(true);
    ContenedorBotones.miBoton5.setEnabled(true);
    ContenedorBotones.miBoton6.setEnabled(true);
    ContenedorBotones.miBoton7.setEnabled(true);
    ContenedorBotones.miBoton8.setEnabled(true);
    ContenedorBotones.miBoton9.setEnabled(true);
  }
}
