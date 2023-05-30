import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        System.out.println(Task1(1, 6));
        Task2(0);
        System.out.println(Task3(0));
        System.out.println(Task4("������������� �� ������ ��������", 10));
        System.out.println(Task5(2100));
    }

    // 1. �������� �����, ����������� �� ���� ��� ����� ����� � �����������, ��� �� ����� ����� � �������� �� 10 �� 20 (������������), ���� �� � ������� true, � ��������� ������ � false.
    private static boolean Task1(int a, int b) {
        System.out.println("������� 1");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void Task2(int a) {
        System.out.println("������� 2");
        String strPattern = "Number " + a + " ";

        // 2. �������� �����, �������� � �������� ��������� ���������� ����� �����, ����� ������ ���������� � �������, ������������� �� ����� �������� ��� �������������. ���������: ���� ������� ������������� ������.
        strPattern += (a >= 0)?"positive":"negative";
        System.out.println(strPattern);
    }

    private static boolean Task3(int a) {
        System.out.println("������� 3");
        // 3. �������� �����, �������� � �������� ��������� ���������� ����� �����. ����� ������ ������� true, ���� ����� �������������, � ������� false ���� �������������.
        return a >= 0;

    }

    private static String Task4(String str, int a) {
        System.out.println("������� 4");
// 4. �������� �����, �������� � �������� ���������� ���������� ������ � �����, ����� ������ ���������� � ������� ��������� ������, ��������� ���������� ���;
        String result = "";
        for (int i = 0; i < a; i++) {
            result = result + str + "\n";
        }
        return result;
    }

    private static boolean Task5(int year) {
        System.out.println("������� 5");

// 5. * �������� �����, ������� ����������, �������� �� ��� ����������, � ���������� boolean (���������� - true, �� ���������� - false). ������ 4-� ��� �������� ����������, ����� ������� 100-��, ��� ���� ������ 400-� � ����������.
        return (!(year % 4 == 0) || (year % 100 == 0 && !(year % 400 == 0))) ? false : true;
    }
}