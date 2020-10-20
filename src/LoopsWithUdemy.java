public class LoopsWithUdemy {

        public static void main(String[] args) {

//        System.out.println(twoSumOne(3,2,5));

//        String name = "shajnsbdhskflsdusj";
//        for(int i = name.length() -1 ; i >= 0; i--){
//            System.out.println("name:" + name.charAt(i));
//        }
//
//        for(int i = 0; i <= 100; i++){
//            if(i % 2 == 0){
//                System.out.println("even number = " + i);
//            }
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }
//
//        String tree = "*";

//        for(int i = 1; i <= 5; i++) {
//            System.out.println();
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//        }

//

//
//        for(int i = 1; i <= 4; i++) {
//            System.out.println("");
//            for(int j = 4; j >= i; j--){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= (2*i-1); k++ ){
//                System.out.print("*");
//            }
//        }







            String str = "We have a large inventory of things in our warehouse falling in the " +
                    "category:apperal and the slightly more in the " +
                    "demand category:makeup along with the category:furniture and the... ";

//        printCategories(str);
//
////        int count = 0;
////
////        while(count <= 100){
////            System.out.println("Kinga");
////            count = count + 1;
////        }
//        System.out.println(square(2));
//        System.out.println(multiply(3,4));
//        System.out.println(convertToUsd(59));
//        System.out.println(createName("Kinga","Aleksiejczuk","LOL"));
//
//        System.out.println(checkMaturity(16));
//        System.out.println(checkEven(26));
//        System.out.println(maxOfThree(9,8,7));
//        System.out.println(factorial(3));
//    }
//
//    static int square(int num){
//        return (int) Math.pow(num,2);
//    }
//
//    static int multiply(int multipler, int index){
//        return multipler*index;
//    }
//
//    static double convertToUsd(double zlotys){
//        double value = 4.04;
//        return zlotys/value;
//    }
//
//    static String createName(String name, String surname, String nickname){
//        return (name + " " + '"' + nickname + '"' + " " + surname);
//    }
//
//    static boolean checkMaturity(int age){
//        if(age >= 18){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    static String checkEven(int number){
//        if(number%2==0){
//            return "even";
//        }else{
//            return "odd";
//        }
//    }
//
//    static int maxOfThree(int one, int two, int three){
//        if(one > two && one > three){
//            return one;
//        }else if (two > one && two > three){
//            return two;
//        }else{
//            return three;
//        }
//    }
//    static int factorial(int n){
//         int wynik = 1;
//         for (int i = 1; i<= n; i++){
//             wynik *= i;
//        }
//         return wynik;
//
//    public static void printCategories(String string){
//
//        int i = 0;
//
////        while(true){
////            int found = string.indexOf("category:", i);
////            if(found == -1) break;
////            int start = found + 9;
////            int end = string.indexOf(" ", start);
////            System.out.println(string.substring(start,end));
////            i = end+1;
////        }
//
//        while(true){
//            int found = string.indexOf("category:", i);
//            if(found == -1) break;
//            int start = found + 9;
//            int end = string.indexOf(" ", start);
//            System.out.println(string.substring(start,end));
//            i = end+1;
//
//        }

//
//    }

//        System.out.println(search(new int[]{4,6,5,7,1}, 5));
//        System.out.println(middleThree("Jamaica"));
//        System.out.println(isOrdered(1, 1, 2, true));
//        System.out.println(isCool(34));
//        System.out.println(fizzyWizzy(23));
//        System.out.println(nearestTwentyOne(19,21));
            


        }

        public static int nearestTwentyOne(int a, int b) {
            if(a <= 21 && a > b || b > 21 && a <= 21){
                return a;
            }else if(b <= 21 && b > a || a > 21 && b <= 21){
                return b;
            }else{
                return 0;
            }
        }



        public static String fizzyWizzy(int n) {

            if(n % 3 == 0 && n % 5 == 0){
                return "FizzBuzz!";
            }else if(n % 5 == 0){
                return "Buzz!";
            }else if(n % 3 == 0){
                return "Fizz!";
            }else{
                return n + "!";
            }

        }




        public static boolean isCool(int n) {

            if(n % 11 == 0){
                return true;
            }else if(n % 11 == 1){
                return true;
            }else{
                return false;
            }
        }




        public static boolean isOrdered(int first, int second, int third, boolean itsOk) {

            if(second > first && third > second){
                return true;
            }else if(first < third && itsOk == true){
                return true;
            }else{
                return false;
            }
        }
        public static int search(int[] nums, int target){

            for(int i = 0; i < nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
            }
            return -1;
        }
        /**
         Given a string of odd length, return the middle 3 characters from the string,
         so the string <b>"Monitor"</b> yields <b>"nit"</b>.
         If the string length is less than 3, return the string as is. <br> <br>

         <b>EXPECTATIONS:</b><br>
         middleThree("bunny") <b>---></b> "unn" <br>
         middleThree("peter") <b>---></b> "ete" <br>
         middleThree("Jamaica") <b>---></b>"mai" <br>
         */


        public static String middleThree(String str) {
            String result;

            int begin;
            int start;
            int end;

            begin = str.length()/2;
            start = begin - 1;
            end = begin + 2;
            result = str.substring(start,end);
            return result;



        }
        public static boolean twoSumOne(int a, int b, int c) {

            if(a + b == c || a + c == b || c + b == a){
                return true;
            }else{
                return false;
            }

        }


}
