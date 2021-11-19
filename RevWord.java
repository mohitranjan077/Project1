package TrackString;

public class RevWord {
static String revstring(String str) {
	char arr[] = str.toCharArray();
	int i=0;
	int j = str.length()-1;
	while(i<j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
	String s2 = new String(arr);
	return s2;
}
public static void main(String[] args) {
	System.out.println(" "+revstring("reverse the array"));
}
}
