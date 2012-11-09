package com.android.jisyooo;

public class Test {
	  private String mId;
	  private String mName;

	  public Test(String id, String name) {
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

	  public void setId(String id) {
	    mId = id;
	  }

	  public String getId() {
	    return mId;
	  }
	}