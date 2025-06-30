import java.util.concurrent.Semaphore;

class ParkingLot 
{
    private Semaphore semaphore;
    public ParkingLot(int slots) {

        semaphore = new Semaphore(slots);
    }

    public void park(String carName) 
    {
        try {
            semaphore.acquire();  
            System.out.println(carName + " is trying to park...");
            System.out.println(carName + " parked.");
            Thread.sleep(3000);
            System.out.println(carName + " is leaving.");
            semaphore.release(); 
        } catch (InterruptedException e) {
            System.out.println(carName + " was interrupted.");
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException
    {
        ParkingLot parkingLot = new ParkingLot(4); 

        for (int i = 1; i <= 10; i++) 
        {
             String carName = "Car " + i;
            new Thread(() -> parkingLot.park(carName)).start();
        }
       
    }
}

