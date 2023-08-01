/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto02.java;

import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import views.interface01;
import views.Interface02;
import views.Interface03;
import views.interface04;

public class Semana02_java {
    
    private static JFrame view;
    
    public static void main(String[] args) {
        view = new interface04();
        view.setVisible(true);
        
        //new interface04().setVisible(true);
        //new Interface03().setVisible(true);
        //new Interface02().setVisible(true);
        //metodoJoption(); 
        createIconTray();
    }
    
    public static void createIconTray(){
        if(!SystemTray.isSupported()){
            System.out.println("Não tem suporte.");
            return;
        }
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "assets" + File.separator + "tray.png";
        
        Image icon = new ImageIcon(path).getImage();
        PopupMenu menu = new PopupMenu();
        MenuItem fechar = new MenuItem("FECHAR");
        MenuItem open = new MenuItem("ABRIR");
        menu.add(open);
        menu.add(fechar);
        
        open.addActionListener((ActionEvent) -> {
            view.setVisible(true);
        });
        
        fechar.addActionListener((ActionEvent) -> {
            System.exit(0);
        });
        
        TrayIcon tray = new TrayIcon(icon, "Pomodoro");
        
        SystemTray bandeja = SystemTray.getSystemTray();
        
        try{
            bandeja.add(tray);
        }catch(Exception e){
            System.out.println("Não foi possivel adicionar o Try...");
        }
        
    }
    
    public static void metodoJoption() {
        String nome = JOptionPane.showInputDialog("Informe seu nome!");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?", "Idade", JOptionPane.INFORMATION_MESSAGE));
        
        int compartilhar = JOptionPane.showConfirmDialog(null, "Deseja compartilhar suas informações?");
        if(compartilhar == JOptionPane.YES_OPTION){
            System.out.println("Você vai compartilhar suas informações");
        }else if(compartilhar == JOptionPane.NO_OPTION){
            System.out.println("Você não vai compartilhar suas informações");
        }else if(compartilhar == JOptionPane.CANCEL_OPTION){
            System.out.println("Você não autorizou o compartilhamento... finalizamos por aqui.");
        }
       
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja confirmar cadastro", "Cadastro", JOptionPane.YES_NO_OPTION);
        if(confirmar == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "DEU CERTO!");
        }else if(confirmar == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "DEU ERRADO!");
        }
        
        //JOptionPane.showMessageDialog(null, "DEU CERTO!");
        //JOptionPane.showMessageDialog(null, "Mensagem Teste", "Teste", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void metodoScanner(){
         //FAKE BANCO DE DADOS
        String nomeAlunos[] = new String[5];
        boolean situacaoAlunos[] = new boolean[5];
        double alturaAlunos[] = new double[5];
        int idadeAlunos[] = new int[5];
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 0; i < nomeAlunos.length; i++){
            System.out.println("Informe seu nome: ");
            nomeAlunos[i] = leitor.nextLine();
            System.out.println("Você estuda?");
            situacaoAlunos[i] = leitor.nextBoolean();
            System.out.println("Qual é a sua altura?");
            alturaAlunos[i] = leitor.nextDouble();
            System.out.println("Qual é a sua idade?");
            idadeAlunos[i] = leitor.nextInt();
        }
        
        for(int i = 0; i < nomeAlunos.length; i++){
            System.out.println("Nome: " + nomeAlunos[i] +" Estuda: "+ situacaoAlunos[i] +" Altura: "+ alturaAlunos[i] +" Idade: "+ idadeAlunos[i]);
        }
        
        leitor.useDelimiter(",");
        
        while(leitor.hasNextInt()){
            int numero = leitor.nextInt();
            System.out.println("Numero: "+ numero);
            leitor.skip(",");
        }
    }
    
    
}