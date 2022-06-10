package senacestacaometeorologica.estacaometeorologicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import senacestacaometeorologica.estacaometeorologicaapi.model.WeatherData;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherData, Integer> {

}
