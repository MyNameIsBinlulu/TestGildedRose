package baiTap;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] { // ten item , so ngay phai ban , trat's luong sp
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), // hang cu~ thi trat luong cao , 
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), // ko bh giam trat's luong
                new Item("Sulfuras, Hand of Ragnaros", -1, 80), // ko bh giam trat's luong
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49), // tang chat luong khi de cang lau
                //Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
            	//Quality drops to 0 after the concert
                
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) }; // quality giam x2 so vs hang` quality hang` khac
        


        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
