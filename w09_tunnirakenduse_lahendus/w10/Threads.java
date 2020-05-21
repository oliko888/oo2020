public class Threads {

    public static String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" };

    public static void main(final String[] args) {
        for (int i = 0; i < letters.length; i++) {
            new Thread(getRunnable(i), letters[i]).start();
        }
    }

    public static Runnable getRunnable(int i) {
        return () -> {

            switch (i) {
                case 0:
                    try {
                        down();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 1:
                    try {
                        up();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        lettersUp();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        lettersDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    break;
            }
        };
    }
    public static void down() throws InterruptedException {
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }
    }

    public static void up() throws InterruptedException {
        for (int j = 0; j <= 10; j++) {
            System.out.println(j);
        }
    }

    public static void lettersUp() throws InterruptedException {
        for (int j = 0; j <= 10; j++) {
            System.out.println(letters[j]);
        }
    }

    public static void lettersDown() throws InterruptedException {
        for (int j = 10; j >= 0; j--) {
            System.out.println(letters[j]);
        }
    }
  }


