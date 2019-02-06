package JavaCourse_Section_7_Encapsulation_Exercise;

public class Printer {

    private int tonerLevel = 100;
    private double numberPages;
    private String printerName;

    public Printer(int tonerLevel, int numberPages, String printerName) {

        if (tonerLevel < 0 && tonerLevel > 100) {
            this.tonerLevel = tonerLevel;
        }
        if (numberPages > 100) {
            this.numberPages = this.tonerLevel;
        } else {
            this.numberPages = numberPages;
        }

        this.printerName = printerName;
    }
    public void Print(){


        if(this.printerName == "duplex"){
            System.out.println("Number of printer paged = " +this.numberPages/2);
        }
        else{
            System.out.println("Number of printed pages = " +this.numberPages);
        }
    }
}
