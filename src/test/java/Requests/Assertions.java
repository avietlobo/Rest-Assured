package Requests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.common.mapper.TypeRef;
import io.restassured.path.json.JsonPath;
import utils.JsonReader;

public class Assertions {
	
	
	
	String response="{\r\n" + 
			"    \"quiz\": {\r\n" + 
			"        \"sport\": {\r\n" + 
			"            \"q1\": {\r\n" + 
			"                \"question\": \"Which one is correct team name in NBA?\",\r\n" + 
			"                \"options\": [\r\n" + 
			"                    \"New York Bulls\",\r\n" + 
			"                    \"Los Angeles Kings\",\r\n" + 
			"                    \"Golden State Warriros\",\r\n" + 
			"                    \"Huston Rocket\"\r\n" + 
			"                ],\r\n" + 
			"                \"answer\": \"Huston Rocket\"\r\n" + 
			"            }\r\n" + 
			"        },\r\n" + 
			"        \"maths\": {\r\n" + 
			"            \"q1\": {\r\n" + 
			"                \"question\": \"5 + 7 = ?\",\r\n" + 
			"                \"options\": [\r\n" + 
			"                    \"10\",\r\n" + 
			"                    \"11\",\r\n" + 
			"                    \"12\",\r\n" + 
			"                    \"13\"\r\n" + 
			"                ],\r\n" + 
			"                \"answer\": \"12\"\r\n" + 
			"            },\r\n" + 
			"            \"q2\": {\r\n" + 
			"                \"question\": \"12 - 8 = ?\",\r\n" + 
			"                \"options\": [\r\n" + 
			"                    \"1\",\r\n" + 
			"                    \"2\",\r\n" + 
			"                    \"3\",\r\n" + 
			"                    \"4\"\r\n" + 
			"                ],\r\n" + 
			"                \"answer\": \"4\"\r\n" + 
			"            }\r\n" + 
			"        }\r\n" + 
			"    }\r\n" + 
			"}";
	
	
	String response1="{\r\n" + 
			"   \"lotto\":{\r\n" + 
			"      \"lottoId\":5,\r\n" + 
			"      \"winning-numbers\":[2,45,34,23,7,5,3],\r\n" + 
			"      \"winners\":[\r\n" + 
			"         {\r\n" + 
			"            \"winnerId\":23,\r\n" + 
			"            \"numbers\":[2,45,34,23,3,5]\r\n" + 
			"         },\r\n" + 
			"         {\r\n" + 
			"            \"winnerId\":54,\r\n" + 
			"            \"numbers\":[52,3,12,11,18,22]\r\n" + 
			"         }\r\n" + 
			"      ]\r\n" + 
			"   }\r\n" + 
			"}";
	
	
	String response2="{\r\n" + 
			"  \"store\": {\r\n" + 
			"    \"book\": [\r\n" + 
			"      {\r\n" + 
			"        \"category\": \"reference\",\r\n" + 
			"        \"author\": \"Nigel Rees\",\r\n" + 
			"        \"title\": \"Sayings of the Century\",\r\n" + 
			"        \"price\": 8.95\r\n" + 
			"      },\r\n" + 
			"      {\r\n" + 
			"        \"category\": \"fiction\",\r\n" + 
			"        \"author\": \"Herman Melville\",\r\n" + 
			"        \"title\": \"Moby Dick\",\r\n" + 
			"        \"isbn\": \"0-553-21311-3\",\r\n" + 
			"        \"price\": 8.99\r\n" + 
			"      },\r\n" + 
			"      {\r\n" + 
			"        \"category\": \"fiction\",\r\n" + 
			"        \"author\": \"J.R.R. Tolkien\",\r\n" + 
			"        \"title\": \"The Lord of the Rings\",\r\n" + 
			"        \"isbn\": \"0-395-19395-8\",\r\n" + 
			"        \"price\": 22.99\r\n" + 
			"      }\r\n" + 
			"    ],\r\n" + 
			"    \"bicycle\": {\r\n" + 
			"      \"color\": \"red\",\r\n" + 
			"      \"price\": 19.95\r\n" + 
			"    }\r\n" + 
			"  },\r\n" + 
			"  \"expensive\": 10\r\n" + 
			"}";
	
	
	String response_demo4="{ \"store\": {\r\n" + 
			"   \"book\": [\r\n" + 
			"    { \"category\": \"reference\",\r\n" + 
			"      \"author\": \"Nigel Rees\",\r\n" + 
			"      \"title\": \"Sayings of the Century\",\r\n" + 
			"      \"price\": 8.95\r\n" + 
			"    },\r\n" + 
			"    { \"category\": \"fiction\",\r\n" + 
			"      \"author\": \"Evelyn Waugh\",\r\n" + 
			"      \"title\": \"Sword of Honour\",\r\n" + 
			"      \"price\": 12.99\r\n" + 
			"    },\r\n" + 
			"    { \"category\": \"fiction\",\r\n" + 
			"      \"author\": \"Herman Melville\",\r\n" + 
			"      \"title\": \"Moby Dick\",\r\n" + 
			"      \"isbn\": \"0-553-21311-3\",\r\n" + 
			"      \"price\": 8.99\r\n" + 
			"    },\r\n" + 
			"    { \"category\": \"fiction\",\r\n" + 
			"      \"author\": \"J. R. R. Tolkien\",\r\n" + 
			"      \"title\": \"The Lord of the Rings\",\r\n" + 
			"      \"isbn\": \"0-395-19395-8\",\r\n" + 
			"      \"price\": 22.99\r\n" + 
			"    }\r\n" + 
			"  ],\r\n" + 
			"    \"bicycle\": {\r\n" + 
			"      \"color\": \"red\",\r\n" + 
			"      \"price\": 19.95\r\n" + 
			"    }\r\n" + 
			"  }\r\n" + 
			" }";
	
