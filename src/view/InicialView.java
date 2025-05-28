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

        jButtonInicio = new javax.swing.JButton();
        jButtonDocenteInicial = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonSalaInicial = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 40));

        jButtonDocenteInicial.setContentAreaFilled(false);
        jButtonDocenteInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDocenteInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocenteInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDocenteInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 40));

        jButtonSair.setContentAreaFilled(false);
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 90, 40));

        jButtonSalaInicial.setContentAreaFilled(false);
        jButtonSalaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 233, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/TelaInicial.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        setSize(new java.awt.Dimension(966, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão para sair do sistema
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonDocenteInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocenteInicialActionPerformed
        CadastroProfessorView cadastroProfessor = new CadastroProfessorView();
        cadastroProfessor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonDocenteInicialActionPerformed

    private void jButtonSalaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalaInicialActionPerformed
        CadastroSalaView cadastrosala = new CadastroSalaView();
        cadastrosala.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonSalaInicialActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDocenteInicial;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalaInicial;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
