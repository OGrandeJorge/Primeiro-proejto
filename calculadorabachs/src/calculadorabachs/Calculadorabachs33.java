package calculadorabachs;
import javax.swing.JOptionPane;

public class Calculadorabachs {

    public static void main(String[] args) {
       
       String o1 =
            JOptionPane.showInputDialog( "Digite a operação desejada, seguindo os modelos : soma, subtracao, multiplicacao, divisao"); 
       String n1 =
            JOptionPane.showInputDialog( "Digite o primeiro número da sua operação (apenas números inteiros):");
       String n2 =
            JOptionPane.showInputDialog( "Digite o segundo número da sua operação (apenas números inteiros):");
       float nm1 = Integer.parseInt ( n1 );
       float nm2 = Integer.parseInt ( n2 );
            
       if(o1.equals("soma") ){  
            float soma = nm1 + nm2;           
            JOptionPane.showMessageDialog( null," o resultado da sua soma é " +soma, ".", JOptionPane.PLAIN_MESSAGE);    
       }else{
            if(o1.equals("subtracao") ){  
               float subtracao = nm1 - nm2;           
               JOptionPane.showMessageDialog( null," o resultado da sua subtração é " +subtracao, ".", JOptionPane.PLAIN_MESSAGE); 
            }else{
               if(o1.equals("multiplicacao")){ 
                   float multiplicacao = nm1 * nm2;
                   JOptionPane.showMessageDialog( null," o resultado da sua multiplicação é " +multiplicacao, ".", JOptionPane.PLAIN_MESSAGE);
               }else{
                  if(o1.equals("divisao")){
                     float divisao = nm1/nm2;
                     JOptionPane.showMessageDialog( null," o resultado da sua divisão é " +divisao, ".", JOptionPane.PLAIN_MESSAGE);
                  }else{
                     JOptionPane.showMessageDialog( null," operação inexistente", ".", JOptionPane.PLAIN_MESSAGE);
               }
            }      
        }
     }
    }
}
    

