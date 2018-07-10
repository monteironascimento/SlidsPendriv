package frame;

import tools.JFileChooser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import tools.CriptoManager;

/**
 *
 * @author Rodrigo
 */
public class GerarLicencaFrame extends javax.swing.JFrame {

    private CriptoManager aes = new CriptoManager();
    private static final String key = "0123456789abcdef";

    public GerarLicencaFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jTFCaminhoArquivoTerminal = new javax.swing.JTextField();
        btnCaminhoArquivoTerminal = new javax.swing.JButton();
        jTFIdTerminal = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTChave = new javax.swing.JTextField();
        jTChave1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerar Licença Software Sabios");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial HD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        jTFCaminhoArquivoTerminal.setEnabled(false);

        btnCaminhoArquivoTerminal.setText("jButton1");
        btnCaminhoArquivoTerminal.setEnabled(false);
        btnCaminhoArquivoTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaminhoArquivoTerminalActionPerformed(evt);
            }
        });

        jTFIdTerminal.setEnabled(false);

        jButton4.setText("Remover");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Adicionar");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Arquivo de Terminais");
        jLabel7.setEnabled(false);

        jLabel8.setText("Id Terminal");

        jButton6.setText("Gerar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Selecionar");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setText("Chave do Sistema do Cliente");

        jTChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChaveActionPerformed(evt);
            }
        });

        jTChave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTChave1ActionPerformed(evt);
            }
        });

        jLabel10.setText("GeradoLiberar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTFIdTerminal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFCaminhoArquivoTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCaminhoArquivoTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jTChave, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jTChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(7, 7, 7)
                        .addComponent(jTChave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(7, 7, 7)
                        .addComponent(jTChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(404, 404, 404)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaminhoArquivoTerminal)
                    .addComponent(jTFCaminhoArquivoTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIdTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(424, 164));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTDtEmissaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDtEmissaoKeyPressed

    }//GEN-LAST:event_jTDtEmissaoKeyPressed

    private void jTDtEmissaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTDtEmissaoFocusLost

    }//GEN-LAST:event_jTDtEmissaoFocusLost

    private void jTDtEmissaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDtEmissaoKeyTyped

    }//GEN-LAST:event_jTDtEmissaoKeyTyped

    private void jTDtEmissaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTDtEmissaoPropertyChange

    }//GEN-LAST:event_jTDtEmissaoPropertyChange

    private void btnCaminhoArquivoTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaminhoArquivoTerminalActionPerformed
        String url = new JFileChooser(1, "C:\\").url;
        if (url != null) {
            jTFCaminhoArquivoTerminal.setText(url);
        }
    }//GEN-LAST:event_btnCaminhoArquivoTerminalActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (jTFIdTerminal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o ID do Hd do terminal desejado adicionar a licença");
            return;
        }

        try {

            DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
            tabela.addRow(new Object[]{jTFIdTerminal.getText()});
            jTFIdTerminal.setText("");
            jTFIdTerminal.grabFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (jTable1.getSelectedRow() < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um ID");
            return;

        }

        DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();
        tabela.removeRow(jTable1.getSelectedRow());


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        if (jTFCaminhoArquivoTerminal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o arquivo com lista dos terminais ! ");
            return;
        }

        try {
            DefaultTableModel tabela = (DefaultTableModel) jTable1.getModel();

            FileInputStream stream = new FileInputStream(jTFCaminhoArquivoTerminal.getText());

            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha = br.readLine();
            int i = 0;
            while (linha != null) {
                tabela.addRow(new Object[]{linha});

                System.out.println(linha);
                linha = br.readLine();
            }
            jTFCaminhoArquivoTerminal.setText("");
            jTFCaminhoArquivoTerminal.grabFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Recuperar dados do arquivo. Erro : " + e);
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        gerar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChaveActionPerformed

    private void jTChave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTChave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTChave1ActionPerformed

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(null).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerarLicencaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaminhoArquivoTerminal;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTChave;
    private javax.swing.JTextField jTChave1;
    private javax.swing.JTextField jTFCaminhoArquivoTerminal;
    private javax.swing.JTextField jTFIdTerminal;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private Boolean gerar() {

        try {

            String representacao = CriptoManager.decifrar(jTChave.getText(), key.getBytes());

            representacao = representacao + "!#VALIDARODRIGO";

            try {
                representacao = CriptoManager.cifrar(representacao, key.getBytes());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro : " + ex);
                return false;
            }

            jTChave1.setText(representacao);

            try {
                System.out.println(CriptoManager.decifrar(representacao, key.getBytes()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro : " + ex);
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro : " + e);
            return false;
        }

        return true;
    }

}
