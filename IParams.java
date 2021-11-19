import java.util.ArrayList;

public interface IParams {
	// 获取大车位
	public int getBig();
	// 获取中车位
	public int getMedium();
	// 获取小车位
	public int getSmall();
	// 获取停车序列，例如 [1 2 2 3] 表示 依次停一辆大车，中车，中车，小车
	public ArrayList<Integer> getPlanParking();
}
