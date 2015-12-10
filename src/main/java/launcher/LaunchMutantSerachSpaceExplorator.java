package launcher;

import java.io.File;

import org.apache.commons.lang3.AnnotationUtilsTest;

import metamutator.MutantSearchSpaceExplorator;

public class LaunchMutantSerachSpaceExplorator {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("/Users/slimane/Documents/master2/OPL/metamutator/target/classes/org/apache/commons/lang3");
		
		File tab[] = dir.listFiles();
		for(int i = 0 ; i < tab.length ; i++){
			if(!tab[i].getName().contains("$") && tab[i].getName().endsWith(".class")){
				System.out.println("********** " + tab[i].getName() + " ***********");

				String[] res = tab[i].getName().split("\\.");
				System.out.println(res[0]);
				System.out.println(res[1]);				
				MutantSearchSpaceExplorator.runMetaProgramWith(Class.forName("org.apache.commons.lang3."+res[0]));
				System.out.println("**********  ***********");
				//
				//res[0];
			}
		}
				//MutantSearchSpaceExplorator.runMetaProgramWith(ClassUtilsTest.class);
		
	}
}
