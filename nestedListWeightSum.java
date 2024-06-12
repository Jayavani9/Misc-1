/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 * // Constructor initializes an empty nested list.
 * public NestedInteger();
 *
 * // Constructor initializes a single integer.
 * public NestedInteger(int value);
 *
 * // @return true if this NestedInteger holds a single integer, rather than a
 * nested list.
 * public boolean isInteger();
 *
 * // @return the single integer that this NestedInteger holds, if it holds a
 * single integer
 * // Return null if this NestedInteger holds a nested list
 * public Integer getInteger();
 *
 * // Set this NestedInteger to hold a single integer.
 * public void setInteger(int value);
 *
 * // Set this NestedInteger to hold a nested list and adds a nested integer to
 * it.
 * public void add(NestedInteger ni);
 *
 * // @return the nested list that this NestedInteger holds, if it holds a
 * nested list
 * // Return empty list if this NestedInteger holds a single integer
 * public List<NestedInteger> getList();
 * }
 */

// BFS Solution

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 * // Constructor initializes an empty nested list.
 * public NestedInteger();
 *
 * // Constructor initializes a single integer.
 * public NestedInteger(int value);
 *
 * // @return true if this NestedInteger holds a single integer, rather than a
 * nested list.
 * public boolean isInteger();
 *
 * // @return the single integer that this NestedInteger holds, if it holds a
 * single integer
 * // Return null if this NestedInteger holds a nested list
 * public Integer getInteger();
 *
 * // Set this NestedInteger to hold a single integer.
 * public void setInteger(int value);
 *
 * // Set this NestedInteger to hold a nested list and adds a nested integer to
 * it.
 * public void add(NestedInteger ni);
 *
 * // @return the nested list that this NestedInteger holds, if it holds a
 * nested list
 * // Return empty list if this NestedInteger holds a single integer
 * public List<NestedInteger> getList();
 * }
 */

/*
 * class Solution {
 * public int depthSum(List<NestedInteger> nestedList) {
 * // Tc: O(n) Sc: O(n)
 * Queue<NestedInteger> q = new LinkedList<>();
 * q.addAll(nestedList);
 * 
 * int depth = 1;
 * int ans = 0;
 * 
 * while(!q.isEmpty())
 * {
 * int n = q.size();
 * for(int i = 0; i < n; i++)
 * {
 * NestedInteger cur = q.poll();
 * if(cur.isInteger())
 * {
 * ans += cur.getInteger() * depth;
 * }
 * 
 * else
 * {
 * q.addAll(cur.getList());
 * }
 * }
 * depth++;
 * }
 * return ans;
 * }
 * }
 * 
 * 
 * 
 * // DFS Solution
 * 
 * /*
 * class Solution {
 * public int depthSum(List<NestedInteger> nestedList) {
 * // Tc: O(n) Sc: O(n)
 * return dfs(nestedList, 1);
 * }
 * 
 * private int dfs(List<NestedInteger> nestedList, int depth) {
 * int ans = 0;
 * for (NestedInteger i : nestedList) {
 * if (i.isInteger()) {
 * ans += i.getInteger() * depth;
 * } else {
 * ans += dfs(i.getList(), depth + 1);
 * }
 * }
 * return ans;
 * }
 * }
 * 
 */