class MaxArrayNumber{
	
	 public static void main(String[] args) {
        int[] numbers = {24, 9, 8, 27, 15, 7, 4};

        int max = findMax(numbers);
        System.out.println("Maximum element in the array: " + max);
      
    }

  
    public static int findMax(int[] ar) {
        if (ar.length == 0) {
            System.out.println("Array is empty");
        }

        int max = ar[0]; 

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}