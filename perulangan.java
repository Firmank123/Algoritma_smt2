package job1;

import java.util.Scanner;

public class perulangan {
    String nim;
    int n;

    public perulangan() {

    }

    void inputNim() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM anda: ");
        nim = input.next();
        System.out.println("===================");
        System.out.print("n: ");
        n = input.nextInt();
        input.close();
    }

    void loop() {
        if (n < 10) {
            n += 10;
        }

        for (int nim = 1; nim <= n; nim++) {
            if (nim == 6 || nim == 10) {
                continue;
            }
            if (nim % 2 == 0) {
                System.out.print(nim);
            } else {
                System.out.print("*");
            }
        }
    }
}
