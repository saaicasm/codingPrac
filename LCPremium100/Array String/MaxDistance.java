import java.util.List;

public class MaxDistance {

    //Brute Force will give
    public int maxDistance(List<List<Integer>> arrays) {
        int maxans = 0;

        for(int i = 0; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);
            for (int j = i + 1; j < arrays.size(); j++) {
                List<Integer> next = arrays.get(j);
                for(int a = 0; a < curr.size(); a++) {
                    int first = curr.get(a);
                    for(int b = 0; b < next.size(); b++) {
                        int second = next.get(b);
                        maxans = Math.max(maxans, Math.abs(first - second));
                    }
                }
            }
        }

        return maxans;
    }
    //Optimal solution
    public int maxDistanceOptimal(List<List<Integer>> arrays) {
        int maxans = 0;
        List<Integer> curr = arrays.get(0);
        int n = curr.size();
        int minval = curr.get(0);
        int maxval = curr.get(n - 1);

        for(int i = 1; i < arrays.size(); i++) {
            curr = arrays.get(i);
            n = curr.size();

            maxans = Math.max(
                maxans,
                Math.max(
                    Math.abs(curr.get(n-1) - minval),
                    Math.abs(maxval - curr.get(0))
                )
            );

            minval = Math.min(minval, curr.get(0));
            maxval = Math.max(maxval, curr.get(n-1));
        }
        
        return maxans;
    }
}
