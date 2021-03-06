/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

/**
 *
 * @author manoel
 */
public class TelaPrincipalMedicos extends javax.swing.JFrame {
   
     private TelaCadastrarMedicos cadastarMedicos;
     private TelaExcluirMedicos excluirMedicos;
     private TelaAtualizarMedicos atualizarMedicos;
     private TelaFiltrarMedicos filtrarMedicos;
     
    public TelaPrincipalMedicos() {
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
        cadastrarBotao = new javax.swing.JButton();
        filtrarBotao = new javax.swing.JButton();
        atualizarBotao = new javax.swing.JButton();
        excluirBotao = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setText("Tela Medicos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel1)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        cadastrarBotao.setText("Cadastrar");
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        filtrarBotao.setText("Filtrar");
        filtrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        atualizarBotao.setText("Atualizar");
        atualizarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        excluirBotao.setText("Excluir");
        excluirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(excluirBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));

        sairBotao.setText("Sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 253, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBotaoActionPerformed
        this.atualizarMedicos = new TelaAtualizarMedicos();
        this.atualizarMedicos.setVisible(true);
    }//GEN-LAST:event_atualizarBotaoActionPerformed

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
       this.cadastarMedicos = new TelaCadastrarMedicos();
       this.cadastarMedicos.setVisible(true);
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void filtrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarBotaoActionPerformed
        this.filtrarMedicos = new TelaFiltrarMedicos();
        this.filtrarMedicos.setVisible(true);
    }//GEN-LAST:event_filtrarBotaoActionPerformed

    private void excluirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBotaoActionPerformed
        this.excluirMedicos = new TelaExcluirMedicos();
        this.excluirMedicos.setVisible(true);
    }//GEN-LAST:event_excluirBotaoActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_sairBotaoActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBotao;
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JButton excluirBotao;
    private javax.swing.JButton filtrarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sairBotao;
    // End of variables declaration//GEN-END:variables
}
