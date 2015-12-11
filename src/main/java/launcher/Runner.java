package launcher;

import org.jsoup.helper.HttpConnectionTest;
import org.jsoup.helper.StringUtilTest;

import metamutator.MutantSearchSpaceExplorator;

public class Runner {

	public static void main(String[] args) throws Exception {
	    //MutantSearchSpaceExplorator.runMetaProgramWith(StringUtilTest.class);
	    MutantSearchSpaceExplorator.runMetaProgramWith(HttpConnectionTest.class);
	}
}
