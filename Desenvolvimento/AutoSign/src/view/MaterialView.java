package view;

import dao.BlocoDAO;
import dao.MaterialDAO;
import dao.SalaDAO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public final class MaterialView extends javax.swing.JFrame {


    public MaterialView() {
        initComponents();
        carregarBlocos();
        carregarMarcasMateriais();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jComboBoxBloco = new javax.swing.JComboBox<>();
        jComboBoxSala = new javax.swing.JComboBox<>();
        jComboBoxArCondicionado = new javax.swing.JComboBox<>();
        jComboBoxDataShow = new javax.swing.JComboBox<>();
        jButtonRegistrarMaterial = new javax.swing.JButton();
        jButtonInicio = new javax.swing.JButton();
        jButtonRetirada = new javax.swing.JButton();
        jButtonStatus = new javax.swing.JButton();
        jButtonRegistroSala = new javax.swing.JButton();
        jButtonRegistroMaterial = new javax.swing.JButton();
        jButtonRegistroDocente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabeliconBloco = new javax.swing.JLabel();
        jLabelNomeBloco = new javax.swing.JLabel();
        jLabeliconSala = new javax.swing.JLabel();
        jLabelNomeSala = new javax.swing.JLabel();
        jLabeliconAr = new javax.swing.JLabel();
        jLabelNomeAr = new javax.swing.JLabel();
        jLabeliconDataShow = new javax.swing.JLabel();
        jLabelNomeDataShow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUniceplac.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 260, 210));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(4, 116, 76));
        jLabelTitulo.setText("Registro de Materiais");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 500, 60));

        jComboBoxBloco.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxBloco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 290, 40));

        jComboBoxSala.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 290, 40));

        jComboBoxArCondicionado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxArCondicionado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxArCondicionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 290, 40));

        jComboBoxDataShow.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxDataShow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxDataShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 290, 40));

        jButtonRegistrarMaterial.setBackground(new java.awt.Color(243, 124, 60));
        jButtonRegistrarMaterial.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistrarMaterial.setText("Registrar");
        jButtonRegistrarMaterial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarMaterialActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 110, 40));

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

        jLabeliconBloco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconBloco.PNG"))); // NOI18N
        getContentPane().add(jLabeliconBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 50, 50));

        jLabelNomeBloco.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeBloco.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeBloco.setText("Bloco");
        getContentPane().add(jLabelNomeBloco, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        jLabeliconSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconSala.PNG"))); // NOI18N
        getContentPane().add(jLabeliconSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 50, 50));

        jLabelNomeSala.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeSala.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeSala.setText("Sala");
        getContentPane().add(jLabelNomeSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        jLabeliconAr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconArCondicionado.PNG"))); // NOI18N
        getContentPane().add(jLabeliconAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 50, 40));

        jLabelNomeAr.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeAr.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeAr.setText("Ar Condicionado");
        getContentPane().add(jLabelNomeAr, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, -1, -1));

        jLabeliconDataShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/iconDataShow.PNG"))); // NOI18N
        getContentPane().add(jLabeliconDataShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 50, 40));

        jLabelNomeDataShow.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelNomeDataShow.setForeground(new java.awt.Color(4, 116, 76));
        jLabelNomeDataShow.setText("Data Show");
        getContentPane().add(jLabelNomeDataShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBase.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        InicialView telaInicial = new InicialView();
        telaInicial.setVisible(true);
        this.setVisible(false);
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

    private void jComboBoxBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBlocoActionPerformed
        jComboBoxBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarSalasDoBlocoSelecionado(); // ← chamada ao novo método
            }
        });
    }//GEN-LAST:event_jComboBoxBlocoActionPerformed

    private void jComboBoxSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSalaActionPerformed

    private void jButtonRegistrarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarMaterialActionPerformed
        try {
            String bloco = jComboBoxBloco.getSelectedItem().toString();
            String salaStr = jComboBoxSala.getSelectedItem().toString();
            String marcaAr = jComboBoxArCondicionado.getSelectedItem().toString();
            String marcaDs = jComboBoxDataShow.getSelectedItem().toString();

            int numeroSala = Integer.parseInt(salaStr);

            SalaDAO salaDao = new SalaDAO();
            int idSala = salaDao.buscarIdSala(bloco, numeroSala);

            if (idSala == -1) {
                JOptionPane.showMessageDialog(rootPane, "Sala não encontrada!");
                return;
            }

            MaterialDAO materialDao = new MaterialDAO();
            boolean sucesso = materialDao.registrarMaterial(idSala, marcaAr, marcaDs);

            if (sucesso) {
                JOptionPane.showMessageDialog(rootPane, "Materiais registrados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao registrar materiais.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonRegistrarMaterialActionPerformed

    //Metodo para carregar sala atraves dos blocos
    public void carregarBlocos() {
    try {
        BlocoDAO blocoDAO = new BlocoDAO();
        jComboBoxBloco.removeAllItems();
        for (String bloco : blocoDAO.listarBlocos()) {
            jComboBoxBloco.addItem(bloco);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar blocos: " + e.getMessage());
    }
}
    
    //Metodo para carregar as salas ao selecionar o bloco
    public void carregarSalasDoBlocoSelecionado() {
    try {
        String blocoSelecionado = (String) jComboBoxBloco.getSelectedItem();
        if (blocoSelecionado != null && !blocoSelecionado.isEmpty()) {
            SalaDAO salaDAO = new SalaDAO();
            jComboBoxSala.removeAllItems();
            for (Integer numeroSala : salaDAO.listarSalasPorBloco(blocoSelecionado)) {
                jComboBoxSala.addItem(String.valueOf(numeroSala));
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar salas: " + e.getMessage());
    }
}
  
    //Metodo para carregar os materiais
    public void carregarMarcasMateriais() {
    try {
        dao.MaterialDAO materialDAO = new dao.MaterialDAO();

        // Limpar os combobox
        jComboBoxArCondicionado.removeAllItems();
        jComboBoxDataShow.removeAllItems();

        // Carregar Ar Condicionado
        for (String marcaAr : materialDAO.listarMarcasPorTipo("Ar Condicionado")) {
            jComboBoxArCondicionado.addItem(marcaAr);
        }

        // Carregar DataShow
        for (String marcaDs : materialDAO.listarMarcasPorTipo("DataShow")) {
            jComboBoxDataShow.addItem(marcaDs);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao carregar marcas: " + e.getMessage());
    }
}
    
    //Getters e Setters
    public JComboBox<String> getjComboBoxArCondicionado() {
        return jComboBoxArCondicionado;
    }

    public void setjComboBoxArCondicionado(JComboBox<String> jComboBoxArCondicionado) {
        this.jComboBoxArCondicionado = jComboBoxArCondicionado;
    }

    public JComboBox<String> getjComboBoxBloco() {
        return jComboBoxBloco;
    }

    public void setjComboBoxBloco(JComboBox<String> jComboBoxBloco) {
        this.jComboBoxBloco = jComboBoxBloco;
    }

    public JComboBox<String> getjComboBoxDataShow() {
        return jComboBoxDataShow;
    }

    public void setjComboBoxDataShow(JComboBox<String> jComboBoxDataShow) {
        this.jComboBoxDataShow = jComboBoxDataShow;
    }

    public JComboBox<String> getjComboBoxSala() {
        return jComboBoxSala;
    }

    public void setjComboBoxSala(JComboBox<String> jComboBoxSala) {
        this.jComboBoxSala = jComboBoxSala;
    }
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaterialView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonRegistrarMaterial;
    private javax.swing.JButton jButtonRegistroDocente;
    private javax.swing.JButton jButtonRegistroMaterial;
    private javax.swing.JButton jButtonRegistroSala;
    private javax.swing.JButton jButtonRetirada;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonStatus;
    private javax.swing.JComboBox<String> jComboBoxArCondicionado;
    private javax.swing.JComboBox<String> jComboBoxBloco;
    private javax.swing.JComboBox<String> jComboBoxDataShow;
    private javax.swing.JComboBox<String> jComboBoxSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNomeAr;
    private javax.swing.JLabel jLabelNomeBloco;
    private javax.swing.JLabel jLabelNomeDataShow;
    private javax.swing.JLabel jLabelNomeSala;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabeliconAr;
    private javax.swing.JLabel jLabeliconBloco;
    private javax.swing.JLabel jLabeliconDataShow;
    private javax.swing.JLabel jLabeliconSala;
    // End of variables declaration//GEN-END:variables
}
