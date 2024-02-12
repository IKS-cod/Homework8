import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        double[] box = {1.57, 7.654, 9.986};
        byte[] people = {11, 13, 43};

        System.out.println("Задание 2");
        for (int i = 0; i < weight.length; i++) {
            if (i == weight.length - 1) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < box.length; i++) {
            if (i == box.length - 1) {
                System.out.print(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < people.length; i++) {
            if (i == people.length - 1) {
                System.out.print(people[i]);
                break;
            }
            System.out.print(people[i] + ", ");
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weight[i]);
                break;
            }
            System.out.print(weight[i] + ", ");
        }
        System.out.println();
        for (int i = box.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        System.out.println();
        for (int i = people.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(people[i]);
                break;
            }
            System.out.print(people[i] + ", ");
        }
        System.out.println();

        System.out.println("Задание 4");
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 != 0) {
                weight[i] = weight[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weight));
    }
}