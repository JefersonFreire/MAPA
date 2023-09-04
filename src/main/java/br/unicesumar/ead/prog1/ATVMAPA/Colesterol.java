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
public class Colesterol extends Exames{
    
    private int quantidadeHDL;
    private int quantidadeLDL;    
    private String risco;
    
    public String ClassificarResultado(String colesterolBom ){  
        
        if(super.getIdade() <= 19 && quantidadeHDL > 45){
             colesterolBom = "HDL BOM";
        }else if(super.getIdade() > 20 && quantidadeHDL > 40){        
             colesterolBom = "HDL BOM";
    }else{
             colesterolBom = "HDL RUIM";            
    }
        return colesterolBom;
}
    
    public String ClassificarResultado(){
        
       String colesterolRuim = "";      
       
       if(risco.equals("B") && quantidadeLDL < 100){
           colesterolRuim = "LDL BOM";
       }else if(risco.equals("M") && quantidadeLDL < 70){
           colesterolRuim = "LDL BOM";
       }else if(risco.equals("A") && quantidadeLDL < 50){
           colesterolRuim = "LDL BOM";
       }else{
           colesterolRuim = "LDL RUIM";
       }
        return colesterolRuim;
    }
          
    @Override
     public void CadastrarExame(){
         
        super.CadastrarExame();
        setQuantidadeHDL(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de HDL:")));
        setQuantidadeLDL(Integer.parseInt(JOptionPane.showInputDialog("\nDigite a quantidade de LDL:")));
        setRisco(JOptionPane.showInputDialog("Digite o risco do paciente(B - baixo, M - médio, A - alto)"));
    }
     
    @Override
     public void MostrarResultado(){      
        
      JOptionPane.showMessageDialog(null,"Exame de Colesterol\nPaciente: "+super.getNome()+"\nIdade: "+super.getIdade()+"\nTipo sanguíneo: "+super.getTipoSanguineo()+"\nResultado HDL: "
                 +getQuantidadeHDL()+"\nResultado LDL: "+getQuantidadeLDL()+"\nResultado Risco: "+getRisco('B')+"\nClassificação: "+ClassificarResultado(risco)+"\n"+ClassificarResultado());
     }

    public int getQuantidadeHDL() {
        return quantidadeHDL;
    }

    public void setQuantidadeHDL(int quantidadeHDL) {
        this.quantidadeHDL = quantidadeHDL;
    }

    public int getQuantidadeLDL() {
        return quantidadeLDL;
    }

    public void setQuantidadeLDL(int quantidadeLDL) {
        this.quantidadeLDL = quantidadeLDL;
    }

    public String getRisco(char par) {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }
}
