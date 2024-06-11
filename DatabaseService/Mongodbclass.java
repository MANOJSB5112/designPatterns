package DatabaseService;

public class Mongodbclass implements dboperations{
    MongodbDriver md=new MongodbDriver();
    @Override
    public void insert() {
      md.insert();
    }

    @Override
    public void update() {
   md.update();
    }

    @Override
    public void delete() {
     md.delete();
    }
}
