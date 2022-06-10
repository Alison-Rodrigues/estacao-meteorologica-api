package senacestacaometeorologica.estacaometeorologicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senacestacaometeorologica.estacaometeorologicaapi.dtos.WeatherDto;
import senacestacaometeorologica.estacaometeorologicaapi.model.WeatherData;
import senacestacaometeorologica.estacaometeorologicaapi.repository.WeatherRepository;
import senacestacaometeorologica.estacaometeorologicaapi.service.WeatherService;

@RestController
@RequestMapping("/index")
public class WeatherController {

	@Autowired
	WeatherRepository weatherRepository;
	
	@Autowired
	WeatherService weatherService;
	
	@GetMapping
	public List<WeatherData> findAll() {
		return weatherRepository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody WeatherDto weatherDto) {
		weatherService.save(weatherDto);
	}
}
