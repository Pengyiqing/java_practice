import java.util.*;
public class Snakeloop{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();//获得输入的N
		int num;
		if(count%2==0)//判断N是奇数还是偶数
			num = count;
		else
			num = (count-1);
		getArray(num,count);
	}
	//实现算法
	public static void getArray(int num,int count){
		ArrayList<ArrayList> listAll = new ArrayList<ArrayList>(count);//构建二维的ArrayList
		if(num != count){//如果N为奇数，先构建最中间的{1}
			ArrayList start = new ArrayList(count);
			start.add(1);
			listAll.add(start);
		}
		//开始构建矩阵
		for(int i=0;i<num/2;i++){
			ArrayList listHead = new ArrayList();//构建要加入的第一行
			ArrayList listEnd = new ArrayList();//构建要加入的最末行
			int k;
			if(num !=count)
				k = 2*i+3;
			else
				k = 2*i+2;
			for(int j=0;j<k;j++){
				listHead.add(k*k-j);//填充要加入的第一行
				listEnd.add((k-2)*(k-2)+k-1+j);//填充要加入的最末行
				if(j<(k-2)){//填充原有的行的头和尾
					ArrayList listTem = new ArrayList();
					listTem = listAll.get(j);
					listTem.add(0,(k-2)*(k-2)+1+j);
					listTem.add(k*k-k-j);
					listAll.set(j,listTem);
				}
			}
			listAll.add(0,listHead);//加入第一行
			listAll.add(listEnd);//加入最末行
		}
		for(int i=0;i<count;i++){//输出矩阵
			ArrayList listTem = new ArrayList();
			listTem = listAll.get(i);
			for(Iterator iter = listTem.iterator();iter.hasNext();){
				int lastValue = count*count+1 - (int)iter.next();
				//下一行是没有标准格式的输出。
				//System.out.print(lastValue+" ");
				System.out.printf("%3d ",lastValue);
			}
			System.out.println();
		}
	}
}

