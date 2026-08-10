public class Remove_duplicate_twopointer {
    public static void main(String[] args) {
        int [] arr={1,2,2,2,3,4,4,5};
        int i=0;
        for (int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        System.out.println("unique elements : "+(i+1));

    }
    
}
