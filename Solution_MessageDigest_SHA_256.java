import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution_MessageDigest_SHA_256 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(scan.next().getBytes());
        scan.close();

        byte[] digest = md.digest();

        for (byte b : digest) {
            System.out.format("%02x", b);
        }

    }
}