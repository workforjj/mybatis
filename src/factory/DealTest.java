package factory;

/**
 * @author ljj
 *����ģʽ�ʺϣ����ǳ����˴����Ĳ�Ʒ��Ҫ���������Ҿ��й�ͬ�Ľӿ�ʱ��
 *����ͨ����������ģʽ���д����������ϵ�����ģʽ�У���һ�����������ַ�������
 *������ȷ�������󣬵���������ڵڶ��֣�����Ҫʵ���������࣬
 *���ԣ����������£����ǻ�ѡ�õ����֡�����̬��������ģʽ��
 */
public class DealTest {
	
/**���Թ���ģʽ��
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
}
