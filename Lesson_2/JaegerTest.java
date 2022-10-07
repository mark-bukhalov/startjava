public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println("mark = " + jaegerOne.getMark());
        System.out.println("speed = " + jaegerOne.getSpeed());
        System.out.println("modelName = " + jaegerOne.getModelName());
        System.out.println(jaegerOne.drift());
    }
}
