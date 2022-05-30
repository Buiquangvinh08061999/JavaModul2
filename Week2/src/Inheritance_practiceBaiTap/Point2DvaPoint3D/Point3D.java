package Inheritance_practiceBaiTap.Point2DvaPoint3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y , float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float [] getXYZ(){
        float [] array ={x,y,z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z =" + z + "} " +
                super.toString()+
                '}';
    }
}
