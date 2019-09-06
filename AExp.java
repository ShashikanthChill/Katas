import java.util.ArrayList;
import java.util.Arrays;

public class AExp {
    int x;
    AExp(int num)
    {
        this.x = num;
    }
    public static void main(String[] args) {
        AExp a1 = new AExp(5);
        AExp a3 = new AExp(10);
        AExp a2 = new AExp(15);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof AExp)
        {
            // AExp temp = (AExp) obj;
            // if(this.x == temp.x)
            // {
            //     return true;
            // } else {
            //     return false;
            // }
            int random = (int) Math.random();
        } else return false;
    }

    @Override
    public int hashCode() {
        return (int) (Math.sqrt(x) + Math.PI - Math.E);
    }
}