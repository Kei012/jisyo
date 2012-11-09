package com.android.jisyooo;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

public class Search extends Activity{
	
	@Override  
	protected void onCreate(Bundle savedInstanceState) {  
	    super.onCreate(savedInstanceState);  
	       
	    final Intent queryIntent = getIntent();  
	    final String queryAction = queryIntent.getAction();      
	  
	    // ACTION_SEARCH の Intent で呼び出された場合  
	    if (Intent.ACTION_SEARCH.equals(queryAction)) {         
	        doSearchWithIntent(queryIntent);  
	    }  
	  
	    // Quick Search Box から呼び出された場合  
	    if (Intent.ACTION_VIEW.equals(queryAction)){  
	        if(queryIntent.getFlags() == Intent.FLAG_ACTIVITY_NEW_TASK) {  
	            doSearchWithIntent(queryIntent);  
	        }  
	    }  
	}  
	  
	// 検索用 Activity から呼び出されたとき   
	@Override  
	protected void onNewIntent(Intent intent) {  
	    doSearchWithIntent(intent);  
	}  
	  
	private void doSearchWithIntent(final Intent queryIntent) {  
	    // 検索文字列は SearchManager.QUERY というキーに入っている  
	    final String queryString = queryIntent.getStringExtra(SearchManager.QUERY);  
	//    doSearchWithQuery(queryString);  
	}  

}
