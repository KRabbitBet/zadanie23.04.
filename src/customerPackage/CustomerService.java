package customerPackage;

import java.util.Scanner;
/* - dodawanie,
 - usuwanie(po id),
 - edytowanie(po id),
 - wyświetlanie wszystkich
*/

public class CustomerService {


    public void addCustomer() {
        System.out.println("Aby utworzyć nowego klienta, podaj dane w kolejności: imię, nazwisko, adres, numer telefonu.");

        Scanner humanData = new Scanner(System.in);
        String addNewCustomer = humanData.nextLine();
        if (addNewCustomer != null) {
 //           System.out.println("Udało się! Użytkownik o imieniu s% pomyśle utworzył konto.", this.name);
        }

        System.out.println("Konto nowego klienta zostało utworzone, wybierz swoje ID w formie liczby z przedziału 1-20.");
        Scanner id = new Scanner(System.in);
        int newId = id.nextInt();
        if (newId > 0 && newId < 21){
            System.out.println("Twoje ID to: " + newId + ".");
        } else {
            System.out.println("Podana liczba wykracza poza ramy przedziału, zacznij od nowa.");
        }
    }

}