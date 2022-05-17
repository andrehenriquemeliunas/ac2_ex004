import java.util.Scanner;
public class ac2_ex004{
    public static void main( String[] args){
        int sexo = 0, idade = 0;
        float altura, medGeral = 0, medIdadeHomem = 0, medAltMulher = 0;

        Scanner s = new Scanner( System.in);

        for(int i=0; i<10; i++){
            
            System.out.print("Sexo ( 0-Fem / 1-Masc /2-Outro): ");
            sexo = s.nextInt();

            System.out.print("Idade: ");
            idade = s.nextInt();

            System.out.print("Altura: ");
            altura = s.nextFloat();

            if(sexo == 1){
                //int somaIdade = idade + idade;
                //medIdadeHomem = somaIdade / 10;
                medIdadeHomem += idade;
            }
        
        }
            System.out.print(medIdadeHomem/10);
        

        s.close();
    }
}