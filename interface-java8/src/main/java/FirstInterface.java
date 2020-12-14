public interface FirstInterface {
    default void show(){
        System.out.println(":: showing first interface ::");
    }

    static void show_static(){
        System.out.println(":: show static ::");
    }
}