	String response_demo51="{\r\n" + 
			"  \"books\": [\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781593275846\",\r\n" + 
			"      \"title\": \"Eloquent JavaScript, Second Edition\",\r\n" + 
			"      \"subtitle\": \"A Modern Introduction to Programming\",\r\n" + 
			"      \"author\": \"Marijn Haverbeke\",\r\n" + 
			"      \"published\": \"2014-12-14T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"No Starch Press\",\r\n" + 
			"      \"pages\": 472,\r\n" + 
			"      \"description\": \"JavaScript lies at the heart of almost every modern web application, from social apps to the newest browser-based games. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale applications.\",\r\n" + 
			"      \"website\": \"http://eloquentjavascript.net/\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781449331818\",\r\n" + 
			"      \"title\": \"Learning JavaScript Design Patterns\",\r\n" + 
			"      \"subtitle\": \"A JavaScript and jQuery Developer's Guide\",\r\n" + 
			"      \"author\": \"Addy Osmani\",\r\n" + 
			"      \"published\": \"2012-07-01T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"O'Reilly Media\",\r\n" + 
			"      \"pages\": 254,\r\n" + 
			"      \"description\": \"With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.\",\r\n" + 
			"      \"website\": \"http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781449365035\",\r\n" + 
			"      \"title\": \"Speaking JavaScript\",\r\n" + 
			"      \"subtitle\": \"An In-Depth Guide for Programmers\",\r\n" + 
			"      \"author\": \"Axel Rauschmayer\",\r\n" + 
			"      \"published\": \"2014-02-01T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"O'Reilly Media\",\r\n" + 
			"      \"pages\": 460,\r\n" + 
			"      \"description\": \"Like it or not, JavaScript is everywhere these days-from browser to server to mobile-and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who once found himself in the same position.\",\r\n" + 
			"      \"website\": \"http://speakingjs.com/\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781491950296\",\r\n" + 
			"      \"title\": \"Programming JavaScript Applications\",\r\n" + 
			"      \"subtitle\": \"Robust Web Architecture with Node, HTML5, and Modern JS Libraries\",\r\n" + 
			"      \"author\": \"Eric Elliott\",\r\n" + 
			"      \"published\": \"2014-07-01T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"O'Reilly Media\",\r\n" + 
			"      \"pages\": 254,\r\n" + 
			"      \"description\": \"Take advantage of JavaScript's power to build robust web-scale or enterprise applications that are easy to extend and maintain. By applying the design patterns outlined in this practical book, experienced JavaScript developers will learn how to write flexible and resilient code that's easier-yes, easier-to work with as your code base grows.\",\r\n" + 
			"      \"website\": \"http://chimera.labs.oreilly.com/books/1234000000262/index.html\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781593277574\",\r\n" + 
			"      \"title\": \"Understanding ECMAScript 6\",\r\n" + 
			"      \"subtitle\": \"The Definitive Guide for JavaScript Developers\",\r\n" + 
			"      \"author\": \"Nicholas C. Zakas\",\r\n" + 
			"      \"published\": \"2016-09-03T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"No Starch Press\",\r\n" + 
			"      \"pages\": 352,\r\n" + 
			"      \"description\": \"ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that ECMAScript 6 brings to JavaScript.\",\r\n" + 
			"      \"website\": \"https://leanpub.com/understandinges6/read\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781491904244\",\r\n" + 
			"      \"title\": \"You Don't Know JS\",\r\n" + 
			"      \"subtitle\": \"ES6 & Beyond\",\r\n" + 
			"      \"author\": \"Kyle Simpson\",\r\n" + 
			"      \"published\": \"2015-12-27T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"O'Reilly Media\",\r\n" + 
			"      \"pages\": 278,\r\n" + 
			"      \"description\": \"No matter how much experience you have with JavaScript, odds are you don’t fully understand the language. As part of the 'You Don’t Know JS' series, this compact guide focuses on new features available in ECMAScript 6 (ES6), the latest version of the standard upon which JavaScript is built.\",\r\n" + 
			"      \"website\": \"https://github.com/getify/You-Dont-Know-JS/tree/master/es6%20&%20beyond\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781449325862\",\r\n" + 
			"      \"title\": \"Git Pocket Guide\",\r\n" + 
			"      \"subtitle\": \"A Working Introduction\",\r\n" + 
			"      \"author\": \"Richard E. Silverman\",\r\n" + 
			"      \"published\": \"2013-08-02T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"O'Reilly Media\",\r\n" + 
			"      \"pages\": 234,\r\n" + 
			"      \"description\": \"This pocket guide is the perfect on-the-job companion to Git, the distributed version control system. It provides a compact, readable introduction to Git for new users, as well as a reference to common commands and procedures for those of you with Git experience.\",\r\n" + 
			"      \"website\": \"http://chimera.labs.oreilly.com/books/1230000000561/index.html\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"      \"isbn\": \"9781449337711\",\r\n" + 
			"      \"title\": \"Designing Evolvable Web APIs with ASP.NET\",\r\n" + 
			"      \"subtitle\": \"Harnessing the Power of the Web\",\r\n" + 
			"      \"author\": \"Glenn Block, et al.\",\r\n" + 
			"      \"published\": \"2014-04-07T00:00:00.000Z\",\r\n" + 
			"      \"publisher\": \"O'Reilly Media\",\r\n" + 
			"      \"pages\": 538,\r\n" + 
			"      \"description\": \"Design and build Web APIs for a broad range of clients—including browsers and mobile devices—that can adapt to change over time. This practical, hands-on guide takes you through the theory and tools you need to build evolvable HTTP services with Microsoft’s ASP.NET Web API framework. In the process, you’ll learn how design and implement a real-world Web API.\",\r\n" + 
			"      \"website\": \"http://chimera.labs.oreilly.com/books/1234000001708/index.html\"\r\n" + 
			"    }\r\n" + 
			"  ]\r\n" + 
			"}";
	
	
	String response_demo5=JsonReader.readJsonfile("demo5.json");
	
