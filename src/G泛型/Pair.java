package G泛型;

import java.time.LocalDate;
@SuppressWarnings("all")//警告
public class Pair <T>{
    private  T second;
    public void  setSecond(T newValue){
        second =  newValue;
    }

    public T getFirst() {
        return null;
    }
}
 class DateInterval extends  Pair<LocalDate>{
    @Override
    public  void  setSecond(LocalDate newValue){
        super.setSecond(newValue);
    }

}