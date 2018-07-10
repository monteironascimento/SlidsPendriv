/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author Rodrigo
 */
public class CriarArquivoBytes {

    public void BytesToFile(byte[] bytes, String caminho, String nome) {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(new File(caminho + "\\" + nome));
            fileOutputStream.write(bytes);
            fileOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
