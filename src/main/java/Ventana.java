import javax.swing.JFrame;

public class Ventana {
  private JFrame miJFrame;

  /**Metodo.*/
  public Ventana() {
    miJFrame = new JFrame();
    miJFrame.setTitle("TIC-TAC-TOE");
    miJFrame.setSize(700, 700);;
    miJFrame.setLocationRelativeTo(null);
    miJFrame.setResizable(false);
    miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miJFrame.setLayout(null);
  }

  public JFrame getJFrame() {
    return miJFrame;
  }
}
