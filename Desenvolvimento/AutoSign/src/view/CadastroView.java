package view;

import controller.LoginController;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;

public class CadastroView extends javax.swing.JFrame {


    public CadastroView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabeliconNome = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabeliconEmail = new javax.swing.JLabel();
        jLabelNomeEmail = new javax.swing.JLabel();
        jLabeliconSenha = new javax.swing.JLabel();
        jLabelNomeSenha = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUniceplac.png"))); // NOI18N
        jLabelLogo.setText("jLabel2");
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 260, 210));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(4, 116, 76));
        jLabelTitulo.setText("Cadastro");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 210, 60));

        jLabeliconNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IconLogin.PNG"))); // NOI18N
        getContentPane().add(jLabeliconNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 50, 40));

        jLabelNome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNome.setText("Nome Completo");
        getContentPane().add(jLabelNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabeliconEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IconLogin.PNG"))); // NOI18N
        getContentPane().add(jLabeliconEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 50, 50));

        jLabelNomeEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeEmail.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeEmail.setText("E-mail");
        getContentPane().add(jLabelNomeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        jLabeliconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconSenha.PNG"))); // NOI18N
        jLabeliconSenha.setText("jLabel3");
        getContentPane().add(jLabeliconSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 50, 50));

        jLabelNomeSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeSenha.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeSenha.setText("Senha");
        getContentPane().add(jLabelNomeSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 180, 50));

        jTextFieldNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 540, 50));

        jTextFieldEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 540, 50));

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 540, 50));

        jButtonCadastrar.setBackground(new java.awt.Color(243, 124, 60));
        jButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBranca.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1199, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão para cadastrar informações do usuario no banco
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeEmail;
    private javax.swing.JLabel jLabelNomeSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeliconEmail;
    private javax.swing.JLabel jLabeliconNome;
    private javax.swing.JLabel jLabeliconSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
