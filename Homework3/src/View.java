import java.util.Locale;
import java.util.ResourceBundle;
public class View {
    public static final String INPUT_INT_DATA_KEY = "input.name";


    public static final ResourceBundle bundle=ResourceBundle.getBundle(
            "regularExpressions",new Locale("en"));

    public void printMessage(String message){System.out.println(message);}




    public void enterName(){
        printMessage(bundle.getString(INPUT_INT_DATA_KEY));
    }
    public void enterSurname(){
        printMessage(bundle.getString("input.surname"));
    }
    public void enterPatronymic(){
        printMessage(bundle.getString("input.patronymic"));
    }
    public void enterEmail(){
        printMessage(bundle.getString("input.email"));
    }
    public void enterCity(){
        printMessage(bundle.getString("input.city"));
    }
    public void enterMobile(){
        printMessage(bundle.getString("input.mobile"));
    }



}
