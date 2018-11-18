/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aruivotxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JeanAmorim
 */
public class AruivoTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader ler = new FileReader("D:\\Desktop\\IAProgamacao\\zoo.data.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            while ((linha = reader.readLine()) != null) {

                String animal[] = linha.split(",");
               
  //System.out.println("temPenas" + "(" + animal[0] + ", " + (animal[1].equals("1")? "true" :"false" ) + ").");
      System.out.println("ds.addSample(("+animal[1]+", "+animal[2]+", "+animal[3]+", "+animal[4]+", "+animal[5]+", "+animal[6]+", "+animal[7]+", "+animal[8]+", "+animal[9]+", "+animal[10]+", "+animal[11]+", "+animal[12]+", "+animal[14]+", "+animal[15]+", "+animal[16]+"), ("+animal[0]+"))");
               // System.out.println("elif a == 1:");
                //System.out.println("    return "+ "'"+animal[0]+"'");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
