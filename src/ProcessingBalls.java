import processing.core.PApplet;

public class ProcessingBalls extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 30;
    int x,y,z,w=0;

    public static void main(String[] args) {
        PApplet.main( "ProcessingBalls", args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(x,HEIGHT/5, DIAMETER,DIAMETER);
        x=x+1;
        ellipse(y,2*HEIGHT/5, DIAMETER,DIAMETER);
        y=y+2;
        ellipse(z,3*HEIGHT/5, DIAMETER,DIAMETER);
        z=z+3;
        ellipse(w,4*HEIGHT/5, DIAMETER,DIAMETER);
        w=w+4;

    }

}
