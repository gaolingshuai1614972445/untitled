import java.lang.reflect.Array;
import java.util.Arrays;

//class Lll{
//    public static void main(String[] args) {
//    }
//        Employee tom = new Employee("tom",10000);
//        tom.setSalary(-10000);
//        System.out.println(tom.getSalary());
//    }
//    private String name;
//    private static fin1al double PI=3.141592654;
//
//    //        name = "tom";
//        salary = 2.2;
//    }
//
//    public Test() {
//        name = "ben";
//        salary = 3.3;
//        System.out.println("non-static");
//
//    }
//
//    static {
//        System.out.println("static");
//    }
//
//    public Test(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Test{" +
//                "name='" + name + '\'' +
//                ", s5al=" + salary +
//                '}';
//    }
//    public static void main(String[] args) {
////        Test test =  new Test();
////        System.out.println(test.name);
//        Test tom = new Test();
//        Test jerry = new Test("jerry", 10000);
//System.out.println(tom);


//}

//    void fun () {
//        System.out.println("1234567");
//        return;
//    }
//    int goo() {
//        System.out.println("123455321221");
//        return 1;
//    }
//    double zoo(int d) {
//        return d+1.0;
//    }
//
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.fun();
//        t.goo();
//        t.zoo(1);
//    public static void main(String[] args) {
//        var i  =  0 ;
//        var sum = 0 ;
//        while (i++ < 10);
//        sum += i;
//        System.out.printf("sun is: %d,",sum);
//        Scanner in = new Scanner(System.in);
//        System.out.println("numbers");
//        String numbers = in.nextLine();
//
////        String firstname = in.next();
////        System.out.println(name);
//        System.out.println(firstname
//        );
//        BigDecimal num1 = new BigDecimal("23.22335987645687757858528528528528245415");
//        BigDecimal num2 = new BigDecimal("3.25555555555555555558952689565565323226565");
//        System.out.println(num1.divide(num2));
//      int x = 30;
//      int[] numbers = new  int[x];
//      x=60;
//      System.out.println("x is "+x);
//      System.out.println("The size of  numbers is" + numbers.length);
//        double[] r =new double[100];
//        for (int i = 0 ; i<r.length;i++)
//        System.out.printf("%-3d",(int)(Math.random()*100));
//        q[q.length]=0;
//        for(var i=0;i<q.length;i++)
//            System.out.println(q[i]);
//        int list[]={1,2,3,4,5,6,};
//        for(int i = 1;i<list.length;i++)
//            list[i]=list[i-1];
//        for (int i = 1 ;i<list.length;i++)
//            System.out.println(list[i]+" ");
//        int[] deck = new int[52];
//        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
//        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
//        for (int i = 0; i < deck.length; i++)
//            deck[i] = i;
//        for (int i = 0; i < deck.length; i++) {
//            int index = (int) (Math.random() * deck.length);
//            int temp = deck[i];
//            deck[i] = deck[index];
//            deck[index] = temp;
//        }
//        for (int i = 0; i < 4; i++) {
//            String suit = suits[deck[i] / 13];
//            String rank = ranks[deck[i] % 13];
//            System.out.println("Card number" + deck[i] + ":" + rank + "of" + suit);
//        }
//        int[]soure = {3,4,5,};
//        int[] t = Arrays.copyOf(soure,3);
//        System.out.println(Arrays.toString(t));
//        int[][] array = new int[5][6];
//        int[]x = {1,2};
//        array[0] = x;
//        System.out.println("array[0][1]is"+array[0][1]);
//        int[][] array={{1,2},{3,4},{5,6}};
//        int sun = 0;
//        for (int i = array.length - 1;i>=0;i--){
//            for(int j =array[i].length-1;j>=0;j--)
//////                System.out.println(6);
//        int[] i = {1,23,4,5,6,7,8,9,};
//        i[i.length-1]= 99;
//        System.out.println(i[7]);
//        for(var p:i)
//            System.out.println(p);
//        Arrays.stream(i).forEach(System.out::println);
//        System.out.println(Arrays.toString(i));
////        Arrays.stream(i).forEach(e->System.out.printf("%-10s",e));
//        int[] w = {1,2,3,4,5,6,7,98,};
//        int[] e = Arrays.copyOf(w,10);
//        System.out.println(Arrays.toString(e));
//        boolean[] r = {true,false,false,true,true,};
//        boolean[] t = Arrays.copyOf(r,10);
//        System.out.println(Arrays.toString(t));
//        System.out.println(Arrays.toString(args));
//        int[] o = {6,7,8,9,0};
////        System.out.println(Arrays.toString(o));
//        int t = (int) (Math.random()*11);
//        System.out.printf("%-3d",(int) (Math.random()*11));
//        for (var i = 0; i < 5; i++)
//            System.out.printf("%-3d", (int) (Math.random() * 11));
//        int[][] num3 = {
//                {12, 2,9},
//                {4, 4, 6},
//                {7, 8, 9},
//        };
//        for(var i= 0;i<num3.length;i++){
//            for(var o = 0 ;o<3;o++) {
//                System.out.printf("%-3d", num3[i][o]);
//            }
//            System.out.println();
//            }
//        int[] nums = {1,2985,3,4,5,6,7,8,9,};
////        for(var i = 0;i<nums.length;i++)
////            if(4==nums[i]){
////                System.out.println(i);
////                break;
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//                System.out.println(Arrays.binarySearch(nums,4));
//        int[][] num = {
//                {1, 2, 3, 4, 5, 6, 7, 8},l
//                {3, 5, 6, 7},
//                {8, 9, 0, 6, 4, 22},};
//        for (var i = 0; i < num.length; i++) {
//            for (var p = 0; p < num[i].length; p++) {
//                System.out.printf("%-3d", num[i][p]);
//            }
//            System.out.println();
//        }
//        int x =30;
//        int[] numbers = new int[x];
//        x=60;
//        System.out.println("x is"+x);
//        System.out.println("The size of numbers is"+numbers.length);
//        int []o = {1,2,3,};
//        System.out.println(o[2]);




