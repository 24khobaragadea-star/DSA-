public class Second_largest {
    public static void main(String[] args){
        int[] arr={2,3,4,6,1,8,7,9};
        int largest=arr[0];
        int second_largest=arr[1];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];

            }
            else if(largest>arr[i] && arr[i]>second_largest){
                second_largest=arr[i];

            }
        System.out.println(second_largest);
        }

    }
    
}
