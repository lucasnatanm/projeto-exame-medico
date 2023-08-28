import javax.swing.JOptionPane;

class Glicemia extends Exames {
    private int qtdGlicose;
    private String resulglicose;
    private int idade;

        String classificarResultado(){
            qtdGlicose = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de glicose: "));

        if (qtdGlicose < 100){
           resulglicose = "Normoglicemia";
        } else if ((qtdGlicose >= 100) && (qtdGlicose < 126)){
           resulglicose = "Pré-diabetes";
        } else if (qtdGlicose >= 126){
            resulglicose = "Diabetes";
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível fazer a pesquisa, valor da glicemia esta incorreto.");
        }
        return resulglicose;
        }
        String cadastrarExame(){
            nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente");
            tipoSangue = JOptionPane.showInputDialog("Digite o tipo sanguíneo");
            anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
            idade = (2023 - anoNascimento);
        return nomePaciente + tipoSangue + idade;
        }    
         String mostrarResultado(){
            JOptionPane.showMessageDialog(null, "O reultado é: " + resulglicose + ", o nome do paciente é: " + nomePaciente + ", o tipo sanguíneo é:  " + tipoSangue + " e a idade: " + idade);
        return resulglicose;
        }   
} 
