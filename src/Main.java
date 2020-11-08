public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 1000000;                                     //цена билета в копейках
        int miles = service.calculate(cost);
        System.out.println("Вам начислено " +miles+ " бонусных миль!");
    }
}