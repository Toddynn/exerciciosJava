class exercicio7{
    public static void main(String[] args){
        int nota1 = 7; 
        int nota2 = 6;
        float media;

        media = (nota1 + nota2)/2;

        if(media == 10){
            System.out.printf("Aprovado com distinção");
        }
        else if(media >= 7){
            System.out.printf("Aprovado");
        }
        else{
            System.out.printf("reprovado");
        }
    }
}