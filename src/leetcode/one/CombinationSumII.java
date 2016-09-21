package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0)
            return result;
        Arrays.sort(candidates);
        ArrayList<Integer> combinations = new ArrayList<Integer>();
        if (candidates[0] > target)
            return result;
        else if (candidates[0] == target) {
            combinations.add(candidates[0]);
            result.add(combinations);
            return result;
        }
        boolean[] isVisited = new boolean[candidates.length];
        getCombinations(0, 0, candidates, target, isVisited, combinations, result);
        return result;
    }

    private void getCombinations(int begin, int sum, int[] candidates, int target, boolean[] isVisited,
                        ArrayList<Integer> combinations, ArrayList<List<Integer>> result) {
        for (int i = begin; i < candidates.length; i++) {
            int temp = candidates[i] + sum;
            if (temp > target)
                break;
            else if (temp == target) {
                combinations.add(candidates[i]);
                result.add(new ArrayList<Integer>(combinations));
                combinations.remove(combinations.size() - 1);
                break;
            }
            else {
                isVisited[i] = true;
                if ( i >= 1 && candidates[i] == candidates[i - 1] && !isVisited[i - 1]) {
                    isVisited[i] = false;
                    continue;
                }
                combinations.add(candidates[i]);
                getCombinations(i + 1, temp, candidates, target, isVisited, combinations, result);
                combinations.remove(combinations.size() - 1);
                isVisited[i] = false;
            }
        }
    }
}
