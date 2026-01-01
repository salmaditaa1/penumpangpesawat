public class Flight {

        private Passenger head;

        public Flight() {
            head = null;
        }

        // Menambah penumpang di akhir daftar
        public void addPassenger(String name) {
            Passenger newPassenger = new Passenger(name);

            if (head == null) {
                head = newPassenger;
            } else {
                Passenger current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newPassenger;
            }
        }

        // Menghapus penumpang berdasarkan nama
        public void removePassenger(String name) {
            if (head == null) {
                System.out.println("Daftar penumpang kosong.");
                return;
            }

            // Jika penumpang pertama yang dihapus
            if (head.name.equals(name)) {
                head = head.next;
                System.out.println("Penumpang " + name + " berhasil dihapus.");
                return;
            }

            Passenger current = head;
            while (current.next != null && !current.next.name.equals(name)) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
                System.out.println("Penumpang " + name + " berhasil dihapus.");
            } else {
                System.out.println("Penumpang tidak ditemukan.");
            }
        }

        // Menampilkan semua penumpang
        public void displayPassengers() {
            if (head == null) {
                System.out.println("Tidak ada penumpang.");
                return;
            }

            Passenger current = head;
            System.out.println("Daftar Penumpang:");
            while (current != null) {
                System.out.println("- " + current.name);
                current = current.next;
            }
        }
    }

