package practica3.pkg1;

import java.io.*;
import java.util.*;

public class Practica31 {

    public static void main(String[] args) throws IOException {
        Vector datos = new Vector();
        BufferedReader entero = new BufferedReader(new InputStreamReader(System.in));
        Scanner sn = new Scanner(System.in);
        int opcion, numero;
        String cadena;
        boolean salir = false;
        while (!salir) {
            System.out.println("\t\t\t..:MENU:..\n"
                    + "1.-Insertar nuevos elementos\n"
                    + "2.-Mostrar el dato en determinada posición del vector\n"
                    + "3.-Eliminar elementos por su posición\n"
                    + "4.-Editar elementos por su posición\n"
                    + "5.-Identificar la posición de un elemento según su contenido\n"
                    + "6.-Determinar el tamaño del vector\n"
                    + "7.-Limpiar el vector\n"
                    + "8.-Salir");
            System.out.println("Escribe una de las opciones");

            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    cadena = entero.readLine();
                    datos.addElement(cadena);
                    System.out.println("se a hagregado un elemento al vector");
                    break;
                case 2:
                    System.out.println("inserte una posicion: ");
                    opcion = sn.nextInt();
                    if (opcion >= 0) {
                        if (opcion <= datos.size() - 1) {
                            System.out.println(datos.elementAt(opcion));
                        } else {
                            System.out.println("no existe nada en esa posicion");
                        }

                    }

                    break;
                case 3:
                    System.out.println("el vector esta formado por " + datos + "\ninserte una posicion: ");
                    opcion = sn.nextInt();
                    if (opcion >= 0) {
                        if (opcion <= datos.size() - 1) {
                            datos.remove(opcion);
                            System.out.println("se elimino el elemneto de esa posicion\n"
                                    + "el nuevo vector es: " + datos);

                        } else {
                            System.out.println("no existe nada en esa posicion");
                        }

                    }
                    break;
                case 4:
                    System.out.println("el vector esta formado por " + datos
                            + "\ninserte una posicion: ");
                    opcion = sn.nextInt();
                    if (opcion >= 0) {
                        if (opcion <= datos.size() - 1) {
                            cadena = entero.readLine();
                            datos.setElementAt(cadena, opcion);
                            System.out.println("se modifico el elemento\n"
                                    + "el nuevo vector es: " + datos);
                        } else {
                            System.out.println("no existe nada en esa posicion");
                        }

                    }
                    break;
                case 5:
                    System.out.println("inserte el contenido para determinar la posicion");
                    cadena = entero.readLine();
                    int posicion = datos.indexOf(cadena);
                    if (posicion == -1) {
                        System.out.println("no se encontro el valor");
                    } else {
                        System.out.println("el dato " + cadena + " esta en la posicion " + datos.indexOf(cadena));
                    }
                    break;
                case 6:
                    System.out.println("el tamaño del vector es: " + datos.size());
                    break;
                case 7:
                    datos.clear();
                    System.out.println("el vector se a limpio ");
                    break;
                case 8:
                    salir = true;
                    System.out.println("el programa a finalizado con exito");
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");

            }
        }
    }

}
