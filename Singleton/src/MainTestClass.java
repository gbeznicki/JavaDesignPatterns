public class MainTestClass {
        public static void main(String[] args){

            Singleton instance = Singleton.getInstance();
            Singleton instance2 = Singleton.getInstance();

            System.out.println(instance);
            System.out.println(instance2);
        }
    }
