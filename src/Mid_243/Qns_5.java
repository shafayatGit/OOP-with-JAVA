package Mid_243;

class Figure {
    void render() {
        System.out.println("rendering...");
    }
}

class Square extends Figure {
    void render() {
        System.out.println("rendering square...");
    }
}

class Oval extends Figure {
    void render() {
        System.out.println("rendering oval...");
    }
}

class Polygon extends Figure {
    void render() {
        System.out.println("rendering polygon...");
    }
}

public class Qns_5 {
    public static void main(String[] args) {
        Figure f[] = new Figure[3];
        f[0] = new Square();
        f[1] = new Oval();
        f[2] = new Polygon();

        for(Figure fig : f){
            fig.render();
        }
    }
}
