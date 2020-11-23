
package jp.ac.uryukyu.ie.e205734;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    /**
     * フィールド変数nameを取得するメソッド。
     * @return this.name モンスター名
     */
    public String getName(){
        return this.name;
    } 
    /**
     * フィールド変数hitPointを取得するメソッド。
     * @return this.hitPoint モンスターのHP
     */
    public int getHitpoint(){
        return this.hitPoint;
    } 
    /**
     * フィールド変数attackを取得するメソッド。
     * @return this.attack モンスターの攻撃力
     */
    public int getAttack(){
        return this.attack;
    } 
    /**
     * フィールド変数deadを取得するメソッド。
     * @return dthis.ead モンスターの状態（生きているか死んでいるか）
     */
    public boolean getDead(){
        return this.dead;
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
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    public void attack(Hero hero){
        if( hitPoint > 0 ){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
        hero.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}