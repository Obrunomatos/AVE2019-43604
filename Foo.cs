using System;

public class Program{
	
	public static boolean Foo(String msg){
		if(msg.length == 1) return 1;
		if(msg[0] != msg[msg.length - 1]) return 0;
		if(msg.length == 2) return 1;
		else{
			String aux = msg.Substring(1, (msg.length-2));
			return Foo(aux);
		}
	}
	
	
	
	
}