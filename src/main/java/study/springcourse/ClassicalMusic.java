package study.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private void initMethod() {
        System.out.println("Bean initialization");
    }

    private void destroyMethod() {
        System.out.println("Bean destroying");
    }
}
