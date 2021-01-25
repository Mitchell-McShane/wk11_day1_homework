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

    public void print(int copies, int pages){
        int totalPages = copies * pages;
        if (totalPages < pages){
            this.pages -= totalPages;
        }
    }
}
