
package guia3ejer3;


public class Rueda {
     private String marca;
    private double presion;

    public Rueda(String marca) {
        this.marca = marca;
        this.presion = 28.0;
    }

    public void inflar() {
        presion = 28.0;
        System.out.println("La rueda " + marca + " ha sido inflada. Presión actual: " + presion + " PSI.");
    }

    public void pinchar() {
        presion = 0.0;
        System.out.println("La rueda " + marca + " ha sido pinchada. Presión actual: " + presion + " PSI.");
    }

    public void desinflar() {
        presion -= 0.5;
        System.out.println("La rueda " + marca + " ha sido desinflada. Presión actual: " + presion + " PSI.");
    }
}
