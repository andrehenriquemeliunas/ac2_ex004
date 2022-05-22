import java.util.Scanner;
public class ac2_ex004{
    public static void main( String[] args){
        int sexo = 0, idade = 0, contOut = 0, contPer = 0;
        float altura, medGeral = 0, medIdadeHomem = 0, medAltMulher = 0;

        Scanner s = new Scanner( System.in);

        for(int i=0; i<10; i++){
            
            System.out.print("Sexo (0-Fem / 1-Masc /2-Outro): ");
            sexo = s.nextInt();

            System.out.print("Idade: ");
            idade = s.nextInt();

            System.out.print("Altura: ");
            altura = s.nextFloat();

            if(sexo == 0){
                medAltMulher += altura;
            }else if(sexo == 1){
                medIdadeHomem += idade;
            }else{
                contOut++;
            }

            if(idade > 18 && idade <= 35){
                contPer = contPer + 1;
            }
        
        }
        //System.out.print(idade/1);
        System.out.println("Média das alturas das mulheres: " + medAltMulher/10);
        System.out.println("Média das idade dos homens: " + medIdadeHomem/10);
        System.out.println("Pessoas que se identificaram com outros: " + contOut);
        System.out.print("Pessoas entre 18 e 35 anos: " + contPer);
        

        s.close();
    }
}


//a) média da idade do grupo;
//b) média da altura das mulheres; FEITO
//c) média da idade dos homens; FEITO
//d) quantidade de pessoas que identificaram como outros;FEITO
//e) percentual de pessoas com idade entre 18 e 35 anos (inclusive).FEITO