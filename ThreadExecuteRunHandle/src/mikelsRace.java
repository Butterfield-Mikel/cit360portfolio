public class mikelsRace {

    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class Racecars
        implements Runnable {
        public void run() {
            String lapTimes[] = {
            		"The black car finshed!"
            		,"The green car finshed!"
            		,"The red car finshed!"
            		,"The blue car finshed!"
            		,"The yellow car finshed!"
                
            };
            try {
                for (int i = 0;
                     i < lapTimes.length;
                     i++) {Thread.sleep(3000);
                    threadMessage(lapTimes[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    }

    public static void main(String args[])
        throws InterruptedException {
        long patience = 1000 * 60 * 60;

        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Ready, set, GO!");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new Racecars());
        t.start();

        threadMessage("And they're off!");
        while (t.isAlive()) {
            threadMessage("The race continues...");
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)
                  && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        threadMessage("Time's up! Mikel's race is over!");
    }
}


// I followed this example http://docs.oracle.com/javase/tutorial/essential/concurrency/simple.html