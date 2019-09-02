public class Singleton {
    private volatile static Singleton instance;

    private Singleton(){
    }

    private static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
}
