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
public class Glicemia extends Exames{
    
    private int quantidadeGlicose;
    
    
    public String ClassificarResultado(String glicose){
        
        if(quantidadeGlicose < 100){
            return glicose = "Normoglicemia";
            
        }else if(quantidadeGlicose >= 100 && quantidadeGlicose < 126){
            return glicose = "Pré-diabetes";
            
        }else if(quantidadeGlicose >= 126){
            return glicose = "Diabetes estabelecido";            
        }        
        return glicose;        
    }
    
    @Override
     public void CadastrarExame(){  
         
        super.CadastrarExame();
        quantidadeGlicose = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de glicose:"));
     }
    
    @Override
    public void MostrarResultado(){
        
        JOptionPane.showMessageDialog(null,"Exame de Glicemia\nPaciente: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nTipo sanguíneo: "+super.getTipoSanguineo()+"\nResultado: "+quantidadeGlicose
        +"\nClassificação: "+ClassificarResultado(""));        
    }

    public int getQuantidadeGlicose() {
        return quantidadeGlicose;
    }   

    public void setQuantidadeGlicose(int quantidadeGlicose) {
        this.quantidadeGlicose = quantidadeGlicose;        
    }        
}
