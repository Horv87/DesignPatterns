package at.martin.designpatterns;

/**
 * Created by martin on 07.12.16.
 */
public class Singleton {

    private Singleton instance;

    private Singleton() {


    }

    public Singleton getInstance() {

        if (instance == null){
            instance = new Singleton();
        }

        return instance;

    }

}
