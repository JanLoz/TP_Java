package com.m2i.poe.shop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CSVsample {

    public static void main(String[] args) { ///lecture de fichier par ligne
        try {
            System.out.println(System.getProperty ( "user.dir" ));
            BufferedReader reader= new BufferedReader (new FileReader ( "mesure.csv" ));
            String line=reader.readLine();
            while(line !=null) {
                System.out.println(line);
                line= reader.readLine ();

            }
            String s="5;3;3.14";  // lecture de valeurs par columna
            StringTokenizer st= new StringTokenizer(s,";");
            System.out.println(st.nextToken()); //A  la primera linea
            System.out.println(st.nextToken()); //b   la segunda
            System.out.println(st.nextToken()); //c   so on ...
            s = "3.14";
            double d= Double.parseDouble ( s ); //parsing valeur int -> double
        }

        catch (FileNotFoundException ex) {
            ex.printStackTrace ();
        }
        catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
