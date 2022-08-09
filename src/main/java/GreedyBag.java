import java.util.Arrays;
import java.util.Comparator;

public class GreedyBag {

    public static void main(String[] args) {
        Integer[][] item = {{1,60,10}, {2,100,20}, {3,120,30}};
        int limit = 50; //배낭의 제한 무게

        //무게 대비 가치순으로 정렬
        Arrays.sort(item, new Comparator<Integer[]>(){
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                for (Integer i : o1) {
                    System.out.println("o1 = " + i);
                }
                for (Integer integer : o2) {
                    System.out.println("o2 = " + integer);
                }
                int prev = o1[1]/o1[2];
                int cur = o2[1]/o2[2];

                if((cur-prev)>0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        int result = 0;

        for(int i = 0 ; i<item.length ; i++){
            Integer[] cur = item[i];
            if (limit > 0) {
                if (limit >= cur[2]) { // 물건 무게가 제한 이하일 경우
                    limit -= cur[2];
                    result += cur[1];
                } else { // 물건 무게가 제한 초과일 경우
                    result += (cur[1] / cur[2] * limit); // 잘라서 넣음
                    limit = 0;
                }
            }else {
                break;
            }
        }
        System.out.println(result); // 240
    }
}
