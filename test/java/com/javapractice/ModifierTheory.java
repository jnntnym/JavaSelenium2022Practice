package com.javapractice;

public class ModifierTheory {

	/*
	 * The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.

We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality
Modifier	Description	Try it
public	The code is accessible for all classes	
private	The code is only accessible within the declared class	
default	The code is only accessible in the same package. This is used when you don't specify a modifier. You will learn more about packages in the Packages chapter	
protected	The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter


Non-Access Modifiers
For classes, you can use either final or abstract:

Modifier	Description	Try it
final	The class cannot be inherited by other classes (You will learn more about inheritance in the Inheritance chapter)	
abstract	The class cannot be used to create objects (To access an abstract class, it must be inherited from another class. You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters)	
For attributes and methods, you can use the one of the following:

Modifier	Description
final	Attributes and methods cannot be overridden/modified
static	Attributes and methods belongs to the class, rather than an object
abstract	Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from). You will learn more about inheritance and abstraction in the Inheritance and Abstraction chapters
transient	Attributes and methods are skipped when serializing the object containing them
synchronized	Methods can only be accessed by one thread at a time
volatile	The value of an attribute is not cached thread-locally, and is always read from the "main memory"

Final
If you don't want the ability to override existing attribute values, declare attributes as final

Static
A static method means that it can be accessed without creating an object of the class, unlike public

Abstract
An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass



	 * 
	 * 
	 */
}
