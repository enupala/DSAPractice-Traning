package org.example.practice2;

class FindLoop {
    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        int loopLength = calculateLoopLength(arr);
        System.out.print(loopLength);
    }

    public static int calculateLoopLength(int[] arr) {

        int cal = 0, len = 0;
        int n = arr.length;
        boolean[] isVisited = new boolean[n];
        int i = 0;
        if(n==0)
            return -1;
        while (true) {
            if (isVisited[i]) {
                return -1;
            }
            if (arr[i] > 0) {
                cal = (i + arr[i]) % n;
            } else {
                cal = (i - arr[i]) % n;
            }
            isVisited[i] = true;
            i = cal;
            len += 1;
            if (i == 0) {
                return len;
            }
        }


    }
}

