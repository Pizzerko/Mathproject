public class Main {
    public static void main(String[] args) {
        double smallest = 0;
        double tigerx = 0;
        double lionx = 0;
        double tigery = 0;
        double liony = 0;
        double count = 0;
        double distance = 0;
        double x1Less = 0;
        double x2Less = 0;
        double y1Less = 0;
        double y2Less = 0;
        boolean cond = false;
        for(double t = 0; t < 61; t++) {
            tigerx = (722.0/60.0)*t;
            lionx = (549.0/60.0)*(60.0-t);
            tigery = ((-113.0/722.0)* tigerx) + 113.0;
            liony = ((-336.0/549.0)*lionx) + 336.0;
            distance = Math.sqrt(Math.pow((lionx - tigerx), 2) + Math.pow((liony-tigery), 2));
            if(smallest == 0) {
                cond = true;
                smallest = distance;
            }
            if(distance < smallest && cond) {
                smallest = distance;
                count = t;
                x1Less = tigerx;
                x2Less = lionx;
                        y1Less = tigery;
                y2Less = liony;

            }
            t -= .999;
        }
        System.out.println(smallest + "\n" + count + "\nTigerx " + x1Less + "\nlionx " + x2Less + "\ntigery " + y1Less + "\nliony " + y2Less);

    }
}
