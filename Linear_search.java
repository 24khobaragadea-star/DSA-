public class Linear_search {
    public static void main(String[] args) {
        
    
      int [] nums={1,2,3,4,5,6,7,8,0};
      int target=9;
      int n=nums.length;
      
      for (int i=0;i<n;i++){
                   if(nums[i]==target){
              System.out.println("element found at : "+i);
              return;
        }
        
    }
     System.out.println("element not found ");
    
    
}
}

    

