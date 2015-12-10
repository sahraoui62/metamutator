package launcher;

import java.io.File;

import org.apache.commons.lang3.ClassUtilsTest;

import metamutator.MutantSearchSpaceExplorator;

public class LaunchMutantSerachSpaceExplorator {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("target/classes/org/apache/commons/lang3");
		
		File tab[] = dir.listFiles();
		System.out.println("Start running ...");
		for(int i = 0 ; i < tab.length ; i++){
			if(tab[i].getName().endsWith(".class") && !tab[i].getName().contains("$")){
				System.out.println("********** " + tab[i].getName() + " ***********");
				String[] res = tab[i].getName().split("\\.");			
				MutantSearchSpaceExplorator.runMetaProgramWith(Class.forName("org.apache.commons.lang3."+res[0]));
				//
				//res[0];
			}
		}
		System.out.println("Finished !");
		MutantSearchSpaceExplorator.runMetaProgramWith(ClassUtilsTest.class);
		
	}
}
