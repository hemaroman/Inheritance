public class Language {

    public void displayInfo(){
        System.out.println("common English Language");
    }
}
class Java extends  Language {

    @Override
    public void displayInfo() {
        System.out.println("java is A programing language");
    }

    public static void main(String args[]){
        Java java = new Java();
        java.displayInfo();
    }

}