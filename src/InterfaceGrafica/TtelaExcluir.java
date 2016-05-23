/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import br.upe.poo.clinica.entidades.Pacientes;
import br.upe.poo.clinica.persistencia.InterfaceRepositorioPacientes;
import br.upe.poo.clinica.persistencia.RepositorioPacientes;
import br.upe.poo.clinica.regraNegocio.Fachada;
import br.upe.poo.clinica.regraNegocio.FachadaImplementa;
import br.upe.poo.clinica.regraNegocio.RegraNegocioDeletarPacientesException;
import br.upe.poo.clinica.regraNegocio.RegraNegocioPacienteBuscarPacienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TtelaExcluir extends javax.swing.JFrame {

    /**
     * Creates new form TtelaExcluir
     */
    public TtelaExcluir() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextExcluir = new javax.swing.JTextField();
        ExcluirButton = new javax.swing.JButton();
        sairB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tela excluir");

        jLabel2.setText("digite cpf");

        TextExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextExcluirActionPerformed(evt);
            }
        });

        ExcluirButton.setText("Excluir");
        ExcluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirButtonActionPerformed(evt);
            }
        });

        sairB.setText("Sair");
        sairB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(TextExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sairB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExcluirButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(ExcluirButton)
                .addGap(28, 28, 28)
                .addComponent(sairB)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextExcluirActionPerformed
        
    }//GEN-LAST:event_TextExcluirActionPerformed

    private void ExcluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirButtonActionPerformed
       Long cpf = Long.parseLong(TextExcluir.getText());
        try {
            Fachada rp = new FachadaImplementa();
            Pacientes paciente = rp.buscarPacienteCpf(cpf);
            try {
                rp.deletarPaciente(paciente);// TODO add your handling code here:
            } catch (RegraNegocioDeletarPacientesException ex) {
                Logger.getLogger(TtelaExcluir.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (RegraNegocioPacienteBuscarPacienteException ex) {
            Logger.getLogger(TtelaExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExcluirButtonActionPerformed

    private void sairBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBActionPerformed
         dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_sairBActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExcluirButton;
    private javax.swing.JTextField TextExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sairB;
    // End of variables declaration//GEN-END:variables
}
