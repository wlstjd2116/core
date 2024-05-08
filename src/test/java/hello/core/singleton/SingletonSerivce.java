package hello.core.singleton;

public class SingletonSerivce {

    // 자기 자신을 내부에 private으로 static하게 갖고있음.
    private static final SingletonSerivce instance = new SingletonSerivce();

    public static SingletonSerivce getInstance() {
        return instance;
    }

    private SingletonSerivce() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
