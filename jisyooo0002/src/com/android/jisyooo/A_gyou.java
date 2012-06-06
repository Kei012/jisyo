package com.android.jisyooo;


import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.view.View;
import android.widget.AdapterView;


public class A_gyou extends Activity{

	ListView lv = null;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_gyou);
        
        
      //ListViewを取得
        this.lv = (ListView)this.findViewById(R.id.ki_list);
        
        //項目の配列を準備
        String[] item = {"おはよがんす", "おばんでがんす", "ごめんくなんしぇ", "おやすみんしぇ" ,
				  "もっし","お静かに","ご油断なく","ゆきちくれ"};
         
       /* String[] imi = {"おはよう", "こんばんは", "ごめんください", "おやすみなさい" ,
  			  "ごめんください","さようなら","お気をつけてお帰りくださいませ","金よこせ"}; */
        
        //項目のオブジェクトを準備
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, item);
        
        //リストビューに項目オブジェクトをセット
        lv.setAdapter(ad);
        
        //リストビュークリック時のイベントを追加
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	
        @Override
        public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
        //呼び出したListViewを取得
        ListView listView = (ListView)arg0;
        
        //クリックした項目を取得
        String item = (String)listView.getItemAtPosition(arg2);
 //       String imi = (String)listView.getItemAtPosition(arg2);
        
  /*      int a=Integer.parseInt(item);
        
        int i=0;*/
        
        
        
     // 選択されたデータをダイアログで表示
        AlertDialog.Builder dialog = new AlertDialog.Builder(A_gyou.this);
        dialog.setTitle(item); //タイトル
        
        dialog.setMessage("意味：" );
        dialog.show();

        }
        });
       
	}
	
}
