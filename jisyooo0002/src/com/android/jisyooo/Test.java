package com.android.jisyooo;

public class Test {
	
	private int mId;
	  private String mName;

	  public Test(int id, String name) {
	    mId = id;
	    mName = name;
	  }
	  
	  public String toString() {
	    return mName;
	  }

	  public void setName(String name) {
	    mName = name;
	  }

	  public String getName() {
	    return mName;
	  }

	  public void setId(int id) {
	    mId = id;
	  }

	  public int getId() {
	    return mId;
	  }
}
