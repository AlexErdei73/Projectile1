public class Projectile1 {
    public static void main(String[] args) {
        Projectile projectile = new Projectile(10, 0);
        projectile.simulate();
        System.out.println("t = " + projectile.t);
        System.out.println("vy = " + projectile.vy);
    }
}