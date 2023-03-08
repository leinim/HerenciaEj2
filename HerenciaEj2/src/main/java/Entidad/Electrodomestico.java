/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

13

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class Electrodomestico {
    protected int precio;
    protected String color;
    protected char consumoEnergetico; //Letras entre a y f
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }    
    
    public char comprobarConsumoEnergetico(char letra){
        char c = 'f';
        if (letra >= 'a' && letra <= 'f'){
            c = letra;
        }
        return letra;
    }
    
    public String comprobarColor(String color){
        String col;
        switch(color){
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                col = color;
                break;
            default:
                col = "blanco";
                break;
        }
        return col;
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el precio:");
        int p = leer.nextInt();
        System.out.println("Ingrese el consumo energético:");
        char c = comprobarConsumoEnergetico(leer.next().toLowerCase().charAt(0));
        System.out.println("Ingrese el color: ");
        String col = comprobarColor(leer.next().toLowerCase());
        System.out.println("Ingrese el peso:");
        int peso = leer.nextInt();
        
        this.color = col;
        this.consumoEnergetico = c;
        this.peso = peso;
        this.precio = p;
    }
    
    public void precioFinal(){
        switch(this.consumoEnergetico){
            case 'a' -> this.precio += 1000;
            case 'b' -> this.precio += 800;
            case 'c' -> this.precio += 600;
            case 'd' -> this.precio += 500;
            case 'e' -> this.precio += 300;
            case 'f' -> this.precio += 100;
        }
        
        if (this.peso >= 1 && this.peso <= 19){
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso <= 49){
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79){
            this.precio += 800;
        } else {
            this.precio += 1000;
        }
        System.out.println("Precio final: " + this.precio);
    }

    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
}
