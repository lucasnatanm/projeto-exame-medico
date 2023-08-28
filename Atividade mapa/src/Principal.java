public class Principal{
    public static void main(String[] args) throws Exception {
   
    Glicemia glicemia = new Glicemia();
        glicemia.cadastrarExame();
        glicemia.classificarResultado();          
        glicemia.mostrarResultado();

    Colesterol colesterol = new Colesterol();
        colesterol.cadastrarExame();
        colesterol.classificarResultado();
        colesterol.mostrarResultado();

    Triglicerídeos triglicerídeos = new Triglicerídeos();
        triglicerídeos.cadastrarExame();    
        triglicerídeos.classificarResultado();
        triglicerídeos.mostrarResultado(); 
                      
    }
}
