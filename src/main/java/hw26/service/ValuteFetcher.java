package hw26.service;

import java.math.BigDecimal;
import java.util.Optional;

public class ValuteFetcher {

    Optional<BigDecimal> getValuteByCode(String code);
}
