package com.emerson.leite.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo.e1;

public class Ponto3D extends Ponto2D {
  private double z;

  Ponto3D(double x, double y, double z) {
    super(x, y);
    this.z = z;
  }

  public double getZ() {
    return z;
  }

  @Override
  public String toString() {
    return super.toString() + ", z = " + z;
  }

}
