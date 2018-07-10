/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Rodrigo
 */
public class RecuperarArquivoBytes {

    public byte[] loadBytes(String arquivo) {
        FileInputStream in = null;

        try {
            in = new FileInputStream(arquivo);
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();

            int bytesread = 0;
            byte[] tbuff = new byte[512];

            while (true) {
                bytesread = in.read(tbuff);
                if (bytesread == -1) // if EOF  
                {
                    break;
                }
                buffer.write(tbuff, 0, bytesread);
            }
            return buffer.toByteArray();
        } catch (IOException e) {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e2) {
                }
            }
            return null;
        }
    }
}
