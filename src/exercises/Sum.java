package exercises;

public class Sum {
    public static void main(String[] args){
        int numList[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for(int num : numList){
            if((num%2)==0){
                count += num;


            }
        }
        System.out.println("the sum of even numbers is: " + count);
    }

}
