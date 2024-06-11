package DatabaseService;

public class Mysqlclass implements dboperations{
    MysqlDriver mq=new MysqlDriver();
    @Override
    public void insert() {
        mq.insert();
    }

    @Override
    public void update() {
        mq.update();
    }

    @Override
    public void delete() {
        mq.delete();
    }
}
