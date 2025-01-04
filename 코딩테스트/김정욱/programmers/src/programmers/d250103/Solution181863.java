package programmers.d250103;

public class Solution181863 {
	public String solution(String rny_string) {
//        StringBuilder sb = new StringBuilder();
//        char tempChar;
//        for(int i=0; i<rny_string.length(); i++) {
//        	tempChar = rny_string.charAt(i);
//        	if(tempChar=='m')
//        		sb.append("rn");
//        	else
//        		sb.append(tempChar);
//        }
//        return sb.toString();
		return rny_string.replace("m", "rn");
    }
}
