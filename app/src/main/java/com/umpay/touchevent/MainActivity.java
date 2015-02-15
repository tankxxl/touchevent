package com.umpay.touchevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.umpay.touchevent.conflict.ConflictMainActivity;


/**
 * 总统 --> MainActivity
 * 省长 --> MyFrameLayout
 * 市长 --> MyLinearLayout
 * 农民 --> MyTextView
 * <p/>
 * 【举个通俗易懂的例子】：
 * 总统对省长说：我要吃红烧鱼
 * 省长对市长说：你做个红烧鱼
 * 市长对县长说：你做个红烧鱼
 * 县长对农民说：你做个红烧鱼
 * ……（农民做呀做，没做出来）
 * 农民说：我尽力了，但真心不会做呀，饶了我吧
 * 县长说：你个笨蛋，下次不找你了，看我来做
 * ……（县长做呀做，没做出来）
 * 县长对市长说：我尽力了，非常抱歉，我不会做
 * 市长说：你个废物，要你何用，只能我自己来做了
 * ……（市长做呀做，做成功了）
 * 市长对省长说：红烧鱼做好了
 * 省长说：不错，下次有事还找你
 * 省长对总统说：红烧鱼做好了
 * 总统说：不错，下次有事还找你
 * ---------------------------
 * 总统对省长说：我要吃水煮鱼
 * 省长对市长说：你做个水煮鱼
 * 市长说：县长连红烧鱼都搞不定，这次就不找他了，我自己亲自来做
 * ……（市长做呀做，又成功了）
 * 市长对省长说：水煮鱼做好了
 * 省长说：不错，下次有事还找你
 * 省长对总统说：水煮鱼做好了
 * 总统说：不错，下次有事还找你
 * ---------------------------
 * 按常理，领导都会把任务向下分派，一旦下面的人把事情做不好，就不会再把后续的任务交给下面的人来做了，只能自己亲自做，如果自己也做不了，就只能告诉上级不能完成任务，上级又会重复他的过程。
 * 另外，领导都有权利拦截任务，对下级隐瞒该任务，而直接自己去做，如果做不成，也只能向上级报告不能完成任务。
 */
public class MainActivity extends ActionBarActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.main);
        Log.d(TAG, "hello");

        findViewById(R.id.btn_conflict).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ConflictMainActivity.class));
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("d", "【总统】-dispatchTouchEvent-任务<" + Util.actionToString(ev.getAction()) + "> : 需要分派");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        boolean bo = false;
        Log.d("d", "【总统】-onTouchEvent-任务<" + Util.actionToString(ev.getAction()) + "> : 下面都解决不了，下次再也不能靠你们了，哼⋯只能自己尝试一下啦。能解决？" + bo);
        return bo;
    }
}
