import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Eventos implements ActionListener {

  private boolean turno = true;

  /**Metodo.*/
  public void actionPerformed(ActionEvent evento) {

    JButton boton = (JButton)evento.getSource();
    String nombreBoton = boton.getName();
    switch (nombreBoton) {
      case "1":
        estableceTurno(ContenedorBotones.miBoton1, 0);
        break;
      case "2":
        estableceTurno(ContenedorBotones.miBoton2, 1);
        break;
      case "3":
        estableceTurno(ContenedorBotones.miBoton3, 2);
        break;
      case "4":
        estableceTurno(ContenedorBotones.miBoton4, 3);
        break;
      case "5":
        estableceTurno(ContenedorBotones.miBoton5, 4);
        break;
      case "6":
        estableceTurno(ContenedorBotones.miBoton6, 5);
        break;
      case "7":
        estableceTurno(ContenedorBotones.miBoton7, 6);
        break;
      case "8":
        estableceTurno(ContenedorBotones.miBoton8, 7);
        break;
      case "9":
        estableceTurno(ContenedorBotones.miBoton9, 8);
        break;
      default:
        break;
    }
    verificarGanadorEmpate();
  }

  /**Metodo.*/
  public void verificarGanadorEmpate() {
    if (ContenedorArray.verificarGanador()) {
      ConstructorBotones.resetEnable();
      JOptionPane.showMessageDialog(null,"GANASTE");
      ConstructorBotones.reset();
      ContenedorArray.reset();
      this.turno = true;
    } else if (ContenedorArray.verificarEmpate()) {
      ConstructorBotones.resetEnable();
      JOptionPane.showMessageDialog(null,"EMPATE");
      ContenedorArray.reset();
      ConstructorBotones.reset();
      this.turno = true;
    }
  }

  /**Metodo.*/
  public void estableceTurno(JButton boton, int posicion) {
    if (turno) {
      boton.setText("O");
      boton.setForeground(Color.GREEN);
      this.turno = false;
      ContenedorArray.arrayList.set(posicion, EnumEstados.REDONDO.toString());
    } else {
      boton.setText("X");
      boton.setForeground(Color.RED);
      this.turno = true;
      ContenedorArray.arrayList.set(posicion, EnumEstados.CRUZ.toString());
    }
    //deshabilitar el boton seleccionado
    boton.setEnabled(false);
  }
}
