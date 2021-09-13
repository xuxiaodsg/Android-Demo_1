package com.example.demo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.demo_1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

//        sendMessage() 将发生以下情况：
//        Intent 构造函数会获取两个参数：Context 和 Class。
//        首先使用 Context 参数，因为 Activity 类是 Context 的子类。
//        在本例中，系统将 Intent, 传递到的应用组件的 Class 参数是要启动的 activity。
//        putExtra() 方法将 EditText 的值添加到 intent。Intent 能够以称为“extra”的键值对形式携带数据类型。
//        您的键是一个公共常量 EXTRA_MESSAGE，因为下一个 activity 将使用该键检索文本值。
//        为 intent extra 定义键时，最好使用应用的软件包名称作为前缀。这样可以确保这些键是独一无二的，这在您的应用需要与其他应用进行交互时会很重要。
//        startActivity() 方法将启动一个由 Intent 指定的 DisplayMessageActivity 实例。接下来，您需要创建该类。
    }
}