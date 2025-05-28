package view;

import dao.BlocoDAO;
import dao.SalaDAO;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class CadastroSalaView extends javax.swing.JFrame {

    
    public CadastroSalaView() {
        initComponents();
        carregarBlocosDoBanco();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonInicio = new javax.swing.JButton();
        jButtonRegistroDocente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonRegistrar1 = new javax.swing.JButton();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jTextFieldSala = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInicio.setContentAreaFilled(false);
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jButtonRegistroDocente.setContentAreaFilled(false);
        jButtonRegistroDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroDocenteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 160, 30));

        jButtonSair.setContentAreaFilled(false);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 30));

        jButtonRegistrar1.setContentAreaFilled(false);
        jButtonRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 30));

        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 372, 260, 30));

        jTextFieldSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resourses/TELA REGISTRO DE SALA.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(997, 561));
        jLabel1.setMinimumSize(new java.awt.Dimension(997, 561));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jTextFieldSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalaActionPerformed
    
    private void jButtonRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrar1ActionPerformed
        String salaStr = jTextFieldSala.getText().trim();
        String blocoStr = jComboBoxBloco.getSelectedItem() != null ? jComboBoxBloco.getSelectedItem().toString().trim().toUpperCase() : "";

        // Regra 1: campos obrigatórios
        if (salaStr.isEmpty() || blocoStr.isEmpty()) {
        JOptionPane.showMessageDialog(
                this,
                "Por favor, preencha todos os campos.",
                "Aviso - Campos Vazios",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }

        // Regra 2: bloco deve ser apenas letras maiúsculas (1 a 3 caracteres) ou "E/F"
        // Aqui permitimos "E/F" ou letras maiúsculas de 1 a 3 caracteres
        if (!(blocoStr.matches("^[A-Z]{1,3}$") || blocoStr.equals("E/F"))) {
        JOptionPane.showMessageDialog(
                this,
                "Bloco inválido. Utilize apenas letras maiúsculas (exemplo: A, B, AB ou E/F).",
                "Erro - Formato Inválido",
                JOptionPane.ERROR_MESSAGE
        );
        return;
    }

        // Regra 3: número da sala deve ser inteiro
        int numero;
        try {
            numero = Integer.parseInt(salaStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                this,
                "Número da sala deve ser um valor numérico.",
                "Erro - Formato Inválido",
                JOptionPane.ERROR_MESSAGE
        );
        return;
    }

        SalaDAO salaDao = new SalaDAO();
        // Regra 4: verifica existência
        if (salaDao.existeSalaBloco(numero, blocoStr)) {
        JOptionPane.showMessageDialog(
                this,
                "A sala " + numero + " já está registrada no bloco " + blocoStr + ".",
                "Aviso - Duplicidade",
                JOptionPane.WARNING_MESSAGE
        );
        return;
    }

    // Regra 5: tenta cadastrar e dá diagnóstico mais claro
        boolean sucesso = salaDao.cadastrarSala(numero, blocoStr);
        if (sucesso) {
            JOptionPane.showMessageDialog(
                this,
                "Sala cadastrada com sucesso!",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE
        );
        limparFormulario();
        } else {
        JOptionPane.showMessageDialog(
                this,
                "Erro ao cadastrar sala. Verifique se o bloco foi informado corretamente e tente novamente.",
                "Erro - Falha no Cadastro",
                JOptionPane.ERROR_MESSAGE
        );
    }
}  

    private void limparFormulario() {
    jTextFieldSala.setText("");
    // Opcional: pode resetar seleção do combo se desejar
    // jComboBoxBloco.setSelectedIndex(-1);

        
    }//GEN-LAST:event_jButtonRegistrar1ActionPerformed

    //Botao pra ir pra tela inicial
    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
       InicialView telaInicial = new InicialView();
       telaInicial.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    //Botao pra tela de registro de professor
    private void jButtonRegistroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroDocenteActionPerformed
        CadastroProfessorView cadastroProfessor = new CadastroProfessorView();
        cadastroProfessor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroDocenteActionPerformed

    //Botao sair do AutoSign
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
         UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBlocoActionPerformed

    //Getters e Setters
    public JButton getjButtonInicio() {
        return jButtonInicio;
    }

    public void setjButtonInicio(JButton jButtonInicio) {
        this.jButtonInicio = jButtonInicio;
    }

    public JButton getjButtonRegistrar1() {
        return jButtonRegistrar1;
    }

    public void setjButtonRegistrar1(JButton jButtonRegistrar1) {
        this.jButtonRegistrar1 = jButtonRegistrar1;
    }

    public JButton getjButtonRegistroDocente() {
        return jButtonRegistroDocente;
    }

    public void setjButtonRegistroDocente(JButton jButtonRegistroDocente) {
        this.jButtonRegistroDocente = jButtonRegistroDocente;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JTextField getjTextFieldSala() {
        return jTextFieldSala;
    }

    public void setjTextFieldSala(JTextField jTextFieldSala) {
        this.jTextFieldSala = jTextFieldSala;
    }

    public JComboBox<String> getjComboBoxBloco() {
        return jComboBoxBloco;
    }

    public void setjComboBoxBloco(JComboBox<String> jComboBoxBloco) {
        this.jComboBoxBloco = jComboBoxBloco;
    }
    
    
    
    
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroSalaView().setVisible(true);
            }
        });
    }
    
    public void carregarBlocosDoBanco() {
    try {
        BlocoDAO blocoDAO = new BlocoDAO();
        List<String> blocos = blocoDAO.listarBlocos(); // método que busca os blocos no banco

        jComboBoxBloco.removeAllItems(); // Limpa o combo
        for (String bloco : blocos) {
            jComboBoxBloco.addItem(bloco); // Adiciona cada bloco
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(
            this,
            "Erro ao carregar blocos: " + e.getMessage(),
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRegistrar1;
    private javax.swing.JButton jButtonRegistroDocente;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxBloco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldSala;
    // End of variables declaration//GEN-END:variables
}
