//simple pojo containing id and greeting sting
//will be converted to JSON
//used for building REST service using spring boot
package hello;

public class Greeting{
	
	private final long id;
	private final String content;
	
	public Greeting(long id, String content){
		
		this.id = id;
		this.content = content;
		
	}
	
	public long getId(){
		return id;
	}
	
	public String getContent(){
		return content;
	}
	
}