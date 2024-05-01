package Ejercicio_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        Collection<String> weekDays= new ArrayList<>();

        weekDays.add("Domingo");
        weekDays.add("Lunes");
        weekDays.add("Martes");
        weekDays.add("Miercoles");
        weekDays.add("Juernes");
        weekDays.add("Viernes");
        weekDays.add("Sabado");

        int position3=3;
        int position4=4;
        String[] days=weekDays.toArray(new String[0]);
        if (position3>=0 && position3<days.length){
            String day=days[position3];
            System.out.println("El día en la posición "+position3+" es: "+day);
        }else{
            System.out.println("La posición especificada está fuera de rango.");
        }
        if (position4>=0 && position4<days.length){
            String day=days[position4];
            System.out.println("El día en la posición "+position4+" es: "+day);
        }else{
            System.out.println("La posición especificada está fuera de rango.");
        }

        System.out.println("------------------------");

        if (days.length>0){
            String firstDay=days[0];
            String lastDays=days[days.length-1];
            System.out.println("El primer día de la lista es: "+firstDay);
            System.out.println("El último día de la lista es: "+lastDays);
        }else{
            System.out.println("La lista está vacía");
        }

        System.out.println("------------------------\n"+"Días de la semana antes de la eliminación: "+weekDays+"\n------------------------");

        boolean eliminated = weekDays.remove("Juernes");

        if (eliminated){
            System.out.println("El día \"Juernes\" se eliminó correctamente.");
        }else{
            System.out.println("El día \"Juernes\" no se encontró en la lista.");
        }

        System.out.println("------------------------\n"+"Días de la semana después de la eliminación: "+weekDays+"\n------------------------");

        Iterator<String> iterator1=weekDays.iterator();

        while (iterator1.hasNext()){
            String value = iterator1.next();
            System.out.println(value);
        }

        System.out.println("------------------------");

        boolean founded=false;
        Iterator<String> iterator2= weekDays.iterator();
        while (iterator2.hasNext()){
            String day= iterator2.next();
            if (day.equalsIgnoreCase("Lunes")){
                founded=true;
                break;
            }
        }

        if (founded){
            System.out.println("Se encontró \"Lunes\" en la lista.");
        }else{
            System.out.println("No se encontró \"Lunes\" en la lista.");
        }

        System.out.println("------------------------");

        System.out.println("Días de la semana antes de borrar la lista: "+weekDays);
        weekDays.clear();
        System.out.println("Días de la semana después de borrar la lista: "+weekDays);
    }
}