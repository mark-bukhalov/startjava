public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        System.out.println("modelName = " + jaegerOne.modelName);
        System.out.println("mark = " + jaegerOne.mark);
        System.out.println("speed = " + jaegerOne.speed);
        System.out.println("modelName = " + jaegerOne.modelName);
        System.out.println(jaegerOne.drift());
    }
}
