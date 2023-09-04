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
public class Triglicerideos extends Exames{
    
    private int quantidadeTriglicerideo;
    private String triglicerideo;
    
    public String ClassificarResultado(){
        
        if(super.getIdade() <= 9 && quantidadeTriglicerideo < 75){
             triglicerideo = "Triglicerídeo BOM";
        }else if(super.getIdade() >= 10 && super.getIdade()<=19 && quantidadeTriglicerideo < 90){        
             triglicerideo = "Triglicerídeo BOM";
         }else if(super.getIdade() >=20 && quantidadeTriglicerideo < 150){        
             triglicerideo = "Triglicerídeo BOM";
           }else{        
               triglicerideo = "Triglicerídeo RUIM";
         }
        return triglicerideo;           
    }
    
    @Override
    public void CadastrarExame(){
        
        super.CadastrarExame();
        setQuantidadeTriglicerideo(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de triglicerídeo: ")));
    }
    
    @Override
    public void MostrarResultado(){
        
        JOptionPane.showMessageDialog(null,"Exame de Triglicerídeos\nPaciente: "
                +super.getNome()+"\nIdade: "+super.getIdade()+"\nTipo sanguíneo: "+super.getTipoSanguineo()+
                "\nResultado Triglicerídeo: "+quantidadeTriglicerideo+
                "\nClassificação: "+ClassificarResultado());
        
    }

    public int getQuantidadeTriglicerideo() {
        return quantidadeTriglicerideo;
    }

    public void setQuantidadeTriglicerideo(int quantidadeTriglicerideo) {
        this.quantidadeTriglicerideo = quantidadeTriglicerideo;
    }

    public String getTriglicerideo() {
        return triglicerideo;
    }

    public void setTriglicerideo(String triglicerideo) {
        this.triglicerideo = triglicerideo;
    }      
}