import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        LinkedList<String>tareasPendientes = new LinkedList<>();

        tareasPendientes.add("barrer");
        tareasPendientes.add("limpiar");
        tareasPendientes.add("ordenar");

         System.out.println(tareasPendientes.toString());

         tareasPendientes.remove("limpiar");
        System.out.println(tareasPendientes.toString());



    }
}