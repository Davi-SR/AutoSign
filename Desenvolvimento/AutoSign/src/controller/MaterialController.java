package controller;

import dao.MaterialDAO;
import dao.SalaDAO;
import javax.swing.JOptionPane;
import view.MaterialView;

public class MaterialController {
    public void registrarMaterial(MaterialView view) {
        try {
            String bloco = view.getjComboBoxBloco().getSelectedItem().toString();
            String salaStr = view.getjComboBoxSala().getSelectedItem().toString();
            String marcaAr = view.getjComboBoxArCondicionado().getSelectedItem().toString();
            String marcaDs = view.getjComboBoxDataShow().getSelectedItem().toString();
            int numeroSala = Integer.parseInt(salaStr);
            SalaDAO salaDao = new SalaDAO();
            int idSala = salaDao.buscarIdSala(
                bloco,
                numeroSala
            );
            if (idSala == -1) {
                JOptionPane.showMessageDialog(view, "Sala não encontrada!");
                return;
            }
            MaterialDAO materialDao = new MaterialDAO();
            boolean sucesso = materialDao.registrarMaterial(
                idSala,
                marcaAr,
                marcaDs
            );
            if (sucesso) {
                JOptionPane.showMessageDialog(view, "Materiais registrados com sucesso!");
            } else {
                JOptionPane.showMessageDialog(view, "Erro ao registrar materiais.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Erro: " + e.getMessage());
        }
    }
}