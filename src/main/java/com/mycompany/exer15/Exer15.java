/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exer15;

import javax.swing.JOptionPane;

public class exer15 {
  public static void main(String[] args) {
    String nome;
    int idade;
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
    if ((idade > 15) && (idade < 25)) {
      JOptionPane.showMessageDialog(null, nome + " ACEITA! ");
    } else {
      JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA! ");
    }
  }
}