/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов
двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.

Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

public class Main {
    public static void main(String[] args) {
        double[] arrayFirst = new double[]{0, 2.6, 3, 4, 5};
        double[] arraySecond = new double[]{ 4, 3, 2.4, 0};

        DevisionElements resultArray = new DevisionElements();
        resultArray.divisionArray(arrayFirst, arraySecond);

    }
}