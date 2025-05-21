package view;

import controller.ProfessorController;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.UIManager;

public class CadastroProfessorView extends javax.swing.JFrame {

    public CadastroProfessorView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistroSala = new javax.swing.JButton();
        jButtonInicialDocente = new javax.swing.JButton();
        jButtonProfessor = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jButtonRegistrarProfessor = new javax.swing.JButton();
        jButtonSairDocente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistroSala.setContentAreaFilled(false);
        jButtonRegistroSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 30));

        jButtonInicialDocente.setContentAreaFilled(false);
        jButtonInicialDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInicialDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicialDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicialDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, 30));

        jButtonProfessor.setContentAreaFilled(false);
        jButtonProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButtonProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 30));

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 510, 40));

        jTextFieldMatricula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextFieldMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 510, 40));

        jButtonRegistrarProfessor.setContentAreaFilled(false);
        jButtonRegistrarProfessor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarProfessorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 90, 40));

        jButtonSairDocente.setContentAreaFilled(false);
        jButtonSairDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSairDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSairDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 90, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/TelaDeRegistroDeProfessor.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed

    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMatriculaActionPerformed

    }//GEN-LAST:event_jTextFieldMatriculaActionPerformed

    //Botao para registrar professor no banco de dados
    private void jButtonRegistrarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarProfessorActionPerformed
        if (jTextFieldNome.getText().matches("") || jTextFieldMatricula.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");

            } else if (!jTextFieldNome.getText().matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(rootPane, "O nome deve conter apenas letras e espaços");

                } else if (!jTextFieldMatricula.getText().matches("\\d+")) {
                    JOptionPane.showMessageDialog(rootPane, "A matrícula deve conter apenas números");
                    } else {
                        try {
                            ProfessorController controller = new ProfessorController();
                            controller.cadastrarProfessor(this);
                        } catch (SQLException sql) {
                            JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar professor.");
                            sql.printStackTrace();
                        }
                        JOptionPane.showMessageDialog(rootPane, "Professor cadastrado com sucesso");
                    }

    }//GEN-LAST:event_jButtonRegistrarProfessorActionPerformed

    //Botão para sair do programa atraves da pagina de Registrar Docente
    private void jButtonSairDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairDocenteActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairDocenteActionPerformed

    //Botão para voltar para tela inicial
    private void jButtonInicialDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicialDocenteActionPerformed
       InicialView telaInicial = new InicialView();
       telaInicial.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonInicialDocenteActionPerformed

    private void jButtonRegistroSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroSalaActionPerformed
        CadastroSalaView cadastrosala = new CadastroSalaView();
        cadastrosala.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroSalaActionPerformed

    //Getter e Setter
    public JTextField getjTextFieldMatricula() {
        return jTextFieldMatricula;
    }

    public void setjTextFieldMatricula(JTextField jTextFieldMatricula) {
        this.jTextFieldMatricula = jTextFieldMatricula;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.jTextFieldNome = jTextFieldNome;
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicialDocente;
    private javax.swing.JButton jButtonProfessor;
    private javax.swing.JButton jButtonRegistrarProfessor;
    private javax.swing.JButton jButtonRegistroSala;
    private javax.swing.JButton jButtonSairDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
