import javax.swing.JOptionPane;

public class Triglicerídeos extends Exames {
    private String resultrigli;
    private int idade;

    
    String cadastrarExame(){
        nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente");
        tipoSangue = JOptionPane.showInputDialog("Digite o tipo sanguíneo");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        idade = (2023 - anoNascimento);

    return nomePaciente + tipoSangue + idade;
    }    

    String classificarResultado(){
        int qtdtrigi = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de triglicerídeos: "));


    if ((idade < 9) && (qtdtrigi < 75)){
        resultrigli = ("Triglicerídeos BOM");
    } else if ((idade > 10) && (idade < 19) && (qtdtrigi <  90)){
        resultrigli = ("Triglicerídeos BOM");
    } else if ((idade > 20) && (qtdtrigi < 150)){
        resultrigli = ("Triglicerídeos BOM");
    }else{
        JOptionPane.showMessageDialog(null, "Não foi possível fazer a pesquisa, idade ou valor do triglicerídeos estão incorretos.");
    }
        return resultrigli;
    }
     String mostrarResultado(){
        JOptionPane.showMessageDialog(null, " O resultado é: " + resultrigli + ", o nome do paciente é " + nomePaciente + ", o tipo sanguíneo é: " + tipoSangue + " e a idade: " +  idade);
        return resultrigli;

    }   
} 