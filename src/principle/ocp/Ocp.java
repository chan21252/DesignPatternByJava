package principle.ocp;

interface Shape {
    void draw();
}

/**
 * 开闭原则：
 * 对扩展开放，对修改关闭
 *
 * @author Administrator
 * @since 2020-02-04
 */
public class Ocp {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape circle = new Circle();
        Shape triangle = new Triangle();

        GraphicEditor ge = new GraphicEditor();
        ge.drawShape(rect);
        ge.drawShape(circle);
        ge.drawShape(triangle);
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
