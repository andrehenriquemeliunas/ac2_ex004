import java.util.Scanner;
public class ac2_ex004{
    public static void main( String[] args){
        int sexo = 0, idade = 0, contOut = 0, contPer = 0;//Declaração das variáveis
        float altura, medGeral = 0, medIdadeHomem = 0, medAltMulher = 0;//Declaração das variáveis

        Scanner s = new Scanner( System.in);//Inicia o scanner

        for(int i=0; i<10; i++){//Início laço de repetição
            
            System.out.print("Sexo (0-Fem / 1-Masc /2-Outro): ");//Print para perguntar o sexo
            sexo = s.nextInt();//Armazena a resposta

            System.out.print("Idade: ");//Print para perguntar o idade
            idade = s.nextInt();//Armazena a resposta

            System.out.print("Altura: ");//Print para perguntar o altura
            altura = s.nextFloat();//Armazena a resposta

            if(sexo == 0){//Condição se o sexo é feminino para calcular a media altura 
                medAltMulher += altura;//Adiciona os valores de altura a variavel medAltMulher
            }else if(sexo == 1){//Condição se o sexo é masculino para calcular a media idade
                medIdadeHomem += idade;//Adiciona os valores de idade na variavel medIdadeHomem
            }else{//Caso não seja nenhuma das anteriores, ou seja, a opção 2 - outros
                contOut++;//Adiciona a quantidade de vezes que escolheram a opção 2 na variável contOut
            }

            if(idade > 18 && idade <= 35){//Condição para verificar se tem idades entre 18 e 35 anos 
                contPer = contPer + 1;//Adiciona a quantidade de pessoas que está nessa condição na variável contPer
            }

            medGeral += idade;//Coloca todas as idades na variável medGeral
        
        }
        System.out.println("Média geral das idade: " + medGeral/10);//Mostra a média geral de idades de todos os grupos
        System.out.println("Média das alturas das mulheres: " + medAltMulher/10);//Mostra a média de altura das mulheres
        System.out.println("Média das idade dos homens: " + medIdadeHomem/10);//Mostra média de idade dos homens
        System.out.println("Pessoas que se identificaram com outros: " + contOut);//Mostra a quantidade de pessoas que se idenficaram como outro
        System.out.print("Pessoas entre 18 e 35 anos: " + contPer);//Mostra a quantidade de pessoas com idade entre 18 e 35 anos
        

        s.close();//Fecha o scanner
    }
}


//a) média da idade do grupo;
//b) média da altura das mulheres; FEITO
//c) média da idade dos homens; FEITO
//d) quantidade de pessoas que identificaram como outros;FEITO
//e) percentual de pessoas com idade entre 18 e 35 anos (inclusive).FEITO