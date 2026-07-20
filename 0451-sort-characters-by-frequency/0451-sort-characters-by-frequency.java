class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for(char c : s.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c, 0)+ 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );

        pq.addAll(frequency.entrySet());
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return sb.toString();
    }
}