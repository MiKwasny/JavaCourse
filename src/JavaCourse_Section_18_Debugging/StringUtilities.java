package JavaCourse_Section_18_Debugging;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c){
        sBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefing(String str){
        String upper = str.toUpperCase();
        return "Prefix " +upper;
    }
    public String addSuffic(String str){
        return str + "__sufix";
    }
}
