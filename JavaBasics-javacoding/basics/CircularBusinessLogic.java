// package name start with lower case letters . If name contains multiple words should be seperated by " . "
	// Note: It indicates the company or organisation ex: com. or org.
package com.javabasics.basics;
//class name start with upper case and should be noun. If name contains multiple words followed by an upper case letter
	// ex: ActionClass()
public class CircularBusinessLogic {
	// variable name start with lower case and should not start with special charaters like "$&_". If name contains multiple words followed by an upper case letter
		// ex: collegeName
	//Note: Avoid using 1 character ex: x,y,z
	int rad =8 ;
	//Below variable acts like constant variable because of final
	// constant variable should have upper case letters.Multiple words seperated by '_'
	//ex: MAX_PRIORITY
	final static double PI = 3.14;
	// method name start with lower case and should be verb. If name contains multiple wordsfollowed by an upper case letter
	// ex: actionPerformed()
	public void areaofcircle()
	{
		double area = (PI * rad* rad) ;	
		System.out.println(area);
	}
	
}
