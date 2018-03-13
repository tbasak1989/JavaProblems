/*In Java the Singleton pattern will ensure that there is only one instance of 
 * a class is created in the Java Virtual Machine
*/
public class SingletonClass {
	
	//static member holds only one instance of the Singleton class
	private static SingletonClass singletonClass;
	
	//This will prevent anybody else to instantiate this class
	private SingletonClass() {
		
	}
	
	//Global access point for getting the singleton instance 
	//Double check locking
	public static SingletonClass getSingletonClass() {
		if(null == singletonClass) {
			synchronized (SingletonClass.class) {
				if(null == singletonClass) {
					singletonClass = new SingletonClass();
				}
			}
		}
		return singletonClass;
	}

}
