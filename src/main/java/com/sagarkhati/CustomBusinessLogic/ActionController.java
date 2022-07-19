package com.sagarkhati.CustomBusinessLogic;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ActionController {
	
	@PostMapping("/addNumbers")
	AddResult handler(@RequestBody addNumbersArgs actionArgs) {
		// logic
		
		try {
			Iterable<Integer> numbers = actionArgs.getnumbers();
			
			int sum = 0;
			for (Integer i : numbers) {
				sum += i;
			}

			AddResult result = new AddResult();
			result.setsum(sum);

			return result;
		} catch (Exception e) {
			System.out.println(e);
			
			return new AddResult();
		}
		
	}
}