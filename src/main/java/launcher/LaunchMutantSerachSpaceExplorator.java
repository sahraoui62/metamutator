package launcher;

import java.io.File;

//import org.apache.commons.lang3.*;
//import org.apache.commons.lang3.event.EventListenerSupportTest;
//import org.apache.commons.lang3.math.FractionTest;
//import org.apache.commons.lang3.mutable.MutableIntTest;
//import org.apache.commons.lang3.text.StrMatcherTest;
//import org.apache.commons.lang3.time.DateUtilsTest;
import org.junit.runner.JUnitCore;

import metamutator.MutantSearchSpaceExplorator;
import metamutator.RunnerThreaded;

public class LaunchMutantSerachSpaceExplorator {

    public static void walk(String path) throws ClassNotFoundException, Exception {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
            }
            else {
            	if(f.getName().endsWith(".class") && !f.getName().contains("$")){
    				System.out.println("********** " + f.getName() + " ***********");
    				String[] res = f.getName().split("\\.");
    				System.out.println(res[0]);
    				String the_path = f.getAbsolutePath().replace(".class","");
    				String package_name = the_path.split("org/")[1].replace('/', '.');
    				package_name.replace(".class", "");
    				MutantSearchSpaceExplorator.runMetaProgramWith(Class.forName("org." + package_name));
            	}
            }
        }
    }
    
	public static void main(String[] args) throws Exception {
		
		System.out.println("Start running ...");

		walk("target/classes/org/jsoup");
		
		/*File dir = new File("target/classes/org/jsoup/helper");
		
		File tab[] = dir.listFiles();
		for(int i = 0 ; i < tab.length ; i++){
			if(tab[i].getName().endsWith(".class") && !tab[i].getName().contains("$")){
				//System.out.println("********** " + tab[i].getName() + " ***********");
				String[] res = tab[i].getName().split("\\.");
				System.out.println(res[0]);
				MutantSearchSpaceExplorator.runMetaProgramWith(Class.forName("org.jsoup.helper."+res[0]));
			}
		}*/
		
		System.out.println("Finished !");
		
	}
}
