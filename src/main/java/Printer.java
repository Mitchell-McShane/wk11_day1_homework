public class Printer {

    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;
    }

    public int getPages(){
        return this.pages;
    }

    public int getToner(){
        return this.toner;
    }
}
