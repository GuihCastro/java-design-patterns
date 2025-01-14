package guilherme.gof;

import guilherme.gof.facade.Facade;
import guilherme.gof.singleton.SingletonEager;
import guilherme.gof.singleton.SingletonLazy;
import guilherme.gof.singleton.SingletonLazyHolder;
import guilherme.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy
        Behavior defensive = new DefensiveBehavior();
        Behavior normal = new NormalBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();
        robot.setBehavior(normal);
        robot.move();

        // Facade
        Facade facade = new Facade();
        facade.migrateClient("Guilherme", "00000-00");
    }
}
