package baiTap;

public class TexttestFixture {
    private static class SystemPrinter implements Printer {
        @Override
        public void println(String x) {
            System.out.println(x);
        }

        @Override
        public void println() {
            System.out.println();
        }

        @Override
        public void println(Object x) {
            System.out.println(x);
        }
    }

    public static Printer printer = new SystemPrinter();

    public static int Days = 2;

    public static void main(String[] args) {
        printer.println("OMGHAI!");

        Item[] items = new Item[]{
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("Aged Brie", 2, 0),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Conjured Mana Cake", 3, 6)};

        GildedRose app = new GildedRose(items);

        int days = Days;

        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            printer.println("-------- day " + i + " --------");
            printer.println("name, sellIn, quality");
            for (Item item : items) {
                printer.println(item);
            }
            printer.println();
            app.updateQuality();
        }
    }

}
