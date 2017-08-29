package 시저암호;

/**
 * 시저암호 - 2017/08/29 - Park Taegyu
 * */
class Caesar {
	String caesar(String s, int n) {
		StringBuffer result = new StringBuffer();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				ch = (char)((ch-'A'+n)%26+'A');
			}else if(Character.isLowerCase(ch)){
				ch = (char)((ch-'a'+n)%26+'a');
			}
			result.append(ch);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("VoVxCPsibkoplbhGNdkUMckHYtCPjgZSWuoQsP MrrHCz dEpv",45));
	}
}