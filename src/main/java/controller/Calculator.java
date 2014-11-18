package controller;

import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class Calculator
{
	@RequestMapping(value = "/add/{first}/{second}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String add(
			@PathVariable String first,
			@PathVariable String second)
	{
		try
		{
			int a = Integer.valueOf(first);
			int b = Integer.valueOf(second);
			return new Gson().toJson(a + b);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "Error";
		}
	}

	@RequestMapping(value = "/subtract/{first}/{second}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String subtract(
			@PathVariable String first,
			@PathVariable String second)
	{
		try
		{
			int a = Integer.valueOf(first);
			int b = Integer.valueOf(second);
			return new Gson().toJson(a - b);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "Error";
		}
	}

	@RequestMapping(value = "/multiply/{first}/{second}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String multiply(
			@PathVariable String first,
			@PathVariable String second)
	{
		try
		{
			int a = Integer.valueOf(first);
			int b = Integer.valueOf(second);
			return new Gson().toJson(a * b);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "Error";
		}
	}

	@RequestMapping(value = "/divide/{first}/{second}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String get(
			@PathVariable String first,
			@PathVariable String second)
	{
		try
		{
			int a = Integer.valueOf(first);
			int b = Integer.valueOf(second);
			return new Gson().toJson(a / b);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return "Error";
		}
	}
}
