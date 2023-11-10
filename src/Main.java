import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Scanner;


public class Main{
    public static void main(String[] arg) {

        AbstractImplementsInterface implement = new ClassAbstractnInterface();

        implement.noInterface();
        implement.test();
        implement.interfaces();


        //Interface shouldNotWork = new Interface();

        Interface shouldWork = new ImplementsInterface();
        ImplementsInterface test = new ImplementsInterface();

        shouldWork.test();
        shouldWork.interfaces();
        //shouldWork.seperatedInterface();

        test.test();
        test.interfaces();
        test.seperatedInterface();


        //Abstract noWork = new Abstract();
        Abstract me = new ExtendsAbstract();
        ExtendsAbstract newMe  = new ExtendsAbstract();

        me.myMethod();
        me.myAbstractMethod();
        newMe.noAbstractMethod();
    }
}

////generic
//        Generic<Integer> number1 = new Generic<>();
//        number1.print1(12);
//
//        Generic<Double> doubleNumber1 = new Generic<>();
//        doubleNumber1.print1(12.3);
//
//        Generic<Integer> number = new Generic<>(12);
//        number.print();
//
//        Generic<Double> doubleNumber = new Generic<>(12.3);
//        doubleNumber.print();
//
//
//    }
//}
/*throws AgeException {*/
      /*  valiatedAge(-1);
    }
    public static void  valiatedAge (int age) throws AgeException {
        if(age < 0) {

            throw new AgeException("super",new RuntimeException());
        }


    }
}*/
        

        /*Scanner number = new Scanner(System.in);
        System.out.println("enter  favourite number");
        try {
            int n = number.nextInt();
            System.out.println("#" + n);
        }catch(Exception e) {
            System.out.println("number");
        }
        try {
            int a[] = {1, 2, 3, 4,  5};
            System.out.println(a[4]);
        } catch (Exception e){
            System.out.println("exception");
        }
    }

    }*/
/*        LinkedList<Integer> linky = new LinkedList<>();
        linky.add(1);
        linky.add(2);
        linky.add(3);
        System.out.println(linky);

        linky.remove(1);
        System.out.println(linky);
    }
}*/
/*        ClassInside objectA = new ClassInside();
        ClassInside.InsideInside objectB = objectA.new InsideInside();

        System.out.println(objectA.a + " " + objectB.b );
    }
}*/
/*        Running running = new Running(12,"NNIKE",12);
        System.out.println(running.brand);

        Walking walking = new Walking(true,"NNIKE",12);
        System.out.println(walking.brand);

        Shoe shoe = new Shoe("NNIKE",12);
        System.out.println(shoe.brand);

        Shoe testWalk = new Walking(true,"NNIKE",12);
        System.out.println(testWalk.brand);
    }
}*/
/*        encapsulation e = new encapsulation();
        e.setName("johnny");
        e.setAge(13);
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }

    }*/
//
//        //abstract
//        //interface
//    HarryPotter  hp =  new HarryPotter();
//    hp.speed();
//    hp.flyss();
//
//    }
//
//
//}


