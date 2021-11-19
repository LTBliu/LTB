
import java.util.ArrayList;
import java.util.Scanner;
public class ParkingSystem implements IParking{
	int big,medium,small;
	ArrayList<Object> input=new ArrayList<Object>();
	ArrayList<Object> input1=new ArrayList<Object>();
	public void print() {
    	input.add(big);
    	input.add(medium);
    	input.add(small);
	 	System.out.println(input1);
    }
	public boolean addCar(int carType){
		if(carType==1){
			if(big>0){
				big--;
				return input1.add(true);
			}
		}
		else if(carType==2){
			if(medium>0){
				medium--;
				return input1.add(true);
			}
		}
		else if(carType==3){
			if(small>0){
				small--;
				return input1.add(true);
			}
		}
		return input1.add(false);
	}
	public String addCar1(){
		if(big==0&&medium==0&&small==0)
			return "null";
		return "∑«ø’";
	}
	
	ParkingSystem(int big,int medium,int small){
		this.big=big;
        this.medium=medium;
		this.small=small;
	}
	public static void main(String[]args)throws Exception{
		System.out.println("«Î ‰»Î:");
		IParams params=IParking.parse();//ParkingSystem.parse();
		ParkingSystem ps=new ParkingSystem(params.getBig(),params.getMedium(),params.getSmall());
		ArrayList<Integer> list=params.getPlanParking();
		ps.addCar1();
		for(int i=0;i<list.size();i++){
			ps.addCar(list.get(i));
		}
		ps.input1.add(ps.addCar1());
		ps.print();
	}
}
