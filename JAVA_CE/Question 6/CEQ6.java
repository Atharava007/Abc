import java.io.*;

abstract class figure {
    abstract void area();

    abstract void volume();
}

class square extends figure {
    float side;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter side of a square: ");
        while (true) {
            side = Float.parseFloat(br.readLine());
            if (side > 0)
                break;
            else
                System.out.print("Invalid side input, Please re-enter side : ");
        }
    }

    void area() {
        System.out.println("Area of square : " + (side * side));
    }

    void volume() {
        System.out.println("Square is 2D figure.Volume cannot be calculated.");
    }
}

class triangle extends figure {
    float height, base;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter height of a triangle: ");
        while (true) {
            height = Float.parseFloat(br.readLine());
            if (height > 0)
                break;
            else
                System.out.print("Invalid height input, Please re-enter height : ");
        }
        System.out.print("Enter base of a triangle: ");
        while (true) {
            base = Float.parseFloat(br.readLine());
            if (base > 0)
                break;
            else
                System.out.print("Invalid base input, Please re-enter base : ");
        }
    }

    void area() {
        System.out.println("Area of triangle : " + (0.5 * height * base));
    }

    void volume() {
        System.out.println("Triangle is 2D figure.Volume cannot be calculated.");
    }
}

class rectangle extends figure {
    float length, breadth;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length of a rectangle : ");
        while (true) {
            length = Float.parseFloat(br.readLine());
            if (length > 0)
                break;
            else
                System.out.print("Invalid length input, Please re-enter length : ");
        }
        System.out.print("Enter breadth of a rectangle: ");
        while (true) {
            breadth = Float.parseFloat(br.readLine());
            if (breadth > 0)
                break;
            else
                System.out.print("Invalid breadth input, Please re-enter breadth : ");
        }
    }

    void area() {
        System.out.println("Area of triangle : " + (length * breadth));
    }

    void volume() {
        System.out.println("Rectangle is 2D figure.Volume cannot be calculated.");
    }
}

class CEQ6 {
    public static void main(String args[]) throws IOException {
        System.out.println("\nSquare : ");
        square s = new square();
        s.input();
        s.area();
        s.volume();

        System.out.println("\nTriangle : ");
        triangle t = new triangle();
        t.input();
        t.area();
        t.volume();

        System.out.println("\nRectangle : ");
        rectangle r = new rectangle();
        r.input();
        r.area();
        r.volume();
    }
}
