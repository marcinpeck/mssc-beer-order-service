package guru.sfg.beer.order.service.domain;

/**
 * Created by marcin.peck on 15.04.2021
 */
public enum BeerOrderEventEnum {
    VALIDATE_ORDER, CANCEL_ORDER, VALIDATION_PASSED, VALIDATION_FAILED,
    ALLOCATE_ORDER, ALLOCATION_SUCCESS, ALLOCATION_NO_INVENTORY, ALLOCATION_FAILED,
    BEER_ORDER_PICKED_UP
}
