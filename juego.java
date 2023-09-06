import java.util.Random;
import java.util.Scanner;

public class juego 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        Jugar();
    }
    static public void Jugar()
    {
        String[] listaDePalabras = { "hola","adios","juego","ordenador" };
        Random rd = new Random(); // nueva instancia del metodo Random.
        int indiceAleatorio = rd.nextInt(listaDePalabras.length); //para elegir la palabra hace falta un indice 
        String palabraQueAdivinar = listaDePalabras[indiceAleatorio]; // la palabra aleatoria se debe de coger de la lista de palabras que es elegida por el indice.
        
        // String palabraQueAdivinar = "Hola";
        int numeroDeIntentos = 5;
        char[] palabraAdivinada = new char[palabraQueAdivinar.length()];
        for (int i = 0; i < palabraQueAdivinar.length(); i++)
        {
            palabraAdivinada[i] = '_';
        }
        boolean respuestaCorrecta = false;
        while(numeroDeIntentos > 0 && respuestaCorrecta == false)
        {
            System.out.println("Introduzca una letra");
            char letra = sc.next().charAt(0);
            for(int i = 0; i < palabraQueAdivinar.length(); i++)
            {
                if(letra == palabraQueAdivinar.charAt(i))
                {
                    palabraAdivinada[i] = letra;
                    System.out.println("la letra es correcta");
                    System.out.println(palabraAdivinada);
                }
            }
            numeroDeIntentos--;
            System.out.println("¿Quieres adivinar la palabra?");
            System.out.printf("Le quedan %d intentos \n", numeroDeIntentos);

            String opcion = sc.next();

            if(opcion.equals("si"))
            {
                System.out.println("introduzca la solución");
                String solucion = sc.next();
                if(solucion.equalsIgnoreCase(palabraQueAdivinar))
                {
                    System.out.println("Felicidades, ha acertado la palabra");
                    respuestaCorrecta = true ;
                }else
                {
                    System.out.println("lo sentimos la solucion no es correcta");
                }
            }
        }
    }
}
