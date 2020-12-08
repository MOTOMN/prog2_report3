
package jp.ac.uryukyu.ie.e205734;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
        /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
        
    }
    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
        /**
     * フィールド変数hitPointのgetterメソッド。
     * 
     * @return this.hitPoint モンスターの体力
     */
    public int getHitPoint() {
        return this.hitPoint;
    }
    /**
     * フィールド変数attackのgetterメソッド。
     * 
     * @return this.attack モンスターの攻撃力
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * nameフィールドに指定した値を代入するメソッド。
     * @param name モンスターの名前
     */ 
    public void setName(String name){
        this.name=name;
    } 
    /**
     * hitPointフィールドに指定した値を代入するメソッド。
     * @param hitPoint モンスターのHP
     */
    public void setHitpoint(int hitPoint){
        this.hitPoint=hitPoint;
    }    
    /**
     * attackフィールドに指定した値を代入するメソッド。
     * @param attack モンスターの攻撃力
     */
    public void setAttack(int attack){
        this.attack=attack;
    } 
    /**
     * deadフィールドに指定した値を代入するメソッド。
     * @param dead モンスターの状態（生きているか死んでいるか）
     */
    public void setDead(boolean dead){
        this.dead=dead;
    } 

}