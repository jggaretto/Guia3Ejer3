/*
Nos piden modelar un Auto con las siguientes características y comportamiento para poder ser
anexado al proyecto.

A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo
tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener
en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible
suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos
tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay
combustible suficiente.

• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.

B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además
Rueda tendrá los siguientes comportamientos:

• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI

C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas,
avanzar/retroceder, y llenarTanque.

Nota: La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen
llevar una presión recomendada comprendida entre los 28 a 30 PSI.
 */
package guia3ejer3;

public class Guia3Ejer3 {

    public static void main(String[] args) {
       Auto auto = new Auto("Rojo", "ABC123");
        Rueda rueda1 = new Rueda("Delantera izquierda");
        Rueda rueda2 = new Rueda("Delantera derecha");
        Rueda rueda3 = new Rueda("Trasera izquierda");
        Rueda rueda4 = new Rueda("Trasera derecha");

        rueda1.inflar();
        rueda2.inflar();
        rueda3.desinflar();
        rueda4.desinflar();

        auto.avanzar(50);
        auto.llenarTanque();
        auto.retroceder(20);
    }
}
