public class Proov1{
    public static void main(String[] args){

        KarpJaVurrud massiiv=AndmeteLooja.arvudFailist("v22rtused.txt", ",");

        System.out.println(massiiv);

        System.out.println(massiiv.maksimum());
        System.out.println(massiiv.minimum());

        System.out.println(massiiv.on25v2iksemad());
        System.out.println(massiiv.on50v2iksemad());
        System.out.println(massiiv.on75v2iksemad());

    }
}