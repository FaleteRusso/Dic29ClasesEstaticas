package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriter {
    public static void main(String[] args) {
        //definir variables
        FileWriter fSalida;
        PrintWriter altoNivel;
        try {
            fSalida= new FileWriter("Print_writer1.txt");
            altoNivel = new PrintWriter(fSalida);
            altoNivel.println("Escrito desde un Printwriter");
            altoNivel.format("El nombre del producto %20s tiene un precio %.2f y hay %d unidades","Te tai",1.33,50);
            altoNivel.flush();
            altoNivel.close();
            fSalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}