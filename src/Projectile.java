public class Projectile {
    private double y;
    public double vy;
    public double t;
    Projectile(double y, double vy) {
        this.y = y;
        this.vy = vy;
    }

    public void simulate() {
      double y, vy, t, dt, ay;
      y = this.y;
      vy = this.vy;
      t = 0;
      ay = -9.8;
      t = 0;
      dt = 0.001;
      while (y > 0) {
          t += dt;
          y += vy * dt;
          vy += ay * dt;
      }
      this.t = t;
      this.vy = vy;
    }
}
