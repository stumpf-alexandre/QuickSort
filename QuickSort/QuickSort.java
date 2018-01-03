package QuickSort;

public class QuickSort {
    public static void redefinir(int vetor[], int esquerdo, int direito){
        int esq=esquerdo;
        int dir=direito;
        int pivo=vetor[(esq+dir)/2];
        int aux;
        while (esq<+dir){
            while (vetor[esq]<pivo){
                esq=esq+1;
            }
            while (vetor[dir]>pivo){
                dir=dir-1;
            }
            if (esq<=dir){
                aux=vetor[esq];
                vetor[esq]=vetor[dir];
                vetor[dir]=aux;
                esq=esq+1;
                dir=dir-1;
            }
        }
        if (dir>esquerdo){
            redefinir(vetor, esquerdo, dir);
        }
        if (esq<direito){
            redefinir(vetor, esq, direito);
        }
    }

    public static void main(String[] args) {
        int vet[]={20, 3, 8, 99, 1000, 23, 61, 21, 7, 0};
        redefinir(vet,0,vet.length-1);
        System.out.println("Numeros Redefinidos: ");
        for (int i=0; i<vet.length;i++){
            System.out.printf(" "+vet[i]);
        }
    }
}
