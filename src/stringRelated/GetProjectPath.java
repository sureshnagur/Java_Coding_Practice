package stringRelated;

public class GetProjectPath {

	public static void main(String[] args) {
		String s=System.getProperty("user.dir");
		System.out.println(s);

		//even if our project path changed in that case we can use System class getProperty method to get the project path
	}

}
