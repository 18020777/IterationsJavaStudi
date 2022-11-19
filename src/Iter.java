import java.util.Arrays;
import java.util.Scanner;

public class Iter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        int[] people = new int[15];
        int age;

        for (int i = 0; i < people.length; i++) {
            age = src.nextInt();
            if (i != 0) {
                for (int j = i; j > 0; j--) {
                    people[j] = Math.max(people[j - 1], age);
                    if (people[j] == age) {
                        break;
                    } else if (j - 1 == 0) {
                        people[j - 1] = age;
                        break;
                    }
                }
            } else {
                people[i] = age;
            }
        }
        System.out.println("Tableau : " + Arrays.toString(people));
        src.close();
    }
}
