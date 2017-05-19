/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m09uf1act2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author ALUMNEDAM
 */
public class M09Uf1act2 {

    public static void main(String[] args) throws Exception {
        
        String home = System.getProperty("user.dir");
        System.out.println(home);
        File fichero = new File(home + File.separator + "Test.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader buffer = new BufferedReader(fr);
        String cad;
        while ((cad = buffer.readLine()) != null) {
            System.out.println(cad);

        }
    }

}
