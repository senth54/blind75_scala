object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
     
        import scala.collection.mutable.HashSet
        import scala.util.control.Breaks._

        var inp_arry = HashSet[Int]()
        var result:Boolean = false
        
        
        breakable {
        for(i <- 0 until nums.length){
            println("i is: " + i);
            println("i'th element is: " + nums(i));
            if(inp_arry.contains(nums(i))) 
            {result=true; 
            break;
            }
            else {
            inp_arry += nums(i)
            }
        } 
        }
        result
    }
}
