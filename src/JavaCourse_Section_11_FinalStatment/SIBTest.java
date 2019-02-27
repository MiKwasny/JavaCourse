package JavaCourse_Section_11_FinalStatment;

public class SIBTest {
    // Static initialization blocks
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTEST initialization called");
    }

    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    static{
        System.out.println("Second static init called");
    }

    public void someMethod(){
        System.out.println("someMethod called");
    }
}
