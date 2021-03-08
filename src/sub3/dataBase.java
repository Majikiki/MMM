package sub3;

public class dataBase {
    protected String name;
    private static dataBase database;

    public dataBase(String name) {
        this.name = name;
    }

    static dataBase getInstance(String name){
        if(database==null)
            database=new dataBase(name);
        return database;
    }

}