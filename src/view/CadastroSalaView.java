package view;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CadastroSalaView extends javax.swing.JFrame {

    public CadastroSalaView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSala = new javax.swing.JTextField();
        jTextFieldBloco = new javax.swing.JTextField();
        jButtonInicioSala = new javax.swing.JButton();
        jButtonRegistro = new javax.swing.JButton();
        jButtonRegistroDocenteSala = new javax.swing.JButton();
        jButtonSairSala = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 300, 30));

        jTextFieldBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 300, 30));

        jButtonInicioSala.setContentAreaFilled(false);
        jButtonInicioSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicioSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 13, 160, 30));

        jButtonRegistro.setContentAreaFilled(false);
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 30));

        jButtonRegistroDocenteSala.setContentAreaFilled(false);
        jButtonRegistroDocenteSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroDocenteSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroDocenteSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 273, 160, 40));

        jButtonSairSala.setContentAreaFilled(false);
        jButtonSairSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/TELA REGISTRO DE SALA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Botão para sair do sistema
    private void jButtonSairSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairSalaActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairSalaActionPerformed

    //Botao para ir para TELA INICIAL
    private void jButtonInicioSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioSalaActionPerformed
       InicialView telaInicial = new InicialView();
       telaInicial.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonInicioSalaActionPerformed

    //Botao para ir para TELA DE CADASTRO DE PROFESSOR
    private void jButtonRegistroDocenteSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroDocenteSalaActionPerformed
       InicialView telaInicial = new InicialView();
       telaInicial.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroDocenteSalaActionPerformed

    //Botao de registro
    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jTextFieldSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalaActionPerformed

    private void jTextFieldBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBlocoActionPerformed

    //Getters e Setters
    public JTextField getjTextFieldBloco() {
        return jTextFieldBloco;
    }

    public void setjTextFieldBloco(JTextField jTextFieldBloco) {
        this.jTextFieldBloco = jTextFieldBloco;
    }

    public JTextField getjTextFieldSala() {
        return jTextFieldSala;
    }

    public void setjTextFieldSala(JTextField jTextFieldSala) {
        this.jTextFieldSala = jTextFieldSala;
    }

    

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroSalaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicioSala;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JButton jButtonRegistroDocenteSala;
    private javax.swing.JButton jButtonSairSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldBloco;
    private javax.swing.JTextField jTextFieldSala;
    // End of variables declaration//GEN-END:variables
}
