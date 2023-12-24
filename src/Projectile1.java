import java.text.DecimalFormat;

public class Projectile1 {
    public static void main(String[] args) {
        Projectile projectile = new Projectile(10, 0, 0.1);
        projectile.simulate();
        DecimalFormat threeDigits = new DecimalFormat("0.000");
        System.out.println("t = " + threeDigits.format(projectile.t));
        System.out.println("vy = " + threeDigits.format(projectile.vy));
    }
}