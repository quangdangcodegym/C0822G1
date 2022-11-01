package view;

public abstract class ViewTemplate {
    public void showHeader(){
        System.out.println("Hello, how are you today?");
        System.out.println("-------------------------");
    }
    public void showFooter(){
        System.out.println("-------------------------");
        System.out.println("Amazing good job!");
    }
    public abstract void showBody();
    public void showPage(){
        showHeader();
        showBody();
        showFooter();
    }
}
