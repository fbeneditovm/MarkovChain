/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author fbeneditovm
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        jSpinnerNIterations = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableInitialVector = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMatrix = new javax.swing.JTable();
        jSpinnerMatrizSize = new javax.swing.JSpinner();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableResult = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btCalculate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableInitialVector.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableInitialVector.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableInitialVector.setShowGrid(true);
        jScrollPane2.setViewportView(jTableInitialVector);

        jTableMatrix.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableMatrix.setShowGrid(true);
        jScrollPane3.setViewportView(jTableMatrix);

        jTableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableResult.setShowGrid(true);
        jScrollPane4.setViewportView(jTableResult);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Press (Tab or Enter) after you input the Matrix.");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel2.setText("Press (Tab or Enter) after you input the Vector.");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Result:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel4.setText("Number of iterations:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel5.setText("Matrix Size:");

        btCalculate.setBackground(new java.awt.Color(255, 255, 255));
        btCalculate.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        btCalculate.setForeground(new java.awt.Color(0, 0, 255));
        btCalculate.setText("Calculate");
        btCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setText("Initial Probability Vector:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel7.setText("Transition Matrix:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerMatrizSize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerNIterations, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCalculate)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSpinnerMatrizSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerNIterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(btCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * The probability calculation is done in this method
     */
    private void btCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculateActionPerformed
        int i, j;
        int matrixSize, nIterations;
        
        /**
         * Getting the user input
         */
        
        matrixSize = (int)jSpinnerMatrizSize.getValue();
        nIterations = (int)jSpinnerNIterations.getValue();
        if((matrixSize == 0)||(nIterations==0)){
            JOptionPane.showMessageDialog(null, "The Matrix Size and the Number of Iterations"
                    + "can not be zero!");
            return;
        }
        
        BigDecimal[] initialVector = new BigDecimal[matrixSize];
        BigDecimal[][] matrix = new BigDecimal[matrixSize][matrixSize];
        
        TableModel vectorTModel = jTableInitialVector.getModel();
        TableModel matrixTModel = jTableMatrix.getModel();
        TableModel resultTModel = jTableResult.getModel();
        
        for(i=0; i<matrixSize; i++){
            try{
                
                initialVector[i] = new BigDecimal((String)vectorTModel.getValueAt(0, i));
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "You either set the Matrix Size wrong or did not "
                        + "press (Tab or Enter) after you filled the Vector."
                        + "Please check your input and try again!");
                break;
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "You typed an invalid value in the Vector."
                        + "Please check your input and try again!");
            }
            for(j=0; j<matrixSize; j++){
                try{
                    matrix[i][j] = new BigDecimal((String)matrixTModel.getValueAt(i, j));
                }catch(NullPointerException e){
                    JOptionPane.showMessageDialog(null, "You either set the Matrix Size wrong or did not "
                        + "press (Tab or Enter) after you filled the Matrix."
                        + "Please check your input and try again!");
                    break;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "You typed an invalid value in the Matrix."
                        + "Please check your input and try again!");
            }
            }
        }
        
        /**
         * Uncomment the next part to test input
        */
        /*
        System.out.println("Matrix Size: "+matrixSize);
        System.out.println("Number or Iteractions: "+nIterations);
        System.out.println("Initial Vector:");
        for(i=0; i<matrixSize; i++)
            System.out.print(initialVector[i]+", ");
        System.out.println("\nTransition Matrix:");
        for(i=0; i<matrixSize; i++){
            for(j=0; j<matrixSize; j++){
                System.out.print(matrix[i][j]+", ");
            }
            System.out.println("");
        }
        */
        
        /**
         * Calculation of the Transition Matrix after
         * nIterations iterations
         */
        BigDecimal[][] matrixN = new BigDecimal[matrixSize][matrixSize];
        for(i=0; i<matrixSize; i++)
            System.arraycopy(matrix[i], 0, matrixN[i], 0, matrixSize);
        
        for(i=0; i<(nIterations-1); i++){
            
            //GUARDAR A MATRIZ ORIGINAL E MULTIPLICAR A ATUAL POR ELA AO
            //INVES DE MULTIPLICAR A ATUAL PELA ATUAL
            matrixN = multiplyMatrices(matrixN, matrix);
            
            /**
             * Uncomment the next part to see the
             * Transition Matrix after each iteration
             */
            System.out.println("Matrix"+(i+2)+":\n");
            for(j=0; j<matrixSize; j++){
                for(int k=0; k<matrixSize; k++){
                    System.out.print(matrixN[j][k]+", ");
                }
            System.out.println("");
            }
        }
        
        /**
         * Multiplication of the Initial Vector
         * by the new Transition Matrix
         */
        BigDecimal[][] aux = new BigDecimal[1][matrixSize];
        aux[0] = initialVector;
        aux = multiplyMatrices(aux, matrixN);
        
        /**
         * Showing the result on the screen
         */
        for(i=0; i<matrixSize; i++)
            resultTModel.setValueAt(""+aux[0][i], 0, i);
        
    }//GEN-LAST:event_btCalculateActionPerformed
    
    /**
     * A simple matrices multiplication method using BigDecimal
     * @param a the first matrix
     * @param b the second matrix
     * @return the matrix resultant of the multiplication
     */
    
    public BigDecimal[][] multiplyMatrices(BigDecimal[][] a, BigDecimal[][] b){       
        int i,j;
        int m1 = a.length;
        int n1 = a[0].length;
        int m2 = b.length;
        int n2 = b[0].length;
        if (n1 != m2) System.out.println("Illegal matrix dimensions.");
        
        BigDecimal[][] c = new BigDecimal[m1][n2];
        for (i = 0; i < m1; i++){
            for (j = 0; j < n2; j++){
                c[i][j] = new BigDecimal("0");
                for (int k = 0; k < n1; k++){
                    c[i][j] = c[i][j].add(a[i][k].multiply(b[k][j]));
                }
            }
        }
        return c;
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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinnerMatrizSize;
    private javax.swing.JSpinner jSpinnerNIterations;
    private javax.swing.JTable jTableInitialVector;
    private javax.swing.JTable jTableMatrix;
    private javax.swing.JTable jTableResult;
    // End of variables declaration//GEN-END:variables
}
