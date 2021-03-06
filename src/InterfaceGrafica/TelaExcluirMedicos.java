/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import br.upe.poo.clinica.entidades.Medicos;
import br.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioBuscarMedicos;
import br.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioDeletarMedicos;
import br.upe.poo.clinica.regraNegocio.Fachada;
import br.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaExcluirMedicos extends javax.swing.JFrame {
    
       private Medicos medico;
     
    public TelaExcluirMedicos() {
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
        cpfLabel = new javax.swing.JLabel();
        cpfTExt = new javax.swing.JTextField();
        excluirBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tela Excluir Medico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        cpfLabel.setText("Digite cpf");
        getContentPane().add(cpfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        getContentPane().add(cpfTExt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 110, -1));

        excluirBotao.setText("Excluir");
        excluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(excluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        sairBotao.setText("sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
             dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_sairBotaoActionPerformed

    private void excluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBotaoActionPerformed
        
        Long cpf = Long.parseLong(cpfTExt.getText());
          Fachada fachada = new FachadaImplementa();
           
           try {
               this.medico = fachada.buscarMedicoCpf(cpf);
           } catch (ExceptionRegraNegocioBuscarMedicos ex) {
               Logger.getLogger(TelaExcluirMedicos.class.getName()).log(Level.SEVERE, null, ex);
           }
           try {
               fachada.deletarMedico(this.medico);
           } catch (ExceptionRegraNegocioDeletarMedicos ex) {
               Logger.getLogger(TelaExcluirMedicos.class.getName()).log(Level.SEVERE, null, ex);
           }
           
    }//GEN-LAST:event_excluirBotaoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTExt;
    private javax.swing.JButton excluirBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sairBotao;
    // End of variables declaration//GEN-END:variables
}
