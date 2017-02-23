public class Proov1{
    public static void main(String[] args){

        KarpJaVurrud massiiv=AndmeteLooja.arvudFailist("v22rtused.txt", ",");
        System.out.println(massiiv);
        System.out.println(massiiv.maksimum());
        System.out.println(massiiv.minimum());

    }
}