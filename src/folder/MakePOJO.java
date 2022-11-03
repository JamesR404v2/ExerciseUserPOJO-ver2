package folder;

//import src.folder.User;
// besides the syntax not being accepted by the IDE.... 
// .... it is also unnecessary to import the User class, because I have already stated package folder; at the top of the file.

public class MakePOJO {

	public static void main(String[] args) {

		String test = "test";
		User KeesKaas = new User("KeesKaas", "GHAEHen", "Kees", "van der Meer", 4);
		
//		String test2 = KeesKaas.toString();
//		System.out.println(test);
//		System.out.println(test2); 
//		var pwd = KeesKaas.getPassword();
//// this results in the below error.

//		MakePOJO (1) [Java Application]	
//				folder.MakePOJO at localhost:64247	
//					Thread [main] (Suspended (KeesKaas cannot be resolved))	
//						MakePOJO.main(String[]) line: 14	
//				C:\Appz\Amazon Corretto\jdk11.0.16_9\bin\javaw.exe (Nov 3, 2022, 2:23:54 PM) [pid: 26852]	

		
		System.out.println(KeesKaas.getPassword());
		
		
	}

}
