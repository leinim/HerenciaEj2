/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000

14

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean tdt, int precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public void crearTelevisor(){
        super.crearElectrodomestico();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la resolucion en pulgadas:");
        int res = leer.nextInt();
        System.out.println("¿Cuenta con sintonizador TDT?");
        String respuesta = leer.next();
        boolean t = false;
        if (respuesta.equalsIgnoreCase("si")){
            t = true;
        }        
        this.resolucion = res;
        this.tdt = t;
        
        
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40){
            this.precio += this.precio * 0.3;
        }
        
        if (this.tdt == true){
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        return "{" + "resolucion=" + resolucion + ", tdt=" + tdt + '}';
    }
    
    
    
}
