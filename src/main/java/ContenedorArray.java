import java.util.ArrayList;
import java.util.List;

public class ContenedorArray {

  public static List<String> arrayList = new ArrayList<>();
  private static String blanco = EnumEstados.BLANCO.toString();

  /**Metodo.*/
  public static void iniciarArray() {
    for (int i = 0; i < 9; i++) {
      arrayList.add(EnumEstados.BLANCO.toString());
    }
  }

  /**Metodo.*/
  public static boolean verificarGanador() {
    String valor0 = arrayList.get(0);
    String valor1 = arrayList.get(1);
    String valor2 = arrayList.get(2);
    String valor3 = arrayList.get(3);
    String valor4 = arrayList.get(4);
    String valor5 = arrayList.get(5);
    String valor6 = arrayList.get(6);
    String valor7 = arrayList.get(7);
    String valor8 = arrayList.get(8);
    if (!valor0.equals(blanco) && valor0.equals(valor1) && valor0.equals(valor2)) {
      return true;
    } else if (!valor3.equals(blanco) && valor3.equals(valor4) && valor3.equals(valor5)) {
      return true;
    } else if (!valor6.equals(blanco) && valor6.equals(valor7) && valor6.equals(valor8)) {
      return true;
    } else if (!valor0.equals(blanco) && valor0.equals(valor3) && valor0.equals(valor6)) {
      return true;
    } else if (!valor1.equals(blanco) && valor1.equals(valor4) && valor1.equals(valor7)) {
      return true;
    } else if (!valor2.equals(blanco) && valor2.equals(valor5) && valor2.equals(valor8)) {
      return true;
    } else if (!valor0.equals(blanco) && valor0.equals(valor4) && valor0.equals(valor8)) {
      return true;
    } else if (!valor2.equals(blanco) && valor2.equals(valor4) && valor2.equals(valor6)) {
      return true;
    }
    return false;
  }

  /**Metodo.*/
  public static void reset() {
    arrayList.set(0, EnumEstados.BLANCO.toString());
    arrayList.set(1, EnumEstados.BLANCO.toString());
    arrayList.set(2, EnumEstados.BLANCO.toString());
    arrayList.set(3, EnumEstados.BLANCO.toString());
    arrayList.set(4, EnumEstados.BLANCO.toString());
    arrayList.set(5, EnumEstados.BLANCO.toString());
    arrayList.set(6, EnumEstados.BLANCO.toString());
    arrayList.set(7, EnumEstados.BLANCO.toString());
    arrayList.set(8, EnumEstados.BLANCO.toString());
  }

  /**Metodo.*/
  public static boolean verificarEmpate() {
    for (String valor : arrayList) {
      if (valor.equals(blanco)) {
        return false;
      }
    }
    return true;
  }
}