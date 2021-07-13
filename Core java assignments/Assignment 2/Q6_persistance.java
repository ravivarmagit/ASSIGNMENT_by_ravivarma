public abstract class persistence {
    abstract void persist();
}


public class FilePersistance extends persistence{
    @Override
    void persist() {
        System.out.println("file added");

    }
}


public class DatabasePersistence extends persistence{
    @Override
    void persist() {
        System.out.println("file added");
    }
}

public class main {
    public static void main(String[] args) {
         FilePersistance persistence = new FilePersistance();
         persistence.persist();
        }
}
