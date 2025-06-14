package view;

import dao.DevolucaoDAO;
import dao.RetiradaDAO;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.RetiradaModel;
import javax.swing.JButton; // Importar JButton
import javax.swing.table.TableCellRenderer; // Importar TableCellRenderer
import java.awt.Component; // Importar Component
import javax.swing.JTable; // Importar JTable
import javax.swing.event.TableModelEvent; // Importar TableModelEvent
import javax.swing.event.TableModelListener; // Importar TableModelListener

public class StatusView extends javax.swing.JFrame {


    public StatusView() {
        initComponents(); // Esta linha inicializa todos os componentes da UI
        carregarRetiradasNaTabela(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogo = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonRetirada = new javax.swing.JButton();
        jButtonStatus = new javax.swing.JButton();
        jButtonRegistroSala = new javax.swing.JButton();
        jButtonRegistroMaterial = new javax.swing.JButton();
        jButtonRegistroDocente = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LogoUniceplac.png"))); // NOI18N
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 260, 210));

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

        jTable1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Bloco", "Sala", "Professor", "DataShow", "Ar Condicionado", "Data/Hora Retirada", "Ação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 830, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaBase.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 710));

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

    
    // Métodos para carregar dados e manipular a tabela
    private void carregarRetiradasNaTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpa a tabela antes de carregar novos dados

        try {
            RetiradaDAO retiradaDAO = new RetiradaDAO();
            List<RetiradaModel> retiradas = retiradaDAO.listarRetiradasComDetalhes();

            for (RetiradaModel retirada : retiradas) {
                model.addRow(new Object[]{
                    retirada.getId(),
                    retirada.getNomeBloco(), // Verifique se este getter existe na RetiradaModel e se a query no DAO retorna o nome do bloco.
                    retirada.getNumeroSala(),
                    retirada.getNomeProfessor(),
                    retirada.getMarcaMaterialDataShow(), // <-- CORRIGIDO AQUI!
                    retirada.getMarcaMaterialAr(),       // <-- E AQUI!
                    retirada.getDataHora(),
                    "Devolver"
                });
            }

            // Configura o renderizador e editor de célula para a coluna "Ação"
            jTable1.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
            jTable1.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JButton("Devolver")));

            // Adiciona um listener para o modelo da tabela para capturar eventos de edição
            model.addTableModelListener(new TableModelListener() {
                @Override
                public void tableChanged(TableModelEvent e) {
                    if (e.getType() == TableModelEvent.UPDATE) {
                        int row = e.getFirstRow();
                        int column = e.getColumn();
                        if (column == 7) { // Se a coluna "Ação" foi atualizada (botão clicado)
                            int idRetirada = (int) jTable1.getValueAt(row, 0);
                            confirmarDevolucao(idRetirada);
                        }
                    }
                }
            });

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar retiradas: " + e.getMessage(), "Erro de Banco de Dados", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void confirmarDevolucao(int idRetirada) {
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        int confirm = JOptionPane.showConfirmDialog(this, "Deseja realmente registrar a devolução desta retirada?", "Confirmar Devolução", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                DevolucaoDAO devolucaoDAO = new DevolucaoDAO();
                boolean sucesso = devolucaoDAO.registrarDevolucao(idRetirada);

                if (sucesso) {
                    JOptionPane.showMessageDialog(this, "Devolução registrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    carregarRetiradasNaTabela(); // Atualiza a tabela para remover a retirada que foi devolvida
                } else {
                    JOptionPane.showMessageDialog(this, "Falha ao registrar a devolução.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro de banco de dados ao registrar devolução: " + e.getMessage(), "Erro SQL", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    // Classe para renderizar o botão na célula da tabela
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value != null) ? value.toString() : "");
            return this;
        }
    }

    // Classe para editar a célula da tabela (ou seja, lidar com o clique do botão)
    class ButtonEditor extends javax.swing.DefaultCellEditor {
        private JButton button;
        private String label;
        private boolean isPushed;
        private int row;

        public ButtonEditor(JButton button) {
            super(new javax.swing.JTextField());
            this.button = button;
            this.button.setOpaque(true);
            this.button.addActionListener(e -> fireEditingStopped());
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(UIManager.getColor("Button.background"));
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            this.row = row;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                // Notifica a tabela que o botão foi clicado
            }
            isPushed = false;
            return label;
        }

        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
        }

        @Override
        protected void fireEditingStopped() {
            super.fireEditingStopped();
            if (row != -1) {
                // Aciona a lógica de devolução aqui, usando o ID da retirada
                // O evento do TableModelListener já cuida disso, então aqui podemos apenas parar a edição
            }
        }
    }



    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatusView().setVisible(true);
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
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
