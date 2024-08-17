package guilherme.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author GuihCastro
 */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
