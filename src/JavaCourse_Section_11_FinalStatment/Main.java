package JavaCourse_Section_11_FinalStatment;

public class Main extends rofl{
    public static void main(String[] args) {
//        SomeClass someClass1 = new SomeClass("lol1");
//        SomeClass someClass2 = new SomeClass("lol2");
//        SomeClass someClass3 = new SomeClass("lol3");
//
//        System.out.println(Math.PI);
//
//        //You cant initiate an object with private constructor
//        //You cant inherit Final class and class with private default constructor and with initiated constructor "constructor(something)"
//
//        //Math m = new Math();
//        int pw = 1212122;
//
//        Password storePassword1 = new ExtendedPassword(pw);
//        storePassword1.storePassword();
//
//
//        Password storePassword2 = new Password(pw);
//        storePassword2.storePassword();
//        storePassword2.letMein(12212);
//        storePassword2.letMein(1212122);

        //looks like all SIB is called before constructor
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);


    }
}
