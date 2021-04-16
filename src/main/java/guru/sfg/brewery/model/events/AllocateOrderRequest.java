package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerOrderDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by marcin.peck on 16.04.2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AllocateOrderRequest {
    private BeerOrderDto beerOrderDto;
}
