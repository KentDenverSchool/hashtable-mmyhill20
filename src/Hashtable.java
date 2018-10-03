import java.util.HashMap;

/*
* Hashtable
* Purpose: The goal of Hashtable is
* Author/s: Morgan Myhill
* 10/2/18
* On My Honor: MM
* Collaborators:
*/
public class Hashtable {
    String [] starray;
    HashMap h

    //initializes an array of size capacity
    public Hashtable(int capacity){
        starray = new String[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        if(starray[hashCode(key)] == null) {
            starray[hashCode(key)] = value;
            return true;
        }
        else{
            System.out.println("Collision error or repeat keys");
            return false;
        }
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        return starray[hashCode(key)];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
//        int sum = 0;
//        for(int i = 0; i < key.length(); i++){
//            sum += (217 * key.charAt(i))^i;
//        }
//        sum = (int)((sum%104729) * starray.length - 1);
//        return sum;
        int toReturn = key.hashCode();
    }

    /*Challenge 1:
        A large prime number is better than a large number with many factors because?
        nums = 10,20,30,40,50,60,70
        ex: num % 18 (factors:1, 2, 9, 3, 6):
        10, 2, 12, 4, 14, 6,

        ?????


     */

    /*Challenge 2:
        All of the chars in a string summed is generally an operation to avoid in a hash function because there
        are numerous combinations of chars that will result in the same sum value for multiple strings, increasing the
        rate of collision
     */

    /*
    Challenge 3:
        Hashmap h = new Hashmap();
        h.put(key,value);
    */

    //is it even possible to create a function with absolutely no collisions?


}
