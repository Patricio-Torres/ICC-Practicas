## PROYECTO 2 ESTEGANOGRAFÍA

## AUTOR: TORRES CUEVAS GAEL PATRCIO
## NO. DE CUENTA:  318266114

## DESCRIPCIÓN
En este proyecto se hace la implementación de algunos métodos de esteganografía, es decir, para descifrar algunos mensajes, ya sea encontrando algunas letras, posiciones o palabras, quedando a eleccion del usuario. 

## CARACTERÍSITCAS
- `Esteganografia.java` Es un archivo que contiene la estructura principal de los métodos a ejecutar
- `Main.java` Es el archivo principal que se encarga de la ejecución del programa por medio de una terminal :)

## Instalación y Uso
1. **Clonar o descargar** este repositorio.
2. **Compilar los archivos** usando un compilador de Java:

   javac Main.java Esteganografia.java 
   
3. **Ejecutar el programa** con:

   java Main

4. **Seleccionar una opción** en el menú para interactuar con el descrifador. 

## Uso del Menú
Al ejecutar el programa, se mostrará un menú como este:
```
╔═══════════════════════════════════════════╗
║            MENÚ ESTEGANOGRAFÍA            ║
╠═══════════════════════════════════════════╣
║ 1.  descifraNulo(texto, n)                ║
║ 2.  descifraNulo(texto con espacios)      ║
║ 3.  contieneNombre(texto, nombre)         ║
║ 4.  descifraPalabrasMarcadas(a, b)        ║
║ 5.  descifraLetrasMarcadas(a, b)          ║
║ 6.  Salir                                 ║
╚═══════════════════════════════════════════╝
```
- **Opción 1**: Recibe un texto por el usuario, despues le pedíra la posición en la que quiere buscar, evaluará cada letra y al final imrpimirá una cadena concatenando la letra en esa posicion de cada palabra.
- **Opción 2**: Recibe un texto por el usuario, a diferencia de la opcion uno, en este no pedirá explicitamente la posicion, sino que al final del texto se pondran "n" espacios y ese será la posicion en la que buscará.
- **Opción 3**: Recibé un texto por el usuario, luego le pide un nombre y le dirá si dicho nombre se encuentra o no oculto en el texto. 
- **Opción 4**: Recibe dos textos con ciertas palabras diferentes e imrpime el mensaje que forman las palabras diferentes. 
- **Opción 5**: Recibe dos textos con ciertas letras diferentes, las concatena e imprime el mensaje que se forma.
- **Opción 6**: Sale del programa

## MEJORAS FUTURAS: 
- Se puede implementar un metodo para detectar clave morse respecto a los puntos (.) y los espacios (-)
- Se puede implementar un metodo que transforme las letras a codigo ASCII, les reste algun valor n y devuelva su respectivo caracter (para cifrar).

