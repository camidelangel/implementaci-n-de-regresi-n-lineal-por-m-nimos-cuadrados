
package Ajuste_de_Funciones;

/**
 * Clase principal para ejecutar el programa
 * de Regresion Lineal por Minimos Cuadrados.
 */
public class Main {

    public static void main(String[] args) {

        // Arreglo con las horas de sol (variable X).
        double[] x = {2, 3, 5, 7, 9};

        // Arreglo con la cantidad de helados vendidos (variable Y).
        double[] y = {4, 5, 7, 10, 15};

        // Ejecutamos el metodo de Minimos Cuadrados.
        double[] resultados =
                RegresionLineal.calcularMinimosCuadrados(x, y);

        // Realizamos una prediccion para X = 6.
        double estimacion = RegresionLineal.predecir(
                resultados[0],
                resultados[1],
                6
        );

        // Mostramos la prediccion.
        System.out.printf(
                "Prediccion para X = 6: %.4f%n",
                estimacion
        );
    }
}
