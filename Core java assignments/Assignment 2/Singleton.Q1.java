public class Singleton {
    
   
    private Singleton() {
    }

    static Singleton default_instance = null;   

    public static Singleton getInstance(){      
        if(default_instance == null)          
        {
            default_instance = new Singleton();   
        }
        return default_instance;
    }
}

public class main {

    public static void main(String[] args) {
        Singleton firstsingleton = Singleton.getInstance();
        Singleton secondsingleton = Singleton.getInstance();

        System.out.println(firstsingletonobject);
        System.out.println(secondsingletonobject);
    }
}
