import java.util.concurrent.CountDownLatch;
import java.util.*;
public class a
{

    /**
     *This is the main method
     * To run it, create an integer array arr
     * Then wait a long time for us to sort
     * and to not return the same numbers 
     * you started with
     */
    public long kittermanSort(int[] arr)

    {
        long startTime = System.nanoTime();

        for(int ik : arr)
        {
            System.out.println(Arrays.toString(arr));

            for(int vc : arr)
            {
                System.out.println(Arrays.toString(arr));
                for(int af : arr)
                {   System.out.println(Arrays.toString(arr));
                    for( int y : arr)
                    {
                        System.out.println(Arrays.toString(arr));
                        for( int yu : arr)
                        {
                            System.out.println(Arrays.toString(arr));
                            for(int io : arr)
                            {
                                System.out.println(Arrays.toString(arr));
                                for(int hj : arr)
                                {
                                    System.out.println(Arrays.toString(arr));
                                    for(int i = 0; i < arr.length-1; i++ ){
                                        if(arr[i] > arr[i+1])
                                        {
                                            for(int o = 0; o < i; o++)
                                            {
                                                System.out.println(Arrays.toString(arr));
                                                int tmp = arr[i];
                                                System.out.println(Arrays.toString(arr));
                                                arr[i] = arr[i+1];
                                                System.out.println(Arrays.toString(arr));
                                                arr[i+1] = tmp;
                                                arr[i+1] = arr[i];
                                                arr[i+1]--;
                                                arr[i]++;
                                            }
                                        }

                                        for(int a = arr.length-1; a > 0; a--){
                                            if(arr[a] > arr[a-1])
                                            {
                                                for(int l = a; l > 0; l--)
                                                {
                                                    int tmp = arr[a];
                                                    for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                    for(int wq = 0; wq < 10; wq++) tmp = arr[a];
                                                    tmp = arr[a];System.out.println(Arrays.toString(arr));
                                                    for(int wq = 0; wq < 10; wq++)arr[a] = arr[a-1];
                                                    for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                    for(int wq = 0; wq < 10; wq++)arr[a-1] = tmp;
                                                    for(int wq = 0; wq < 10; wq++)arr[a-1] = arr[a];
                                                    for(int wq = 0; wq < 10; wq++)arr[a-1] ++;
                                                    for(int wq = 0; wq < 10; wq++)arr[a] --;
                                                }
                                            }
                                            for(int b = 0; b < arr.length-1; b++){
                                                if(arr[b] > arr[b+1])
                                                {
                                                    for( int z = b; z < arr.length-1; z++)
                                                    {
                                                        for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                        int tmp = arr[b];
                                                        for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                        for(int wq = 0; wq < 10; wq++)arr[b] = arr[b+1];
                                                        for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                        for(int wq = 0; wq < 10; wq++)arr[b+1] = tmp;
                                                        for(int wq = 0; wq < 10; wq++)arr[b] = arr[b+1];
                                                        for(int wq = 0; wq < 10; wq++)arr[b+1] ++;
                                                        for(int wq = 0; wq < 10; wq++)arr[b] --;
                                                    }
                                                }
                                                for(int v = arr.length-1; v > 0; v--){
                                                    if(arr[v] > arr[v-1])
                                                    {
                                                        for(int r = v; r > 0; r--)
                                                        {
                                                            for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                            int tmp = arr[v];
                                                            for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                            for(int wq = 0; wq < 10; wq++)arr[v] = arr[v-1];
                                                            for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                            for(int wq = 0; wq < 10; wq++)arr[v-1] = tmp;
                                                            for(int wq = 0; wq < 10; wq++)           arr[v] = arr[v-1];
                                                            for(int wq = 0; wq < 10; wq++)arr[v] ++;
                                                            for(int wq = 0; wq < 10; wq++)arr[v-1] --;
                                                            for(int wq = 0; wq < 10; wq++)arr[r] --;
                                                            for(int wq = 0; wq < 10; wq++)arr[r-1] ++;
                                                        }
                                                    }
                                                    for(int t = 0; t <arr.length-1; t++){
                                                        for(int vb = 0; vb < t; vb++)
                                                        {
                                                            for(int hg = 0; hg < vb; hg++)
                                                            {
                                                                if(arr[t] > arr[t+1])
                                                                {
                                                                    for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                                    int tmp = arr[t];
                                                                    for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                                    for(int wq = 0; wq < 10; wq++)arr[t] = arr[t+1];
                                                                    for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                                    for(int wq = 0; wq < 10; wq++)arr[t+1] = tmp;
                                                                    for(int wq = 0; wq < 10; wq++)arr[t] = arr[t+1];
                                                                    for(int wq = 0; wq < 10; wq++)arr[t] ++;
                                                                    for(int wq = 0; wq < 10; wq++)arr[t+1] --;
                                                                    for(int wq = 0; wq < 10; wq++)arr[5] = 10;
                                                                    for(int wq = 0; wq < 10; wq++)arr[7] = 9;
                                                                    for(int wq = 0; wq < 10; wq++)arr[vb] --;
                                                                    for(int wq = 0; wq < 10; wq++)arr[vb+1] ++;
                                                                    for(int wq = 0; wq < 10; wq++)arr[hg] ++;
                                                                    for(int wq = 0; wq < 10; wq++)arr[hg+1] --;
                                                                }
                                                            }
                                                        }
                                                        for(int h = arr.length-1; h > 0; h--){
                                                            if(arr[h] > arr[h-1])
                                                            {
                                                                System.out.println(Arrays.toString(arr));
                                                                int tmp = arr[h];
                                                                System.out.println(Arrays.toString(arr));
                                                                arr[h] = arr[h-1];
                                                                System.out.println(Arrays.toString(arr));
                                                                arr[h-1] = tmp;
                                                                arr[h] = arr[h-1];
                                                                arr[h] ++;
                                                                arr[h-1] --;
                                                            }
                                                            for(int r = 0; r < arr.length-1; r++){
                                                                if(arr[r] > arr[r+1])
                                                                {
                                                                    System.out.println(Arrays.toString(arr));
                                                                    int tmp = arr[r];
                                                                    System.out.println(Arrays.toString(arr));
                                                                    arr[r] = arr[r+1];
                                                                    System.out.println(Arrays.toString(arr));
                                                                    arr[r+1] = tmp;
                                                                    arr[r] = arr[r+1];
                                                                    arr[r] --;
                                                                    arr[r+1] ++;
                                                                }
                                                                for(int u = arr.length-1; u > 0; u--){
                                                                    if(arr[u] > arr[u-1])
                                                                    {
                                                                        System.out.println(Arrays.toString(arr));
                                                                        int tmp = arr[u];
                                                                        System.out.println(Arrays.toString(arr));
                                                                        arr[u] = arr[u-1];
                                                                        System.out.println(Arrays.toString(arr));
                                                                        arr[u-1] = tmp;
                                                                        arr[u] = arr[u-1];
                                                                        arr[u] --;
                                                                        arr[u-1] ++;

                                                                    }
                                                                    for(int g = 0; g < arr.length-1; g++){

                                                                        if(arr[i] > arr[i+1])
                                                                        {
                                                                            for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                                            int tmp = arr[g];
                                                                            for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                                            for(int wq = 0; wq < 10; wq++)arr[g] = arr[g+1];
                                                                            for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));
                                                                            arr[g+1] = tmp;
                                                                            arr[g] = arr[g+1];
                                                                        }
                                                                        for(int op = 0; op<arr.length-1;op++)
                                                                        {
                                                                            for(int wq = 0; wq < 10; wq++)arr[op] = 5;
                                                                            for(int po = 0; po < op; po++)
                                                                            {
                                                                                if(arr[po] == arr[po+1])
                                                                                    for(int wq = 0; wq < 10; wq++)arr[po] -= 5;
                                                                            }
                                                                            for(int wq = 0; wq < 10; wq++)arr[op+1] ++;
                                                                            for(int wq = 0; wq < 10; wq++)arr[op] --;

                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } for(int wq = 0; wq < 10; wq++)System.out.println(Arrays.toString(arr));

                                    for(int p = 0; p < arr.length-1; p++)
                                    {
                                        if(arr[p] == arr[p+1])
                                            for(int x = 0; x < p; x++)
                                                for(int wq = 0; wq < 10; wq++)arr[x] -= 4;

                                    }
                                    for(int ty = 0; ty< arr.length-1; ty++)
                                    {
                                        if(arr[ty] > arr[ty+1])
                                        {  int tmp = arr[ty];
                                            for(int wq = 0; wq < 10; wq++)arr[ty] = arr[ty+1];
                                            for(int wq = 0; wq < 10; wq++)arr[ty+1] = tmp;

                                        }
                                    }
                                    System.out.println(Arrays.toString(arr));
                                    System.out.println("if you see this, good luck not crashing.");

                                }
                            }
                        }
                    }
                }
            }
        }
        final CountDownLatch doneSignal = new CountDownLatch(arr.length);
        for(final int nums : arr)
        {
            new Thread(new Runnable(){
                public void run(){
                    doneSignal.countDown();
                    try
                    {
                        doneSignal.await();

                        Thread.sleep(nums * 1000);
                        System.out.println(nums);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        return duration;         

    }

   
}

