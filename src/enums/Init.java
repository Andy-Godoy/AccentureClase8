package enums;

enum coloresImpresion {
    CYAN, MAGENTA, AMRAILLO, NEGRO
}

enum coloresLuz {
    ROJO, VERDE, AZUL
}

class constantesLuz {
   public static final String rojo = "ROJO";
}

public class Init {
    public static int calcularColor(coloresLuz constantesLuz) {
        return 2;
    }
    public static void main(String[] args) {
        calcularColor(coloresLuz.AZUL);
    }
}
