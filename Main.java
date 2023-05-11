import pengguna.Mhs;

public class Main {
    public static void main(String[] args) {

        Mhs mhs = new Mhs("Muhammad Wildan Nur Fadhlullah", "G111190016", 3, "ini_username", "ini_password");

        System.out.println("Nama Mhs: " + mhs.getNama());
        System.out.println("Nim Mhs: " + mhs.getNim());
        System.out.println("Smt Mhs: " + mhs.getSmt());
        System.out.println("Username: " + mhs.getUser().getUsername());
        System.out.println("Password: " + mhs.getUser().getPassword());
    }
}
