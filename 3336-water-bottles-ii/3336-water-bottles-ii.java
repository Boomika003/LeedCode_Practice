class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int e=numBottles;
        int t=numBottles;
        while(e>=numExchange){
            e-=numExchange;
            e++;
            numExchange++;
            t++;
        }
        return t;
    }
}