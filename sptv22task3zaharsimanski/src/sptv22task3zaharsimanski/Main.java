import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свое имя (желательно на латинице): ");
        String imya = scanner.nextLine();

        System.out.print("Введите свою фамилию (желательно на латинице): ");
        String familiya = scanner.nextLine();

        System.out.print("Введите свой личный код: ");
        String isikuKood = scanner.nextLine();

        char[] isikuKoodNumbers = isikuKood.toCharArray();
        String[] months = {
                "января",
                "февраля",
                "марта",
                "апреля",
                "мая",
                "июня",
                "июля",
                "августа",
                "сентября",
                "октября",
                "ноября",
                "декабря"
        };

        int monthIndex = Integer.parseInt(isikuKood.substring(3, 5));
        String month = (monthIndex >= 1 && monthIndex <= 12) ? months[monthIndex - 1] : "Недопустимый месяц";

        int yearCode = Integer.parseInt(isikuKood.substring(0, 1));
        int yearPrefix = (yearCode == 1 || yearCode == 2) ? 1800 :
                (yearCode == 3 || yearCode == 4) ? 1900 :
                        (yearCode == 5 || yearCode == 6) ? 2000 :
                                (yearCode == 7 || yearCode == 8) ? 2100 : 0;

        int yearDigits = Integer.parseInt(isikuKood.substring(1, 3));
        int Year = yearPrefix + yearDigits;

        System.out.println(imya + " " + familiya + " родился " + isikuKoodNumbers[5] + isikuKoodNumbers[6] + " " + month + " " + Year + " года");
    }
}