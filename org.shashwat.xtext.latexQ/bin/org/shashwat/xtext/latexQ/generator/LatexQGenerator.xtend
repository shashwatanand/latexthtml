/*
 * generated by Xtext
 */
package org.shashwat.xtext.latexQ.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.shashwat.xtext.latexQ.latexQ.QuestionPaper
import org.shashwat.xtext.latexQ.latexQ.Question
import org.shashwat.xtext.latexQ.latexQ.Answer
import org.shashwat.xtext.latexQ.latexQ.CHECK
import org.shashwat.xtext.latexQ.latexQ.RADIO

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LatexQGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(QuestionPaper)) {
			fsa.generateFile(e.papername + ".html", e.compile)
		}
	}
	
	//<link href="http://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.1.1/katex.min.css" rel="stylesheet" />
	//<script src="http://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.1.1/katex.min.js" />
	
	def compile(QuestionPaper qp) '''
		<!DOCTYPE html>
		<html lang="en">
			<head>
				<meta charset="UTF-8">
				«IF qp.papername != null»
					<title>«qp.papername»</title>
				«ELSE»
					<title>Questions</title>
				«ENDIF»
			</head>
			<body>
				<ol>
				«FOR q:qp.questions»
					<li>
					«q.compile»
					</li>
				«ENDFOR»
				</ol>
			</body>
		</html>
	'''
	
	def compile(Question q) '''
		<section>
			<p>«q.question»</p>
			<ul>
				«FOR a:q.answers»
					<li>
					«a.compile»
					</li>
				«ENDFOR»
			</ul>
		</section>
	'''
	
	def compile(Answer a) '''
		«IF a.type == null»
			<p>«a.answer»</p>
		«ENDIF»
		«IF a.type == CHECK.name»
			<p><input type="CHECK">«a.answer»</input></p>
		«ELSEIF a.type == RADIO.name»
			<p><input type="RADIO">«a.answer»</input></p>
		«ELSE»
			<p>«a.answer»</p>
		«ENDIF»
	'''
}
