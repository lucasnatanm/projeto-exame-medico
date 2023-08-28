import javax.swing.JOptionPane;

public class Colesterol extends Exames {

    private String resulLDL;
    private String resulHDL;
    private int idade;
    
    String cadastrarExame(){
        nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente");
        tipoSangue = JOptionPane.showInputDialog("Digite o tipo sanguíneo");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        idade = (2023 - anoNascimento);
    return nomePaciente + tipoSangue + idade;
    }

        public String classificarResultado(){
            int qtdHDL = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de HDL: "));
            String risco = JOptionPane.showInputDialog("Digite o risco do paciente(alto, medio ou baixo)."); 
            String rmedio = "medio";
            String rbaixo =  "baixo";
            String ralto = "alto";
            int qtdLDL = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de LDL: "));

        if((idade < 19) && (qtdHDL > 45)){
            resulHDL = "HDL BOM";
        } else if ((idade >= 20) && (qtdHDL > 40)){
            resulHDL =  "HDL BOM";
        }
        
        if(risco.equals(rbaixo)){
             if ((qtdLDL > 70) && (qtdLDL <100)){
             resulLDL = "baixo risco";
        }
        }
        if(risco.equals(rmedio)){
            if ((qtdLDL > 50) && (qtdLDL < 70)){
             resulLDL = "medio risco";
        }
        }
        if(risco.equals(ralto)){
            if (qtdLDL < 50){
             resulLDL = "alto risco";  
        }
        } 
            
        
        return resulLDL + resulHDL;
    }
        public void mostrarResultado(){
            JOptionPane.showMessageDialog(null,"O resultado do exame de HLD é: " +  resulHDL + ", o resultado do exame de LDL é " + resulLDL + ", o nome do paciente é: " + nomePaciente + ", o tipo sanguíneo é: " + tipoSangue + " e a idade é: " + idade);
             
        }   
}
