package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Witaj użytkowniku. Za pomocą numeru, wybierz co chciałbyś zrobić, korzystając z przedstawionego menu:\n" +
                "MENU:\n" +
                "               1. Dodaj klienta\n" +
                "               2. Usuń klienta\n" +
                "               3. Edytuj klienta\n" +
                "               4. Wyświetl wszystkich klientów\n" +
                "               5. Dodaj zamówienie\n" +
                "               6. Usuń zamówienie\n" +
                "               7. Edytuj zamówienie\n" +
                "               8. Zmień status\n" +
                "               9. Wyświetl wszystkie zamówienia\n" +
                "               10. Wyświetl wszystkie zamówienia klienta\n" +
                "               0. Zakończ program \n");

        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        switch (menuNumber) {
            case 1:

                break;

            case 2:
                System.out.println("Jeżeli chcesz usunąć konto klienta, podaj jego ID.");
            break;

            case 3:
                System.out.println("Jeżeli chcesz edytować dane klienta, podaj jego ID.");
            break;

            case 4:
                System.out.println("Oto lista wszystkich klientów: ");
                //??? baza danych?
                break;

            case 5:
                System.out.println("Dodaj nowe zamówienie wpisując nazwę produktu i ID użytkownika.");
                break;

            case 6:
                System.out.println("W celu usunięcia zamówienia, podaj ID zamawiającego.");
                break;

            case 7:
                System.out.println("Aby edytować zamówienie, podaj ID zamawiającego.");
                break;

            case 8:
                System.out.println("W celu zmiany statusu, podaj ID użytkownika.");
                break;

            case 9:
                System.out.println("Dotychczas złożone zamówienia: ");
                break;

            case 10:
                System.out.println("W celu podsumowania wszystkich zamówień klienta, podaj ID użytkownika.");
                break;

        }
    }
}