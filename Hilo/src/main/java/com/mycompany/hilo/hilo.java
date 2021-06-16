/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hilo;

/**
 *
 * @author mvoperacionales
 */

class hiloPrincipal extends Thread {
    public void run() {
        // todas las acciones se ejecutan dentro del hilo
        System.out.println("Ingresando al hilo");
    }
    
 }   
public class hilo {    

    public static void principal(String[] args) {
        // Creando el hilo y arrancndolo
        hiloPrincipal t = new hiloPrincipal();
        t.start();
        // Cambio en la prioridad del hilo
        t.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        try {
            // iniciamos el try para que el hilo detenga su ejecucion
            t.sleep(1000); // 1000 milliseconds
        } catch (InterruptedException e) {
            e.getMessage();
        }
        System.out.println("Dentro del metodo principal");
    }
}
     



