package com.prog_kiev;

import com.sun.jdi.VMCannotBeModifiedException;
import org.jetbrains.annotations.NotNull;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d addVector(Vector3d vec){
        return new Vector3d(this.x+vec.x, this.y+vec.y  , this.z + vec.z);
    }

    public double scalarProduct(Vector3d vec){
        double new_x = this.x*vec.x;
        double new_y = this.y*vec.y;
        double new_z = this.z*vec.z;
        double scalar = new_x + new_y + new_z;
        return scalar;
    }

    public Vector3d vectProduct(Vector3d other){
        double x = this.y * other.z - this.z * other.y;
        double y = this.z * other.x - this.x * other.z;
        double z = this.x * other.y - this.y * other.x;
        return new Vector3d(x,y,z);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
