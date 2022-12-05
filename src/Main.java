public class Main {
    public static void main(String[] args) {
        System.out.println("\n *********** Test Case for Kid User **************\n");
        KidUser Mila = new KidUser();
        Mila.setAge(10);
        Mila.registerAccount();
        System.out.println("_____________________");
        Mila.setAge(18);
        Mila.registerAccount();
        System.out.println("_____________________");
        Mila.setBookType("Kids");
        Mila.requestBook();
        System.out.println("_____________________");
        Mila.setBookType("Fiction");
        Mila.requestBook();

        System.out.println("\n*********** Test Case for Adult User **************\n");
        AdultUser Lana = new AdultUser();
        Lana.setAge(5);
        Lana.registerAccount();
        System.out.println("_____________________");
        Lana.setAge(23);
        Lana.registerAccount();
        System.out.println("_____________________");
        Lana.setBookType("Kids");
        Lana.requestBook();
        System.out.println("_____________________");
        Lana.setBookType("Fiction");
        Lana.requestBook();

    }
}