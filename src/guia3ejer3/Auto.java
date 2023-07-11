
package guia3ejer3;


public class Auto {
     private String color;
    private String patente;
    private int combustible;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.combustible = 50;
    }

    public void avanzar(int metros) {
        int consumo = metros / 10;
        if (consumo <= combustible) {
            this.combustible -= consumo;
            System.out.println("El auto avanzó " + metros + " metros. Combustible restante: " + combustible + " lts.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar esa distancia.");
        }
    }

    public void retroceder(int metros) {
        int consumo = metros / 10;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println("El auto retrocedió " + metros + " metros. Combustible restante: " + combustible + " lts.");
        } else {
            System.out.println("No hay suficiente combustible para retroceder esa distancia.");
        }
    }

    public void llenarTanque() {
        combustible = 50;
        System.out.println("Se ha llenado el tanque del auto.");
    }
}


