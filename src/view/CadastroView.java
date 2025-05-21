package view;

import controller.LoginController;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroView extends javax.swing.JFrame {

    public CadastroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 510, 40));

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 510, 40));

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 510, 40));

        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/TelaDeCadastro.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão para cadastrar usuario no banco de dados
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
       
        if(jTextFieldNome.getText().matches("")|| jTextFieldEmail.getText().matches("") || jPasswordFieldSenha.getText().matches("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");

            } else if (!jTextFieldNome.getText().matches("[a-zA-Z\\s]+")) {
                JOptionPane.showMessageDialog(rootPane, "O nome deve conter apenas letras e espaços");
            
                } else if (!jTextFieldEmail.getText().contains("@") || jTextFieldEmail.getText().contains(" ")) {
                    JOptionPane.showMessageDialog(rootPane, "Insira um e-mail válido (deve conter @ e não ter espaços)");

                    } else if (String.valueOf(jPasswordFieldSenha.getPassword()).length() != 8) {
                        JOptionPane.showMessageDialog(rootPane, "A senha deve ter exatamente 8 caracteres");

                        } else if (!String.valueOf(jPasswordFieldSenha.getPassword()).matches(".*[a-zA-Z].*") || !String.valueOf(jPasswordFieldSenha.getPassword()).matches(".*\\d.*")) {
                            JOptionPane.showMessageDialog(rootPane, "A senha deve conter letras e números");

                            } else {
                                try {
                                    LoginController cadastro = new LoginController(); 
                                    cadastro.cadastroUsuario(this);
                                } catch (SQLException sql) {

                                }
                                JOptionPane.showMessageDialog(rootPane, "Cadastro realizado com sucesso");
                                this.setVisible(false);    
                            }        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    //Getters e Setters
    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.jTextFieldEmail = jTextFieldEmail;
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
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
