package guru.sfg.beer.order.service.services;

import guru.sfg.beer.order.service.domain.BeerOrder;

/**
 * Created by marcin.peck on 16.04.2021
 */
public interface BeerOrderManager {
    BeerOrder newBeerOrder(BeerOrder beerOrder);
}
