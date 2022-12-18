public class CheckArray {

    public void checkArray(int[] arr1, int[] arr2) {

        int[] resultArr;

        if (arr1.length != arr2.length) {
            System.out.println(": Error : \n Один из массивов имеет большую/меньшую длину");
        }
        else {
            resultArr = new int[arr1.length];

            for (int i = 0; i < arr1.length; i++) {
                resultArr[i] = arr1[i] - arr2[i];
            }

            for (int result : resultArr) {
                System.out.println(result);
            }
        }
    }
}
