package launcher;

import java.util.LinkedList;
import java.util.List;

import metamutator.ConstantReplacementMetaMutator;
import spoon.Launcher;

public class Launch {
	public static void main(String[] args) {
		Launcher l = new Launcher();
		l.addInputResource("/local/yousfi/jsoup-master/src/main/java/org/jsoup");// src/test/java/Foo.java
		l.addProcessor(new ConstantReplacementMetaMutator());
//	    final List<String> arguments = new LinkedList<String>();
//	    arguments.add("--source-classpath");
//	    arguments.add("lib/jsoup-1.8.3.jar");
//	    final String[] argumentsArray = arguments.toArray(new String[arguments.size()]);
//		l.run(argumentsArray);
		l.run();
	}
}