/**
 * 
 * Count object for how many tickets you have
 * 
 */
import java.util.*;

public class Count{
    public Date refreshed_at;
    public int value;
    
    public Date getRefreshed_at() {
        return refreshed_at;
    }
    public void setRefreshed_at(Date refreshed_at) {
        this.refreshed_at = refreshed_at;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

}
