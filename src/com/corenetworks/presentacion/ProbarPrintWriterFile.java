package com.corenetworks.presentacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriterFile {
    public static void main(String[] args) {
        //definir variables
        File fSalida;
        PrintWriter altoNivel;
        try {
            fSalida= new File("Print_writer2.txt");
            altoNivel = new PrintWriter(fSalida);
            altoNivel.println("Escrito desde un Printwriter");
            altoNivel.format("El nombre del producto %20s tiene un precio %.2f y hay %d unidades","Te tai",1.33,50);
            altoNivel.flush();
            altoNivel.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}