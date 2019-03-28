
    public class Singleton {
        private static Singleton singletonInstance = new Singleton();

        private void Singleton() {
        }

        public static Singleton getInstance() {

            return singletonInstance;
        }


    }

