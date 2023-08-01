/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.Timer;
import projeto02.java.Status;


/**
 *
 * @author alisson_formento
 */
public class interface04 extends javax.swing.JFrame {

    /**
     * Creates new form interface04
     */
    public interface04() {//METODO CONSTRUTOR 
        initComponents();
        this.time = this.createTimer();
        
    }

    private Timer time;   
    
    private final int FOCUS_TIME = 25;
    private final int LONG_BREAK_TIME = 10;
    private final int SHORT_BREAK_TIME = 5;
    private final int ROUNDS = 4;
    
    private int focusTime = 25;
    private int fastBreakTime = 5;
    private int longBreakTime = 15;
    private int rounds = 4;
    
    private int tempoRestante = 25 * 60;
    private boolean isStopped = true;
    
    private Status statusAtual = Status.PAUSED;
    private Status statusAnterior = null;
    
    private int countRound;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        timer = new javax.swing.JPanel();
        timerLabel = new javax.swing.JLabel();
        iniciar = new javax.swing.JLabel();
        configuracoes = new javax.swing.JLabel();
        tempoDeFoco = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        variadorFoco = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        tempoFoco = new javax.swing.JLabel();
        variadorCurto = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        tempoCurto = new javax.swing.JLabel();
        variadorLongo = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        tempoLongo = new javax.swing.JLabel();
        numeroRepeticoes = new javax.swing.JLabel();
        variadorRepeticoes = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        applyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(370, 500));

        main.setPreferredSize(new java.awt.Dimension(450, 410));
        main.setLayout(new java.awt.CardLayout());

        timer.setPreferredSize(new java.awt.Dimension(450, 410));

        timerLabel.setFont(new java.awt.Font("Dialog", 1, 79)); // NOI18N
        timerLabel.setText("25:00");

        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/play.png"))); // NOI18N
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
        });

        configuracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/engrenagem.png"))); // NOI18N
        configuracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                configuracoesMouseClicked(evt);
            }
        });

        tempoDeFoco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tempoDeFoco.setText("TEMPO DE FOCO");

        javax.swing.GroupLayout timerLayout = new javax.swing.GroupLayout(timer);
        timer.setLayout(timerLayout);
        timerLayout.setHorizontalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerLayout.createSequentialGroup()
                .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(configuracoes))
                    .addGroup(timerLayout.createSequentialGroup()
                        .addGroup(timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(timerLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(iniciar))
                            .addGroup(timerLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 108, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(timerLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(tempoDeFoco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        timerLayout.setVerticalGroup(
            timerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configuracoes)
                .addGap(46, 46, 46)
                .addComponent(timerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciar)
                .addGap(18, 18, 18)
                .addComponent(tempoDeFoco)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        main.add(timer, "timer");

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/claro.png"))); // NOI18N
        fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharMouseClicked(evt);
            }
        });

        variadorFoco.setMaximum(50);
        variadorFoco.setMinimum(1);
        variadorFoco.setValue(25);
        variadorFoco.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                variadorFocoStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Tempo de foco");

        tempoFoco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tempoFoco.setText("25:00");

        variadorCurto.setMaximum(15);
        variadorCurto.setMinimum(1);
        variadorCurto.setValue(5);
        variadorCurto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                variadorCurtoStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Descanço curto");

        tempoCurto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tempoCurto.setText("05:00");

        variadorLongo.setMaximum(30);
        variadorLongo.setMinimum(1);
        variadorLongo.setValue(10);
        variadorLongo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                variadorLongoStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Descanço longo");

        tempoLongo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tempoLongo.setText("10:00");

        numeroRepeticoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numeroRepeticoes.setText("04");

        variadorRepeticoes.setMaximum(10);
        variadorRepeticoes.setMinimum(1);
        variadorRepeticoes.setValue(4);
        variadorRepeticoes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                variadorRepeticoesStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Repetições");

        resetButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        resetButton.setText("Resetar");
        resetButton.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                resetButtonStateChanged(evt);
            }
        });
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        applyButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        applyButton.setText("Aplicar");
        applyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                applyButtonMouseClicked(evt);
            }
        });
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsLayout = new javax.swing.GroupLayout(settings);
        settings.setLayout(settingsLayout);
        settingsLayout.setHorizontalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(settingsLayout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(tempoFoco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(110, 110, 110))
                                .addComponent(variadorFoco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(variadorCurto, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(settingsLayout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(tempoLongo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(110, 110, 110))
                                .addComponent(variadorLongo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(variadorRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(numeroRepeticoes)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(settingsLayout.createSequentialGroup()
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingsLayout.createSequentialGroup()
                        .addContainerGap(360, Short.MAX_VALUE)
                        .addComponent(fechar))
                    .addGroup(settingsLayout.createSequentialGroup()
                        .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel8))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(tempoCurto))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel3))
                            .addGroup(settingsLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(applyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        settingsLayout.setVerticalGroup(
            settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tempoFoco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variadorFoco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tempoCurto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variadorCurto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tempoLongo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variadorLongo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroRepeticoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(variadorRepeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(settingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(applyButton))
                .addContainerGap())
        );

        main.add(settings, "settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configuracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_configuracoesMouseClicked
        changePanel("settings");
                
    }//GEN-LAST:event_configuracoesMouseClicked

    private void fecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharMouseClicked
        changePanel("timer");
    }//GEN-LAST:event_fecharMouseClicked

    private void variadorFocoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variadorFocoStateChanged
       changeValueSlider(this.variadorFoco ,this.tempoFoco);
    }//GEN-LAST:event_variadorFocoStateChanged

    private void variadorLongoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variadorLongoStateChanged
       changeValueSlider(this.variadorLongo ,this.tempoLongo);
    }//GEN-LAST:event_variadorLongoStateChanged

    private void variadorRepeticoesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variadorRepeticoesStateChanged
       changeValueSlider(this.variadorRepeticoes ,this.numeroRepeticoes);
    }//GEN-LAST:event_variadorRepeticoesStateChanged

    private void variadorCurtoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_variadorCurtoStateChanged
       changeValueSlider(this.variadorCurto ,this.tempoCurto);
    }//GEN-LAST:event_variadorCurtoStateChanged

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed
        this.focusTime = this.variadorFoco.getValue();
        this.longBreakTime = this.variadorLongo.getValue();
        this.fastBreakTime = this.variadorCurto.getValue();
        this.rounds = this.variadorRepeticoes.getValue();
        this.tempoRestante = this.focusTime * 60;
        int minutos = tempoRestante / 60;
        int segundos = tempoRestante % 60;
        timerLabel.setText(String.format("%02d:%02d", minutos, segundos));
        changePanel("timer");
    }//GEN-LAST:event_applyButtonActionPerformed

    private void applyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyButtonMouseClicked
        
    }//GEN-LAST:event_applyButtonMouseClicked

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        
    }//GEN-LAST:event_resetButtonMouseClicked

    private void resetButtonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_resetButtonStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_resetButtonStateChanged

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        this.variadorFoco.setValue(this.FOCUS_TIME);
        this.variadorLongo.setValue(this.LONG_BREAK_TIME);
        this.variadorCurto.setValue(this.SHORT_BREAK_TIME);
        this.variadorRepeticoes.setValue(this.ROUNDS);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked
    
        if(isStopped){
            this.time.start();
            this.iniciar.setIcon(new ImageIcon(getClass().getResource("/assets/pause.png")));
            
            if(statusAnterior == null){
                statusAtual = Status.FOCUS_TIME;
                statusAnterior = Status.PAUSED;
            }else{
                statusAtual = statusAnterior;
                statusAnterior = Status.PAUSED;
            }
        }else{
            this.time.stop();
            this.iniciar.setIcon(new ImageIcon(getClass().getResource("/assets/play.png")));           
        }
        this.isStopped = !this.isStopped;
        
    }//GEN-LAST:event_iniciarMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel configuracoes;
    private javax.swing.JLabel fechar;
    private javax.swing.JLabel iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel main;
    private javax.swing.JLabel numeroRepeticoes;
    private javax.swing.JButton resetButton;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel tempoCurto;
    private javax.swing.JLabel tempoDeFoco;
    private javax.swing.JLabel tempoFoco;
    private javax.swing.JLabel tempoLongo;
    private javax.swing.JPanel timer;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JSlider variadorCurto;
    private javax.swing.JSlider variadorFoco;
    private javax.swing.JSlider variadorLongo;
    private javax.swing.JSlider variadorRepeticoes;
    // End of variables declaration//GEN-END:variables

    private void changePanel(String cardName) {
        CardLayout cardLayout = (CardLayout) this.main.getLayout();
        cardLayout.show(this.main, cardName); // NOME DENTRO DAS ASPAS SE REFERE AO NOME DENTRO DO CARD 
    
    }
    
    private void changeValueSlider(JSlider slider, JLabel label){
       int value = slider.getValue();
       String valueFormat = String.format("%02d:%02d", value, 00);
       label.setText(valueFormat);
    }
    
    private Timer createTimer(){
        return new Timer(1000, (ActionEvent e) -> {
           updateTimer();
        });
    }
    
    private void updateTimer(){
        this.tempoRestante--;
        int minutos = tempoRestante / 60;
        int segundos = tempoRestante % 60;
        this.timerLabel.setText(String.format("%02d:%02d", minutos, segundos));
        if(this.tempoRestante <= 0){
            this.changeStatus();
        }
    
    }

    private void changeStatus(){
        if(this.statusAtual == Status.FOCUS_TIME && this.rounds == this.countRound){
            this.statusAtual = Status.BREAK_LONG;
            this.statusAnterior = Status.FOCUS_TIME;
            this.countRound = 0;
            this.tempoRestante = this.LONG_BREAK_TIME * 60;
        }else if(this.statusAtual == Status.FOCUS_TIME && this.rounds != this.countRound){
            this.statusAtual = Status.BREAK_FAST;
            this.statusAnterior = Status.FOCUS_TIME;
            this.tempoRestante = this.fastBreakTime * 60;
            this.countRound--;
        }else if(this.statusAtual == Status.BREAK_FAST){
            this.statusAtual = Status.FOCUS_TIME;
            this.statusAnterior = Status.BREAK_FAST;
            this.tempoRestante = this.FOCUS_TIME * 60;
            this.countRound--;
        }else if(this.statusAtual == Status.BREAK_LONG){
            this.statusAtual = Status.FOCUS_TIME;
            this.statusAnterior = Status.BREAK_LONG;
            this.countRound--;
        }
    }

}


