package JavaCourse_Section_11_FinalStatment;

public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private static String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name+" crated instance is: "+instanceNumber);

    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
