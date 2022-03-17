import au.com.bytecode.opencsv.CSVReader;
import java.util.*;
import java.util.List;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.InputStream;

/**
 * This my Main class.
 */
//foreign_names.csv
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите название csv файла или укажите путь до него  : ");
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        try (InputStream in = Main.class.getClassLoader().getResourceAsStream(path)) {

            List<Person> companyList = new LinkedList<>();
            Reader csvReader = new Reader(path);
            companyList = csvReader.fromCsvToList();
            System.out.println("Какое количество значений вы хотите увидеть: ");

            while (!console.hasNextInt()) {
                System.out.println("Введите число! ");
                console.next();
            }
            int n = console.nextInt();
            if (n < 1) {
                System.out.println("Введите число от 1 и больше!");
                while (!console.hasNextInt()) {
                    System.out.println("Введите число! ");
                    console.next();
                }
                n = console.nextInt();
            }

            for (int i = 0; i < n; i++) {
                System.out.print(companyList.get(i).getID()+"\t");
                System.out.print(companyList.get(i).getName()+"\t");
                System.out.print(companyList.get(i).getGender()+"\t");
                System.out.print(companyList.get(i).getBirthDate()+"\t");
                System.out.print(companyList.get(i).getSubdivisionID()+"\t");
                System.out.print(companyList.get(i).getSubdivisionName()+"\t");
                System.out.print(companyList.get(i).getSalary()+"\t");
                System.out.print("\n");
            }

        }
        catch(FileNotFoundException except) {
            System.out.println("Вы ввели неправильное название файла или указали неправильный путь");
        }
    }
}