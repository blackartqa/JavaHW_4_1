public class BonusMilesService {
    public int calculate(int cost){
        int bonusAmount = 2000;              //сумма в копейках, на которую начисляется 1 бонусная миля
        int miles = cost/bonusAmount;        //бонусные мили
        return miles;
    }
}
