package view;

import dao.BlocoDAO;
import dao.MaterialDAO;
import dao.ProfessorDAO;
import dao.RetiradaDAO;
import dao.SalaDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class RetiradaView extends javax.swing.JFrame {

    public RetiradaView() {
        initComponents();
        carregarDadosIniciais();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRetirar = new javax.swing.JButton();
        lblBloco = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        lblProfessor = new javax.swing.JLabel();
        lblDataShow = new javax.swing.JLabel();
        lblAr = new javax.swing.JLabel();
        cbBloco = new javax.swing.JComboBox<>();
        cbSala = new javax.swing.JComboBox<>();
        cbProfessor = new javax.swing.JComboBox<>();
        cbDataShow = new javax.swing.JComboBox<>();
        cbAr = new javax.swing.JComboBox<>();
        lblbloco = new javax.swing.JLabel();
        lblsala = new javax.swing.JLabel();
        lblProf = new javax.swing.JLabel();
        lbldatashow = new javax.swing.JLabel();
        lblar = new javax.swing.JLabel();
        lblResultadoBloco = new javax.swing.JLabel();
        lblResultadoSala = new javax.swing.JLabel();
        lblResultadoProfessor = new javax.swing.JLabel();
        lblResultadoDataShow = new javax.swing.JLabel();
        lblResultadoAr = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonRetirada = new javax.swing.JButton();
        jButtonStatus = new javax.swing.JButton();
        jButtonRegistroSala = new javax.swing.JButton();
        jButtonRegistroMaterial = new javax.swing.JButton();
        jButtonRegistroDocente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRetirar.setBackground(new java.awt.Color(243, 124, 60));
        btnRetirar.setForeground(new java.awt.Color(0, 0, 0));
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 650, 90, 27));

        lblBloco.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblBloco.setForeground(new java.awt.Color(0, 102, 51));
        lblBloco.setText("Bloco");
        getContentPane().add(lblBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        lblSala.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblSala.setForeground(new java.awt.Color(0, 102, 51));
        lblSala.setText("Sala");
        getContentPane().add(lblSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        lblProfessor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblProfessor.setForeground(new java.awt.Color(0, 102, 51));
        lblProfessor.setText("Professor");
        lblProfessor.setToolTipText("");
        getContentPane().add(lblProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        lblDataShow.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblDataShow.setForeground(new java.awt.Color(0, 102, 51));
        lblDataShow.setText("DataShow");
        getContentPane().add(lblDataShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        lblAr.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblAr.setForeground(new java.awt.Color(0, 102, 51));
        lblAr.setText("Ar");
        getContentPane().add(lblAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 60, -1));

        cbBloco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cbBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(cbBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 220, 40));

        cbSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(cbSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 220, 40));

        cbProfessor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(cbProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 220, 40));

        cbDataShow.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(cbDataShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 240, 220, 40));

        cbAr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(cbAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 320, 220, 40));

        lblbloco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblbloco.setForeground(new java.awt.Color(0, 0, 0));
        lblbloco.setText("Bloco:");
        getContentPane().add(lblbloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        lblsala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblsala.setForeground(new java.awt.Color(0, 0, 0));
        lblsala.setText("Sala:");
        getContentPane().add(lblsala, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, -1, -1));

        lblProf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblProf.setForeground(new java.awt.Color(0, 0, 0));
        lblProf.setText("Professor:");
        getContentPane().add(lblProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        lbldatashow.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbldatashow.setForeground(new java.awt.Color(0, 0, 0));
        lbldatashow.setText("DataShow:");
        getContentPane().add(lbldatashow, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        lblar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblar.setForeground(new java.awt.Color(0, 0, 0));
        lblar.setText("Ar:");
        getContentPane().add(lblar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));

        lblResultadoBloco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblResultadoBloco.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblResultadoBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 50, 20));

        lblResultadoSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblResultadoSala.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblResultadoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 80, 20));

        lblResultadoProfessor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblResultadoProfessor.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblResultadoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 250, 20));

        lblResultadoDataShow.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblResultadoDataShow.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblResultadoDataShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 80, 20));

        lblResultadoAr.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblResultadoAr.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblResultadoAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, 110, 20));

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
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 260, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaRetirada.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

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
        ProfessorView cadastroProfessor = new ProfessorView();
        cadastroProfessor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonRegistroDocenteActionPerformed

    //Botão para Sair do AutoSign
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente sair do AutoSign?", "Confirmação",JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void carregarDadosIniciais() {
        carregarBlocos();
        carregarProfessores();
        carregarMarcasMateriais();
    }

    private void carregarBlocos() {
        try {
            BlocoDAO blocoDAO = new BlocoDAO();
            List<String> blocos = blocoDAO.listarBlocos();
            // Usar DefaultComboBoxModel para carregar os itens de forma segura
            cbBloco.setModel(new DefaultComboBoxModel<>(blocos.toArray(new String[0])));
            // Após carregar os blocos, carrega as salas do primeiro bloco selecionado (se houver)
            if (!blocos.isEmpty()) {
                carregarSalasDoBlocoSelecionado();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar blocos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void carregarSalasDoBlocoSelecionado() {
        if (cbBloco.getSelectedItem() == null) return;
        
        String blocoSelecionado = cbBloco.getSelectedItem().toString();
        SalaDAO salaDAO = new SalaDAO();
        List<Integer> salas = salaDAO.listarSalasPorBloco(blocoSelecionado);
        // Converte a lista de Integer para String para popular o ComboBox
        List<String> salasStr = new java.util.ArrayList<>();
        for (Integer salaNum : salas) {
            salasStr.add(String.valueOf(salaNum));
        }
        cbSala.setModel(new DefaultComboBoxModel<>(salasStr.toArray(new String[0])));
    }
  
    private void carregarMarcasMateriais() {
        MaterialDAO materialDAO = new MaterialDAO();
        // Carregar Ar Condicionado
        List<String> marcasAr = materialDAO.listarMarcasPorTipo("Ar Condicionado");
        cbAr.setModel(new DefaultComboBoxModel<>(marcasAr.toArray(new String[0])));
        // Carregar DataShow
        List<String> marcasDs = materialDAO.listarMarcasPorTipo("DataShow");
        cbDataShow.setModel(new DefaultComboBoxModel<>(marcasDs.toArray(new String[0])));
    }

    private void carregarProfessores() {
        // Esta é uma maneira de listar os professores. O ideal seria ter um método no ProfessorDAO.
        // Por simplicidade, mantemos a lógica aqui, mas com tratamento de erro.
        try {
            // Supondo que exista um método listarNomesProfessores em ProfessorDAO
            ProfessorDAO professorDao = new ProfessorDAO();
            List<String> professores = professorDao.listarNomesProfessores(); // Método hipotético, mas ideal
            cbProfessor.setModel(new DefaultComboBoxModel<>(professores.toArray(new String[0])));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar professores: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    
    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // 1. Validação dos campos de seleção
        if (cbBloco.getSelectedItem() == null || cbSala.getSelectedItem() == null || cbProfessor.getSelectedItem() == null || cbAr.getSelectedItem() == null || cbDataShow.getSelectedItem() == null ||
            cbBloco.getSelectedItem().toString().trim().isEmpty() ||
            cbSala.getSelectedItem().toString().trim().isEmpty() ||
            cbProfessor.getSelectedItem().toString().trim().isEmpty() ||
            cbAr.getSelectedItem().toString().trim().isEmpty() ||
            cbDataShow.getSelectedItem().toString().trim().isEmpty()) {
            
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser selecionados.", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            // 2. Recuperar os valores selecionados
            String bloco = cbBloco.getSelectedItem().toString();
            String salaStr = cbSala.getSelectedItem().toString();
            String professorNome = cbProfessor.getSelectedItem().toString();
            String marcaAr = cbAr.getSelectedItem().toString();
            String marcaDs = cbDataShow.getSelectedItem().toString();

            // 3. Instanciar os DAOs necessários
            SalaDAO salaDao = new SalaDAO();
            ProfessorDAO professorDao = new ProfessorDAO();
            MaterialDAO materialDao = new MaterialDAO();

            // 4. Buscar os IDs correspondentes no banco de dados
            int idSala = salaDao.buscarIdSala(bloco, Integer.parseInt(salaStr));
            int idProfessor = professorDao.buscarIdPorNome(professorNome);
            int idMaterialAr = materialDao.buscarIdMaterial("Ar Condicionado", marcaAr);
            int idMaterialDataShow = materialDao.buscarIdMaterial("DataShow", marcaDs);

            // 5. Verificar se todos os IDs foram encontrados
            if (idSala == -1 || idProfessor == -1 || idMaterialAr == -1 || idMaterialDataShow == -1) {
                JOptionPane.showMessageDialog(this, "Não foi possível encontrar todos os dados (Sala, Professor ou Materiais). Verifique os cadastros.", "Erro de Dados", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // 6. Chamar o DAO correto para registrar a retirada completa
            RetiradaDAO retiradaDao = new RetiradaDAO();
            boolean sucesso = retiradaDao.registrarRetiradaCompleta(idProfessor, idSala, idMaterialAr, idMaterialDataShow);

            // 7. Exibir resultado para o usuário
            if (sucesso) {
                lblResultadoBloco.setText(bloco);
                lblResultadoSala.setText(salaStr);
                lblResultadoProfessor.setText(professorNome);
                lblResultadoDataShow.setText(marcaDs);
                lblResultadoAr.setText(marcaAr); // Exibe a marca do ar no label correspondente
                JOptionPane.showMessageDialog(this, "Retirada registrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao registrar a retirada.", "Erro de Registro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O número da sala é inválido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro Crítico", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

                                        

    private void cbBlocoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        carregarSalasDoBlocoSelecionado();
    }                                       
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(() -> {
            new RetiradaView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetirar;
    private javax.swing.JComboBox<String> cbAr;
    private javax.swing.JComboBox<String> cbBloco;
    private javax.swing.JComboBox<String> cbDataShow;
    private javax.swing.JComboBox<String> cbProfessor;
    private javax.swing.JComboBox<String> cbSala;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRegistroDocente;
    private javax.swing.JButton jButtonRegistroMaterial;
    private javax.swing.JButton jButtonRegistroSala;
    private javax.swing.JButton jButtonRetirada;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel lblAr;
    private javax.swing.JLabel lblBloco;
    private javax.swing.JLabel lblDataShow;
    private javax.swing.JLabel lblProf;
    private javax.swing.JLabel lblProfessor;
    private javax.swing.JLabel lblResultadoAr;
    private javax.swing.JLabel lblResultadoBloco;
    private javax.swing.JLabel lblResultadoDataShow;
    private javax.swing.JLabel lblResultadoProfessor;
    private javax.swing.JLabel lblResultadoSala;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblar;
    private javax.swing.JLabel lblbloco;
    private javax.swing.JLabel lbldatashow;
    private javax.swing.JLabel lblsala;
    // End of variables declaration//GEN-END:variables
}
