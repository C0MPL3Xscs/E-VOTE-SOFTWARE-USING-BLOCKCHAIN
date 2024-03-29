/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package E_Vote.GUI;

import E_Vote.Classes.Eleicao;
import E_Vote.Classes.Eleitores;
import E_Vote.Classes.Voto;
import distributedMiner.RemoteInterface;
import distributedMiner.blockchain.Block;
import java.awt.Color;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.GuiUtils;
import utils.RMI;
import utils.Serializer;

/**
 *
 * @author Samuel Sampaio
 */
public class Admin extends javax.swing.JFrame {

    Eleicao eleição;
    Eleitores eleitor;
    RemoteInterface remote;
    boolean isConnected;

    /**
     * Creates new form Main
     */
    public Admin(Eleitores eleitor, Eleicao eleicao, RemoteInterface remote) {
        initComponents();
        this.remote = remote;
        this.eleitor = eleitor;
        eleição = new Eleicao(true);
        this.setLocationRelativeTo(this);
        this.eleição = eleicao;
    }

    public Admin(Eleitores eleitor, Eleicao eleicao, String adress, RemoteInterface remote) {
        initComponents();
        this.remote = remote;
        this.eleitor = eleitor;
        this.setLocationRelativeTo(this);
        this.eleição = eleicao;
        Main.setSelectedComponent(Conectar);
        txtAdress.setText(adress);
        btConnectActionPerformed(null);
    }

    private Admin() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JTabbedPane();
        AdminJpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ResultadosPn = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Results = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        candidatoTxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        menssagem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Conectar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextPane();
        txtAdress = new javax.swing.JTextField();
        btConnect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Results.setColumns(20);
        Results.setRows(5);
        Results.setText("Finalize a eleição para ver os resultados");
        jScrollPane2.setViewportView(Results);

        jLabel1.setText("Resultados");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/end.png"))); // NOI18N
        jButton2.setText("Finalizar Eleição");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ResultadosPnLayout = new javax.swing.GroupLayout(ResultadosPn);
        ResultadosPn.setLayout(ResultadosPnLayout);
        ResultadosPnLayout.setHorizontalGroup(
            ResultadosPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ResultadosPnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResultadosPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
                    .addGroup(ResultadosPnLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ResultadosPnLayout.setVerticalGroup(
            ResultadosPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultadosPnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel2.setText("Adicionar Candidato");

        candidatoTxt.setText("Candidato");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton4.setText("ADICIONAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        jButton1.setText("Salvar e sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menssagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(candidatoTxt)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(454, 454, 454)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(candidatoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menssagem, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ResultadosPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(ResultadosPn, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout AdminJpanelLayout = new javax.swing.GroupLayout(AdminJpanel);
        AdminJpanel.setLayout(AdminJpanelLayout);
        AdminJpanelLayout.setHorizontalGroup(
            AdminJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AdminJpanelLayout.setVerticalGroup(
            AdminJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Main.addTab("Admin", AdminJpanel);

        jLabel7.setText("Address");

        jScrollPane3.setPreferredSize(new java.awt.Dimension(64, 200));

        txtLog.setEditable(false);
        txtLog.setBackground(new java.awt.Color(0, 0, 0));
        txtLog.setBorder(null);
        txtLog.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(txtLog);

        txtAdress.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        txtAdress.setText("//localhost:10010/RemoteMiner");
        txtAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdressActionPerformed(evt);
            }
        });

        btConnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Connect_to_Server.png"))); // NOI18N
        btConnect.setText("Connect to Server");
        btConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConectarLayout = new javax.swing.GroupLayout(Conectar);
        Conectar.setLayout(ConectarLayout);
        ConectarLayout.setHorizontalGroup(
            ConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConectarLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 334, Short.MAX_VALUE))
                    .addComponent(txtAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ConectarLayout.setVerticalGroup(
            ConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConectarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConnect)
                    .addGroup(ConectarLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
        );

        Main.addTab("Conexão", Conectar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (remote.getElection().getListaNames().contains(candidatoTxt.getText())) {
                menssagem.setText("Candidato já existe");
                return;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            remote.addCandidate(candidatoTxt.getText());
            menssagem.setText("Sucesso");
        } catch (Exception e) {
            menssagem.setText("Erro");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConnectActionPerformed
        try {
            this.remote = (RemoteInterface) RMI.getRemote(txtAdress.getText());
            setTitle(txtAdress.getText());
            onMessage("Connected to ", txtAdress.getText());
            Main.setSelectedComponent(AdminJpanel);
            isConnected = true;
        } catch (Exception e) {
            onException("Connect to server", e);
        }
    }//GEN-LAST:event_btConnectActionPerformed

    private void txtAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Main m = new Main(this.eleitor, this.eleição, txtAdress.getText(), this.remote);
            m.setVisible(true);
            this.setVisible(false);
        } catch (RemoteException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            remote.IsOver(true);
            Results.setText(getResults());
        } catch (RemoteException ex) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private String getResults() throws RemoteException {
        String results = "";

        // Map to store the count of votes for each candidate
        Map<String, Integer> candidateCounts = new HashMap<>();

        for (int i = 0; i < remote.getBlockchainSize(); i++) {
            Block b = remote.getBlockchain().getChain().get(i);
            // Skip the "First Block"
            if (b.getData().equals("First Block")) {
                continue;
            }

            List<String> lst = (List<String>) Serializer.base64ToObject(b.getData());
            StringBuilder txt = new StringBuilder();

            // Iterating through transactions
            for (String string : lst) {
                // Convert transactions to Voto
                Voto v = (Voto) Serializer.base64ToObject(string);

                // Add candidate to the StringBuilder
                txt.append(v.getCandidate()).append("\n");

                // Update count in the map
                String candidateName = v.getCandidate();
                candidateCounts.put(candidateName, candidateCounts.getOrDefault(candidateName, 0) + 1);
            }

            results += txt;
        }

        // Generating the counts string
        StringBuilder counts = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidateCounts.entrySet()) {
            String candidateName = entry.getKey();
            int voteCount = entry.getValue();
            counts.append(candidateName).append(" Recebeu ").append(voteCount).append(" Votos.\n \n");
        }

        return "NUMERO DE VOTOS:\n" + counts.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    public void onException(String title, Exception ex) {
        GuiUtils.addText(txtLog, title, ex.getMessage(), Color.RED, Color.MAGENTA);
        JOptionPane.showMessageDialog(this, ex.getMessage(),
                title, JOptionPane.ERROR_MESSAGE);
        Logger.getAnonymousLogger().log(Level.SEVERE, null, ex);
    }

    public void onMessage(String title, String msg) {
        GuiUtils.addText(txtLog, title, msg, Color.GREEN, Color.WHITE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminJpanel;
    private javax.swing.JPanel Conectar;
    private javax.swing.JTabbedPane Main;
    private javax.swing.JPanel ResultadosPn;
    private javax.swing.JTextArea Results;
    private javax.swing.JButton btConnect;
    private javax.swing.JTextField candidatoTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel menssagem;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextPane txtLog;
    // End of variables declaration//GEN-END:variables
}
