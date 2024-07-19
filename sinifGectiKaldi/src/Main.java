import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Matematik Notunuz : ");
            mat = input.nextInt();
            if (mat < 0 || mat > 100) {
                System.out.println("Hatalı Giriş Yaptınız!\n" +
                        "Notunuz 0 ve 100 arasında olmalıdır.\n" +
                        "Lütfen Notunuzu Tekrar Giriniz...");
            }
        } while (mat < 0 || mat > 100);

        do {
            System.out.print("Fizik Notunuz : ");
            fizik = input.nextInt();
            if (fizik < 0 || fizik > 100) {
                System.out.println("Hatalı Giriş Yaptınız!\n" +
                        "Notunuz 0 ve 100 arasında olmalıdır.\n" +
                        "Lütfen Notunuzu Tekrar Giriniz...");
            }
        } while (fizik < 0 || fizik > 100);


        do {
            System.out.print("Turkce Notunuz : ");
            turkce = input.nextInt();
            if (turkce < 0 || turkce > 100) {
                System.out.println("Hatalı Giriş Yaptınız!\n" +
                        "Notunuz 0 ve 100 arasında olmalıdır.\n" +
                        "Lütfen Notunuzu Tekrar Giriniz...");
            }
        } while (turkce < 0 || turkce > 100);


        do {
            System.out.print("Kimya Notunuz : ");
            kimya = input.nextInt();
            if (kimya < 0 || kimya > 100) {
                System.out.println("Hatalı Giriş Yaptınız!\n" +
                        "Notunuz 0 ve 100 arasında olmalıdır.\n" +
                        "Lütfen Notunuzu Tekrar Giriniz...");
            }
        } while (kimya < 0 || kimya > 100);


        do {
            System.out.print("Müzik Notunuz : ");
            muzik = input.nextInt();
            if (muzik < 0 || muzik > 100) {
                System.out.println("Hatalı Giriş Yaptınız!\n" +
                        "Notunuz 0 ve 100 arasında olmalıdır.\n" +
                        "Lütfen Notunuzu Tekrar Giriniz...");
            }
        } while (muzik < 0 || muzik > 100);

        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        if (average < 55) {
            System.out.println("Sınıfta Kaldınız! Seneye görüşmek üzere!");
        } else {
            System.out.println("Sınıfı Geçtiniz. Tebrikler...");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
