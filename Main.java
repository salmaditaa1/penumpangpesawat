public class Main {
        public static void main(String[] args) {
            Flight flight = new Flight();

            flight.addPassenger("miknad");
            flight.addPassenger("nopi");
            flight.addPassenger("salma");

            flight.displayPassengers();

            flight.removePassenger("nopi");

            flight.displayPassengers();
        }
    }


