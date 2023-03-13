import java.util.Random;

public class Merchant {

    public enum Goods {
        POTION,
        GSOM2000,
        SOMEITEM,
        SWORDOFTHOUSANDSTRUTHS,
        POWERARMOR;

        //Случайный товар для текста в вариантах команд
        public static Goods randomItem() {
            return Goods.values()[new Random().nextInt(Goods.values().length)];
        }

        //Взаимодействие с товарами
        public static Goods BuySomeItem() {
            return null;
        }
    }
}