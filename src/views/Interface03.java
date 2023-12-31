/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author alisson_formento
 */
public class Interface03 extends javax.swing.JFrame {

    private int tempoRestante;
    private int tempoInicial = 1;
    private Timer timer;
    
    public Interface03() {
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

        start = new javax.swing.JButton();
        tempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        start.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        tempo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        tempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tempo.setText("25:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(tempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tempo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        tempoRestante = tempoInicial * 60; //TEMPO INCIAL CONVERTIDO EM SEGUNDOS
        
        timer = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                atualizaTempo();
            }
        });
        timer.start();
        start.setEnabled(false);
    }//GEN-LAST:event_startActionPerformed

    
    private void atualizaTempo(){
        
        System.out.println("");
        int minutos = tempoRestante / 60; // INT SÓ PEGA O NUMERO ANTES DA VIRGULA, SE USASSE DOUBLE PEGARIA OS NUMEROS DEPOIS DA VIRGULA TAMBÉM
        int segundos = tempoRestante % 60;
        
        String tempoText = String.format("%02d:%02d", minutos, segundos); // 2 DIGITOS, DOIS PONTOS, MAIS DOIS DIGITOS
        
        this.tempo.setText(tempoText); // THIS É OPICIONAL(ESCOPO GLOBAL DENTRO DESTE ARQUIVO)
        
        tempoRestante--; // DIMINUI 1 SEGUNDO DO CONTADOR
        if(tempoRestante < 0){
            timer.stop();
        }
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton start;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
