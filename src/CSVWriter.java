
/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\computer 21\\Documents\\restuti22a\\new_students.csv";
        String[] data = {
            "4,David,23",
            "5,Eva,22",
            "6,Ferdi,21"
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 32\\Documents\\Harist\\new_students.csv";
        Scanner scanner = new Scanner(System.in);
        
        //input jumlah data yang akan d tambahkan
        System.out.println("Masukkan jumlah data yang akan ditambahkan: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        
        //input data mahasiswa baru
        String[] data = new String[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i + 1) + " (format: NIM,NAMA,UMUR): ");
            data[i] = scanner.nextLine();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}