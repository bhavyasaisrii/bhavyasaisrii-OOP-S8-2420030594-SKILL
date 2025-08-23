package lab5;

class Transport {
    public void ticketPrice() {
        System.out.println("Ticket price for Transport is not defined.");
    }
}

class Bus extends Transport {
  
    public void ticketPrice() {
        System.out.println("Bus Ticket Price: ₹50");
    }
}

class Train extends Transport {
  
    public void ticketPrice() {
        System.out.println("Train Ticket Price: ₹150");
    }
}

public class inheritence {

    public static void main(String[] args) {
        // Creating objects of Bus and Train
        Transport t1 = new Bus();
        Transport t2 = new Train();

        // Demonstrating method overriding
        t1.ticketPrice();
        t2.ticketPrice();
    }
}
