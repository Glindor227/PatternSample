package com.geekbrains.patternsample.model.uml;

//это будет декоратор для Product, он будет высчитывать его полнуюстоимость
class CalculateMoney {
    private Product p;
    CalculateMoney(Product p) {
        this.p = p;
    }

    Float getTotal() {
        Count count =p.getCount();
        MoneyBlock moneyBlock = p.getPrice();
        if (count == null )
            return 0f;
        if(count instanceof CountTotalMoney)
            return ((CountTotalMoney) count).getCount();
        if(moneyBlock==null)
            return 0f;
        if(count instanceof CountItem)
            return moneyBlock.getCost()*((CountItem) count).getCount();
        return 0f;
    }
}
