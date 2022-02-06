package uz.pdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.pdp.entity.Currency;
import uz.pdp.payload.Result;
import uz.pdp.service.CurrencyService;

@RestController
@RequestMapping(value = "/currency")
public class CurrencyController {

	@Autowired
	CurrencyService currencyService;
	
	@PostMapping
	public Result addCurrency(@RequestBody Currency currency) {
		return currencyService.addCurrent(currency);
	}
	@GetMapping
	public List<Currency> getCurrencyc() {
		return currencyService.getCurrencyc();
	}
	@GetMapping(value = "/{id}")
	public Result getCurrency(@PathVariable Integer id) {
		return currencyService.getCurrency(id);
	}
	@PutMapping(value = "/{id}")
	public Result editCurreny(@PathVariable Integer id, @RequestBody Currency currency) {
		return currencyService.editCurreny(id, currency);
	}
	@DeleteMapping(value = "/{id}")
	public Result deleteCurrency(@PathVariable Integer id) {
		return currencyService.deletCurrency(id);
	}
}
