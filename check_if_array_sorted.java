public class check_if_array_sorted {
    public static void main(String[] args) {
        int [] arr={1,2,2,3,4,5,5,6,7,1};

        for (int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                continue;
            }
            else{
                System.out.println("array not sorted");
                return;
               
            }
        }
        System.out.println("array is sorted");
        
        }

    }
    

