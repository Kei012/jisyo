package com.android.jisyooo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
	
	//挨拶
	private Button menu01;
	//動詞
	private Button menu02;
	//感情
	private Button menu03;
	//楽
//	private Button menu04;
	//終了
	private Button finish;
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        menu01 = (Button)findViewById(R.id.ki_Button);
        menu02 = (Button)findViewById(R.id.do_Button);
        menu03 = (Button)findViewById(R.id.ai_Button);
//        menu04 = (Button)findViewById(R.id.raku_Button);
        finish = (Button)findViewById(R.id.finish_Button);
        
        menu01.setOnClickListener(new ki_OnClick());
        menu02.setOnClickListener(new do_OnClick());
        menu03.setOnClickListener(new ai_OnClick());
 //       menu04.setOnClickListener(new raku_OnClick());
        finish.setOnClickListener(new finish_OnClick());
    }
    
  //挨拶
    class ki_OnClick implements OnClickListener{
		public void onClick(View v) {

            //次の画面に遷移させる
            Intent intent = new Intent();
            intent.setClassName(
                    "com.android.jisyooo",//←パッケージ名
                    "com.android.jisyooo.A_gyou");
            intent.setAction(Intent.ACTION_VIEW);
            startActivity(intent);
		}
    }
    
  //動詞
    class do_OnClick implements OnClickListener{
		public void onClick(View v) {

            //次の画面に遷移させる
			Intent intent = new Intent();
            intent.setClassName(
                    "com.android.jisyooo",//←パッケージ名
                    "com.android.jisyooo.Verb");
            intent.setAction(Intent.ACTION_VIEW);
            startActivity(intent);
		}
    }
    
  //感情
    class ai_OnClick implements OnClickListener{
		public void onClick(View v) {

            //次の画面に遷移させる
            Intent intent = new Intent();
            intent.setClassName(
                    "com.android.jisyooo",//←パッケージ名
                    "com.android.jisyooo.Emotion");
            intent.setAction(Intent.ACTION_VIEW);
            startActivity(intent);	
		}
    }
    
  /*//楽
    class raku_OnClick implements OnClickListener{
		public void onClick(View v) {

            //次の画面に遷移させる
            Intent intent = new Intent();
            intent.setClassName(
                    "jp.android.jisyooo",//←パッケージ名
                    "jp.android.jisyooo.S_gyou");
            intent.setAction(Intent.ACTION_VIEW);
            startActivity(intent);
		}
    }*/

  //終了
    class finish_OnClick implements OnClickListener{
		public void onClick(View v) {
			finish();
		}
    }

}