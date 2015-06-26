import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_testApp_dashboardindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
for( c in (grailsApplication.controllerClasses.sort { it.name }) ) {
printHtmlPart(6)
createTagBody(3, {->
expressionOut.print(c.name)
})
invokeTag('link','g',89,['controller':(c.logicalPropertyName)],3)
printHtmlPart(7)
}
printHtmlPart(8)
loop:{
int i = 0
for( customer in (customers) ) {
printHtmlPart(9)
expressionOut.print(i+1)
printHtmlPart(10)
expressionOut.print(customer.name)
printHtmlPart(10)
expressionOut.print(customer.zipCode)
printHtmlPart(10)
expressionOut.print(customer.email)
printHtmlPart(10)
expressionOut.print(customer.phoneNumber)
printHtmlPart(11)
i++
}
}
printHtmlPart(12)
loop:{
int i = 0
for( orders in (order) ) {
printHtmlPart(9)
expressionOut.print(i+1)
printHtmlPart(13)
expressionOut.print(order.datePurchased)
printHtmlPart(10)
expressionOut.print(order.customerName)
printHtmlPart(10)
expressionOut.print(order.storeUsed)
printHtmlPart(10)
expressionOut.print(order.orderNumber)
printHtmlPart(10)
expressionOut.print(order.itemPurchased)
printHtmlPart(11)
i++
}
}
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',155,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435298866915L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
