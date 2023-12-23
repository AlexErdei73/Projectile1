public class Projectile {
    private double y;
    public double vy;
    public double t;
    private Plot plot;
    Projectile(double y, double vy) {
        this.y = y;
        this.vy = vy;
        this.plot = new Plot ("Height of horizontal projectile in time", 0, 2, 0.5, 0, 10, 0.5);
        this.plot.setPointSize(1);
    }

    public void simulate() {
      double y, vy, t, dt, ay, delta_t;
      y = this.y;
      vy = this.vy;
      t = 0;
      ay = -9.8;
      t = 0;
      dt = 0.0001;
      delta_t = 0.001;
      while (y > 0) {
          t += dt;
          y += vy * dt;
          vy += ay * dt;
          if (t > this.t + delta_t) {
              plot.addPoint(t, y);
              this.t = t;
          }
      }
      this.t = t;
      this.vy = vy;
      this.y = y;
      improveFinalResult();
    }
    private void improveFinalResult() {
        double delta_t = this.y / this.vy;
        this.t -= delta_t;
        this.y -= this.vy*delta_t;
    }
}
