package JavaCourse_Section_12_SetsAndHashSets;

public class Dog {
    private final String name;

    public Dog(final String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Dog){
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
