package titulojava;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import tools.CriptoManager;
import tools.MailJava;
import tools.MailJavaSender;
import tools.RecuperaDados;

/**
 *
 * @author Rodrigo
 */
public class SelecionaLicenca extends javax.swing.JFrame {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final String key = "0123456789abcdef";
    private String nmArquivo = "MON_2028499.CLIOT";

    public SelecionaLicenca() {
        initComponents();
        init();
        try {
            getContentPane().setBackground(new Color(255, 255, 255));
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Ico.png")));
            recuperaIdhd();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTFArquivoLicenca = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jTChaveLicenca = new javax.swing.JTextField();
        jTFArquivoLicenca1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Licença");

        jButton1.setText("Solicitar Licença por E-Mail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_1.png"))); // NOI18N
        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTFArquivoLicenca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe a Chave"));
        jTFArquivoLicenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFArquivoLicencaActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/b_2.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTChaveLicenca.setEditable(false);
        jTChaveLicenca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTChaveLicenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChaveLicencaActionPerformed(evt);
            }
        });

        jTFArquivoLicenca1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Informe seu Nome, e Email para contato."));
        jTFArquivoLicenca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFArquivoLicenca1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Versão 1.0.0                                                  Contato : rodrigo.monteiro.nascimento@gmail.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTChaveLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFArquivoLicenca)
                            .addComponent(jTFArquivoLicenca1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFArquivoLicenca1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jTChaveLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFArquivoLicenca, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(24, 24, 24))
        );

        setSize(new java.awt.Dimension(634, 359));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (jTFArquivoLicenca1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe seu Nome!");
            jTFArquivoLicenca1.grabFocus();
            return;
        }

        if (jTChaveLicenca.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chave não encontrada!");
            jTChaveLicenca.grabFocus();
            return;
        }

        MailJava mj = new MailJava();

        mj.setSmtpHostMail("smtp.gmail.com");
        mj.setSmtpPortMail("587");
        mj.setSmtpAuth("true");
        mj.setSmtpStarttls("true");
        mj.setUserMail("rodrigo.monteiro.nascimento@gmail.com");
        mj.setFromNameMail(" Monteiro Sistemas");
        mj.setPassMail("monteiro99");
        mj.setCharsetMail(" ISO-8859-1");
        mj.setSubjectMail(" Solicitação de Licença de Software -  " + sdf.format(new Date()));

        mj.setBodyMail("\n\nCHAVE P LIBERACAO :     " + jTChaveLicenca.getText() + "  \n\nNome:" + jTFArquivoLicenca1.getText());

        mj.setTypeTextMail(MailJava.TYPE_TEXT_PLAIN);

        Map<String, String> map = new HashMap<String, String>();
        map.put("rodrigo.monteiro.nascimento@gmail.com", "email");

        mj.setToMailsUsers(map);

        try {
            new MailJavaSender().senderMail(mj);
            JOptionPane.showMessageDialog(null, "E-Mail enviado com Sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar E-mail, Verifique a conexão com a internet ! " + e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (jTFArquivoLicenca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o arquivo de Licença de Software !");
            return;
        }

        try {
            String representacao = CriptoManager.decifrar(jTFArquivoLicenca.getText(), key.getBytes());

            String parte1 = representacao.split("!#")[0];
            String parte2 = representacao.split("!#")[1];

            System.out.println("PARTE 1: " + parte1 + "  PARTE2:" + parte2);

            if (parte1.equals(CriptoManager.decifrar(jTChaveLicenca.getText(), key.getBytes())) && parte2.equals("VALIDARODRIGO")) {
                gravaArquivos(representacao);

                Organizador jdct = new Organizador(this, true);
                jdct.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowGainedFocus(WindowEvent e) {

                    }

                    @Override
                    public void windowClosed(WindowEvent e) {
                        System.exit(0);
                    }
                });
                jdct.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Chave Invalida");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro : " + e);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTChaveLicencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChaveLicencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChaveLicencaActionPerformed

    private void jTFArquivoLicencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFArquivoLicencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFArquivoLicencaActionPerformed

    private void jTFArquivoLicenca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFArquivoLicenca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFArquivoLicenca1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SelecionaLicenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionaLicenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionaLicenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionaLicenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SelecionaLicenca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTChaveLicenca;
    private javax.swing.JTextField jTFArquivoLicenca;
    private javax.swing.JTextField jTFArquivoLicenca1;
    // End of variables declaration//GEN-END:variables

    private void recuperaIdhd() throws Exception {

        String cpu = RecuperaDados.getCPUSerial().substring(0, 5);

        String chave = CriptoManager.cifrar(cpu, key.getBytes());

        jTChaveLicenca.setText(chave);

        try {
            FileReader fileReader = new FileReader(nmArquivo);
            BufferedReader reader = new BufferedReader(fileReader);
            String data = null;
            String representacao = "";
            while ((data = reader.readLine()) != null) {
                if (!data.equals("")) {
                    representacao = data;
                }
            }
            fileReader.close();
            reader.close();

            representacao = CriptoManager.decifrar(representacao, key.getBytes());

            String parte1 = representacao.split("!#")[0];
            String parte2 = representacao.split("!#")[1];

            System.out.println("PARTE 1: " + parte1 + "  PARTE2: " + parte2);

            System.out.println("CPU    : " + cpu + "  and 2 : VALIDARODRIGO");

            if (parte1.equals(cpu) && parte2.equals("VALIDARODRIGO")) {

                Organizador jdct = new Organizador(this, true);
                jdct.addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowClosed(WindowEvent e) {
                        System.exit(0);
                    }
                });
                jdct.setVisible(true);

            } else {
                System.out.println("CONTRARIO");
            }
        } catch (Exception e) {

        }

    }

    private void init() {
        try {

            Properties props = new Properties();
            props.put("logoString", "Monteiro Sistemas");
            props.put("fontsize", "12");
            AcrylLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

        } catch (Exception e) {

        }
    }

    private void gravaArquivos(String chave) throws Exception {

        File file = new File(nmArquivo);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(CriptoManager.cifrar(chave, key.getBytes()));
        //Criando o conteúdo do arquivo
        writer.flush();
        //Fechando conexão e escrita do arquivo.
        writer.close();

    }

}