/*    enum PornStars {
        MIA,LANA,SWEETYY;
    }
    public static void main(String[] arg) {
        PornStars  pornStars = PornStars.LANA;
        switch(pornStars) {
            case MIA:
                System.out.println("MIA KIAFIA");
                break;
            case LANA:
                System.out.println("LANA RHOADES");
                break;
            case SWEETYY:
                System.out.println("SWEETY FOX");
                break;
        }
    }
}*/
/*        //inheritance
        HarryPotter harryPotter = new HarryPotter();
        harryPotter.getName();
        harryPotter.getAuthor();
        harryPotter.characters();

        Percy percy = new Percy();
        percy.getName();
        percy.getAuthor();
        percy.gods();
    }
}*/
//        HashMap<String, Integer> empID = new HashMap<>();
//
//        empID.put("Joh", 12345);
//        empID.put("riccha", 1232345);
//        empID.put("asdf", 1232345);
//
//        System.out.println(empID);
//        System.out.println(empID.get("Joh"));
//        System.out.println(empID.containsKey("asdf"));
//        System.out.println(empID.containsValue(12345));
//
//        empID.put("Joh",123465);
//        System.out.println(empID);
//
//        empID.replace("Joh",213);
//        System.out.println(empID);
//
//        empID.putIfAbsent("pop",1234);
//        System.out.println(empID);
//        System.out.println(empID.get("pop"));
//        System.out.println(empID.containsValue(1234));
//        System.out.println(empID.containsKey("pop"));
//
//
//    }
//}
//        //objecct oriented Programming
//        User youngUser  =  new User();
//        youngUser.name = " daddy ";
//        youngUser.birthDay = LocalDate.parse("1952-01-23");
//        Book user = new Book();
//        user.name =  "   John  cena";
//        user.author =  "john cena";
//
//        youngUser.borrow(book);
//
//        System.out.printf("%s has borrowed these books: %2",youngUser.name, books.toString());
//
//        System.out.printf("%s is born on  %s and he is  now %s",youngUser.name,youngUser.birthDay.toString(),youngUser.age() );
//
//
//    }
//}
//    HashMap<String,Integer>examScores = new HashMap<String,Integer>();
//    examScores.put("cpsc",20);
//    examScores.put("math200",40);
//    examScores.put("bio",60);
//
//    System.out.print(examScores.toString());
//    System.out.println(examScores.get("bio"));
//
//
//    }
//
//    }
    //arrayList
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.remove(2);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(1);
//
//        System.out.println(numbers.contains(Integer.valueOf(3)));
//        System.out.println(numbers.isEmpty());
//        numbers.sort(Comparator.reverseOrder());
//        numbers.sort(Comparator.naturalOrder());
//
//        numbers.forEach(number ->{
//            System.out.print(number*2);
//                }
//                );
//        numbers.forEach(number ->
//                {
//                    numbers.set(numbers.indexOf(number), number * 2);
//                }
//
//        );
//
//        numbers.remove(Integer.valueOf(2));
//        System.out.print(numbers.get(2));
//        System.out.print(numbers);
//        System.out.print(numbers.toString());
//        numbers.clear();
//        System.out.print(numbers.toString());
//    }
//}
//for loop
//        int numbers[] ={1,2,3,4,5,6,7,8,9}  ;
//        int num = 5;
//        int sum  = 0;
//        for(int multiply = 0 ; multiply<num ; multiply++) {
//            System.out.printf("%d * %d =%d\n",num , multiply,num*multiply);
//        }
//        for(int num1 = 1;  num1<=5; num1++) {
//            for (int multiply = 1; multiply <= 5; multiply++) {
//                System.out.printf("%d * %d =%d\n", num1, multiply, num1 * multiply);
//            }
//        }
//        //checking odd / even
//        for(int num2 = 1; num2<=50;num2++){
//            if(num2%2 == 1){
//                System.out.println(num2 +"odd");
//            }
//        }

//        for(int x: numbers){
//            sum+=x;
//        }
//
//        for(int i = 0; i<numbers.length;i++){
//            sum+=numbers[i];
//
//        }
//        System.out.println(sum);
//    }
//}
    //arrays
