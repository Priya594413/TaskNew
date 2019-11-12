package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountService {
	
	private int count;
	
	@RequestMapping(value="/counts", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public String getScore()
	{
		String pattern="{\"count\":\"%s\"}";
		String json=String.format(pattern, count);
		System.out.println(json);
		return json;
	}
	
	@RequestMapping(value="/counts", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public String updateCounts(int count)
	{
		this.count=count;
		String pattern="{\"count\":\"%s\"}";
		String json=String.format(pattern, count);		
		System.out.println(json);
		return json;
	}
	
	@RequestMapping(value="/counts/count", method=RequestMethod.POST)
	public int incrementCount()
	{
		/*
		 * try { Thread.sleep(10); } catch(InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		count++;
		return count;
	}

	@RequestMapping(value="/counts/count", method=RequestMethod.GET)
	public int getCount() {
		return count;
	}

}
