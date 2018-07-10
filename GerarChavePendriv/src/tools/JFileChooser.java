/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.io.File;

/**
 *
 * @author Rodrigo Monteiro 22/07/2014
 */
public class JFileChooser {

    public String url;

    public JFileChooser(Integer tp, String caminho) {
        this.carregaFoto(tp, caminho);
    }

    public void carregaFoto(Integer tp, String caminho) {
        javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();
        jfc.setMultiSelectionEnabled(false);
        jfc.setDialogTitle("Selecione a pasta");

        try {
            jfc.setCurrentDirectory(new File(caminho));
        } catch (Exception e) {

        }

        //dentro da janela do jfc  
        if (tp == 0) {
            jfc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);// ha outros parametros aqui
        } else if (tp == 1) {
            jfc.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);// ha outros parametros aqui

        }
        int resposta = jfc.showOpenDialog(jfc);
        //este if determina o que o programa faz ao se clicar no botao abrir ou cancelar dentro do jfc  
        if (resposta == 0) {

            url = jfc.getSelectedFile().getAbsolutePath().toString();
            System.out.println("Seu caminho é: " + url);
        }
        if (resposta == 1) {
            url = null;
            System.out.println("Você clicou em cancelar");
        }
    }

    public static void main(String[] args) {
        //JFileChooser x = new JFileChooser();
    }
}
