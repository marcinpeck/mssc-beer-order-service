package guru.sfg.beer.order.service.services.beer;

import guru.sfg.brewery.model.BeerDto;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by marcin.peck on 12.04.2021
 */
public interface BeerService {
    Optional<BeerDto> getBeerById(UUID id);
    Optional<BeerDto> getBeerByUpc(String upc);
}
