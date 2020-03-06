import java.util.*;

class Eamaple {
	public static void main(String[] args) {
		int[] a={12,28,46,32,50};
		int[] b={50,12,32,406,28};
		int[] sol=solution(a,b);
		for (int i:sol) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] solution(int[] a,int[] b)
	{
		HashMap<Integer,Integer> bMap=new HashMap<Integer,Integer>();
		for (int i = 0; i < b.length; i++) {
			bMap.put(b[i], i);
		}
		for (int i = 0; i < a.length; i++) {
			if(bMap.containsKey(a[i])){
				b[i]=bMap.get(a[i]);
			}else {
				b[i]=-1;
			}
		}
		return b;
	}
}