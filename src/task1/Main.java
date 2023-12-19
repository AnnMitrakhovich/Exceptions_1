package task1;

public class Main {
    public static void main(String[] args) {
        ArrayOperation arr = new ArrayOperation();
        int e = arr.getCode(arr.setArray(10), 5);
        System.out.println(e);
        arr.infoCode(e);
    }




}
