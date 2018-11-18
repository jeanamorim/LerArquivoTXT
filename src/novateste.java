
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Joice
 */
public class novateste {

    String fileName = "/temp/teste2.txt";
    Scanner scan = null;
    StringWriter linha = new StringWriter();
    PrintWriter out = new PrintWriter(linha);

    
        try {
   Scan = new Scanner(new File(fileName));
        while (scan.hasNextLines()) {
            out.println(scan.nextLine());
        }
    }
    catch (Exception e

    
        ) {
       System.out.println("Problem reading " + fileName);
    }

    
        finally {
   if (scan != null) {
            scan.close();
        }
    }

    return str.toString ();
}
