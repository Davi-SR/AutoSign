package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class InicialView extends javax.swing.JFrame {


    public InicialView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelFraseBemVindo = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonRetirada = new javax.swing.JButton();
        jButtonStatus = new javax.swing.JButton();
        jButtonRegistroSala = new javax.swing.JButton();
        jButtonRegistroMaterial = new javax.swing.JButton();
        jButtonRegistroDocente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUniceplac.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 260, 210));

        jLabelFraseBemVindo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelFraseBemVindo.setForeground(new java.awt.Color(4, 116, 76));
        jLabelFraseBemVindo.setText("Bem-vindo ao AutoSign");
        getContentPane().add(jLabelFraseBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 510, 110));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBase.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed

    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetiradaActionPerformed
        RetiradaView telaRetirada = new RetiradaView();
        telaRetirada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRetiradaActionPerformed

    private void jButtonStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStatusActionPerformed
        StatusView telaStatus = new StatusView();
        telaStatus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonStatusActionPerformed

    private void jButtonRegistroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroSalaActionPerformed
        SalaView cadastroSala = new SalaView();
        cadastroSala.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroSalaActionPerformed

    private void jButtonRegistroMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroMaterialActionPerformed
        MaterialView cadastroMaterial = new MaterialView();
        cadastroMaterial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroMaterialActionPerformed

    private void jButtonRegistroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroDocenteActionPerformed
        ProfessorView cadastroProfessor = new ProfessorView();
        cadastroProfessor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroDocenteActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRegistroDocente;
    private javax.swing.JButton jButtonRegistroMaterial;
    private javax.swing.JButton jButtonRegistroSala;
    private javax.swing.JButton jButtonRetirada;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFraseBemVindo;
    private javax.swing.JLabel jLabelLogo;
    // End of variables declaration//GEN-END:variables
}
