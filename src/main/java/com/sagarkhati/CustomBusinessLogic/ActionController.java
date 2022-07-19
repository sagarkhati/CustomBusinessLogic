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

	@PostMapping("/Create")
	CreateOutput handler(@RequestBody CreateArgs actionArgs) {
		// logic

		CreateBookInsertInput createBookInsertInput = actionArgs.getobject();

		if (createBookInsertInput.getbook_name().strip() == "") {
			throw new RuntimeException("Please re-enter book name. It can not be empty or white spaces");
		}

		CreateOutput output = new CreateOutput();
		output.setbook_id(createBookInsertInput.getbook_id());
		output.setbook_name(createBookInsertInput.getbook_name());
		output.setfk_user_id(createBookInsertInput.getfk_user_id());

		return output;
	}
}