package inflearn.study01.test09;

import java.util.*;

/**
 * (최소스패닝트리 : 크루스칼, Union&Find 활용)
 */
class Edge1 implements Comparable<Edge1> {

    public int v1;
    public int v2;
    public int cost;

    public Edge1(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge1 o) {
        return this.cost - o.cost;
    }

}

public class 원더랜드 {
    static int[] unf;

    private static int Find(int v){
        if(v==unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }
    private static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        unf = new int[n+1];
        ArrayList<Edge1> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) unf[i] =i;
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();
            arr.add(new Edge1(a,b,c));
        }
        int answer = 0;
        Collections.sort(arr);
        for (Edge1 ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1 != fv2) {
                answer += ob.cost;
                Union(ob.v1, ob.v2);//한집합을
            }
        }
        System.out.println(answer);
    }
}
