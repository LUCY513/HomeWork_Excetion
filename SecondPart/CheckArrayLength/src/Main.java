/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив,каждый элемент которого
равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class Main {
    public static void main(String[] args) {
        int[] arrayFirst = new int[]{1, 2, 3, 4};
        int[] arraySecond = new int[]{5, 4, 3};

        CheckArray arrayResult = new CheckArray();
        arrayResult.checkArray(arrayFirst, arraySecond);

    }
}