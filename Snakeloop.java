import java.util.*;
public class Snakeloop{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		int num;
		if(count%2==0)
			num = count;
		else
			num = (count-1);
		getArray(num,count);
	}
	public static void getArray(int num,int count){
		ArrayList<ArrayList> listAll = new ArrayList<ArrayList>(count);
		if(num != count){
			ArrayList start = new ArrayList(count);
			start.add(1);
			listAll.add(start);
		}
		for(int i=0;i<num/2;i++){
			ArrayList listHead = new ArrayList();
			ArrayList listEnd = new ArrayList();
			int k;
			if(num !=count)
				k = 2*i+3;
			else
				k = 2*i+2;
			for(int j=0;j<k;j++){
				listHead.add(k*k-j);
				listEnd.add((k-2)*(k-2)+k-1+j);
				if(j<(k-2)){
					ArrayList listTem = new ArrayList();
					listTem = listAll.get(j);
					listTem.add(0,(k-2)*(k-2)+1+j);
					listTem.add(k*k-k-j);
					listAll.set(j,listTem);
				}
			}
			listAll.add(0,listHead);
			listAll.add(listEnd);
		}
		for(int i=0;i<count;i++){
			ArrayList listTem = new ArrayList();
			listTem = listAll.get(i);
			for(Iterator iter = listTem.iterator();iter.hasNext();){
				int lastValue = count*count+1 - (int)iter.next();
//				System.out.print(lastValue+" ");
				System.out.printf("%3d ",lastValue);
			}
			System.out.println();
		}
	}
}

