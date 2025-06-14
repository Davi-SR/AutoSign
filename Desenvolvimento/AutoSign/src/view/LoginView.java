package view;

import dao.LoginDAO;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginView extends javax.swing.JFrame {


    public LoginView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabeliconLogin = new javax.swing.JLabel();
        jLabelNomeEmail = new javax.swing.JLabel();
        jLabeliconSenha = new javax.swing.JLabel();
        jLabelNomeSenha = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonRealizarCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUniceplac.png"))); // NOI18N
        jLabelLogo.setText("jLabel2");
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 260, 210));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(4, 116, 76));
        jLabelTitulo.setText("Login");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 120, 60));

        jLabeliconLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/IconLogin.PNG"))); // NOI18N
        getContentPane().add(jLabeliconLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 50, 40));

        jLabelNomeEmail.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeEmail.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeEmail.setText("E-mail");
        getContentPane().add(jLabelNomeEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        jLabeliconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconSenha.PNG"))); // NOI18N
        jLabeliconSenha.setText("jLabel3");
        getContentPane().add(jLabeliconSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 50, -1));

        jLabelNomeSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeSenha.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeSenha.setText("Senha");
        getContentPane().add(jLabelNomeSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 180, 40));

        jTextFieldLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 540, 50));

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 540, 50));

        jButtonEntrar.setBackground(new java.awt.Color(243, 124, 60));
        jButtonEntrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 110, 40));

        jButtonRealizarCadastro.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRealizarCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRealizarCadastro.setText("Realizar Cadastro");
        jButtonRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 200, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBranca.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão para entrar no AutoSign
    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        if (jTextFieldLogin.getText().matches("") || jPasswordFieldSenha.getText().matches("")) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        } else {
            LoginDAO login = new LoginDAO();
            if (login.login(jTextFieldLogin.getText(), jPasswordFieldSenha.getText())) {
                JOptionPane.showMessageDialog(rootPane, "Login bem-sucedido! Carregando AutoSign...");

                // Desabilita os botões para evitar cliques enquanto carrega
                jButtonEntrar.setEnabled(false);
                jButtonRealizarCadastro.setEnabled(false);

                // Cria e inicia uma nova Thread para o atraso
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(3000); // Pausa de 3 segundos
                        } catch (InterruptedException ex) {
                            System.err.println("Thread de carregamento interrompida: " + ex.getMessage());
                        }

                        // Após o atraso, execute a atualização da UI no EDT
                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                InicialView telaInicial = new InicialView();
                                telaInicial.setVisible(true);
                                dispose(); // Fecha a tela de login
                            }
                        });
                    }
                }).start(); // Inicia a thread

            } else {
                JOptionPane.showMessageDialog(rootPane, "Usuário ou senha incorretos.");
            }
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    //Botão para ir para a Tela de Cadastro
    private void jButtonRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarCadastroActionPerformed
        CadastroView teladecadastro = new CadastroView();
        teladecadastro.setVisible(true);
    }//GEN-LAST:event_jButtonRealizarCadastroActionPerformed

    //Getters e Setters
    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.jPasswordFieldSenha = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    public void setjTextFieldLogin(JTextField jTextFieldLogin) {
        this.jTextFieldLogin = jTextFieldLogin;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonRealizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNomeEmail;
    private javax.swing.JLabel jLabelNomeSenha;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeliconLogin;
    private javax.swing.JLabel jLabeliconSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
