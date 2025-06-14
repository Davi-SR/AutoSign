package view;

import dao.BlocoDAO;
import dao.SalaDAO;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public final class SalaView extends javax.swing.JFrame {


    public SalaView() {
        initComponents();
        carregarBlocosDoBanco();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldSala = new javax.swing.JTextField();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jButtonRegistrarSala = new javax.swing.JButton();
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
        jLabeliconMatricula = new javax.swing.JLabel();
        jLabelNomeBloco = new javax.swing.JLabel();
        jLabelNomeSala = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 540, 50));

        jComboBoxBloco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 260, 60));

        jButtonRegistrarSala.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRegistrarSala.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistrarSala.setText("Registrar");
        jButtonRegistrarSala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 630, 100, 40));

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
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 260, 210));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(4, 116, 76));
        jLabelTitulo.setText("Registro de Salas");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 500, 60));

        jLabeliconProfessor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconBloco.PNG"))); // NOI18N
        getContentPane().add(jLabeliconProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 50, 40));

        jLabeliconMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconSala.PNG"))); // NOI18N
        getContentPane().add(jLabeliconMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 50, 50));

        jLabelNomeBloco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeBloco.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeBloco.setText("Bloco");
        getContentPane().add(jLabelNomeBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 488, -1, 40));

        jLabelNomeSala.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeSala.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeSala.setText("Sala");
        getContentPane().add(jLabelNomeSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBase.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1201, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo que preenche a lista com os blocos
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
    
    //Botão para registrar dados da SALA no MySQL
    private void jButtonRegistrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarSalaActionPerformed
        String salaStr = jTextFieldSala.getText().trim();
        String blocoSelecionado = jComboBoxBloco.getSelectedItem() != null ? jComboBoxBloco.getSelectedItem().toString().trim() : "";

            if (salaStr.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Preencha o número da sala");
                return;
            }

            int numeroSala;
            try {
                numeroSala = Integer.parseInt(salaStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "O número da sala deve ser um valor numérico");
                return;
            }

            SalaDAO salaDao = new SalaDAO();
            if (salaDao.existeSalaBloco(numeroSala, blocoSelecionado)) {
                JOptionPane.showMessageDialog(rootPane, "A sala " + numeroSala + " já está registrada no bloco " + blocoSelecionado);
                return;
            }

            boolean sucesso = salaDao.cadastrarSala(numeroSala, blocoSelecionado);
            if (sucesso) {
                JOptionPane.showMessageDialog(rootPane, "Sala cadastrada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar sala. Verifique as informações e tente novamente.");
            }
    }//GEN-LAST:event_jButtonRegistrarSalaActionPerformed

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

    }//GEN-LAST:event_jButtonRegistroSalaActionPerformed

    //Botão para ir para Tela de Registro de Material
    private void jButtonRegistroMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroMaterialActionPerformed
        MaterialView cadastroMaterial = new MaterialView();
        cadastroMaterial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroMaterialActionPerformed

    //Botão para ir para Tela de Registro de Docente
    private void jButtonRegistroDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroDocenteActionPerformed
        ProfessorView cadastroProfessor = new ProfessorView();
        cadastroProfessor.setVisible(true);
        this.setVisible(false);
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

    //Getters e Setters
    public JComboBox<String> getjComboBoxBloco() {
        return jComboBoxBloco;
    }

    public void setjComboBoxBloco(JComboBox<String> jComboBoxBloco) {
        this.jComboBoxBloco = jComboBoxBloco;
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
                new SalaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRegistrarSala;
    private javax.swing.JButton jButtonRegistroDocente;
    private javax.swing.JButton jButtonRegistroMaterial;
    private javax.swing.JButton jButtonRegistroSala;
    private javax.swing.JButton jButtonRetirada;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JComboBox<String> jComboBoxBloco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNomeBloco;
    private javax.swing.JLabel jLabelNomeSala;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeliconMatricula;
    private javax.swing.JLabel jLabeliconProfessor;
    private javax.swing.JTextField jTextFieldSala;
    // End of variables declaration//GEN-END:variables
}
