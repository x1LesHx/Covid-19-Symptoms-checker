import java.util.Scanner;

public class MyP {

	public static void main(String[] args) 
	{
		String words[][] = { 
				{"Fever","حمى"},
				{"headache","صداع"},
				{"dry cough","جاف سعال"},
				{"Exhaustion","ارهاق"},
				{"Pains and aches","اوجاع"},
				{"Sore throat","الحلق التهاب"},
				{"Diarrhea","سهال"},
				
				};
		
		Scanner m = new Scanner(System.in); 
		
		System.out.print("English (1) or Arabic(2)?: ");
		int o = m.nextInt();		
		
		if(o == 1){
			System.out.print("Enter Your Symptoms: ");
			
		}
		else if (o == 2) { 
			System.out.print("اعراضك ادخل:");
		}

		String w = m.next();
		
		if(o == 1){		
			for(int i = 0; i < words.length; i++)
				if(w.equals(words[i][0])) {
					System.out.println("You must check for covid-19");
					break;
				}
		}
		else if(o == 2){		
			for(int i = 0; i < words.length; i++)
				if(w.equals(words[i][1])) {
					System.out.println("الفحص عليك يجب");
                    break;
				}
		}
		else
			System.out.print("Error");
		
		
		m.close();
		

	}

}
