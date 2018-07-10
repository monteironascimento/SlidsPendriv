/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Rodrigo
 */
public class Arquivo {

    public Arquivo() {
    }

    public void gerar(String caminho, String conteudo) throws IOException {

        File arquivo = new File(caminho+"\\SABIOSCONF.CONF");
        arquivo.createNewFile();
        

        FileWriter a = new FileWriter(arquivo);

        a.write(conteudo);
        a.close();

    }

//    Leia mais em
//    : Criando e Gravando dados em Txt com Java http
//
//://www.devmedia.com.br/criando-e-gravando-dados-em-txt-com-java/23060#ixzz3LzSOkiQs
}
