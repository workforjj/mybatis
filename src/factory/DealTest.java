package factory;

public class DealTest {
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
	DealAll all = getbean("one");
	all.dealThings();
}
}
