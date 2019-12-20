/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author SAI
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mythread  t = new Mythread();
        t.start();
        for(int i = 0;i<5;i++)
        {
            System.out.println("main thread...");
        }
    }
  
}
