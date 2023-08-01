/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alisson_formento
 */

public class Interface {
    
    //NÃO PODE EXECUTAR NENHUMA LÓGICA(FUNÇÃO) DENTRO DA CLASSE, SOMENTE VARIAVEIS
    
    public Interface(){
    
        JFrame janela = new JFrame("Minha primeira janela"); //DECLARA A JANELA
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //DIZ O QUE ACONTECE QUANDO A JANELA SE FECHA
        janela.setVisible(true); //DEIXA A JANELA VISIVEL
        janela.setLocationRelativeTo(null); //DIZ ONDE A JANELA APARECE
        janela.setSize(500, 500); //IDENTIFICA O TAMANHO DA JANELA
        
        janela.setLayout(null);
        
        
        JButton botao = new JButton("CLIQUE AQUI!"); //DECLARA O BOTÃO
        botao.setBounds(115, 110, 150, 25); //DIZ ONDE ELE APARECE NA JANELA
        
        JLabel texto = new JLabel("TEXTO PADRÃO"); //DECLARA O TEXTO
        texto.setBounds(200, 200, 150, 50); //DIZ ONDE ELE APARECE NA JANELA
        
        JTextField input = new JTextField(); // DECLARA A CAIXA DE TRANSCRIÇÃO
        input.setBounds(200, 400, 150, 50); // DIZ ONDE ELA APARECE NA JANELA
        
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String mensagem = input.getText();
                texto.setText(mensagem);
            }
        });
        
        janela.add(input); // ADICIONA A CAIXA DE TRANSCRIÇÃO
        janela.add(texto); //ADICIONA O TEXTO 
        janela.add(botao, BorderLayout.CENTER); //ADICIONA O BOTÃO E DIZ ONDE ELE APARECE NA JANELA
    }
}
