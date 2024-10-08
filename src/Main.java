import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        //EJERCICIO 1

        LinkedList<String>tareasPendientes = new LinkedList<>();

        tareasPendientes.add("barrer");
        tareasPendientes.add("limpiar");
        tareasPendientes.add("ordenar");

         //System.out.println(tareasPendientes.toString());

         tareasPendientes.remove("limpiar");
        //System.out.println(tareasPendientes.toString());

        //EJERCICIO 2

        LinkedList<Integer>numeros = new LinkedList<Integer>();

        numeros.add(3);
        numeros.add(2);
        numeros.add(5);
        numeros.add(9);
        numeros.add(45);
        numeros.add(32);

        Collections.sort(numeros);
        //System.out.println(numeros.toString());

        //EJERCICIO 3

        Stack<String>libros = new Stack<>();

        libros.push("El principito");
        libros.push("Venas abiertas de america latina");
        libros.push("Harry potter");

        System.out.println(libros.toString());

        libros.pop();
        String ultimoLibro = libros.peek();

        System.out.println(ultimoLibro);



    }
}