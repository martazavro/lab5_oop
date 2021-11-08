package users;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Sender implements User {
    private static int id = 0;
    private int newid = 1;
    public int getId(){return id;}
    public Sender() {this.id = newid;}
    @Override
    public String update(int status) {
        System.out.println(id + ": " + status);
        return null;
    }
}