	//@Test
	public void assertUsingJObject()
	{
		JsonPath js= new JsonPath(response);
		System.out.println(js.get("quiz.sport.q1.question"));
		
		List<String> ls=js.getList("quiz.sport.q1.options");
		//Map<String, String> hs1=js.getMap("quiz.sport.q1.options",,);
	
	}
	
	//@Test
	public void assertUsingJObject1()
	{
		JsonPath js= new JsonPath(response1);
		//System.out.println(js.get("quiz.sport.q1.question"));
		
		//List<String> ls=js.getList("quiz.sport.q1.options");
		Map<String, String> hs1=js.getMap("lotto.winners");
		
		
	
	}
	
	//@Test(enabled=false)
	public void assertUsingJObject2()
	{
		JsonPath js= new JsonPath(response2);
		System.out.println("HELLO");
		Map<String,String> ls=js.getMap("store.bicycle");
		List<String> ls1=js.getList("store.book.category");
		
	}
	
	//@Test
	public void assertUsingJSON_Demo4()
	{
		JsonPath js= new JsonPath(response_demo4);
		System.out.println("HELLO");
		Map<String, Object> book = js.getObject("store.book[2]", new TypeRef<Map<String, Object>>() {});
		System.out.println(book.get("category"));
		System.out.println(book.get("author"));
		System.out.println(book.get("title"));
		System.out.println(book.get("isbn"));
		System.out.println(book.get("price"));
	}
	
	@Test
	public void assertUsingJSON_Demo5()
	{
		JsonPath js= new JsonPath(response_demo5);
		List<Book> allBooks = js.getList("books", Book.class);
		System.out.println();
		System.out.println();
		System.out.println("SIZE OF BOOK ARRAY IS===="+allBooks.size());
		System.out.println();
		System.out.println();
		for(int i=0;i<allBooks.size();i++)
		{
			
	    System.out.println("*********BOOK INFO******************************");
	    System.out.println();
		System.out.println(allBooks.get(i).author);
		System.out.println(allBooks.get(i).description);
		System.out.println(allBooks.get(i).isbn);
		System.out.println(allBooks.get(i).pages);
		System.out.println(allBooks.get(i).published);
		System.out.println(allBooks.get(i).publisher);
		System.out.println(allBooks.get(i).subtitle);
		System.out.println(allBooks.get(i).title);
		System.out.println(allBooks.get(i).website);
		System.out.println();
		System.out.println("*******END OF BOOK INFO*******************");
		System.out.println();
		System.out.println();
		
		}
		
		
	
	}
	
}
