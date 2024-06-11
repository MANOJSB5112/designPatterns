package DatabaseService;

public class UserService {
    dboperations db=new Mysqlclass();

    public void insert()
    {
        db.insert();
    }
    public void delete()
    {
        db.delete();
    }
    public void update()
    {
        db.update();
    }
}

