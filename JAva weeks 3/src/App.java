public class App {
    public static void main(String[] args) throws Nbexception {
       

        GetFactorial(15);
    }

    public static int  GetFactorial(int nb) throws Nbexception{
        int resultat=1;
        if(nb>10 || nb<1){

            throw new Nbexception("We need a number beetwin 1 and 10");
        }
        for (int i=1;i<=nb;i++){
            resultat*=i;
            
        }

        return(resultat);

    }
}
