package algorithms;

import java.util.Arrays;

public class MruApps {
    public static void main(String[] args) {
        int[] appIds = {3,5,2,4,1};
        altTab(appIds,3);
        System.out.println(Arrays.toString(appIds));
    }
    private static void altTab(int[] mru, int k){
        int n = mru.length;
        int appIndex = k % n;
        int appId = mru[appIndex];
        for (int i = appIndex; i > 0; i--){
            int temp = mru[i];
            mru[i] = mru[i - 1];
            mru[i-1] = temp;
        }
    }
}
