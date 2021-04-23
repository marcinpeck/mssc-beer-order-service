package guru.sfg.beer.order.service.services;

import guru.sfg.brewery.model.CustomerPagedList;
import org.springframework.data.domain.Pageable;

/**
 * Created by marcin.peck on 23.04.2021
 */
public interface CustomerService {
    CustomerPagedList listCustomers(Pageable pageable);
}
