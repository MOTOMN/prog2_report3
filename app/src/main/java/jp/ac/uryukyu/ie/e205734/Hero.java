
package jp.ac.uryukyu.ie.e205734;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
            /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーローの名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
        
    }
    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
    /**
     * フィールド変数hitPointのgetterメソッド。
     * 
     * @return this.hitPoint ヒーローの体力
     */
    public int getHitpoint() {
        return this.hitPoint;
    }
    /**
     * フィールド変数attackのgetterメソッド。
     * 
     * @return this.attack ヒーローの攻撃力
     */
    public int getAttack() {
        return this.attack;
    }
    /**
     * nameフィールドに指定した値を代入するメソッド。
     * @param name ヒーローの名前
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * hitPointフィールドに指定した値を代入するメソッド。
     * @param hitPoint ヒーローのHP
     */
    public void setHitpoint(int hitPoint){
        this.hitPoint=hitPoint;
    } 
    /**
     * attackフィールドに指定した値を代入するメソッド。
     * @param attack ヒーローの攻撃力
     */
    public void setAttack(int attack){
        this.attack=attack;
    } 
    /**
     * deadフィールドに指定した値を代入するメソッド。
     * @param dead ヒーローの状態（生きているか死んでいるか）
     */
    public void setDead(boolean dead){
        this.dead=dead;
    } 
}
