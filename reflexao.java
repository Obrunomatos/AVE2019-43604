public class A{}
public class B extends A {}
public class C extends B{
	public int x, y;
	public void foo(){}
}

public class App{
	public static void main(String args[]){
		PrintMembers(new C());
        PrintMethods(new C());
        PrintFields(new C());
		
	}
	
	public static void PrintMembers(object obj) {
        System.out.println("Members: ");
        foreach(var m in obj.GetType().GetMembers()) Console.Write(m.Name + " ");
        Console.WriteLine();
    }
    public static void PrintMethods(object obj) {
        System.out.println("Methods: ");
		Method[] methods = obj.class.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
               System.out.println(methods[i].toString());
           }
    }
    public static void PrintFields(object obj) {
        Console.Write("Fields: ");
		while(obj != null){
			Field[] f = obj.getSuperClass().getDeclaredFields();
			for(int i=0; i<f.length;i++)System.out.println(f[i].getName);
			
    }
	
	
}