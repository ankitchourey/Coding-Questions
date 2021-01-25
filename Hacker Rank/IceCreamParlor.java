public IceCreamParlor{
	static void whatFlavors(int[] cost, int money) {
        Map<Integer,Integer> mp = new HashMap<>();
        int s=0,l=0;
        for(int i=0;i<cost.length;i++)
        {
            int compliment = money-cost[i];
            if(mp.containsKey(compliment))
            {
                s=mp.get(compliment);
                l=i;
            }else{
                mp.put(cost[i],i);
            }
        }   
        System.out.println((s+1)+" "+(l+1));
    }
} 