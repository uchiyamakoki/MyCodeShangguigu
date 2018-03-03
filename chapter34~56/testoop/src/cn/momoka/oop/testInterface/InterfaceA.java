package cn.momoka.oop.testInterface;

public interface InterfaceA {
	void aaa();
}
interface InterfaceB{
	
}
interface InterfaceC extends InterfaceA,InterfaceB{
	void ccc();
}
class TestClass implements InterfaceC{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}
	
}