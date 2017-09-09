package factory;

/**
 * @author ljj
 *
 */
public class DealTest {
	
/**测试工厂模式类
 * @param type
 * @return
 */
public static DealAll getbean(String type){
	if("one".equals(type)){
		return new ChildDealOne();
	}
	else if ("two".equals(type)){
		return new ChildDealSecond();
	}
	else{
		return null;
	}
}
public static void main(String[] args){
	//获取对应的对象
	DealAll all = getbean("one");
	all.dealThings();
}
}
