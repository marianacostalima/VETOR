import java.util.Scanner;

public class ExVetor {
    final static Scanner teclado = new Scanner(System.in);

    //lerInt = ler n
    public static int lerInt(){
        int valor;
        valor = teclado.nextInt();
        return valor;
    }

    //ler e imprimir o vetor
    public static void imprimirVetorIinteiro(int[] vet){
        for (int i = 0; i < vet.length; i++) {
            System.out.println("posição: [" + i + "]; seu numero: " + vet[i]);
            System.out.println();
        }
    }

    //ler o vetor inteiro 
    public static int [] lerVetorInteiros(int tamanho){
        int[] vet;
        vet = new int[tamanho];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = lerInt();
        }
        return vet;
    }

    //encontra o maior
    public static int encontrarMaior(int[] vet){
        int maior = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > maior){
                maior = vet[i];
            } 
        }
        return maior;
    }

    //encontra o medio
    public static float encontrarMedia(int[] vet){
        int soma = vet[0];

        for (int i = 1; i < vet.length; i++) {
            soma = soma + vet[i];
        }

        float media = soma / vet.length;
        return media;
    }

    //encontra o menor
    public static int encontrarMenor(int[] vet){
        int menor = vet[0];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] < menor){
                menor = vet[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int [] meuVetor;
        meuVetor = lerVetorInteiros(5);

        //imprimindo a posição e o numero digitado
        imprimirVetorIinteiro(meuVetor);

        //encontra o maior 
        int maior = encontrarMaior(meuVetor);
        System.out.println("maior: "+ maior);
        System.out.println();

        //encontra a media
        float media = encontrarMedia(meuVetor);
        System.out.println("media: "+ media);
        System.out.println();

        //encontra o menor 
        int menor = encontrarMenor(meuVetor);
        System.out.println("menor: "+ menor); 

        
    }
}