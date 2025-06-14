package view;

import controller.ProfessorController;
import dao.ProfessorDAO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProfessorView extends javax.swing.JFrame {


    public ProfessorView() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldProfessor = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jButtonRegistrarProfessor = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jButtonRetirada = new javax.swing.JButton();
        jButtonStatus = new javax.swing.JButton();
        jButtonRegistroSala = new javax.swing.JButton();
        jButtonRegistroMaterial = new javax.swing.JButton();
        jButtonRegistroDocente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabeliconProfessor = new javax.swing.JLabel();
        jLabelNomeProfessor1 = new javax.swing.JLabel();
        jLabeliconSenha = new javax.swing.JLabel();
        jLabelNomeProfessor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldProfessor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 540, 50));

        jTextFieldMatricula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 540, 50));

        jButtonRegistrarProfessor.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRegistrarProfessor.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistrarProfessor.setText("Registrar");
        jButtonRegistrarProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 110, 40));

        jButtonInicio.setBackground(new java.awt.Color(243, 124, 60));
        jButtonInicio.setForeground(new java.awt.Color(0, 0, 0));
        jButtonInicio.setText("Inicio");
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 40));

        jButtonRetirada.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRetirada.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRetirada.setText("Retirada");
        jButtonRetirada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetiradaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRetirada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 40));

        jButtonStatus.setBackground(new java.awt.Color(243, 124, 60));
        jButtonStatus.setForeground(new java.awt.Color(0, 0, 0));
        jButtonStatus.setText("Status");
        jButtonStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStatusActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 230, 40));

        jButtonRegistroSala.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRegistroSala.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistroSala.setText("Registro de Sala");
        jButtonRegistroSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, 40));

        jButtonRegistroMaterial.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRegistroMaterial.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistroMaterial.setText("Registro de Material");
        jButtonRegistroMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 230, 40));

        jButtonRegistroDocente.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRegistroDocente.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistroDocente.setText("Registro de Docente");
        jButtonRegistroDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistroDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 230, 40));

        jButtonSair.setBackground(new java.awt.Color(243, 124, 60));
        jButtonSair.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSair.setText("Sair");
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 110, 40));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUniceplac.png"))); // NOI18N
        jLabelLogo.setText("jLabel2");
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 260, 210));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(4, 116, 76));
        jLabelTitulo.setText("Registro de Docentes");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 500, 60));

        jLabeliconProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IconLogin.PNG"))); // NOI18N
        getContentPane().add(jLabeliconProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 50, 50));

        jLabelNomeProfessor1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeProfessor1.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeProfessor1.setText("Professor");
        getContentPane().add(jLabelNomeProfessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 338, -1, 40));

        jLabeliconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconSenha.PNG"))); // NOI18N
        jLabeliconSenha.setText("jLabel3");
        getContentPane().add(jLabeliconSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 50, -1));

        jLabelNomeProfessor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeProfessor.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeProfessor.setText("Matricula");
        getContentPane().add(jLabelNomeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBase.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão para ir para Tela Inicial
    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicialView telaInicial = new InicialView();
        telaInicial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    //Botão para ir para Tela de Retirada
    private void jButtonRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetiradaActionPerformed
        RetiradaView telaRetirada = new RetiradaView();
        telaRetirada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRetiradaActionPerformed

    //Botão para ir para Tela de Status
    private void jButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatusActionPerformed
        StatusView telaStatus = new StatusView();
        telaStatus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonStatusActionPerformed

    //Botão para ir para Tela de Registro de Sala
    private void jButtonRegistroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroSalaActionPerformed
        SalaView cadastroSala = new SalaView();
        cadastroSala.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroSalaActionPerformed

    //Botão para ir para Tela de Registro de Material
    private void jButtonRegistroMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroMaterialActionPerformed
        MaterialView cadastroMaterial = new MaterialView();
        cadastroMaterial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroMaterialActionPerformed

    //Botão para ir para Tela de Registro de Docente
    private void jButtonRegistroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroDocenteActionPerformed

    }//GEN-LAST:event_jButtonRegistroDocenteActionPerformed

    //Botão para sair do AutoSign
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    //Botão para Registrar Professor no MySQL
    private void jButtonRegistrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarProfessorActionPerformed
        if (jTextFieldProfessor.getText().matches("") || jTextFieldMatricula.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        } else if (!jTextFieldProfessor.getText().matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(rootPane, "O nome deve conter apenas letras e espaços");
        } else if (!jTextFieldMatricula.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "A matrícula deve conter apenas números");
        } else {
            try {
                ProfessorDAO professorDAO = new ProfessorDAO();
                if (professorDAO.existeProfessorPorMatricula(jTextFieldMatricula.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Matricula já cadastrada no sistema");
                } else {
                    try {
                        ProfessorController controller = new ProfessorController();
                        controller.cadastrarProfessor(this);
                        JOptionPane.showMessageDialog(rootPane, "Professor cadastrado com sucesso");
                    }catch (SQLException sql) {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar professor.");
                        sql.printStackTrace();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(ProfessorView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonRegistrarProfessorActionPerformed

    //Getters e Setters
    public JTextField getjTextFieldMatricula() {
        return jTextFieldMatricula;
    }

    public void setjTextFieldMatricula(JTextField jTextFieldMatricula) {
        this.jTextFieldMatricula = jTextFieldMatricula;
    }

    public JTextField getjTextFieldProfessor() {
        return jTextFieldProfessor;
    }

    public void setjTextFieldProfessor(JTextField jTextFieldProfessor) {
        this.jTextFieldProfessor = jTextFieldProfessor;
    }

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
            java.util.logging.Logger.getLogger(ProfessorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfessorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRegistrarProfessor;
    private javax.swing.JButton jButtonRegistroDocente;
    private javax.swing.JButton jButtonRegistroMaterial;
    private javax.swing.JButton jButtonRegistroSala;
    private javax.swing.JButton jButtonRetirada;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNomeProfessor;
    private javax.swing.JLabel jLabelNomeProfessor1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeliconProfessor;
    private javax.swing.JLabel jLabeliconSenha;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldProfessor;
    // End of variables declaration//GEN-END:variables

}
