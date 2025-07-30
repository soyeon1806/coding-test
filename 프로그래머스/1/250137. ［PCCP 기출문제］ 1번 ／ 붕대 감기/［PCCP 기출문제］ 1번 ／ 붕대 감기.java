class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int max_health = health;
        int casting_time = bandage[0];
        int heal_per_sec = bandage[1];
        int bonus = bandage[2];
        
        int time = 0;
        int combo = 0;
        int attack_idx = 0;
        
        int last_attack = attacks[attacks.length - 1][0];
        
        for(int i = 0; i <= last_attack; i++){
            if(attack_idx < attacks.length && attacks[attack_idx][0] == i){
                health -= attacks[attack_idx][1];
                
                if(health <= 0){
                    return -1;
                }
                
                combo = 0;
                attack_idx++;
            }
            else{
                combo++;
                health += heal_per_sec;
                
                if(combo == casting_time){
                    health += bonus;
                    combo = 0;
                }
                
                if(health > max_health){
                    health = max_health;
                }
            }                                                                 
        }
        
        return health;
    }
}