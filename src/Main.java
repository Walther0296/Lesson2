import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task1(1, 6));
        Task2(0);
        System.out.println(Task3(0));
        System.out.println(Task4("ѕреподаватель не читает рефераты", 10));
        System.out.println(Task5(2100));
    }

    // 1. Ќаписать метод, принимающий на вход два целых числа и провер€ющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да Ц вернуть true, в противном случае Ц false.
    private static boolean Task1(int a, int b) {
        System.out.println("«адание 1");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void Task2(int a) {
        System.out.println("«адание 2");
        String strPattern = "Number " + a + " ";

        // 2. Ќаписать метод, которому в качестве параметра передаетс€ целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. «амечание: ноль считаем положительным числом.
        strPattern += (a >= 0)?"positive":"negative";
        System.out.println(strPattern);
    }

    private static boolean Task3(int a) {
        System.out.println("«адание 3");
        // 3. Ќаписать метод, которому в качестве параметра передаетс€ целое число. ћетод должен вернуть true, если число отрицательное, и вернуть false если положительное.
        return a >= 0;

    }

    private static String Task4(String str, int a) {
        System.out.println("«адание 4");
// 4. Ќаписать метод, которому в качестве аргументов передаетс€ строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
        String result = "";
        for (int i = 0; i < a; i++) {
            result = result + str + "\n";
        }
        return result;
    }

    private static boolean Task5(int year) {
        System.out.println("«адание 5");

// 5. * Ќаписать метод, который определ€ет, €вл€етс€ ли год високосным, и возвращает boolean (високосный - true, не високосный - false).  аждый 4-й год €вл€етс€ високосным, кроме каждого 100-го, при этом каждый 400-й Ц високосный.
        return (!(year % 4 == 0) || (year % 100 == 0 && !(year % 400 == 0))) ? false : true;
    }
}