/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delfinen.presentation;

import delfinen.logic.ControllerAdmin;
import delfinen.logic.Member;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author sofieamalielandt
 */
public class GUIPayment extends javax.swing.JFrame
{

    private ControllerAdmin c;
    private ArrayList<Member> members;
    private int y;
    private Member fm;

    public GUIPayment()
    {
        initComponents();
        c = new ControllerAdmin();

        int today = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = today; i > 1989; i--)
        {
            String _i = Integer.toString(i);
            this.year.addItem(_i);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        Tmembers = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        sub = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        goback = new javax.swing.JButton();
        newPay = new javax.swing.JButton();
        saved = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Register payment");

        Tmembers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TmembersActionPerformed(evt);
            }
        });

        jLabel2.setText("Member:");

        jLabel3.setText("Total:");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveActionPerformed(evt);
            }
        });

        sub.setText(" ");

        jLabel5.setText("Year:");

        year.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                yearActionPerformed(evt);
            }
        });

        goback.setText("Go back");
        goback.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                gobackActionPerformed(evt);
            }
        });

        newPay.setText("New");
        newPay.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                newPayActionPerformed(evt);
            }
        });

        saved.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tmembers, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(newPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(goback, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saved, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tmembers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sub))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPay)
                    .addComponent(save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goback)
                    .addComponent(saved))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TmembersActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TmembersActionPerformed
    {//GEN-HEADEREND:event_TmembersActionPerformed
        String selected = (String) Tmembers.getSelectedItem();
        
        if (!(selected == null))
        {
            String[] temp = selected.split(" - ");
            String ssn = temp[1];

            fm = c.getMember(ssn);
            this.sub.setText(fm.calculateS() + " kr.");
        }
        
        else this.sub.setText("0 kr.");
    }//GEN-LAST:event_TmembersActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveActionPerformed
    {//GEN-HEADEREND:event_saveActionPerformed
        fm.getYearsPaid().add(y);
        if (y > fm.getLastPayment())
        {
            c.payForCurrentYear(fm, y);
        }
        
        this.saved.setText("Payment is now registered");

    }//GEN-LAST:event_saveActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_gobackActionPerformed
    {//GEN-HEADEREND:event_gobackActionPerformed
        this.setVisible(false);
        new GUICashier().setVisible(true);
    }//GEN-LAST:event_gobackActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_yearActionPerformed
    {//GEN-HEADEREND:event_yearActionPerformed
        Tmembers.removeAllItems();

        String _y = (String) year.getSelectedItem();
        y = Integer.parseInt(_y);

        members = c.seeMembersInArrears(y);

        for (Member m : members)
        {
            if(m.getBirthyear() <= y){
                
                this.Tmembers.addItem(m.getName() + " - " + m.getSsn());
            }
            
        }
    }//GEN-LAST:event_yearActionPerformed

    private void newPayActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_newPayActionPerformed
    {//GEN-HEADEREND:event_newPayActionPerformed
        this.saved.setText(" ");
        this.sub.setText("0 kr.");
        
        Tmembers.removeAllItems();

        String _y = (String) year.getSelectedItem();
        y = Integer.parseInt(_y);

        members = c.seeMembersInArrears(y);

        for (Member m : members)
        {
            if(m.getBirthyear() <= y){
                
                this.Tmembers.addItem(m.getName() + " - " + m.getSsn());
            }
            
        }
    }//GEN-LAST:event_newPayActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(GUIPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(GUIPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(GUIPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(GUIPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Tmembers;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton newPay;
    private javax.swing.JButton save;
    private javax.swing.JLabel saved;
    private javax.swing.JLabel sub;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
