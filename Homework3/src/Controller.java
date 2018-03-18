import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private Model model;
    private View view;


    public Controller(View view,Model model){
        this.model=model;
        this.view=view;
    }




    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));




    public void processUser() throws IOException {
       processName();
        view.printMessage(record.getName());











    }

    Record record= new Record();
    private boolean processName() throws IOException {
        view.enterName();
        String string=bufferedReader.readLine();
        Pattern p = Pattern.compile("[a-z]");
        Matcher m= p.matcher(string);
       if (m.matches()){
           record.setName(string);


        }
         return true;

    }




}



