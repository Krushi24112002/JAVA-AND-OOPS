import java.math.BigDecimal;

public class OOPsBigDecimal {

    public static void main(String[] args) {

        // Creating Two BigDecimal
        BigDecimal bd1 = new BigDecimal("123233434636436.726462467674673");
        BigDecimal bd2 = new BigDecimal("362646836473746783473.23772476274676");

        // Addition Of Two Big Decimal
        bd1 = bd1.add(bd2);
        System.out.println(bd1);

    }
}