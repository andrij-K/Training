public class Main {
    public static void main(String[] args) {

        View v = new View();
        Model m = new Model();
        Controller controller= new Controller(v,m);

        controller.processUser();
    }
}
