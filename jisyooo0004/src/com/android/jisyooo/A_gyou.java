package com.android.jisyooo;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;


public class A_gyou extends Activity{

	// ListView
	  private ListView mLstBooks;
	//戻るボタン
	private Button back;

	// ListViewに表示するデータ
	  private ArrayList<Test> mBooks = new ArrayList<Test>();
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_gyou);
        
        // Viewを取得
        mLstBooks = (ListView)this.findViewById(R.id.ki_list);
        //項目の配列を準備
        /*String[] item = {"おはよう", "こんばんは", "ごめんください", "おやすみなさい" ,
    			  "ごめんください","さようなら","お気をつけてお帰りくださいませ","金よこせ"};
        
        String[] imi = {"おはよがんす", "おばんでがんす", "ごめんくなんしぇ", "おやすみんしぇ" ,
				  "もっし","お静かに","ご油断なく","ゆきちくれ"};*/
        
        //項目のオブジェクトを準備
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, item);
        
        //
        
     // Viewを取得
        mLstBooks = (ListView)this.findViewById(R.id.ki_list);
        
        
     // イベントハンドラを設定
        mLstBooks.setOnItemClickListener(
        new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent,
            View view, int position, long id) {
            // 選択されたデータを取得
            ListView listView = (ListView)parent;
            Test book = (Test)listView.getItemAtPosition(position);
                    
            // 選択されたデータをダイアログで表示
            AlertDialog.Builder dialog = new AlertDialog.Builder(
              A_gyou.this);
            dialog.setTitle(book.getName());
            dialog.setMessage("岩手弁：" + book.getId());
            
            //ダイアログ閉じる処理
            dialog.setCancelable(false)
            .setPositiveButton("close", new DialogInterface.OnClickListener() {
    			
    			@Override
    			public void onClick(DialogInterface dialog, int id) {
    				// TODO 自動生成されたメソッド・スタブ
    				dialog.cancel(); //ダイアログを閉じる
    				
    			}
    		});
            
            dialog.show();
          }
        });
        	    	
        	    
     // ListViewにアダプタを設定
        ArrayAdapter<Test> adapter = new ArrayAdapter<Test>(
          this, 
          R.layout.list_main, // 1行分のレイアウトファイル
          R.id.row_textview,  // 上記レイアウト内のテキスト表示箇所のId
          mBooks             // 表示対象のデータ
          );
        mLstBooks.setAdapter(adapter);
        
     // ListViewに表示するデータを作成
        mBooks.add(new Test("おはよがんす", "おはよう"));
        mBooks.add(new Test("おばんでがんす", "こんばんは"));
        mBooks.add(new Test("ごめんくなんしぇ", "ごめんください"));
        
        
   
        
        back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new backOnClick());
       
	}
	
	//戻るボタン処理
	class backOnClick implements OnClickListener{
		public void onClick(View v) {
			finish();
		}
	}
	
}
