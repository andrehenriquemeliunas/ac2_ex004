import java.util.Scanner;
public class ac2_ex004{
    public static void main( String[] args){
        int sexo, idade;
        float altura, medGeral, medIdadeHomem, medAltulher, contMih, contMam;

        Scanner s = new Scanner( System.in);
        for(int i=0; i<10; i++){
            System.out.print("Sexo ( 0-Fem / 1-Masc /2-Outro): ");
            sexo = s.nextInt(i);

            System.out.print("Idade: ");
            idade = s.nextInt(i);

            System.out.print("Altura: ");
            altura = s.nextFloat();

            if(sexo == 1){
                medIdadeHomem = medIdadeHomem + idade(i);
                contMih++;
            }

        }

        s.close();
    }
}