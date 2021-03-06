/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import esper.Engine;
import events.CancelEvent;
import events.PowerSwitch;
import events.SelectCoffee;
import events.SelectSize;
import events.StartOrder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Coffee;
import model.CurrencyController;
import model.Monitor;
import model.VisaDetector;


/**
 *
 * @author Abd El Rahman
 */
public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
     private static final StartPage startpage = new StartPage();
        
        

    private StartPage() {
        initComponents();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }
    
    public static StartPage getStartPageGUI() {
        return startpage;
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
        jLabel4 = new javax.swing.JLabel();
        moneyEntered = new javax.swing.JTextField();
        visaBox = new javax.swing.JCheckBox();
        cashBox = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        InsertMoney = new javax.swing.JButton();
        switchPowerBtn = new javax.swing.JButton();
        Drink = new javax.swing.JSlider();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Cappuccino = new javax.swing.JButton();
        Americano = new javax.swing.JButton();
        Mocha = new javax.swing.JButton();
        Latte = new javax.swing.JButton();
        Macchiato = new javax.swing.JButton();
        Espresso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Sugar = new javax.swing.JSlider();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        small = new javax.swing.JButton();
        medium = new javax.swing.JButton();
        large = new javax.swing.JButton();
        Start = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coffee vending machine");

        jPanel1.setBackground(new java.awt.Color(202, 81, 22));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 70));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment Method");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 40));

        moneyEntered.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        moneyEntered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneyEnteredActionPerformed(evt);
            }
        });
        jPanel1.add(moneyEntered, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 160, 40));

        visaBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        visaBox.setText("Visa");
        jPanel1.add(visaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        cashBox.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        cashBox.setText("Cash");
        cashBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashBoxActionPerformed(evt);
            }
        });
        jPanel1.add(cashBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Please Insert Money");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/1.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        InsertMoney.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        InsertMoney.setText("Insert Money");
        InsertMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertMoneyActionPerformed(evt);
            }
        });
        jPanel1.add(InsertMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 150, -1));

        switchPowerBtn.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        switchPowerBtn.setText("Switch Power");
        switchPowerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchPowerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(switchPowerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, -1));

        Drink.setOrientation(javax.swing.JSlider.VERTICAL);
        Drink.setValue(0);
        jPanel1.add(Drink, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 40, 140));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CUP");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, -1, 60));

        jPanel2.setBackground(new java.awt.Color(88, 28, 12));
        jPanel2.setName("Coffee vending machine"); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("0          1           2           3           4           5");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 635, -1, 20));

        Cappuccino.setBackground(new java.awt.Color(88, 28, 12));
        Cappuccino.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        Cappuccino.setForeground(new java.awt.Color(88, 28, 12));
        Cappuccino.setText("Cappuccino - 15L.E");
        Cappuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CappuccinoActionPerformed(evt);
            }
        });
        jPanel2.add(Cappuccino, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 260, -1, -1));

        Americano.setBackground(new java.awt.Color(88, 28, 12));
        Americano.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Americano.setForeground(new java.awt.Color(88, 28, 12));
        Americano.setText("American - 15L.E");
        Americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmericanoActionPerformed(evt);
            }
        });
        jPanel2.add(Americano, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 259, -1, -1));

        Mocha.setBackground(new java.awt.Color(88, 28, 12));
        Mocha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Mocha.setForeground(new java.awt.Color(88, 28, 12));
        Mocha.setText("Mocha - 30L.E");
        Mocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MochaActionPerformed(evt);
            }
        });
        jPanel2.add(Mocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 259, 140, -1));

        Latte.setBackground(new java.awt.Color(88, 28, 12));
        Latte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Latte.setForeground(new java.awt.Color(88, 28, 12));
        Latte.setText("Latte - 25L.E");
        Latte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LatteActionPerformed(evt);
            }
        });
        jPanel2.add(Latte, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 446, 150, -1));

        Macchiato.setBackground(new java.awt.Color(88, 28, 12));
        Macchiato.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Macchiato.setForeground(new java.awt.Color(88, 28, 12));
        Macchiato.setText("Machiatto - 30L.E");
        Macchiato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MacchiatoActionPerformed(evt);
            }
        });
        jPanel2.add(Macchiato, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 446, 148, -1));

        Espresso.setBackground(new java.awt.Color(88, 28, 12));
        Espresso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Espresso.setForeground(new java.awt.Color(88, 28, 12));
        Espresso.setText("Espresso - 10L.E");
        Espresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspressoActionPerformed(evt);
            }
        });
        jPanel2.add(Espresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 446, 150, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Please Choose Your Drink");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 94, -1, 40));

        Sugar.setMaximum(5);
        Sugar.setValue(0);
        jPanel2.add(Sugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 673, 264, 30));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Please Choose Your Sugar");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 595, -1, 50));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/Americano.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/Cappuccino.png"))); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 152, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/Espresso.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 317, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/Latte.png"))); // NOI18N
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 326, -1, 120));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/Machiatto.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 326, -1, 101));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view2/Mocha.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 152, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Please choose your size");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 513, -1, -1));

        small.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        small.setText("Small");
        small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });
        jPanel2.add(small, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 552, 90, -1));

        medium.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        medium.setText("Medium");
        medium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumActionPerformed(evt);
            }
        });
        jPanel2.add(medium, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 552, -1, -1));

        large.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        large.setText("Large");
        large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largeActionPerformed(evt);
            }
        });
        jPanel2.add(large, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 552, 90, -1));

        Start.setBackground(new java.awt.Color(88, 28, 12));
        Start.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Start.setForeground(new java.awt.Color(88, 28, 12));
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        jPanel2.add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 710, 150, -1));

        Cancel.setBackground(new java.awt.Color(88, 28, 12));
        Cancel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Cancel.setForeground(new java.awt.Color(88, 28, 12));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel2.add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 742, 150, -1));

        Screen.setBackground(new java.awt.Color(0, 0, 0));
        Screen.setColumns(20);
        Screen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Screen.setForeground(new java.awt.Color(255, 255, 255));
        Screen.setRows(2);
        Screen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Screen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 14), new java.awt.Color(255, 204, 51))); // NOI18N
        jScrollPane2.setViewportView(Screen);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -3, 530, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moneyEnteredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneyEnteredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moneyEnteredActionPerformed

    private void InsertMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertMoneyActionPerformed
       if(cashBox.isSelected())
       {
            CurrencyController.getInstance().determineCurrencyValue();
       }
       else if(visaBox.isSelected())
       {
            VisaDetector.getInstance().acceptMoney();
       }
       else
       {
           Monitor.getInstance().display("Please choose payment method");
       }
    }//GEN-LAST:event_InsertMoneyActionPerformed

    private void switchPowerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchPowerBtnActionPerformed
        Engine.sendEvent(new PowerSwitch(false));
    }//GEN-LAST:event_switchPowerBtnActionPerformed

    private void CappuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CappuccinoActionPerformed
        Engine.sendEvent(new SelectCoffee(Coffee.getCoffeeTypes().get(5))); 
        getCappuccino().setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_CappuccinoActionPerformed

    private void AmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmericanoActionPerformed
        Engine.sendEvent(new SelectCoffee(Coffee.getCoffeeTypes().get(2)));  
        getAmericano().setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_AmericanoActionPerformed

    private void MochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MochaActionPerformed
        Engine.sendEvent(new SelectCoffee(Coffee.getCoffeeTypes().get(0)));  
         getMocha().setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_MochaActionPerformed

    private void LatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LatteActionPerformed
        Engine.sendEvent(new SelectCoffee(Coffee.getCoffeeTypes().get(4))); 
         getLatte().setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_LatteActionPerformed

    private void MacchiatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MacchiatoActionPerformed
        Engine.sendEvent(new SelectCoffee(Coffee.getCoffeeTypes().get(3)));   
         getMacchiato().setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_MacchiatoActionPerformed

    private void EspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspressoActionPerformed
        Engine.sendEvent(new SelectCoffee(Coffee.getCoffeeTypes().get(1)));   
         getEspresso().setBackground(Color.yellow);// TODO add your handling code here:
    }//GEN-LAST:event_EspressoActionPerformed

    private void smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallActionPerformed
        Engine.sendEvent(new SelectSize(1));        // TODO add your handling code here:
         getSmall().setBackground(Color.CYAN);
    }//GEN-LAST:event_smallActionPerformed

    private void mediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumActionPerformed
        Engine.sendEvent(new SelectSize(2));        
    getMedium().setBackground(Color.CYAN);// TODO add your handling code here:
    }//GEN-LAST:event_mediumActionPerformed

    private void largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largeActionPerformed
        Engine.sendEvent(new SelectSize(3));     
        getLarge().setBackground(Color.CYAN);// TODO add your handling code here:
    }//GEN-LAST:event_largeActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        Engine.sendEvent(new StartOrder(true));        // TODO add your handling code here:
    }//GEN-LAST:event_StartActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        Engine.sendEvent(new CancelEvent(true));        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void cashBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashBoxActionPerformed

        public JTextArea getScreen() {
        return Screen;
    }

    /**
     * @return 
     */
    public JTextField getMoneyEntered() {
        return moneyEntered;
    }
    
    public JButton getInsertMoney() {
        return InsertMoney;
    }

    public JButton getStart() {
        return Start;
    }

    public JSlider getSugar() {
        return Sugar;
    }
    
    public JButton getCancel() {
        return Cancel;
    }

    public JButton getAmericano() {
        return Americano;
    }

    public JButton getCappuccino() {
        return Cappuccino;
    }

    public JButton getEspresso() {
        return Espresso;
    }

    public JButton getLatte() {
        return Latte;
    }

    public JButton getMacchiato() {
        return Macchiato;
    }

    public JButton getMocha() {
        return Mocha;
    }

    public JButton getLarge() {
        return large;
    }

    public JButton getMedium() {
        return medium;
    }

    public JButton getSmall() {
        return small;
    }
       public JSlider getDrink() {
        return Drink;
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Americano;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Cappuccino;
    private javax.swing.JSlider Drink;
    private javax.swing.JButton Espresso;
    private javax.swing.JButton InsertMoney;
    private javax.swing.JButton Latte;
    private javax.swing.JButton Macchiato;
    private javax.swing.JButton Mocha;
    private javax.swing.JTextArea Screen;
    private javax.swing.JButton Start;
    private javax.swing.JSlider Sugar;
    private javax.swing.JCheckBox cashBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton large;
    private javax.swing.JButton medium;
    private javax.swing.JTextField moneyEntered;
    private javax.swing.JButton small;
    private javax.swing.JButton switchPowerBtn;
    private javax.swing.JCheckBox visaBox;
    // End of variables declaration//GEN-END:variables
}
