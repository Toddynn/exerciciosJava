class exercicio{
    public static void main(String[] arg){
        int i = 150;
        int j = 1;

        while(i <= 300){
            System.out.println("[" + i + "] ");
            i = i + 1;
        }

        while(j <= 1000){
            System.out.println("[" + j + "] ");
            j = j + 1;
        }

        int l = 0;
        int result = 0;

        for(l = 0; l <= 1000; l++){
            result = 1 / 3; 
            if(result % 3 == 0){
                System.out.println("\n(" + l + ") ");

            }
        }
    }
}