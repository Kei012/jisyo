package com.android.jisyooo;

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


public class Emotion extends Activity{

	//リストビュー
	ListView lv = null;
	//戻るボタン
	private Button back;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_gyou);
        
      //ListViewを取得
        this.lv = (ListView)this.findViewById(R.id.ki_list);
        //項目の配列を準備
        String[] item = {"ごしゃぐ(怒る)", "きもやげる(イライラする)", "じゃみる(羨ましい)", "やがねる(嫉妬する)" ,
				  "やんだ(嫌だ)","お静かに"};
        
        //項目のオブジェクトを準備
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, item);
        
        //
           ArrayAdapter<String> adapter = new ArrayAdapter<String>(
              this,
              R.layout.list_main,
              R.id.row_textview,
              item);
          
        //リストビューに項目オブジェクトをセット
        lv.setAdapter(adapter);
        
        //リストビュークリック時のイベントを追加
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        	
        @Override
        public void onItemClick(AdapterView arg0, View arg1, int arg2,long arg3) {
        //呼び出したListViewを取得
        ListView listView = (ListView)arg0;
        
        //クリックした項目を取得
        String item = (String)listView.getItemAtPosition(arg2);
 
        
     // 選択されたデータをダイアログで表示----------------------------------------------------------
        AlertDialog.Builder dialog = new AlertDialog.Builder(Emotion.this);
        
        dialog.setTitle(item); //タイトル
        dialog.setMessage("意味：" );
       
        
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
        //ダイアログ処理ここまで------------------------------------------------------------------
        
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
