/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author SHIELD
 */
public class ControlDeFlujo {
    public static void condicionales(){
        int var=5;
        if(var<7)
            System.out.println("true");
        if(var<8)
            System.out.println("true");
    }
    public void mensaje(){
        System.out.println("Hola yo me llamo");
    }
    public static void IfAnidado(){
        int a=3;
        if (a>3){
            System.out.println("Es mayor");
        }
        else if (a<3){
            System.out.println("Es menor");
        }
        else{
            System.out.println("Es igual");
        }
    }
    public static void Switch(){
        int nota=9;
        switch(nota){
            case 10:
                System.out.println("A");
                break;
                default:
                    System.out.println("Nota invalida");
                    break;
                case 2:
                    System.out.println("B");
                    break;
        }
    }
    
    public static void Switch2(){
        int x=4;
        switch (x){
            case 4:
                x++;
            case 3:
                x++;
        }
        System.out.println(x);
    }
    
    public static void interadorFor(){
        for (int i = 0; i < 4; i++) {
            System.out.println("interacion:"+i);
            if(i==2){
                break;
            }
            System.out.println("paso"+i);
        }
        System.out.println("Sali del bucle");
    }
}
