import java.util.ArrayList;

public class task3 {
    public static final int GRIDSIZE = 2;
    public static void main(String[] args) {
        ArrayList<boolean[]> paths = new ArrayList<>();
        paths.add(new boolean[GRIDSIZE * 2]);
        for(int i = 0; i < GRIDSIZE; i++) {
            paths.get(0)[i] = true;
            paths.get(0)[GRIDSIZE * 2 - 1 - i] = false;
        }
        boolean[] buf = paths.get(0).clone();
        printArr(buf);
        boolean tmp;
        while(!checkTerminate(paths)) {
            while(paths.contains(buf)) {
                tmp = buf[buf.length - 1];
                for(int i = buf.length - 1; buf[i - 1] != tmp && 0 < i; i--) {
                    buf[i] = !buf[i];
                    for(int j = 0; checkValid(buf) && j < i; j++)
                        buf[j] = !buf[j];
                }
            }
            paths.add(buf.clone());
            printArr(buf);
        }
        System.out.println(paths.size());
    }
    public static boolean checkTerminate(ArrayList<boolean[]> paths) {
        boolean[] endPath = new boolean[GRIDSIZE * 2];
        for(int i = 0; i < GRIDSIZE; i++) {
            endPath[i] = false;
            endPath[GRIDSIZE * 2 - 1 - i] = true;
        }
        return paths.contains(endPath);
    }
    public static boolean checkValid(boolean[] arr) {
        int countR = 0,
            countL = 0;
        for(int i = 0; i < arr.length; i++) 
            if(arr[i])
                countR++;
            else
                countL++;
        return countR == countL;
    }
    public static void printArr(boolean[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] ? "right " : "down ");
        System.out.println();
    }
}