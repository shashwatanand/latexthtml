/*
 * generated by Xtext
 */
package org.shashwat.xtext.latexQ.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LatexQAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.tokens");
	}
}