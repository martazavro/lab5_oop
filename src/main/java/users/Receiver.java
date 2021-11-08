
package users;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Receiver implements User{

    private int id = 0;
    public Receiver() {this.id = 1;}
    public int getId(){return id;}

    @Override
    public String update(int status) {
        return ("Receiver's id is "+ status);
    }}