import java.util.Random;

public class Assingment7 {

 public static void main(String[ ] args){
    System.out.println("100 randomly generated J Numbers hashed for an array with a length of 127 had");
    test1Hashfunction();
     System.out.println("500 randomly generated J Numbers hashed for an array with a length of 512 had");
     test2Hashfunction();
     System.out.println("1000 randomly generated J Numbers hashed for an array with a length of 1024 had");
     test3Hashfunction();
     System.out.println("25000 randomly generated J Numbers hashed for an array with a length of 27000 had");
     test4Hashfunction();

     System.out.println();

     System.out.println("100 randomly generated J Numbers hashed for an array with a length of 127 had");
     customTest1Hashfunction();
     System.out.println("500 randomly generated J Numbers hashed for an array with a length of 512 had");
     customTest2Hashfunction();
     System.out.println("1000 randomly generated J Numbers hashed for an array with a length of 1024 had");
     customTest3Hashfunction();
     System.out.println("25000 randomly generated J Numbers hashed for an array with a length of 27000 had");
     customTest4Hashfunction();






 }


   public static int hashfunction(String key, int size){
     int hash = 0;
     for(int i = 0; i < key.length(); i++){
       int x = key.charAt(i);
       hash = hash+x;
     }
     return Math.abs(hash % size);
   }

   public static int customFunction(String key, int size){
     int hash = 0;
     for (int i = 0; i < key.length(); i++){
         int x = key.charAt(i);
         hash = (786 * hash)^2 +x;
     }
     return Math.abs(hash % size);
   }

   public static void test1Hashfunction(){
     int size = 127;
     int[] array = new int[size];

       Random rand =new Random();
       for (int i = 0; i<101; i++){
           int digit8 = rand.nextInt(99999999);
           String jNum = "J" + String.format("%08d",digit8);

           int h = hashfunction(jNum, size);
           array[h]++;

       }

       int collision = 0;
       for(int i = 0; i < size; i++){

           if (array[i] > 1){
               collision = collision + (array[i] - 1);
           }

       }//end for
       System.out.println("Collision total = " + collision);


   }

   // Custom function test 1
   public static void customTest1Hashfunction(){
       int size = 127;
       int[] array = new int[size];

       Random rand =new Random();

       for (int i = 0; i<101; i++){
           int digit8 = rand.nextInt(99999999);
           String jNum = "J" + String.format("%08d",digit8);

           int h = customFunction(jNum, size);
           array[h]++;

       }

       int collision = 0;
       for(int i = 0; i < size; i++){

           if (array[i] > 1){
               collision = collision + (array[i] - 1);
           }

       }//end for
       System.out.println("Collision total = " + collision);


   }

    public static void test2Hashfunction(){
        int size = 512;
        int[] array = new int[size];

        Random rand =new Random();
        for (int i = 0; i<501; i++){
            int digit8 = rand.nextInt(99999999);
            String jNum = "J" + String.format("%08d",digit8);

            int h = hashfunction(jNum, size);
            array[h]++;

        }

        int collision = 0;
        for(int i = 0; i < size; i++){

            if (array[i] > 1){
                collision = collision + (array[i] - 1);
            }

        }//end for
        System.out.println("Collision total = " + collision);


    }


    // Custom function test 2
    public static void customTest2Hashfunction(){
        int size = 512;
        int[] array = new int[size];

        Random rand =new Random();

        for (int i = 0; i<501; i++){
            int digit8 = rand.nextInt(99999999);
            String jNum = "J" + String.format("%08d",digit8);

            int h = customFunction(jNum, size);
            array[h]++;

        }

        int collision = 0;
        for(int i = 0; i < size; i++){

            if (array[i] > 1){
                collision = collision + (array[i] - 1);
            }

        }//end for
        System.out.println("Collision total = " + collision);


    }

    public static void test3Hashfunction(){
        int size = 1024;
        int[] array = new int[size];

        Random rand =new Random();
        for (int i = 0; i<1001; i++){
            int digit8 = rand.nextInt(99999999);
            String jNum = "J" + String.format("%08d",digit8);

            int h = hashfunction(jNum, size);
            array[h]++;

        }

        int collision = 0;
        for(int i = 0; i < size; i++){

            if (array[i] > 1){
                collision = collision + (array[i] - 1);
            }

        }//end for
        System.out.println("Collision total = " + collision);


    }

    // Custom function test 3
    public static void customTest3Hashfunction(){
        int size = 1024;
        int[] array = new int[size];

        Random rand =new Random();

        for (int i = 0; i<1001; i++){
            int digit8 = rand.nextInt(99999999);
            String jNum = "J" + String.format("%08d",digit8);

            int h = customFunction(jNum, size);
            array[h]++;

        }

        int collision = 0;
        for(int i = 0; i < size; i++){

            if (array[i] > 1){
                collision = collision + (array[i] - 1);
            }

        }//end for
        System.out.println("Collision total = " + collision);


    }

    public static void test4Hashfunction(){
        int size = 27000;
        int[] array = new int[size];

        Random rand =new Random();
        for (int i = 0; i<25001; i++){
            int digit8 = rand.nextInt(99999999);
            String jNum = "J" + String.format("%08d",digit8);

            int h = hashfunction(jNum, size);
            array[h]++;

        }

        int collision = 0;
        for(int i = 0; i < size; i++){

            if (array[i] > 1){
                collision = collision + (array[i] - 1);
            }

        }//end for
        System.out.println("Collision total = " + collision);


    }

    // Custom function test 4
    public static void customTest4Hashfunction(){
        int size = 27000;
        int[] array = new int[size];

        Random rand =new Random();

        for (int i = 0; i<25001; i++){
            int digit8 = rand.nextInt(99999999);
            String jNum = "J" + String.format("%08d",digit8);

            int h = customFunction(jNum, size);
            array[h]++;

        }

        int collision = 0;
        for(int i = 0; i < size; i++){

            if (array[i] > 1){
                collision = collision + (array[i] - 1);
            }

        }//end for
        System.out.println("Collision total = " + collision);


    }

}
