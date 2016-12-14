package at.martin.designpatterns.SingletonPattern;

/**
 * Created by martin on 07.12.16.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {


    }

    public static Singleton getInstance() {

        if (instance == null){
            instance = new Singleton();
        }
        return instance;

    }

}
