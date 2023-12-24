import java.awt.*;

public class Projectile {
    private double y;
    public double vy;
    public double t;
    private double drag;
    private Plot plot;
    Projectile(double y, double vy, double drag) {
        this.y = y;
        this.vy = vy;
        this.drag = drag;
        this.plot = new Plot ("Height of horizontal projectile in time", 0, 2, 0.5, 0, 10, 0.5);
        this.plot.setPointSize(1);
    }

    public void simulate() {
      double y, vy, t, dt, ay, delta_t, ymid, vymid, aymid;
      y = this.y;
      vy = this.vy;
      t = 0;
      t = 0;
      dt = 0.0001;
      delta_t = 0.001;
      while (y > 0) {
          ay = this.ay(vy);
          ymid = y + vy * 0.5 * dt;
          vymid = vy + ay * 0.5 * dt;
          aymid = this.ay(vymid);
          y += vymid * dt;
          vy += aymid * dt;
          t += dt;
          if (t > this.t + delta_t) {
              plot.setColor(Color.red);
              plot.addPoint(t, y);
              plot.setColor(Color.blue);
              plot.addPoint(t, -vy);
              this.t = t;
          }
      }
      this.t = t;
      this.vy = vy;
      this.y = y;
      improveFinalResult();
    }
    private double ay(double vy) {
        double g =9.8;
        if (vy == 0) return -g;
        else return -g - this.drag * vy * vy * vy / Math.abs(vy);
    }
    private void improveFinalResult() {
        double delta_t = this.y / this.vy;
        this.t -= delta_t;
        this.y -= this.vy*delta_t;
    }
}
