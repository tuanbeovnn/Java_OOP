package Excercise_Dat4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu() {
        System.out.println("---Please choose ---");
        System.out.println("1. Insert Information");
        System.out.println("2. Update Information");
        System.out.println("3. Find by Id");
        System.out.println("4. Print out all");
        System.out.println("0. Quit...");
        System.out.print(">>> Selection: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manage manage = new Manage();
        while (true){
            menu();
            int choiceNumber = scanner.nextInt();
            switch (choiceNumber){
                case 1:
                    Information information = new Information();
                    information.askData();
                    manage.addStaff(information);
                    System.out.println(information.toString());
                    System.out.println("Enter to continue...");
                    scanner.nextLine();
                    break;
                case 2:
                    Information information1 = new Information();
                    System.out.println("Enter id");
                    int idUpdate = new Scanner(System.in).nextInt();

                    if (manage.searchInformation(idUpdate).size()!=0){
                        information1.setStaffId(idUpdate);
                        System.out.println("Enter name");
                        String name = new Scanner(System.in).nextLine();
                        information1.setName(name);
                        System.out.println("Enter gender");
                        String gender = new Scanner(System.in).nextLine();
                        information1.setGender(gender);
                        manage.update(information1);
                    }
                case 3:
                    System.out.print("Enter id to search: ");
                    int id = new Scanner(System.in).nextInt();
                    manage.searchInformation(id).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                case 4:
                    manage.showList();
                    break;

            }
        }
    }
}