////        char vowels[] = new char[5];
//
////        vowels[0] = 'a';
////        vowels[1] = 'e';
////        vowels[2] = 'u';
////        vowels[3] = 'o';
////        vowels[4] =  'i';
//        // can also do this  for arrays
//    char vowels[] = {'a','u','o','i','e'};
//    Arrays.sort(vowels);
//    char randomLetters[]={'z','b','s','a','b','x'};
//    vowels[2] ='x';//sorts but replace the x value
//    Arrays.sort(randomLetters);// sorts the  array alphabetically
//    System.out.println(Arrays.toString(vowels) + " "+ vowels.length+ " "+  Arrays.toString(randomLetters));//Returns a string representation of the contents of the specified array
//
//    char sortingMid[] = {'z','a','t','g','h','t'};
//    int startingIndex = 1;
//    int endingIndex = 4;
//    System.out.println(Arrays.toString(sortingMid));
//    Arrays.sort(sortingMid,startingIndex,endingIndex);
//    System.out.println(Arrays.toString(sortingMid));
//
//    //searching for index
//    char searching[] = {'a','b','h','g','p','d'};
//    char key = 'h';
//    char key2 ='g';
//    int  index = Arrays.binarySearch(searching,startingIndex,endingIndex,key);
//    int  index2 = Arrays.binarySearch(searching,key);
//    System.out.printf("array searching  for %c and  %c in " + Arrays.toString(searching) + "index is %d  and %d\n",key,key2,index,index2);
//
//    //filling all the arrays
//        char fill[] = {'a','b','c','d','e'};
//        System.out.println("before fill " +Arrays.toString(fill));
//        Arrays.fill(fill,startingIndex,endingIndex,'x');
//        System.out.println("After fill" + Arrays.toString(fill));
//        Arrays.fill(fill,'x');
//        System.out.println("After fill" + Arrays.toString(fill));
//
//    int numbers[] =  {1,2,3,4,5,6};
//    int copyNumbers[] = numbers;
//    int copyNumbers1[] =  Arrays.copyOf(numbers,numbers.length);
//    int copyNumbers2[] =  Arrays.copyOfRange(numbers, startingIndex,endingIndex);
//    Arrays.fill(numbers,0);
//    System.out.println(Arrays.toString(numbers) + Arrays.toString(copyNumbers) +
//            Arrays.toString(copyNumbers1) + Arrays.toString(copyNumbers2));
//    System.out.println(Arrays.equals(numbers,copyNumbers2) +" "+ (numbers.length==copyNumbers1.length));
////        System.out.println(vowels[2]);//shows the value inside that array slot
//    }
//}
            //inputs
//        Scanner myObj = new Scanner(System.in);
//
//        System.out.println("Enter first digit:");
//        double num1  = myObj.nextDouble();
//
//        System.out.println("Enter second  number:");
//        double num2 = myObj.nextDouble();
//
//        myObj.nextLine();
//        while(true) {
//            System.out.println("what operation would  you  like");
//            String operation =  myObj.nextLine();
            //switch case
//              can replace if else ladder statements;
//            switch(operation) {
//                case ("sum"):
//                    System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
//                    break;
//                case "sub":
//                    System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
//                    break;
//                case "div":
//                    if(num2 == 0){
//                   System.out.println("Can't divide by 0");
//                }else
//                System.out.printf("%f * %f = %f", num1, num2, num1 / num2);
//
//                    break;
//                case "mult":
//                    System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
//                    break;
//            }
//            System.out.print("Would you like to end?  y/n");
//            String end = myObj.nextLine();
//            if(end.equals("n")){
//                continue;
//            }else{
//                break;
//            }
//        }
//          while loops the entire function  over and over
////        while(true)
////        {
////            System.out.println("Enter Operation you would like");
////            String operator  = myObj.nextLine();
////            if (operator.equals("Sum") || operator.equals("sum")) {
////                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
////            } else if (operator.equals("sub") || operator.equals("Sub")) {
////                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
////            } else if (operator.equals("mult") || operator.equals("Mult")) {
////                System.out.printf("%f x %f = %f", num1, num2, num1 * num2);
////            } else if (operator.equals("div") || operator.equals("Div")) {
////                if(num2 == 0){
////                    System.out.println("Can't divide by 0");
////                }else
////                System.out.printf("%f - %f = %f", num1, num2, num1 / num2);
////            }
////            System.out.print("Would you like to end?  y/n");
////            String end = myObj.nextLine();
////            if(end.equals("n")){
////                continue;
////            }else{
////                break;
////            }
//
//        myObj.close();
//
//    }
//}