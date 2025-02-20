public class PracticeProblem {

	public static int lettersToFive(String word, char character){
		int instance=0;
		//boolean existInstance = word.contains(character);
		int currentAt=0;
		int length = word.length();
		//char test = character;

		//if (existInstance=true){
		while (currentAt<=length){
			if (word.charAt(currentAt)==(character)){
				instance = instance +1;
				currentAt = currentAt+1;
			} else {
				currentAt = currentAt+1;
			}
		//}
	}
		if (instance==5){
			return (currentAt-1);
		}
		else{
			return (-1);
		}
		
		}

		public static int countLetter (String word, char character){
			int instance = 0;
			int current = 0;
			int length = word.length();
				while (current<=length){
					if (character==word.charAt(current)){
						instance = instance+1;
						current = current+1;
					}
				}
			//}
			return instance;
			
		}

		public static int oddSum(int num, int numAgain){
			int collective = 0;
			if (num>numAgain){
				int inbetween = numAgain;
				while (inbetween<=num){
					if (inbetween%2!=0){
						collective = (collective + inbetween);
						inbetween = inbetween+1;
					}else 
					{
						inbetween = inbetween+1;
					}
					
				}
			}
			if (numAgain>num){ //4>=2
				int inbetween = num; // 0=2
				while (inbetween<=numAgain){ //2 <=4
					if (inbetween%2!=0){ //2/2 != 0 
						collective = (collective + inbetween); 
						inbetween = inbetween+1;
					}else 
					{
						inbetween = inbetween+1;
					}
					
		}

		
	}
		if (num==numAgain){
			if (num%2!=0){
				collective = collective+num;
			}
		}
	return collective;
	}
}


