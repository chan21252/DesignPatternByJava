package proxy.staticproxy;

public class Target implements ITeacher {
    @Override
    public void teach() {
        System.out.println("老师在上课");
    }
}
