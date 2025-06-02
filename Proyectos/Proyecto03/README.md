## PROYECTO 03: PICK A PERRO

## INTRODUCCIÓN. 
PICK A PERRO Es un juego de cartas, Se empieza el juego con una carta guía, en cada turno debes tomar cuántas cartas puedas siempre y cuando tengan como máximo una diferencia entre: brazos, color, tamaño, lentes y palimitas.
Cuando no puedas tomar más cartas, deberás gritar "Equipo completo"
Por cada carta correcta se sumará un punto, pero si te equivocas en una será suficiente para perder todos los puntos de la ronda. 

## DESCRIPCIÓN 
Utlizamos importacion de java.util, así como listas ligadas para este proyecto. Así podemos recibir cartas aleatorias, además de jugar contra un "bot".

## CARACTERÍSTICAS 

## INSTALACIÓN Y USO
1. **CLONAR O DESCARGAR** este repositorio
2. **COMPILAR LOS ARCHIVOS** usando un compilador de Java:

    javac proyecto03/*.java

3. **EJECUTAR EL PROGRAMA** con: 

    java proyecto03.PickaPerro

## USO DEL JUEGO

Al ejecutar el programa se mostrará una serie de "Cartas" Delimitadas por corchetes [] 
Cada carta tiene una posición vertical como horizontal. Filas y Columnas respectivamente. 

Debajo de las cartas vendrá una "Carta Guia", que es la carta con la que comenzaremos a jugar

El programa nos preguntará "¿Deseas tomar carta o decir "Equipo completo"?" Elegiremos una opcion

TOMAR CARTA: 
Para tomar una carta, las filas y columnas se cuentan con n-1, Es decir, la fila 1 = 0, fila 2 = 1, columna 3 = 2
Nos fijaremos en nuestra carta guia y veremos las cartas en la mesa, el programa nos dara la opcion de introducir fila y columna respectivamente. La ronda concluye cuando te equivoques o decidas gritar "Equipo completo"

EQUIPO COMPLETO:
Automáticamente concluye la ronda y comenzaremos a sumar puntos. 

## DIFICULTADES.
- No pude hacer que me corriera sin el uso del package. 
- Hay una parte donde en el programa me sale un símbolo que no escribí en el códgio y no pude corregirlo.

## MEJORAS FUTURAS 
Corregir los errores previos y mejorar la visualización del programa.
