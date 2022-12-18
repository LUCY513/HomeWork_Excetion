public class DevisionElements {

    public void divisionArray(double[] arr1, double[] arr2) {

        double[] arrayResult = new double[arr1.length];

        try {
            if (arr1.length != arr2.length) {
                System.out.println(new RuntimeException(" Массивы не совподают по длине"));
            }
            for (int i = 0; i < arr1.length; i++) {
                arrayResult[i] = arr1[i] / arr2[i];
            }
            //int sum = 14/0;

        } catch (RuntimeException e) {
            System.out.println("Ошибка выполнения --> " + e);
        }

        // Output
        for (double n : arrayResult) {
            System.out.println(n);
        }
    }
}
