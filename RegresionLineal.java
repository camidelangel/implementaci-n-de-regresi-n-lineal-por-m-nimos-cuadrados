package Ajuste_de_Funciones;
/*
 * Clase que implementa el calculo de Regresion Lineal Simple
 * utilizando el metodo de Minimos Cuadrados, incluyendo Pearson y R2.
 */
public class RegresionLineal {

    /*
     * Calcula la regresion y retorna los coeficientes:
     * {beta0, beta1, pearsonR, r2}.
     *
     * @param x Arreglo con los valores independientes.
     * @param y Arreglo con los valores dependientes.
     * @return Arreglo double con los indicadores estadisticos.
     */
    public static double[] calcularMinimosCuadrados(double[] x, double[] y) {

        // Validamos que los arreglos sean correctos.
        if (x == null || y == null || x.length != y.length || x.length == 0) {

            System.out.println("Error: Los arreglos deben tener el mismo tamano y no estar vacios.");

            return new double[]{0.0, 0.0, 0.0, 0.0};
        }

        int n = x.length;

        double sumX = 0;
        double sumY = 0;
        double sumX2 = 0;
        double sumY2 = 0;
        double sumXY = 0;

        // Acumulamos las sumatorias necesarias.
        for (int i = 0; i < n; i++) {

            sumX += x[i];
            sumY += y[i];

            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];

            sumXY += x[i] * y[i];
        }

        // Calculamos el denominador de la pendiente.
        double denominadorX = n * sumX2 - (sumX * sumX);

        // Verificamos que los valores de X tengan variacion.
        if (denominadorX == 0) {

            System.out.println("Error: Todos los valores de X son iguales.");

            return new double[]{
                    0.0, 0.0, Double.NaN, Double.NaN
            };
        }

        // Calculamos la pendiente (beta1).
        double beta1 = (n * sumXY - sumX * sumY) / denominadorX;

        // Calculamos la ordenada al origen (beta0).
        double beta0 = (sumY - beta1 * sumX) / n;

        // ==================================================
        // CALCULO DEL COEFICIENTE DE CORRELACION DE PEARSON
        // ==================================================

        double numeradorR = n * sumXY - sumX * sumY;

        double denominadorY = n * sumY2 - (sumY * sumY);

        double denominadorR = Math.sqrt(denominadorX * denominadorY);

        double pearsonR;
        double r2;

        // Comprobamos que Pearson pueda calcularse.
        if (denominadorY <= 0 || denominadorR == 0) {

            pearsonR = Double.NaN;
            r2 = Double.NaN;

            System.out.println("Aviso: Pearson y R2 no estan definidos.");

        } else {

            // Calculamos el coeficiente de Pearson.
            pearsonR = numeradorR / denominadorR;

            // ==========================================
            // CALCULO DEL COEFICIENTE DE DETERMINACION
            // ==========================================

            r2 = pearsonR * pearsonR;
        }

        // Mostramos los resultados en consola.
        System.out.println("--- RESULTADOS DE MINIMOS CUADRADOS Y CORRELACION ---");

        System.out.printf(
                "Sumatorias: n= %d, X= %.1f, Y= %.1f, X2= %.1f, Y2= %.1f, XY= %.1f%n",
                n, sumX, sumY, sumX2, sumY2, sumXY
        );

        System.out.printf("Pendiente (beta1): %.4f%n", beta1);

        System.out.printf("Ordenada al origen (beta0): %.4f%n", beta0);

        System.out.printf(
                "Modelo obtenido: Y = %.4f + %.4fX%n",
                beta0, beta1
        );

        System.out.printf("Coeficiente de Pearson (r): %.4f%n", pearsonR);

        System.out.printf("Coeficiente de Determinacion (r2): %.4f%n", r2);

        // Retornamos los resultados.
        return new double[]{beta0, beta1, pearsonR, r2};
    }

    /*
     * Realiza una estimacion o prediccion evaluando el modelo
     * con un valor de X.
     *
     * @param beta0 Ordenada al origen.
     * @param beta1 Pendiente.
     * @param xValor Valor de X para realizar la prediccion.
     * @return Valor estimado de Y.
     */
    public static double predecir(double beta0, double beta1, double xValor) {

        return beta0 + beta1 * xValor;
    }
}
