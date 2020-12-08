package jp.ac.uryukyu.ie.e205734;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        if (hitPoint >0){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキル発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}