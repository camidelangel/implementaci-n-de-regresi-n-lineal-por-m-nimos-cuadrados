
# Regresion Lineal por Minimos Cuadrados

## Descripcion 

Este proyecto consiste en la implementacion del metodo de Regresion Lineal Simple mediante Minimos Cuadrados utilizando el lenguaje de programacion Java.

El programa permite analizar la relacion entre dos variables, una independiente (X) y otra dependiente (Y), 
mediante el calculo de una ecuacion de regresion lineal.

Ademas, incorpora el calculo del coeficiente de correlacion de Pearson (r) y el coeficiente de determinacion (r2),
los cuales permiten conocer la fuerza de la relacion entre las variables y el nivel de ajuste del modelo.

Tambien cuenta con un metodo para realizar predicciones utilizando la ecuacion obtenida.

## Estructura del proyecto

```text

│── Ajuste_de_Funciones/
│     ├── RegresionLineal.java
│     └── Main.java
│
└── README.md
```

## Requisitos

Para ejecutar el proyecto se necesita:

- Tener instalado Java JDK.
- Contar con un IDE o una terminal de comandos.


## Ejecucion

Una vez compilado el proyecto, ejecuta el siguiente comando:

```bash
java -cp out Ajuste_de_Funciones.Main
```

## Datos de prueba

Se utilizaron los siguientes datos para comprobar el funcionamiento del programa:

| Horas de sol (X) | Helados vendidos (Y) |
|---|---|
| 2 | 4 |
| 3 | 5 |
| 5 | 7 |
| 7 | 10 |
| 9 | 15 |

## Resultados obtenidos

Los resultados de la ejecucion fueron:

- Pendiente (beta1): 1.5183
- Ordenada al origen (beta0): 0.3049
- Ecuacion de regresion: Y = 0.3049 + 1.5183X
- Coeficiente de Pearson (r): 0.9796
- Coeficiente de determinacion (r2): 0.9595
- Prediccion para X = 6: 9.4146

## Funcionamiento del programa

El programa realiza las siguientes operaciones:

1. Recibe los valores de X y Y mediante arreglos.
2. Calcula las sumatorias necesarias.
3. Obtiene la pendiente y la ordenada al origen.
4. Calcula el coeficiente de correlacion de Pearson.
5. Calcula el coeficiente de determinacion.
6. Construye la ecuacion de regresion lineal.
7. Realiza una prediccion utilizando el modelo obtenido.

## Autor

Nombre: Camila amor del angel cervantes 

Asignatura: Metodos Numericos

Maestro: Victor Hugo Vasquez Herrera
