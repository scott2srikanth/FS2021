import java.util.*;

class TwoSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			list.add(scan.nextInt());
		}
		int target=scan.nextInt();
		
		List<Integer> result=twoSum(list, target);
		if(result.isEmpty())
			System.out.println("-1");
		else
			System.out.println(result);
		
	}
	public static List<Integer> twoSum(List<Integer> list, int target) {

			List<Integer> res=new ArrayList<Integer>();
			List<Integer> original=new ArrayList<Integer>(list);
			for (int i=0; i < list.size(); i++) {
				list.set(i,target-list.get(i));
			}
			for (int i=0; i < list.size(); i++) {
				Integer num = original.get(i);
				int j = list.indexOf(num);
				if (j > -1)  {
					res.add(i+1);
					res.add(j+1);
					break;
				}
			}
			return res;        
		}

}
