// Laba05  Variant-6
public class Model {
    Date dt;
    public void CreateDate(String date){
       Date dt=new Date(date);
       }
    public void incDate(){
    dt.incDate();
    }
    public void  decDate(){
    dt.decDate();
    }
    public String getDate(){
        return dt.getDate();

    }




}
