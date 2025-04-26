package Proyecto2;
import java.util.Scanner;

public class Esteganografia {
    
    public String descifraNulo(String original, int n) {
        String mensaje = "";
        String[] palabras = original.split("\\s+");
        for (String palabra : palabras) {
            if (palabra.length() >= n) {
                mensaje += palabra.charAt(n - 1);
            }
        }
        return mensaje;
    }

    public String descifraNulo(String original) {
        int espacios =0; 
        for (int i = original.length()-1; i>= 0 && original.charAt(i)== ' '; i--){
            espacios++;
        }
        return descifraNulo(original.trim(), espacios);
    }

    public boolean contieneNombre ( String mensaje , String nombre) {
        String nuevo = mensaje.replaceAll("[a-z,A-Z]","").toLowerCase();
        String nombreCifrado = nombre.replaceAll("[a-z,A-Z]","").toLowerCase();
        return nombre.contains(nombreCifrado);
    }

    public String descifraPalabrasMarcadas(String a, String b) {
        String resultado = "";
        String[] palabrasA = a.split("\\s+");
        String[] palabrasB = b.split("\\s+");
    
        int len = Math.min(palabrasA.length, palabrasB.length);
        for (int i = 0; i < len; i++) {
            if (!palabrasB[i].equals(palabrasA[i])) {
                resultado += palabrasA[i] + " ";
            }
        }
        return resultado.trim();
    }

    public String descifraLetrasMarcadas(String m, String e) {
        String mensaje = "";
        String[] palabrasA = m.split("\\s+");
        String[] palabrasB = e.split("\\s+");

        int len = Math.min(palabrasA.length, palabrasB.length);
        for (int i = 0; i < len; i++) {
            String palabraA = palabrasA[i];
            String palabraB = palabrasB[i];
            if (palabraA.length() == palabraB.length()) {
                for (int j = 0; j < palabraA.length(); j++) {
                    if (palabraA.charAt(j) != palabraB.charAt(j)) {
                        mensaje += palabraA.charAt(j);
                    }
                }
            }
        }
        return mensaje;
    }
}


