/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Calendar; //primera vez que uso esto del import, bah primera vez que uso java jajaja, paciencia por favoooor
import java.util.Scanner;

public class JavaApplication1 {
public static int calculadorDias(int añoActual, int mesActual, int diaActual){ //función que debería de hacer un calculo 
        int cantDias= (añoActual/400) - (añoActual/100) + (añoActual/4)+ (añoActual*365);
        switch (mesActual){
            case 1 ->{cantDias = cantDias + 0;
                }
            case 2 -> {cantDias = cantDias + 31;
            }
            case 3 -> {cantDias = cantDias + 59;
            }
            case 4 -> {cantDias = cantDias + 90;
            }
            case 5 -> {cantDias = cantDias + 120;
            }
            case 6 ->{cantDias = cantDias + 151;
            }
            case 7 ->{cantDias = cantDias + 181;
            }
            case 8 ->{cantDias = cantDias + 212;
            }
            case 9 ->{cantDias = cantDias + 243;
            }
            case 10 ->{cantDias = cantDias + 273;
            }
            case 11 ->{cantDias = cantDias + 304;
            }
            case 12 ->{cantDias = cantDias + 334;
            }
        }
        cantDias = cantDias+diaActual;
        return cantDias;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Bienvenido a tu agenda de tareas!");
        Scanner in = new Scanner(System.in); //que complejo que fue encontrar como leer un dato ingresado por teclado
        int opciones = 0;
        int opcion = 0;
        Task tarea1;
        tarea1 = new Task("Tarea1", "descripcion1", 1, 1, 1, 1, 1);
        Task tarea2;
        tarea2 = new Task("Tarea2", "descripcion2", 1, 1, 1, 1, 2);
        Task tarea3;
        tarea3 = new Task("Tarea3", "descripcion3", 1, 1, 1, 1, 3);
        
        String nombreTarea;
        String descripcionTarea;
        int año;
        int mes;
        int dia;
        
        Calendar calendario = Calendar.getInstance();
        int añoA = calendario.get(Calendar.YEAR);
        int mesA = calendario.get(Calendar.MONTH)+1;
        int diaA = calendario.get(Calendar.DAY_OF_MONTH);
        int cantDias = calculadorDias(añoA, mesA, diaA);
        int cantDiasLimite;
        int diferencialDias;
        String BasuraText;
        do{ 
            System.out.println("Por favor ingrese: ");
            System.out.println("1 para agregar una tarea");
            System.out.println("2 para ver el listado de tareas");
            System.out.println("3 para ver una sola tarea en especial");
            System.out.println("4 para salir");
            opcion=in.nextInt();
            switch(opcion){
                case 1 -> {
                    if(!tarea1.isActivo()){ //controlar esto
                        System.out.println("Ingrese el nombre de la tarea");
                        BasuraText= in.nextLine();
                        nombreTarea= in.nextLine();
                        tarea1.setTitulo(nombreTarea);
                        System.out.println("Ingrese la descripción de la tarea");
                        descripcionTarea= in.nextLine();
                        tarea1.setDescripcion(descripcionTarea);
                        System.out.println ("ingrese el tiempo límite iniciando con año ");
                        do{
                            año= in.nextInt();
                            if (año<0 || año>9999){
                                System.out.println("Debe ingresar un año válido entre el año 0 al 9999");
                            }
                        }while(año<0 || año>9999);
                        tarea1.setAñoLimite(año);
                        System.out.println ("ahora ingrese el mes ");
                        do{
                            mes=in.nextInt();
                            if (mes<1 || mes>12){
                                System.out.println("Ingrese un mes válido, comprendido entre 1 y 12");
                            }
                        }while(mes<1 || mes>12);
                        tarea1.setMesLimite(mes);
                        System.out.println ("ahora ingrese el dia ");// ahora se viene lo divertido jaja que conste que no usé java util calendar para esto porque quería hacerlo más interesante (ah y no le entendía bien la documentacion pero esos son detalles :D)
                        switch(mes){
                            case 1 -> {
                                do{
                                    dia=in.nextInt();
                                        if (dia<1 || dia>31){
                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                        }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }
                            case 2 -> {
                                if(año%400==0){
                                    do{
                                        dia=in.nextInt();
                                        if (dia<1 || dia>29){
                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 29");
                                        }
                                    }while(mes<1 || mes>29);
                                    tarea1.setDiaLimite(dia);
                                }
                                else {
                                    if(año%100==0){
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>28){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 28");
                                            }
                                        }while(mes<1 || mes>28);
                                        tarea1.setDiaLimite(dia);
                                    }
                                    else{
                                        if(año%4==0){
                                            do{
                                                dia=in.nextInt();
                                                if (dia<1 || dia>29){
                                                    System.out.println("Ingrese un día válido, comprendido entre 1 y 29");
                                                }
                                            }while(mes<1 || mes>29);
                                            tarea1.setDiaLimite(dia);
                                        }
                                        else{
                                            do{
                                                dia=in.nextInt();
                                                if (dia<1 || dia>28){
                                                    System.out.println("Ingrese un día válido, comprendido entre 1 y 28");
                                                }
                                            }while(mes<1 || mes>28);
                                            tarea1.setDiaLimite(dia);
                                        }
                                    }
                                }  
                            }
                            case 3 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>31){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                    }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }
                            case 4 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>30){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                    }
                                }while(mes<1 || mes>30);
                                tarea1.setDiaLimite(dia);
                            }
                            case 5 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>31){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                    }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }
                            case 6 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>30){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                    }
                                }while(mes<1 || mes>30);
                                tarea1.setDiaLimite(dia);
                            }
                            case 7 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>31){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                    }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }
                            case 8 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>31){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                    }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }
                            case 9 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>30){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                    }
                                }while(mes<1 || mes>30);
                                tarea1.setDiaLimite(dia);
                            }
                            case 10 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>31){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                    }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }
                            case 11 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>30){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                    }
                                }while(mes<1 || mes>30);
                                tarea1.setDiaLimite(dia);
                            }
                            case 12 -> {
                                do{
                                    dia=in.nextInt();
                                    if (dia<1 || dia>31){
                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                    }
                                }while(mes<1 || mes>31);
                                tarea1.setDiaLimite(dia);
                            }          
                        }
                        cantDiasLimite = calculadorDias(tarea1.getAñoLimite(),tarea1.getMesLimite(), tarea1.getDiaLimite());
                        diferencialDias = cantDiasLimite - cantDias;
                        tarea1.setTiemporestante(diferencialDias);
                        System.out.println(cantDias);
                        System.out.println(cantDiasLimite);
                        System.out.println(diferencialDias);
                        System.out.println("actual creo "+añoA+" "+mesA+" "+diaA);
                        tarea1.setActivo(true);
                        tarea1.setPosicion(1);
                    }
                    else{
                        if(!tarea2.isActivo()){
                                BasuraText= in.nextLine();
                                System.out.println("Ingrese el nombre de la tarea");
                                nombreTarea= in.nextLine();
                                tarea2.setTitulo(nombreTarea);
                                System.out.println("Ingrese la descripción de la tarea");
                                descripcionTarea= in.nextLine();
                                tarea2.setDescripcion(descripcionTarea);
                                System.out.println ("ingrese el tiempo límite iniciando con año ");
                                do{
                                    año= in.nextInt();
                                    if (año<0 || año>9999){
                                        System.out.println("Debe ingresar un año válido entre el año 0 al 9999");
                                    }
                                }while(año<0 || año>9999);
                                tarea2.setAñoLimite(año);
                                System.out.println ("ahora ingrese el mes ");
                                do{
                                    mes=in.nextInt();
                                    if (mes<1 || mes>12){
                                        System.out.println("Ingrese un mes válido, comprendido entre 1 y 12");
                                    }
                                }while(mes<1 || mes>12);
                                tarea2.setMesLimite(mes);
                                System.out.println ("ahora ingrese el dia ");// ahora se viene lo divertido jaja que conste que no usé java util calendar para esto porque quería hacerlo más interesante (ah y no le entendía bien la documentacion pero esos son detalles :D)
                                switch(mes){
                                    case 1 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 2 -> {
                                        if(año%400==0){
                                            do{
                                                dia=in.nextInt();
                                                if (dia<1 || dia>29){
                                                    System.out.println("Ingrese un día válido, comprendido entre 1 y 29");
                                                }
                                            }while(mes<1 || mes>29);
                                            tarea2.setDiaLimite(dia);
                                        }
                                        else {
                                            if(año%100==0){
                                                do{
                                                    dia=in.nextInt();
                                                    if (dia<1 || dia>28){
                                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 28");
                                                    }
                                                }while(mes<1 || mes>28);
                                                tarea2.setDiaLimite(dia);
                                            }
                                            else{
                                                if(año%4==0){
                                                    do{
                                                        dia=in.nextInt();
                                                        if (dia<1 || dia>29){
                                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 29");
                                                        }
                                                    }while(mes<1 || mes>29);
                                                    tarea2.setDiaLimite(dia);
                                                }
                                                else{
                                                    do{
                                                        dia=in.nextInt();
                                                        if (dia<1 || dia>28){
                                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 28");
                                                        }
                                                    }while(mes<1 || mes>28);
                                                    tarea2.setDiaLimite(dia);
                                                }
                                            }
                                        }  
                                    }
                                    case 3 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 4 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 5 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 6 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 7 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 8 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 9 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 10 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 11 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea2.setDiaLimite(dia);
                                    }
                                    case 12 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea2.setDiaLimite(dia);
                                    }          
                                }
                                cantDiasLimite = calculadorDias(añoA, mesA, diaA);
                                diferencialDias = cantDiasLimite - cantDias;
                                tarea2.setTiemporestante(diferencialDias);
                                tarea2.setActivo(true);
                                tarea2.setPosicion(2);
                        }
                        else{
                            if(!tarea3.isActivo()){
                                BasuraText= in.nextLine();
                                System.out.println("Ingrese el nombre de la tarea");
                                nombreTarea= in.nextLine();
                                tarea3.setTitulo(nombreTarea);
                                System.out.println("Ingrese la descripción de la tarea");
                                descripcionTarea= in.nextLine();
                                tarea3.setDescripcion(descripcionTarea);
                                System.out.println ("ingrese el tiempo límite iniciando con año ");
                                do{
                                    año= in.nextInt();
                                    if (año<0 || año>9999){
                                        System.out.println("Debe ingresar un año válido entre el año 0 al 9999");
                                    }
                                }while(año<0 || año>9999);
                                tarea3.setAñoLimite(año);
                                System.out.println ("ahora ingrese el mes ");
                                do{
                                    mes=in.nextInt();
                                    if (mes<1 || mes>12){
                                        System.out.println("Ingrese un mes válido, comprendido entre 1 y 12");
                                    }
                                }while(mes<1 || mes>12);
                                tarea3.setMesLimite(mes);
                                System.out.println ("ahora ingrese el dia ");// ahora se viene lo divertido jaja que conste que no usé java util calendar para esto porque quería hacerlo más interesante (ah y no le entendía bien la documentacion pero esos son detalles :D)
                                switch(mes){
                                    case 1 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 2 -> {
                                        if(año%400==0){
                                            do{
                                                dia=in.nextInt();
                                                if (dia<1 || dia>29){
                                                    System.out.println("Ingrese un día válido, comprendido entre 1 y 29");
                                                }
                                            }while(mes<1 || mes>29);
                                            tarea3.setDiaLimite(dia);
                                        }
                                        else {
                                            if(año%100==0){
                                                do{
                                                    dia=in.nextInt();
                                                    if (dia<1 || dia>28){
                                                        System.out.println("Ingrese un día válido, comprendido entre 1 y 28");
                                                    }
                                                }while(mes<1 || mes>28);
                                                tarea3.setDiaLimite(dia);
                                            }
                                            else{
                                                if(año%4==0){
                                                    do{
                                                        dia=in.nextInt();
                                                        if (dia<1 || dia>29){
                                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 29");
                                                        }
                                                    }while(mes<1 || mes>29);
                                                    tarea3.setDiaLimite(dia);
                                                }
                                                else{
                                                    do{
                                                        dia=in.nextInt();
                                                        if (dia<1 || dia>28){
                                                            System.out.println("Ingrese un día válido, comprendido entre 1 y 28");
                                                        }
                                                    }while(mes<1 || mes>28);
                                                    tarea3.setDiaLimite(dia);
                                                }
                                            }
                                        }  
                                    }
                                    case 3 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 4 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 5 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 6 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 7 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 8 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 9 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 10 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 11 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>30){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 30");
                                            }
                                        }while(mes<1 || mes>30);
                                        tarea3.setDiaLimite(dia);
                                    }
                                    case 12 -> {
                                        do{
                                            dia=in.nextInt();
                                            if (dia<1 || dia>31){
                                                System.out.println("Ingrese un día válido, comprendido entre 1 y 31");
                                            }
                                        }while(mes<1 || mes>31);
                                        tarea3.setDiaLimite(dia);
                                    }          
                                }
                                cantDiasLimite = calculadorDias(añoA, mesA, diaA);
                                diferencialDias = cantDiasLimite - cantDias;
                                tarea3.setTiemporestante(diferencialDias);
                                tarea3.setActivo(true);
                                tarea3.setPosicion(3);
                            }
                            else{
                                System.out.println("Termina alguna tarea antes de iniciar otra, listado de tareas lleno");
                            }
                        }  
                    }   
                }
                case 2 -> {
                    if(tarea1.isActivo()){
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Nombre de la tarea: "+tarea1.getTitulo());
                        System.out.println("                                                                     tarea número: "+tarea1.getPosicion());
                        System.out.println();
                        System.out.println("Descripción de la tarea: "+tarea1.getDescripcion());
                        System.out.println();
                        System.out.print("Estado de la tarea: ");
                        if(tarea1.isCompleta()){
                            System.out.println("\033[32m"+"Completa"+"\u001B[0m");
                        }
                        else{
                            System.out.println("\033[31m"+"incompleta"+"\u001B[0m");
                            System.out.print("Días restantes para completar la tarea: ");//acá utilizo 3 if porque Switch solo permite evaluar valores concretos de la expresión: no permite evaluar intervalos (pertenencia de la expresión a un intervalo o rango) ni expresiones compuestas.
                            if(tarea1.getTiemporestante()>0){ //el tiempo restante solo aparece si la tarea no ha sido completada aún 
                                System.out.println( "\033[32m"+tarea1.getTiemporestante()+"\u001B[0m");
                            }
                            if(tarea1.getTiemporestante()==0){
                                System.out.println( tarea1.getTiemporestante());
                            }
                            if(tarea1.getTiemporestante()<0){
                                System.out.println( "\033[31m"+tarea1.getTiemporestante()+"\u001B[0m");
                            }
                        }
                        System.out.println("La fecha límite de la tarea es: día "+tarea1.getDiaLimite() +" mes "+tarea1.getMesLimite() +" año "+tarea1.getAñoLimite());
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                    else{
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("NO HAY TAREAS CARGADAS EN ESTE LUGAR");
                        System.out.println("                                                                     tarea número: "+tarea1.getPosicion());
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                    if(tarea2.isActivo()){
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Nombre de la tarea: "+tarea2.getTitulo());
                        System.out.println("                                                                     tarea número: "+tarea2.getPosicion());
                        System.out.println();
                        System.out.println("Descripción de la tarea: "+tarea2.getDescripcion());
                        System.out.println();
                        System.out.print("Estado de la tarea: ");
                        if(tarea2.isCompleta()){
                            System.out.println("\033[32m"+"Completa"+"\u001B[0m");
                        }
                        else{
                            System.out.println("\033[31m"+"incompleta"+"\u001B[0m");
                            System.out.print("Días restantes para completar la tarea: ");//acá utilizo 3 if porque Switch solo permite evaluar valores concretos de la expresión: no permite evaluar intervalos (pertenencia de la expresión a un intervalo o rango) ni expresiones compuestas.
                            if(tarea2.getTiemporestante()>0){ //el tiempo restante solo aparece si la tarea no ha sido completada aún 
                                System.out.println( "\033[32m"+tarea2.getTiemporestante()+"\u001B[0m");
                            }
                            if(tarea2.getTiemporestante()==0){
                                System.out.println( tarea2.getTiemporestante());
                            }
                            if(tarea2.getTiemporestante()<0){
                                System.out.println( "\033[31m"+tarea2.getTiemporestante()+"\u001B[0m");
                            }
                        }
                        System.out.println("La fecha límite de la tarea es: día "+tarea2.getDiaLimite() +" mes "+tarea2.getMesLimite() +" año "+tarea2.getAñoLimite());
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                    else{
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("NO HAY TAREAS CARGADAS EN ESTE LUGAR");
                        System.out.println("                                                                     tarea número: "+tarea2.getPosicion());
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                    if(tarea3.isActivo()){
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Nombre de la tarea: "+tarea3.getTitulo());
                        System.out.println("                                                                     tarea número: "+tarea3.getPosicion());
                        System.out.println();
                        System.out.println("Descripción de la tarea: "+tarea3.getDescripcion());
                        System.out.println();
                        System.out.print("Estado de la tarea: ");
                        if(tarea3.isCompleta()){
                            System.out.println("\033[32m"+"Completa"+"\u001B[0m");
                        }
                        else{
                            System.out.println("\033[31m"+"incompleta"+"\u001B[0m");
                            System.out.print("Días restantes para completar la tarea: ");//acá utilizo 3 if porque Switch solo permite evaluar valores concretos de la expresión: no permite evaluar intervalos (pertenencia de la expresión a un intervalo o rango) ni expresiones compuestas.
                            if(tarea3.getTiemporestante()>0){ //el tiempo restante solo aparece si la tarea no ha sido completada aún 
                                System.out.println( "\033[32m"+tarea3.getTiemporestante()+"\u001B[0m");
                            }
                            if(tarea3.getTiemporestante()==0){
                                System.out.println( tarea3.getTiemporestante());
                            }
                            if(tarea3.getTiemporestante()<0){
                                System.out.println( "\033[31m"+tarea3.getTiemporestante()+"\u001B[0m");
                            }
                        }
                        System.out.println("La fecha límite de la tarea es: día "+tarea3.getDiaLimite() +" mes "+tarea3.getMesLimite() +" año "+tarea3.getAñoLimite());
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                    else{
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("NO HAY TAREAS CARGADAS EN ESTE LUGAR");
                        System.out.println("                                                                     tarea número: "+tarea3.getPosicion());
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                }
                case 3 -> {
                    do{
                        System.out.println("por favor ingrese el numero de tarea(numero del 1 al 3)");
                        opciones=in.nextInt();
                    }while(opciones<1|| opciones>3 );
                    switch(opciones){
                        case 1 -> {
                            if(tarea1.isActivo()){
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("Nombre de la tarea: "+tarea1.getTitulo());
                                System.out.println("                                                                     tarea número: "+tarea1.getPosicion());
                                System.out.println();
                                System.out.println("Descripción de la tarea: "+tarea1.getDescripcion());
                                System.out.println();
                                System.out.print("Estado de la tarea: ");
                                if(tarea1.isCompleta()){
                                    System.out.println("\033[32m"+"Completa"+"\u001B[0m");
                                }
                                else{
                                    System.out.println("\033[31m"+"incompleta"+"\u001B[0m");
                                    System.out.print("Días restantes para completar la tarea: ");//acá utilizo 3 if porque Switch solo permite evaluar valores concretos de la expresión: no permite evaluar intervalos (pertenencia de la expresión a un intervalo o rango) ni expresiones compuestas.
                                    if(tarea1.getTiemporestante()>0){ //el tiempo restante solo aparece si la tarea no ha sido completada aún
                                        System.out.println( "\033[32m"+tarea1.getTiemporestante()+"\u001B[0m");
                                    }
                                    if(tarea1.getTiemporestante()==0){
                                        System.out.println( tarea1.getTiemporestante());
                                    }
                                    if(tarea1.getTiemporestante()<0){
                                        System.out.println( "\033[31m"+tarea1.getTiemporestante()+"\u001B[0m");
                                    }
                                }
                                System.out.println("La fecha límite de la tarea es: día "+tarea1.getDiaLimite() +" mes "+tarea1.getMesLimite() +" año "+tarea1.getAñoLimite());
                                System.out.println("--------------------------------------------------------------------------------------------");
                                do{
                                    System.out.println("ingresa 1 para continuar, 2 para marcar la tarea como completa, 3 para eliminar esta tarea");
                                    opciones=in.nextInt();
                                }while(opciones<1|| opciones>3 );
                                if(opciones==2){
                                    tarea1.setCompleta(true);
                                }
                                if(opciones==3){
                                    tarea1.setActivo(false);
                                }
                            }
                            else{
                                System.out.println("--------------------------------------------------------------------------------------------");
                                System.out.println("NO HAY TAREAS CARGADAS EN ESTE LUGAR");
                                System.out.println("                                                                     tarea número: "+tarea1.getPosicion());
                                System.out.println();
                                System.out.println("--------------------------------------------------------------------------------------------");
                            }
                        }
                        case 2 -> { 
                            if(tarea2.isActivo()){
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Nombre de la tarea: "+tarea2.getTitulo());
                        System.out.println("                                                                     tarea número: "+tarea2.getPosicion());
                        System.out.println();
                        System.out.println("Descripción de la tarea: "+tarea2.getDescripcion());
                        System.out.println();
                        System.out.print("Estado de la tarea: ");
                        if(tarea2.isCompleta()){
                            System.out.println("\033[32m"+"Completa"+"\u001B[0m");
                        }
                        else{
                            System.out.println("\033[31m"+"incompleta"+"\u001B[0m");
                            System.out.print("Días restantes para completar la tarea: ");//acá utilizo 3 if porque Switch solo permite evaluar valores concretos de la expresión: no permite evaluar intervalos (pertenencia de la expresión a un intervalo o rango) ni expresiones compuestas.
                            if(tarea2.getTiemporestante()>0){ //el tiempo restante solo aparece si la tarea no ha sido completada aún 
                                System.out.println( "\033[32m"+tarea2.getTiemporestante()+"\u001B[0m");
                            }
                            if(tarea2.getTiemporestante()==0){
                                System.out.println( tarea2.getTiemporestante());
                            }
                            if(tarea2.getTiemporestante()<0){
                                System.out.println( "\033[31m"+tarea2.getTiemporestante()+"\u001B[0m");
                            }
                        }
                        System.out.println("La fecha límite de la tarea es: día "+tarea2.getDiaLimite() +" mes "+tarea2.getMesLimite() +" año "+tarea2.getAñoLimite());
                        System.out.println("--------------------------------------------------------------------------------------------");
                        do{
                            System.out.println("ingresa 1 para continuar, 2 para marcar la tarea como completa, 3 para eliminar esta tarea");
                            opciones=in.nextInt();
                        }while(opciones<1|| opciones>3 );
                        if(opciones==2){
                            tarea2.setCompleta(true);
                        }
                        if(opciones==3){
                            tarea2.setActivo(false);
                        }
                    }
                    else{
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("NO HAY TAREAS CARGADAS EN ESTE LUGAR");
                        System.out.println("                                                                     tarea número: "+tarea2.getPosicion());
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                        }
                        case 3 -> {
                            if(tarea3.isActivo()){
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("Nombre de la tarea: "+tarea3.getTitulo());
                        System.out.println("                                                                     tarea número: "+tarea3.getPosicion());
                        System.out.println();
                        System.out.println("Descripción de la tarea: "+tarea3.getDescripcion());
                        System.out.println();
                        System.out.print("Estado de la tarea: ");
                        if(tarea3.isCompleta()){
                            System.out.println("\033[32m"+"Completa"+"\u001B[0m");
                        }
                        else{
                            System.out.println("\033[31m"+"incompleta"+"\u001B[0m");
                            System.out.print("Días restantes para completar la tarea: ");//acá utilizo 3 if porque Switch solo permite evaluar valores concretos de la expresión: no permite evaluar intervalos (pertenencia de la expresión a un intervalo o rango) ni expresiones compuestas.
                            if(tarea3.getTiemporestante()>0){ //el tiempo restante solo aparece si la tarea no ha sido completada aún 
                                System.out.println( "\033[32m"+tarea3.getTiemporestante()+"\u001B[0m");
                            }
                            if(tarea3.getTiemporestante()==0){
                                System.out.println( tarea3.getTiemporestante());
                            }
                            if(tarea3.getTiemporestante()<0){
                                System.out.println( "\033[31m"+tarea3.getTiemporestante()+"\u001B[0m");
                            }
                        }
                        System.out.println("La fecha límite de la tarea es: día "+tarea3.getDiaLimite() +" mes "+tarea3.getMesLimite() +" año "+tarea3.getAñoLimite());
                        System.out.println("--------------------------------------------------------------------------------------------");
                        do{
                            System.out.println("ingresa 1 para continuar, 2 para marcar la tarea como completa, 3 para eliminar esta tarea");
                            opciones=in.nextInt();
                        }while(opciones<1|| opciones>3 );
                        if(opciones==2){
                            tarea3.setCompleta(true);
                        }
                        if(opciones==3){
                            tarea3.setActivo(false);
                        }
                    }
                    else{
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.println("NO HAY TAREAS CARGADAS EN ESTE LUGAR");
                        System.out.println("                                                                     tarea número: "+tarea3.getPosicion());
                        System.out.println();
                        System.out.println("--------------------------------------------------------------------------------------------");
                    }
                    }
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por utilizar este programa");
                }
                default -> {System.out.println("Valor ingresado incorrecto, vuelva a intentarlo");
                }
                
            }
        }while(opcion!=4); 
    
    }
    
}
