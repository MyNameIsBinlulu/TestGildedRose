package baiTap;

class GildedRose {
    Item[] items; // mang array chua items

    //const
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() { // update trat's luong 
        for (int i = 0; i < items.length; i++) {
        	// if : hang ko thuoc name : aged && backstage
            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    	
                        items[i].quality = items[i].quality - 1; // ngoai 3 cai ko giam trat luong tren thi con lai giam
                        //my method Conj
                        if(items[i].name.equals("Conjured Mana Cake")) {
                        	items[i].quality = items[i].quality -1; // neu la Conj thi giam them 1 lan nua = > -2 quality 
                        }
                    }
                } // code dung 
            } else { // truong hop else : hang thuoc name: Aged brie vs BackStage
                if (items[i].quality < 50) { // trat's luong < 50 va de bai ko cho trat luong tren 50 tru luu huynh
                    items[i].quality = items[i].quality + 1; // thi tang trat's luong len 1 neu update sau 1 ngay ko ban dc

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { // truong hop backtage
                        if (items[i].sellIn < 11) { 
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1; // => +2 neu duoi 11 ngay
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1; // => +3 neu duoi 5 ngay
                            }
                        }
                    }
                }
            }// end else

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;  // luu huynh ko can ngay phai ban nen loai bo truong hop luu huynh
            } // ko sai

            if (items[i].sellIn < 0) { // truong hop het ngay ban 
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { 
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {// luu huynh pro vip
                                items[i].quality = items[i].quality - 1; // bi giam 1 trat's luong vs trg hop ngay update < 0 moi ngay
                                // suy ra la bi giam -2 neu < 0 vi giam 1 lan o if dau tien ben tren
                                // MY FUCKING METHOD
                                if(items[i].name.equals("Conjured Mana Cake")) {
                                	items[i].quality = items[i].quality -1; // neu la Conj thi giam them 1 lan nua = > -2 quality 
                                }
                            }
                        }
                    } else { // truong hop  = equals Backstage
                        items[i].quality = items[i].quality - items[i].quality; // theo de bai thi <0 thi quality cua backStage xuong day xh
                    }
                } else { // truong hop day la = equals Aged brie
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1; // cang cu~ cang tang gia nen +1
                    }
                }
            } // end truong hop if cho date < 0
            
        }// end for
        
        
    } // end method UpdateQuality
}