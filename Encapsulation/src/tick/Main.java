package tick;

class StopWatch {
    private long startTime;
    private long endTime;
    
    public  StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int minIndeks = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndeks]) {
                    minIndeks = j;
                }
            }
            int temp = arr[minIndeks];
            arr[minIndeks] = arr[i];
            arr[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] array = new int [100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        
        StopWatch stopwatch = new StopWatch();
        
        stopwatch.start();
        
        selectionSort(array);
        
        stopwatch.stop();
        
        long elapsedTime = stopwatch.getElapsedTime();
        
        System.out.println("Execution time sorting 100.000 angka menggunakan selection sort: \n" + elapsedTime + " Milisecond");
    }
    
}
