package movers.ngagroupinc.com.samplegitdemo;

/**
 * Created by user1 on 27-Apr-17.
 */

class Singleton {
    private static final Singleton ourInstance = new Singleton();

    static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
