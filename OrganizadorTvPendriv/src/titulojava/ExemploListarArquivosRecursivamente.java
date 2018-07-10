/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titulojava;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploListarArquivosRecursivamente {

    public List<File> listFiles(File directory) {
        List<File> files = new ArrayList<File>();
        listFiles(files, directory);
        return files;
    }

    private void listFiles(List<File> files, File directory) {
        File[] filesAndSubdirectories = directory.listFiles();
        if (filesAndSubdirectories != null) {
            for (File file : filesAndSubdirectories) {
                if (file.isDirectory()) {
                    listFiles(files, file);
                } else {
                    files.add(file);
                }
            }
        }
    }

    private boolean endsWith(File filename, List<String> extensions) {
        String name = filename.getName();
        for (String ext : extensions) {
            if (name.toLowerCase().endsWith(ext.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public List<File> listFiles(File directory, List<String> extensions) {
        List<File> files = new ArrayList<File>();
        listFiles(files, directory, extensions);
        return files;
    }

    private void listFiles(List<File> files, File directory, List<String> extensions) {
        File[] filesAndSubdirectories = directory.listFiles();
        if (filesAndSubdirectories != null) {
            for (File file : filesAndSubdirectories) {
                if (file.isDirectory()) {
                    listFiles(files, file, extensions);
                } else {
                    if (endsWith(file, extensions)) {
                        files.add(file);
                    }
                }
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExemploListarArquivosRecursivamente e = new ExemploListarArquivosRecursivamente();
        // Exemplo :
        List<String> extensions = Arrays.asList(new String[]{".jpg"});
        String path = "/Users/Monteiro/Documents/Minhas Imagens/teste/Apresentação1";

        List<File> files = e.listFiles(new File(path), extensions);
        for (File f : files) {

            String numero = autoCompletar.lpadTo(f.getName().trim().replaceAll("[^0-9-]*", ""), 2, '0');

            System.out.println("Numero : " + numero);

            File file = new File(f.getAbsolutePath());    // Arquivo ou diretório com novo nome   
            File file2 = new File(f.getPath().replaceAll(f.getName(), numero + ".png"));    // Renomeando arquivo ou diretório 
            boolean success = file.renameTo(file2);
            if (!success) {
                System.out.println("FALHA AO ALTERAR ARQUIVO");
                // Falha no momento de renomear  
            } else {
                System.out.println("AQUIVO ALTERADO COM SUCESSO");
            }

        }
    }

}
