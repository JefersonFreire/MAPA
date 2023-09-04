/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unicesumar.ead.prog1.ATVMAPA;

import javax.swing.JOptionPane;


/**
 *
 * @author JFrei
 */
public class MAPA {

    public static void main(String[] args) {
        int op = 5;       
        
        while(op != 4){
           op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de exame: \n1 - Glicemia \n2 - Colesterol \n3 - Triglicerídeos \n4 - Sair"));
          switch(op){
              case 1: 
                  Glicemia glicemia = new Glicemia();
                  glicemia.CadastrarExame();
                  glicemia.MostrarResultado();
                  break; 
              case 2:
                  Colesterol colesterol = new Colesterol();
                  colesterol.CadastrarExame();
                  colesterol.MostrarResultado();
                  break;
              case 3:
                   Triglicerideos triglicerideo = new Triglicerideos();
                   triglicerideo.CadastrarExame();
                   triglicerideo.MostrarResultado();
                   break;
              default: JOptionPane.showMessageDialog(null, "Sair!");                  
          }
            
        }
    }
}
