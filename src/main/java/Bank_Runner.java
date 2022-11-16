public class Bank_Runner {

    private boolean firstName;
    private boolean accountNumber;

    public static void main(String[] args) {
        Bank_Runner aron = new Bank_account("Aron", "73625354", 35);
        Bank_Runner anna = new Bank_account("Anna", "43256785", 35);



        System.out.println(aron.firstName); //"Aron"
        System.out.println(anna.firstName); //"Anna"
        System.out.println(anna.accountNumber); // "43256785"
        System.out.println(aron.accountNumber); // "73625354"


        System.out.println(anna.generateBio());
        System.out.println(aron.generateBio());

        ;

        System.out.println(anna.());
    }



}

