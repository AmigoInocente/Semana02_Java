/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto02.java;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alisson_formento
 */
public class Projeto02Java {

    public static void main(String[] args) {
        metodoJOption();
    }
    
    public static void metodoJOption(){
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a sua idade?", "Idade", JOptionPane.INFORMATION_MESSAGE));
    
        int compartilhar = JOptionPane.showConfirmDialog(null, "Deseja compartilhar as suas informações?"); // pode ser usado como confirmação(deseja cadastrar esse usuário com este nome?)
        if(compartilhar == JOptionPane.YES_NO_OPTION){
            System.out.println("Você vai compartilhar suas informações");
        }else if(compartilhar == JOptionPane.NO_OPTION){
            System.out.println("Suas informações não serão compartilhadas");
        }else if(compartilhar == JOptionPane.CANCEL_OPTION){
            System.out.println("Você não autorizou compartilhamento... finalizamos por aqui.");
            System.exit(0);
        }
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar o usuário?", "Questionário", JOptionPane.YES_NO_OPTION);
        if(confirmar == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Deu certo!");
        }else if(confirmar == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Deu B.O A CASA CAIU MENÓ");}
        
        //JOptionPane.showMessageDialog(null, "Deu certo!");
        //JOptionPane.showMessageDialog(null, "Mensagem teste", "Teste", JOptionPane.ERROR_MESSAGE);
        
    }
    
    
    
    public static void metodoScanner(){
        
        String nomeAlunos[] = new String[5];
        boolean situacaoAlunos[] = new boolean[5];
        double alturaAlunos[] = new double [5];
        int idadeAlunos [] = new int[5];
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i <nomeAlunos.length; i++) {
        
        System.out.println("Informe seu nome: ");
        nomeAlunos[i] = leitor.nextLine();
        System.out.println("Você estuda?");
        situacaoAlunos[i] = leitor.nextBoolean();
        System.out.println("Qual é a sua altura?");
        alturaAlunos[i] = leitor.nextDouble();
        System.out.println("Qual é a sua idade?");
        idadeAlunos[i] = leitor.nextInt();
        }
            
        for(int i = 0; i < nomeAlunos.length; i++) {
            System.out.println("Nome: " + nomeAlunos[i] + " Estuda: " + situacaoAlunos[i] + " Altura: " + alturaAlunos[i] + " Idade: " + idadeAlunos[i]);
        }
        
        
          leitor.useDelimiter(",");
          
          while(leitor.hasNextInt()){
              int numero = leitor.nextInt();
              System.out.println("Numero: " + numero);
              leitor.skip(",");
          }
        
        
        //System.out.println("Olá "+nome+", tudo bem?");
        
    }
    
}
