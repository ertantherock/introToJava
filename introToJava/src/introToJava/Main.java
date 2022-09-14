package introToJava;

public class Main {
	
	//Main javada başlangıç noktasıdır.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!"); //ctrl+space(sys)
		
		String ustMetin = "Merhabalar";
		String altMetin = "İlginizi Çekebilir";
		
		System.out.println(ustMetin);
		System.out.println(altMetin);
		
		int vade = 12;
		double dolarDun = 18.25;
		double dolarBugun = 18.11;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} else if(dolarBugun>dolarDun) {
			
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//Arrays
		String[] krediler = {"Hızlı Kredi","Mutlu Emekli","Çalışanlara Özel Kredi"};
		
		//For loop for "krediler" array
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
		
		
	}

}
