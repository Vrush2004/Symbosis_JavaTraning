package in.vrush.charactercount;

public class CharacterCount {
	String variable;
	public CharacterCount() {}
	
	public CharacterCount(String variable) {
		this.variable = variable;
	}
	
	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public String getVariable() {
		return variable;
	}
	
	public void countVowels() {
		int a =0;
		int e =0;
		int i =0;
		int o =0;
		int u =0;
		int consonant = 0;
		for(int j=0; j<variable.length(); j++) {
			switch(variable.toLowerCase().charAt(j)) {
				case 'a': a++;
						 break;
				case 'e': e++;
						break;
				case 'i': i++;
						break;
				case 'o': o++;
						break;
				case 'u': u++;
						break;
				default: consonant++;
			}
		}
		System.out.println("a :" + a);
		System.out.println("e :" + e);
		System.out.println("i :" + i);
		System.out.println("o :" + o);
		System.out.println("u :" + u);
		System.out.println("consonant :" + consonant);
	}
}
