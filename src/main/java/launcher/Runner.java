package launcher;

import java.io.File;

import metamutator.MutantSearchSpaceExplorator;

public class Runner {
	
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
    				//System.out.println("********** " + tab[i].getName() + " ***********");
    				String[] res = f.getName().split("\\.");
    				System.out.println(res[0]);
    				String the_path = f.getAbsolutePath().replace(".class","");
    				String package_name = the_path.split("org/")[1].replace('/', '.');
    				package_name.replace(".class", "");
    				MutantSearchSpaceExplorator.runMetaProgramWith(Class.forName("org." + package_name));
    				System.out.println();
    			}
            }
        }
    }
    
	public static void main(String[] args) throws Exception {
		
		walk("target/classes/org/jsoup");

	}
}
