import java.time.LocalDate;

public class Date implements Comparable {
    String date;

    public String getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        int result=17;
        return result=3*result+date.hashCode();
    }

    @Override
    public String toString() {
        return this.date;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        Date dt;
        if(obj instanceof Date){
            dt=(Date)obj;
        }
        else{
            return false;
        }
        if(this.date==dt.date){return true;}

        return false;
    }




    public Date(String date){

        this.date=date;
    }

    public void incDate(){
        int tmp= (int)date.charAt(6)+date.charAt(7);
        //Works badly
        switch (tmp){
            case 0-30:tmp++;char c=(char)tmp;   this.date.replace(date.charAt(7),c);
            break;

        }


    }
    public void  decDate(){
        int tmp= (int)date.charAt(6)+date.charAt(7);
        switch (tmp){
            case 0-30:tmp--;char c=(char)tmp;   this.date.replace(date.charAt(7),c);
                break;

        }


    }

    @Override
    public int compareTo(Object o) {
        if(o==null){return -1;}
        if (o==this){return 0;}
        Date dt;
        if(o instanceof Date){
             dt=(Date)o;
        }else{return -1;}
        if (Integer.parseInt(this.date)==Integer.parseInt(dt.date)){return 0;}
        if (Integer.parseInt(this.date)>Integer.parseInt(dt.date)){return 1;}
        if (Integer.parseInt(this.date)<Integer.parseInt(dt.date)){return -1;}


        return -1;
    }
}
