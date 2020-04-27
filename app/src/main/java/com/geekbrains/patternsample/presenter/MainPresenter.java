package com.geekbrains.patternsample.presenter;

import com.geekbrains.patternsample.model.MainRepository;
import com.geekbrains.patternsample.model.uml.Location;
import com.geekbrains.patternsample.model.uml.Price;
import com.geekbrains.patternsample.model.uml.Product;
import com.geekbrains.patternsample.model.uml.Purchase;
import com.geekbrains.patternsample.model.uml.Type;
import com.geekbrains.patternsample.view.MainStateView;

/**
 *Область: сейчас в условиях изоляции в магазин за продуктами хожу один, без жены.
 * Хожу со списком из 20-30 наименований, что купить.
 * Жена дома выбирает продукты(с сайта гипермаркета)(по составу, полезности, производителю, скидке).
 * В итоге я этих 20+ очень конкретных продуктов ищу час!!!! заколебываюсь.
 * Мне было бы полезно, если бы у меня был список в котором точное название, производитель, цена(по ценнику искать удобно),
 * фотка продукта(зная как выглядит — искать быстрее). А может описание продукта будет очень приблизиельно -"йогурт" и все
 * Более того список хорошо бы упорядочить по маршруту обхода моего супермаркета,
 * в который я хожу.
 * В общем, жена составляет список в программе, этот список я считываю и с ним хожу покупаю.
 * */

public class MainPresenter {
    private MainStateView mainStateView;
    private MainRepository mainRepository;
    private Purchase purchase;

    public MainPresenter(MainStateView mainStateView) {
        this.mainStateView = mainStateView;
        //TODO а репозиторий, который может заполняься в разных местах, надо сделать Singleton
        mainRepository = new MainRepository();
        initRepository();
    }

    // при первом запуске
    // должна вычитыватся откудато
    // для конкретного магазина должна пользователем коректироваться протритет отдела(порядок обхода)
    private void initRepository() {
        Location l1 = new Location("Молочка",1);mainRepository.addLocation(l1);
        mainRepository.addType(new Type("Молоко",l1));
        mainRepository.addType(new Type("Йогурт",l1));

        Location l2 = new Location("Хлеб",2); mainRepository.addLocation(l2);
        mainRepository.addType(new Type("Батон",l2));
        mainRepository.addType(new Type("Пироженкое",l2));

        Location l3 = new Location("Напитки",3);mainRepository.addLocation(l3);
        mainRepository.addType(new Type("Газеровка",l3));
        mainRepository.addType(new Type("Сок",l3));

        Location l4 = new Location("Мясной",4);mainRepository.addLocation(l4);
        mainRepository.addType(new Type("Шашлык",l4));
        mainRepository.addType(new Type("Фарш",l4));
        mainRepository.addType(new Type("Стейк",l4));
    }

    /**
     * Типа, UI множествоим кликов сформировал этот список
     */
    public void newPurchase(){
        purchase = new Purchase();
        purchase.addProduct(new Product("натуральный обезжиренный"
                ,"фабрики Бабаевской"
                , new Price(37.5f,true)
                ,mainRepository.getTypesByName("Йогурт"),
                2));
        purchase.addProduct(new Product("Анансовый"
                ,mainRepository.getTypesByName("Сок"),
                1));
        purchase.addProduct(new Product(
                mainRepository.getTypesByName("Фарш"),
                1));

        mainStateView.presenterCallback(purchase.print());

    }
}
