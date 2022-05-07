public class MaxMin {

    public int Maximum(int [] array){
        int maxval;
        if (arr.length != 0) {
            maxval = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (array[i] > maxval)
                    maxval = arr[i];
            }
            return maxval;
        }
        else
            return -1;
    }

    public int Minimum(int [] arr){
        int minval;
        if (arr.length != 0) {
            minval = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minval)
                    minval = arr[i];
            }
            return minval;
        }
        else
            return -1;
    }

}
