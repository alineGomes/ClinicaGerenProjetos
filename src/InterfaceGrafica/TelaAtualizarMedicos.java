/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import br.upe.poo.clinica.entidades.Medicos;
import br.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioAtualizarMedicos;
import br.upe.poo.clinica.regraNegocio.ExceptionRegraNegocioBuscarMedicos;
import br.upe.poo.clinica.regraNegocio.Fachada;
import br.upe.poo.clinica.regraNegocio.FachadaImplementa;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class TelaAtualizarMedicos extends javax.swing.JFrame {
      
       private Medicos medico;
       private String especialidade;
     
    public TelaAtualizarMedicos() {
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
        cpfText = new javax.swing.JTextField();
        filtrarBotao = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        enderecoText = new javax.swing.JTextField();
        telefoneText = new javax.swing.JTextField();
        salvarText = new javax.swing.JButton();
        sairBotao = new javax.swing.JButton();
        limparBotao = new javax.swing.JButton();
        especialidadeText = new javax.swing.JComboBox<>();
        crmLabel = new javax.swing.JLabel();
        crmTexto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Atualizar medico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel2.setText("Digite cpf");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, 30));
        getContentPane().add(cpfText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        filtrarBotao.setText("Filtrar");
        filtrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, 20));

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("endereco");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("telefone");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel6.setText("especialidade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        getContentPane().add(nomeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 270, -1));
        getContentPane().add(enderecoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 270, -1));
        getContentPane().add(telefoneText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 90, -1));

        salvarText.setText("salvar");
        salvarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarTextActionPerformed(evt);
            }
        });
        getContentPane().add(salvarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        sairBotao.setText("sair");
        sairBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(sairBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 70, -1));

        limparBotao.setText("limpar textos");
        getContentPane().add(limparBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, -1));

        especialidadeText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cardiologista", "pediatra", "otopedista" }));
        especialidadeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidadeTextActionPerformed(evt);
            }
        });
        getContentPane().add(especialidadeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        crmLabel.setText("crm");
        getContentPane().add(crmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        crmTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crmTextoActionPerformed(evt);
            }
        });
        getContentPane().add(crmTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crmTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crmTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crmTextoActionPerformed

    private void sairBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairBotaoActionPerformed
                dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_sairBotaoActionPerformed

    private void salvarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarTextActionPerformed
        Long crm = new Long(10);
        crm = Long.parseLong(crmTexto.getText());
        Fachada fachada = new FachadaImplementa();
         this.medico.setNome(nomeText.getText());
         this.medico.setCrm(crm);
         this.medico.setEndereco(enderecoText.getText());
         this.medico.setTelefone(telefoneText.getText());
         this.medico.setEspecialidade(this.especialidade);
           try {
               fachada.atualizarMedico(this.medico);
           } catch (ExceptionRegraNegocioAtualizarMedicos ex) {
               Logger.getLogger(TelaAtualizarMedicos.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_salvarTextActionPerformed

    private void filtrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarBotaoActionPerformed
       this.medico = new Medicos();
       Long cpf = new Long(11);
       cpf = Long.parseLong(cpfText.getText());
       Fachada fachada = new FachadaImplementa();
           try {
               this.medico = fachada.buscarMedicoCpf(cpf);
           } catch (ExceptionRegraNegocioBuscarMedicos ex) {
               Logger.getLogger(TelaAtualizarMedicos.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_filtrarBotaoActionPerformed

    private void especialidadeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidadeTextActionPerformed
       this.especialidade = new String();
        
         if(especialidadeText.getSelectedIndex()==0) {
             this.especialidade = "cardiologista";
         }
         else if(especialidadeText.getSelectedIndex()==1) {
             this.especialidade = "pediatra";
         }
         else if(especialidadeText.getSelectedIndex()==2) {
             this.especialidade = "ortopedista";
         }
     
       
    }//GEN-LAST:event_especialidadeTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfText;
    private javax.swing.JLabel crmLabel;
    private javax.swing.JTextField crmTexto;
    private javax.swing.JTextField enderecoText;
    private javax.swing.JComboBox<String> especialidadeText;
    private javax.swing.JButton filtrarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparBotao;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton sairBotao;
    private javax.swing.JButton salvarText;
    private javax.swing.JTextField telefoneText;
    // End of variables declaration//GEN-END:variables
}
