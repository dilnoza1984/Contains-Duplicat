class Main {
  public static void main(String[] args) {

    //TESTS

    System.out.println(containsDuplicate (   new int[] {1,2,3,1})); //true
    System.out.println(containsDuplicate (   new int[] {1,2,3,4})); //false
    System.out.println(containsDuplicate (   new int[] {1,1,1,3,3,4,3,2,4,2})); // true
    System.out.println(containsDuplicate (   new int[] {1})); //false
    System.out.println(containsDuplicate (   new int[] {})); //false
    System.out.println(containsDuplicate (   new int[] {1,3,5,7,9,11,13,11,15})); // true
    
    
  }

  public static boolean containsDuplicate(int[] nums) {
    if(nums==null || nums.length ==0)
      return false;
    for(int i=0; i < nums.length; i++){
      for(int j=0; j <i; ++j){
        if (nums[i]==nums[j]){
          return true;
        }
      }
    }
        

     return false;
  }
}