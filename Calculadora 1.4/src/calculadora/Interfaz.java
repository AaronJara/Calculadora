/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Aaron Jara Molina
 *
 */

public class Interfaz extends javax.swing.JFrame {
    //Declaro las variables que voy a utilizar.
    //Variable de tipo String llamada memoria.
    String memoria;
    // Variable de tipo String llamada memori2.
    String memoria2;
    // Variable de tipo String llamada signo.
    String signo;
    // Variable de tipo String llamda memoc.
    String memoc;

    /**
     * Creates new form Interfaz
     **/
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        pantalla = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("MC");
        jButton1.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton1.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("MR");
        jButton2.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton2.setMinimumSize(new java.awt.Dimension(5, 5));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("MS");
        jButton3.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton3.setMinimumSize(new java.awt.Dimension(5, 5));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("M+");
        jButton4.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton4.setMinimumSize(new java.awt.Dimension(5, 5));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setText("M-");
        jButton5.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton5.setMinimumSize(new java.awt.Dimension(5, 5));

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setText("⏎");
        jButton6.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton6.setMinimumSize(new java.awt.Dimension(5, 5));

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setText("CE");
        jButton7.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton7.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setText("C");
        jButton8.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton8.setMinimumSize(new java.awt.Dimension(5, 5));

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setText("+/-");
        jButton9.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton9.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(153, 153, 153));
        btn7.setText("7");
        btn7.setMaximumSize(new java.awt.Dimension(5, 5));
        btn7.setMinimumSize(new java.awt.Dimension(5, 5));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(153, 153, 153));
        btn8.setText("8");
        btn8.setMaximumSize(new java.awt.Dimension(5, 5));
        btn8.setMinimumSize(new java.awt.Dimension(5, 5));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(153, 153, 153));
        btn9.setText("9");
        btn9.setMaximumSize(new java.awt.Dimension(5, 5));
        btn9.setMinimumSize(new java.awt.Dimension(5, 5));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(153, 153, 153));
        btn4.setText("4");
        btn4.setMaximumSize(new java.awt.Dimension(5, 5));
        btn4.setMinimumSize(new java.awt.Dimension(5, 5));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(153, 153, 153));
        btn5.setText("5");
        btn5.setMaximumSize(new java.awt.Dimension(5, 5));
        btn5.setMinimumSize(new java.awt.Dimension(5, 5));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(153, 153, 153));
        btn6.setText("6");
        btn6.setMaximumSize(new java.awt.Dimension(5, 5));
        btn6.setMinimumSize(new java.awt.Dimension(5, 5));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(153, 153, 153));
        btn1.setText("1");
        btn1.setMaximumSize(new java.awt.Dimension(5, 5));
        btn1.setMinimumSize(new java.awt.Dimension(5, 5));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(153, 153, 153));
        btn2.setText("2");
        btn2.setMaximumSize(new java.awt.Dimension(5, 5));
        btn2.setMinimumSize(new java.awt.Dimension(5, 5));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(153, 153, 153));
        btn3.setText("3");
        btn3.setMaximumSize(new java.awt.Dimension(5, 5));
        btn3.setMinimumSize(new java.awt.Dimension(5, 5));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(153, 153, 153));
        jButton19.setText("/");
        jButton19.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton19.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        btnmulti.setBackground(new java.awt.Color(153, 153, 153));
        btnmulti.setText("*");
        btnmulti.setMaximumSize(new java.awt.Dimension(5, 5));
        btnmulti.setMinimumSize(new java.awt.Dimension(5, 5));
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(153, 153, 153));
        jButton21.setText("-");
        jButton21.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton21.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(153, 153, 153));
        jButton22.setText("+");
        jButton22.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton22.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(153, 153, 153));
        btn0.setText("0");
        btn0.setMaximumSize(new java.awt.Dimension(5, 5));
        btn0.setMinimumSize(new java.awt.Dimension(5, 5));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(153, 153, 153));
        jButton24.setText(",");
        jButton24.setMaximumSize(new java.awt.Dimension(5, 5));
        jButton24.setMinimumSize(new java.awt.Dimension(5, 5));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        pantalla.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pantalla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pantalla.setName(""); // NOI18N
        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 153, 153));
        jButton10.setText("=");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnmulti, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10)))
                        .addGap(8, 8, 8)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        memoc = "" ;
        pantalla.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * 
     * @param evt 
     **/
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        String btnpunto;
        btnpunto = pantalla.getText();

        if (btnpunto.length() <= 0) {
            pantalla.setText("0,");

        } else {

            if (!coma(pantalla.getText())) {
                pantalla.setText(pantalla.getText() + ",");

            }

        }
    }//GEN-LAST:event_jButton24ActionPerformed

    public static boolean coma(String cadena) {
        boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.substring(i, i + 1).equals(".")) {
                resultado = true;
                break;
            }
        }

        return resultado;

    }


    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pantallaActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        // TODO add your handling code here:
        if (!pantalla.getText().equals("")) {
            memoria = pantalla.getText();
            signo = "*";
            pantalla.setText("");

        }
    }//GEN-LAST:event_btnmultiActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if (!pantalla.getText().equals("")) {
            memoria = pantalla.getText();
            signo = "/";
            pantalla.setText("");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String resultado;
        memoria2 = pantalla.getText();

        if (!memoria2.equals("")) {
            resultado = calculadora(memoria, memoria2, signo);
            pantalla.setText(resultado);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    public static String calculadora(String memoria, String memoria2, String signo) {
        Double resultado = 0.0;
        String respuesta;

        if (signo.equals("-")) {
            resultado = Double.parseDouble(memoria) - Double.parseDouble(memoria2);

        }

        if (signo.equals("+")) {
            resultado = Double.parseDouble(memoria) + Double.parseDouble(memoria2);

        }
        if (signo.equals("*")) {
            resultado = Double.parseDouble(memoria) * Double.parseDouble(memoria2);
        }

        if (signo.equals("/")) {
            resultado = Double.parseDouble(memoria) / Double.parseDouble(memoria2);

        }

        respuesta = resultado.toString();
        return respuesta;
    }


    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if (!pantalla.getText().equals("")) {
            memoria = pantalla.getText();
            signo = "-";
            pantalla.setText("");
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if (!pantalla.getText().equals("")) {
            memoria = pantalla.getText();
            signo = "+";
            pantalla.setText("");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
