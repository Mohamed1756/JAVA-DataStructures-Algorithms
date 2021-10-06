public class LinearSearch {


    public static void main(String[] args) {

        // LINEAR
            int target = 54, target1 = 22;

            int [] array = new int[59];


            for(int i = 0; i < array.length; i++) {
                if (i == target ){
                    System.out.println("target found");
                }//else{
                 //   System.out.println("no found");
              //  }

            }

            int [] a = {5,3,23,4,23,22,11,8};

        for(int i = 0; i < a.length; i++) {
            if (a[i] == target1 ){
                System.out.println("target found: 22 ");
            }//else{
            //   System.out.println("no found");
            //  }

        }


    }
}
