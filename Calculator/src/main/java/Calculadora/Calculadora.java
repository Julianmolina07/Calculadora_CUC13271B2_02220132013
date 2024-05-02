package Calculadora;

public class Calculadora extends javax.swing.JFrame {
    
    String Numero;
    String Signo;
    String Numero1;

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextPantalla = new javax.swing.JTextField();
        jBtnCE = new javax.swing.JButton();
        jBtnC = new javax.swing.JButton();
        jBtnDividir = new javax.swing.JButton();
        jBtnPor = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtnMenos = new javax.swing.JButton();
        jBtnMas = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtnPunto = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        jBtnIgual = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextPantalla.setEditable(false);
        jTextPantalla.setBackground(new java.awt.Color(204, 204, 204));
        jTextPantalla.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jTextPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPantallaActionPerformed(evt);
            }
        });

        jBtnCE.setBackground(new java.awt.Color(255, 153, 0));
        jBtnCE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnCE.setText("CE");
        jBtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCEActionPerformed(evt);
            }
        });

        jBtnC.setBackground(new java.awt.Color(255, 153, 0));
        jBtnC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnC.setText("C");
        jBtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCActionPerformed(evt);
            }
        });

        jBtnDividir.setBackground(new java.awt.Color(255, 153, 0));
        jBtnDividir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnDividir.setText("/");
        jBtnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDividirActionPerformed(evt);
            }
        });

        jBtnPor.setBackground(new java.awt.Color(255, 153, 0));
        jBtnPor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnPor.setText("*");
        jBtnPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPorActionPerformed(evt);
            }
        });

        jBtn9.setBackground(new java.awt.Color(255, 153, 0));
        jBtn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn8.setBackground(new java.awt.Color(255, 153, 0));
        jBtn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn7.setBackground(new java.awt.Color(255, 153, 0));
        jBtn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn4.setBackground(new java.awt.Color(255, 153, 0));
        jBtn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn5.setBackground(new java.awt.Color(255, 153, 0));
        jBtn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn6.setBackground(new java.awt.Color(255, 153, 0));
        jBtn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtnMenos.setBackground(new java.awt.Color(255, 153, 0));
        jBtnMenos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnMenos.setText("-");
        jBtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMenosActionPerformed(evt);
            }
        });

        jBtnMas.setBackground(new java.awt.Color(255, 153, 0));
        jBtnMas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnMas.setText("+");
        jBtnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMasActionPerformed(evt);
            }
        });

        jBtn3.setBackground(new java.awt.Color(255, 153, 0));
        jBtn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn2.setBackground(new java.awt.Color(255, 153, 0));
        jBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn1.setBackground(new java.awt.Color(255, 153, 0));
        jBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtnPunto.setBackground(new java.awt.Color(255, 153, 0));
        jBtnPunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnPunto.setText(".");
        jBtnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPuntoActionPerformed(evt);
            }
        });

        jBtn0.setBackground(new java.awt.Color(255, 153, 0));
        jBtn0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        jBtnIgual.setBackground(new java.awt.Color(255, 153, 0));
        jBtnIgual.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnIgual.setText("=");
        jBtnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIgualActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtn0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jBtnCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnPor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jBtnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBtnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jTextPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtnCE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void jBtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCEActionPerformed
        jTextPantalla.setText("");
    }//GEN-LAST:event_jBtnCEActionPerformed

    private void jBtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCActionPerformed

        String cadena;
        cadena = jTextPantalla.getText();

        if (cadena.length()>0){
            cadena = cadena.substring(0, cadena.length()-1);
            jTextPantalla.setText(cadena);
        }
    }//GEN-LAST:event_jBtnCActionPerformed

    private void jBtnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDividirActionPerformed

        if (!jTextPantalla.getText().isEmpty()){
            Numero = jTextPantalla.getText();
            Signo = "/";
            jTextPantalla.setText("");
        }
    }//GEN-LAST:event_jBtnDividirActionPerformed

    private void jBtnPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPorActionPerformed

        if (!jTextPantalla.getText().isEmpty()){
            Numero = jTextPantalla.getText();
            Signo = "*";
            jTextPantalla.setText("");
        }
    }//GEN-LAST:event_jBtnPorActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"9");
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"8");
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"7");
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"4");
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"5");
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"6");
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMenosActionPerformed

        if (!jTextPantalla.getText().isEmpty()){
            Numero = jTextPantalla.getText();
            Signo = "-";
            jTextPantalla.setText("");
        }
    }//GEN-LAST:event_jBtnMenosActionPerformed

    private void jBtnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMasActionPerformed

        if (!jTextPantalla.getText().isEmpty()){
            Numero = jTextPantalla.getText();
            Signo = "+";
            jTextPantalla.setText("");
        }
    }//GEN-LAST:event_jBtnMasActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"3");
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"2");
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"1");
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPuntoActionPerformed

        String cadena;
        cadena = jTextPantalla.getText();
        if (cadena.length()<=0){
            jTextPantalla.setText(".");
        }
        else{
            if (!Punto(jTextPantalla.getText())){
                jTextPantalla.setText(jTextPantalla.getText()+".");
            }
        }
    }//GEN-LAST:event_jBtnPuntoActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        jTextPantalla.setText(jTextPantalla.getText()+"0");
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void jBtnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIgualActionPerformed

        if (!Numero.isEmpty() && !Signo.isEmpty() && !jTextPantalla.getText().isEmpty()) {
        String resultado = Respuesta(Numero, Signo, jTextPantalla.getText());
        jTextPantalla.setText(resultado);
        Numero = "";
        Signo = "";
        }
    }//GEN-LAST:event_jBtnIgualActionPerformed

    private void jTextPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPantallaActionPerformed
        
    }//GEN-LAST:event_jTextPantallaActionPerformed
     
    public static boolean Punto(String cadena){
        boolean resultado;
        resultado = false;
        
        for (int i = 0; i< cadena.length(); i++){
            if (cadena.substring(i,i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public static String Respuesta(String Numero, String Signo, String Numero1){
        Double Total = 0.0;
        String Resultado;
        
        if (Signo.equals("/")){
            Total= Double.parseDouble(Numero)/Double.parseDouble(Numero1);
        }
        if (Signo.equals("*")){
            Total= Double.parseDouble(Numero)*Double.parseDouble(Numero1);
        }
        if (Signo.equals("-")){
            Total= Double.parseDouble(Numero)-Double.parseDouble(Numero1);
        }
        if (Signo.equals("+")){
            Total= Double.parseDouble(Numero)+Double.parseDouble(Numero1);
        }
        Resultado = Total.toString();
        return Resultado;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnC;
    private javax.swing.JButton jBtnCE;
    private javax.swing.JButton jBtnDividir;
    private javax.swing.JButton jBtnIgual;
    private javax.swing.JButton jBtnMas;
    private javax.swing.JButton jBtnMenos;
    private javax.swing.JButton jBtnPor;
    private javax.swing.JButton jBtnPunto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextPantalla;
    // End of variables declaration//GEN-END:variables
}
