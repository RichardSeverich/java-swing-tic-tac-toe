
public class Main {

  /**Metodo.*/
  public static void main(String[] args) {

    ContenedorArray.iniciarArray();
    Ventana miVentana = new Ventana();
    ConstructorBotones.anadirPropiedades();
    ConstructorBotones.anadirEventos();
    ConstructorBotones.anadirBoton(miVentana.getJFrame());
    miVentana.getJFrame().setVisible(true);
  }
}
