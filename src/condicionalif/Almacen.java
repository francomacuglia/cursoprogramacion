/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class Almacen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double compra = scanner.nextDouble();
        double descuento = 0.0;
        double totalDescuento = 0.0;

        if (compra > 100) {
            descuento = 0.5;
        } else if (compra == 100) {
            descuento = 0.2;
        }

        if (descuento > 0) {
            totalDescuento = compra * descuento;
            System.out.println("Se aplicó un descuento del " + (descuento * 100) + "%, equivalente a: $" + totalDescuento);
        } else {
            System.out.println("No se aplicó ningún descuento");
        }

        double totalConDescuento = compra - totalDescuento;
        System.out.println("El total a pagar es: $" + totalConDescuento);

        scanner.close();
    }
}
