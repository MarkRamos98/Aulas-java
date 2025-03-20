package Controller;

import static View.Inicio_GUI.Altura1;
import static View.Inicio_GUI.IMC1;
import static View.Inicio_GUI.Peso1;
import static View.Inicio_GUI.img1;
import static View.Inicio_GUI.img2;
import static View.Inicio_GUI.img3;
import static View.Inicio_GUI.img4;
import static View.Inicio_GUI.img5;
import static View.Inicio_GUI.img6;
import javax.swing.JOptionPane;


public class Calcula_DAO {
    
    public static void calc_imc(){
        
      double IMC = 0 , Peso = 0 , Altura = 0;
     
      Peso = Double.parseDouble(Peso1.getText());
      
      Altura = Double.parseDouble(Altura1.getText());
      
      IMC = Peso / (Altura * Altura);
      
      String res = String.format("%.2f",IMC);
      
      IMC1.setText(String.valueOf(IMC));
      
      if(IMC <18.5){
      
          JOptionPane.showMessageDialog(null," Abaixo do Peso \n Risco de Doença: Normal ou Elevado");
          img1.setVisible(true);
          
        }else if(IMC == 18.5 && IMC == 24.9){
    
            JOptionPane.showMessageDialog(null,"Classificação:Normal ou Eutrófico \n Risco de Doença: Pouco Elevado");
            img2.setVisible(true);
        
        }else if(IMC == 25 && IMC == 29.9){
    
            JOptionPane.showMessageDialog(null,"Classificação:Sobrepeso ou Pré-obeso  \n Risco de Doença: Pouco Elevado");
            img3.setVisible(true);
        
        }else if(IMC == 30 && IMC == 34.99){
    
            JOptionPane.showMessageDialog(null,"Classificação:Obesidade \n Risco de Doença: Elevado");
            img4.setVisible(true);
        
        }else if(IMC == 35 && IMC == 39.99){
    
            JOptionPane.showMessageDialog(null,"Classificação:Obesidade \n Risco de Doença: Muito Elevado");
            img5.setVisible(true);
        
        }else if(IMC >= 40){
    
            JOptionPane.showMessageDialog(null,"Classificação:Obesidade \n Risco de Doença: Muitissimo Elevado");
            img6.setVisible(true);
        
        }
    
    }
    public static void limpar(){
    
        Peso1.setText("");
        Altura1.setText("");
        IMC1.setText("");
                
    }
        
}
