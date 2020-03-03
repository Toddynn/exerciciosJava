class exercicio5{
    public static void main(String[] args){
        long fat = 1;
        int n;
        
        // a partir do fatorial 20 a variável estora e n é possivel correr o código corretamente

        for(n=1; n<=40; n++){
            fat = fat * n;
            System.out.println("fatorial de" + n + "! = " + fat);
        }                               
    }
}