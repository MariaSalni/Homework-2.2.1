public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int milesForPrice10000 = service.calculate( 10_000);
        System.out.println(milesForPrice10000);

        int milesForPrice20000 = service.calculate( 20_000);
        System.out.println(milesForPrice20000);

        int milesForPrice30000 = service.calculate( 30_000);
        System.out.println(milesForPrice30000);

        int milesForPrice40000 = service.calculate( 40_000);
        System.out.println(milesForPrice40000);
    }
}
