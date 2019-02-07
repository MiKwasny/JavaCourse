package JavaCourse_Section_9_InnerClasses;

public class Main {
    public static void main(String[] args) {

        GearBox mcLaren = new GearBox(6);
        // this is good ->
        GearBox.Gear first = mcLaren.new Gear(1,12.3);

        // this not ->
        //GearBox.Gear second = new GearBox.Gear(1,12.3));
        //GearBox.Gear third = new mcLaren.Gear(3,17.3);

    }
}
