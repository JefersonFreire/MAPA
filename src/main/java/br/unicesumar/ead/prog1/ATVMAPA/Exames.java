/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unicesumar.ead.prog1.ATVMAPA;

import javax.swing.JOptionPane;

/**
 *
 * @author JFrei
 */
public class Exames {
    private String nome;
    private String tipoSanguineo;
    private int anoNascimento;
    private int idade;  


public void CadastrarExame(){
        
        setNome(JOptionPane.showInputDialog("Digite o nome:"));
        setTipoSanguineo(JOptionPane.showInputDialog("Digite o tipo sanguíneo:"));
        setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "))) ;
        this.idade = 2023 - anoNascimento;
}    
    public void MostrarResultado(){
        JOptionPane.showMessageDialog(null,"Paciente: "+getNome()+"\nIdade: "+getIdade());        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }       
}