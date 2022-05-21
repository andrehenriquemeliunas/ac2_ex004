import java.util.Scanner;
public class ac2_ex004{
    public static void main( String[] args){
        int sexo = 0, idade = 0, contOut = 0, contPer = 0;
        float altura, medGeral = 0, medIdadeHomem = 0, medAltMulher = 0;

        Scanner s = new Scanner( System.in);

        for(int i=0; i<3; i++){
            
            System.out.print("Sexo (0-Fem / 1-Masc /2-Outro): ");
            sexo = s.nextInt();

            System.out.print("Idade: ");
            idade = s.nextInt();

            System.out.print("Altura: ");
            altura = s.nextFloat();

            if(sexo == 1){
                medIdadeHomem += idade;
            }else if(sexo == 0){
                medAltMulher += altura;
            }else if(idade >= 35){
                contPer += 1;
            }else if(sexo == 2){
                contOut++;
            }
        
        }
        //System.out.print(medIdadeHomem/5); FEITO
        //System.out.print(medAltMulher/3);FEITO
        //System.out.print(idade/3);
        //System.out.print(contOut);FEITO
        System.out.print(contPer);
        

        s.close();
    }
}