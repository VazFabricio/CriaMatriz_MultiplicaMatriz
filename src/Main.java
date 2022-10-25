import java.util.Random;

public class Main {
    /**
     * Soma cada coluna de uma matriz e gera um vetor resultante
     * @param matriz Matriz gerada aleatoriamente, e que sera usada para as operacoes dentro do programa
     * @return Um Vetor com a soma de cada coluna da Matriz fornecida
     */
    private static int [] somarColunas (int [][] matriz) {
        int[] somaCol = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
                somaCol[j] = soma;
            }
        }
        return somaCol;
    }

    /**
     * Soma os elementos de um vetor
     * @param vetor Vetor para ser somado
     * @return um Inteiro resultado da soma dos elementos de um Vetor
     */
    private static int somarElementos(int [] vetor){
        int soma = 0;
        for (int i = 0; i< vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }

    /**
     * Multiplica cada elemento de uma Matriz por um Inteiro
     * @param matriz Matriz a ser multiplicada
     * @param x Inteiro multiplicador da Matriz
     * @return Uma Matriz atualizada apos a multiplicacao de cada um de seus elementos por um Inteiro
     */
    private static int [][] multiplicarMatriz(int [][] matriz, int x){
        int [][] matrizMultiplicada = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizMultiplicada[i][j] = (matriz[i][j] * x);
            }
        }
        return  matrizMultiplicada;
    }

    /**
     * Exibe uma Matriz 2D na tela
     * @param matriz Matriz a ser exibida na tela
     */
    private static void exibreArray2D(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    /**
     * Exibe um vetor na tela
     * @param vetor Vetor a ser exibido na tela
     */
    private static void exibreArray1D(int [] vetor) {
        System.out.print("| ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+" | ");
            }
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        //Cria uma Matriz 2D com numeros aleatorios entre 9 e 10
        int[][] numeros = new int[10][5];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = aleatorio.nextInt(0, 10);
            }
        }
        System.out.println("--Matriz Formada--");
        exibreArray2D(numeros);
        System.out.println("------------------");
        int [] resultSoma = somarColunas(numeros);
        System.out.println("Vetor resultado da soma das colunas da Matriz");
        exibreArray1D(resultSoma);
        int somaDosElentosResultantes = somarElementos(resultSoma);
        System.out.println(" ");
        System.out.println("A soma dos numeros do vetor resultante = "+somaDosElentosResultantes);
        System.out.println("--Matriz Atualizada--");
        int [][] matrizMultiplicada = multiplicarMatriz(numeros, somaDosElentosResultantes);
        exibreArray2D(matrizMultiplicada);
        System.out.println("--------------------");

    }
}