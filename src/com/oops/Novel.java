package com.oops;

interface Text {
    default String getContent() { return "Blank"; }
    String setContent(String txt);
    void spellCheck() throws InterruptedException;
}

abstract class Prose {
    public abstract void setAuthor(String name);
    public void spellCheck() throws Exception {
        System.out.print("Do generic prose spellcheck");
    }
}

public class Novel extends Prose implements Text {
	
	public void spellCheck()  { }
	
	public static void main(String[] args)  {
	Novel n = new Novel();
	n.spellCheck();}
  // line n1
//
//	@Override
//	 String setContent(String txt) {
//		// TODO Auto-generated method stub
//		return novel;
//	}

	@Override
	public void setAuthor(String name) {
		// TODO Auto-generated method stub
		
	}

@Override
public String setContent(String txt) {
	return super.toString();
	// TODO Auto-generated method stub
	
}
}