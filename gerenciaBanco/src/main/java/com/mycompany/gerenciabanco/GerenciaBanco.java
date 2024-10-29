/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

import java.util.Scanner;

class ContaBancaria {
    public String nome;
    public String sobrenome;
    public String cpf;
    public double saldo;
    
    public ContaBancaria (String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    
    public double consultarSaldo(){
        return saldo;
    } 
    
    public void depositar (double valor){
        saldo += valor;
        System.out.println("Deposito de RS + " + valor + "realizado com sucesso");
    }
    
    public void sacar (double valor){
        if(saldo >= valor){
            saldo-=valor;
            System.out.println("Saque de RS + " + valor + "realizado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void exibirMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n-------Menu-------");
            System.out.println("1.Consultar Saldo");
            System.out.println("2.Realizar Deposito");
            System.out.println("3.Realizar Saque");
            System.out.println("4.Sair");
            System.out.println("Escolha uma opcao");
            System.out.println("-----------------");
            opcao = scanner.nextInt();
            
            switch(opcao){
                case 1 -> System.out.println("Saldo: RS " + consultarSaldo());
                
                case 2 -> {
                    System.out.println("Digite o valor do deposito");
                    double valorDeposito = scanner.nextDouble();
                }
                
                case 3 -> {
                    System.out.println("Digite o valor do saque");
                    double valorSaque = scanner.nextDouble();
                    sacar(valorSaque);
                }
                
                case 4 -> System.out.println("Volte sempre!");
                default -> System.err.println("opcao invalida");
            }
            
        }while(opcao!=4);
        
        scanner.close();
    }
    
    

/**
 *
 * @author Márcio
 */
public class GerenciaBanco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.err.println("Bem-vindo(a) ao Banco");
        System.err.println("Digite o seu nome");
        String nome = scanner.nextLine();
        
        System.err.println("Digite o seu sobrenome");
        String sobrenome = scanner.nextLine();
        
        System.err.println("Digite o seu cpf");
        String cpf = scanner.nextLine();
        
        ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);
        
        conta.exibirMenu();
        
        System.out.println("Obrigado por usar os nossos servicos!");
        scanner.close();
        
    }

    }
}
