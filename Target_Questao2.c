#include <stdio.h>

int main() {

    int numeroEscolhido, cont;

    printf ("Sequencia de Fibonacci\n");

    printf ("Informe o numero a ser calculado:");
    scanf ("%d", &numeroEscolhido);

    unsigned long long int vetor [numeroEscolhido + 1];

    //Calcula a sequencia de Fibonacci conforme o numero escolhido
    vetor[0] = 0;
    vetor[1] = 1;

    for (cont = 2; cont <= numeroEscolhido; cont++){
        vetor [cont] = vetor [cont - 1] + vetor [cont - 2];
        printf ("%llu\n", vetor[cont]);
    }

    printf ("Fib(%d) = %llu\n", numeroEscolhido, vetor [numeroEscolhido]);

    //Verifica se o numero escolhido pertence a sequencia calculada

   int numeroSequencia = 0;

   for (int i = 0; i < numeroEscolhido + 1; i++){
         if(vetor[i] == numeroEscolhido){
            numeroSequencia = vetor[i];
         }
   }

    // Impressão informando se o numero pertence a sequencia ou não
    if(numeroSequencia != 0){

            printf ("%d faz parte da sequencia de Fibonacci ", numeroSequencia);
        }
        else{

            printf ("%d nao pertence a sequencia de Fibonacci ", numeroEscolhido);
        }

	return 0;
}
