import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        // Definir tasas de cambio actuales
        double tasaDolarAPeso = 20.0;  // Cambia esto con la tasa de cambio actual
        double tasaEuroAPeso = 22.5;   // Cambia esto con la tasa de cambio actual
        double tasaLibraAPeso = 25.0;  // Cambia esto con la tasa de cambio actual

        Scanner scanner = new Scanner(System.in);

        // Entrada del usuario
        System.out.print("Ingresa la cantidad en pesos: ");
        double cantidadPesos = scanner.nextDouble();

        // Conversión a otras monedas
        double cantidadDolares = cantidadPesos / tasaDolarAPeso;
        double cantidadEuros = cantidadPesos / tasaEuroAPeso;
        double cantidadLibras = cantidadPesos / tasaLibraAPeso;

        // Mostrar resultados
        System.out.println(cantidadPesos + " pesos son aproximadamente:");
        System.out.println(cantidadDolares + " dólares");
        System.out.println(cantidadEuros + " euros");
        System.out.println(cantidadLibras + " libras esterlinas");

        scanner.close();
    }
}
