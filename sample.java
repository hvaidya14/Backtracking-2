class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return result;
        }
        List<Integer> list = new ArrayList<>();
        backtrack(nums, 0, list);
        return result;
    }
    private void backtrack(int[] nums, int index, List<Integer> list) {
        if (index == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        backtrack(nums, index+1, list);
        list.add(nums[index]);
        backtrack(nums, index+1, list);
        list.remove(list.size()-1);
    }
}
