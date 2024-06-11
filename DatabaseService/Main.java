package DatabaseService;

public class Main {
    public static void main(String[] args) {
        UserService us=new UserService();
        us.update();
        us.delete();
        us.insert();
    }
}
