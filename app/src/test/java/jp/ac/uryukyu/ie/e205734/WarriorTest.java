/*
* This Java source file was generated by the Gradle 'init' task.
*/
package jp.ac.uryukyu.ie.e205734;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
class WarriorTest {
   @Test
void attackWithWeponSkillTest() {
    int defaultHeroHp = 100;
    Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 100);
    Enemy slime = new Enemy("スライムもどき", 450, 100); //150*3
    for(int i=0; i<3; i++){
        demoHero.attackWithWeponSkill(slime);
    }

    assertEquals(0, slime.getHitPoint());
}
}