public class App {
    public static void main(String[] args) throws Exception {
        char var = 'a';
        System.out.println(var);

        int var2 = var;
        System.out.println(var2);

        double var3 = var2;
        System.out.println(var3);

        float var4 = (float)var3;
        System.out.println(var3);
    
        for ( int x=0 ; x <= 10; x++){
            int y = F(x);
            System.out.println("("+ x + ","+ y +")");
        }
    }

    public static  int F(int x){ 
        int y =3*x*x + 2*x + 1;
        return y;
    }
}