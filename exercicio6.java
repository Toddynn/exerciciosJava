class exercicio6{
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int num = 0;

        while(n1<100){
            System.out.println(n1);
            num = n1 + n2;
            n1 = n2;
            n2 = num;
        }
    }
}