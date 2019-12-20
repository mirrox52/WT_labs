package utils;

public class IDGenerator {
    private static int id;

    private IDGenerator() {

    }

    public static int getNewId() {
        return ++id;
    }

    public static void init(int i){
        if (id == 0){
            id = i;
        }
    }

}
