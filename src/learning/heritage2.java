package learning;
public class heritage2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage(); // Output: Singleton instance

        SubSingleton subSingleton = SubSingleton.getInstance();
        subSingleton.showMessage(); // Output: SubSingleton instance

        // Check if singleton is an instance of Singleton class
        if (singleton instanceof Singleton) {
            System.out.println("singleton is an instance of Singleton class");
        }

        // Check if subSingleton is an instance of Singleton class
        if (subSingleton instanceof Singleton) {
            System.out.println("subSingleton is an instance of Singleton class");
        }

        // Check if subSingleton is an instance of SubSingleton class
        if (subSingleton instanceof SubSingleton) {
            System.out.println("subSingleton is an instance of SubSingleton class");
        }
    }
}

class Singleton {
    private static Singleton instance;

    protected Singleton() {
        // Private constructor to prevent direct instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance");
    }
}

class SubSingleton extends Singleton {
    private static SubSingleton instance;

    private SubSingleton() {
        // Private constructor to prevent direct instantiation
        super(); // Call the superclass constructor
    }

    public static SubSingleton getInstance() {
        if (instance == null) {
            instance = new SubSingleton();
        }
        return instance;
    }

    @Override
    public void showMessage() {
        System.out.println("SubSingleton instance");
    }
}
