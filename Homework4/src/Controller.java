import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private  static Model model;
    private  static View view;
    public Controller(View v ,Model m){
        this.view=v;
        this.model=m;
    }
   public  static Scanner sc= new Scanner(System.in);
    public static ResourceBundle bundle=ResourceBundle.getBundle("regex",new Locale("en"));




     public static  void processUser(){
         Pattern p = Pattern.compile(bundle.getString("regex"));
        view.printMessage("Current date "+LocalDate.now().toString()+"\n"+"Enter your date:");

        do {
            String d=sc.next();
            Matcher matcher = p.matcher(d);

            if (matcher.matches()) {
                model.CreateDate(d);
                view.printMessage("Great, your date"+model.getDate());

            }

        } while (sc.hasNext());





     }
}
