/*
 * generated by Xtext
 */
package org.shashwat.xtext.latexQ.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.shashwat.xtext.latexQ.ui.internal.LatexQActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LatexQExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return LatexQActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return LatexQActivator.getInstance().getInjector(LatexQActivator.ORG_SHASHWAT_XTEXT_LATEXQ_LATEXQ);
	}
	
}
