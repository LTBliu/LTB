
import java.util.ArrayList;
import java.util.Scanner;

public interface IParking {
	//打印输出结果
	public void print();
	//检查是否有 carType 对应的停车位
	//如果没有空车位，请返回 false ，否则将该车停入车位并返回 true
	public boolean addCar(int carType);
	
	public static IParams parse()throws Exception{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str=sc.next();
		//[[1, 1, 0], [1], [2], [3], [1]]
		String[]s=str.split("\\D+");
		ArrayList<Integer> list=new ArrayList();
		list.add(Integer.parseInt(s[4]));
		list.add(Integer.parseInt(s[5]));
		list.add(Integer.parseInt(s[6]));
		list.add(Integer.parseInt(s[7]));
	   return new IParams(){
		   public int getBig(){// 获取大车位
			   return Integer.parseInt(s[1]);
		   }
		   public int getMedium(){// 获取中车位
			   return Integer.parseInt(s[2]);
		   }
		   public int getSmall(){//获取小车位
			   return Integer.parseInt(s[3]);
		   }
		   public ArrayList<Integer> getPlanParking(){//获取停车序列，例如 [1 2 2 3] 表示 依次停一辆大车，中车，中车，小车
			   return list;
		   }
	   };
	}
}