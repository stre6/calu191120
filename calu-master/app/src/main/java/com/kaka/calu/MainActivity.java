package com.kaka.calu;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    int i;
    double fact = 1;
    final int BTNE = 23;
    double mValue1, mValue2, mValue3, mValue4, mValue5;
    int mCalcMode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Splash.class));
        Button btn[] = new Button[BTNE];

        LinearLayout li = new LinearLayout(this);
        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        li.setOrientation(LinearLayout.VERTICAL);
        li.setLayoutParams(params);
        li.setBackgroundColor(Color.rgb(220, 220, 220));

        txt = new TextView(this);
        LinearLayout.LayoutParams params1 =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 670);
        txt.setBackgroundResource(R.drawable.dwad);
        txt.setLayoutParams(params1);
        txt.setText("0");
        txt.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 40);
        txt.setTypeface(Typeface.createFromAsset(getAssets(), "font/hanjokar.ttf"));
        txt.setGravity(Gravity.RIGHT);
        txt.setTextColor(Color.WHITE);
        txt.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        txt.setPadding(0, 0, 15, 0);

        LinearLayout li1 = new LinearLayout(this);
        LinearLayout.LayoutParams params2 =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
        li1.setBackgroundColor(Color.rgb(220, 220, 220));
        li1.setLayoutParams(params2);
        li1.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout li2 = new LinearLayout(this);
        li2.setBackgroundColor(Color.rgb(220, 220, 220));
        li2.setLayoutParams(params2);
        li2.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout li3 = new LinearLayout(this);
        li3.setBackgroundColor(Color.rgb(220, 220, 220));
        li3.setLayoutParams(params2);
        li3.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout li4 = new LinearLayout(this);
        li4.setBackgroundColor(Color.rgb(220, 220, 220));
        li4.setLayoutParams(params2);
        li4.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout li5 = new LinearLayout(this);
        li5.setBackgroundColor(Color.rgb(220, 220, 220));
        li5.setLayoutParams(params2);
        li5.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout li6 = new LinearLayout(this);
        li6.setBackgroundColor(Color.rgb(220, 220, 220));
        li6.setLayoutParams(params2);
        li6.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams params4 = new LinearLayout.LayoutParams(540, 197);

        LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(270, 197);
        for (int i = 0; i <= 22; i++) {
            btn[i] = new Button(this);
            btn[i].setText(String.valueOf(i));
            btn[i].setOnClickListener(listener);
            btn[i].setLayoutParams(params3);
            btn[i].setGravity(Gravity.CENTER);
            btn[i].setId(i);
            btn[i].setTextSize(TypedValue.COMPLEX_UNIT_DIP, 25);
            btn[i].setTypeface(Typeface.createFromAsset(getAssets(), "font/hanjokar.ttf"));
            btn[i].setBackgroundResource(R.drawable.sun);
            btn[i].setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            btn[i].setTextColor(Color.rgb(255, 255, 255));
        }
//        btn[7].setBackgroundResource(R.drawable.r1s);
//        btn[8].setBackgroundResource(R.drawable.r2);
        btn[11].setText("DEL");
        btn[12].setText("＋");
        btn[13].setText("－");
        btn[15].setText("×");
        btn[14].setText(".");
        btn[10].setText("00");
        btn[16].setText("C");
        btn[17].setText("÷");
        btn[18].setText("=");
        btn[19].setText("√");
        btn[20].setText("!");
        btn[21].setText("¹／ｎ");
        btn[22].setText("%");
        btn[18].setLayoutParams(params4);
        btn[7].setId(0);
        btn[8].setId(Integer.parseInt(String.valueOf(1)));
        btn[9].setId(Integer.parseInt(String.valueOf(2)));
        btn[11].setId(Integer.parseInt(String.valueOf(3)));
        btn[4].setId(Integer.parseInt(String.valueOf(4)));
        btn[5].setId(Integer.parseInt(String.valueOf(5)));
        btn[6].setId(Integer.parseInt(String.valueOf(6)));
        btn[12].setId(Integer.parseInt(String.valueOf(7)));
        btn[1].setId(Integer.parseInt(String.valueOf(8)));
        btn[2].setId(Integer.parseInt(String.valueOf(9)));
        btn[3].setId(Integer.parseInt(String.valueOf(10)));
        btn[13].setId(Integer.parseInt(String.valueOf(11)));
        btn[14].setId(Integer.parseInt(String.valueOf(12)));
        btn[0].setId(Integer.parseInt(String.valueOf(13)));
        btn[10].setId(Integer.parseInt(String.valueOf(14)));
        btn[15].setId(Integer.parseInt(String.valueOf(15)));
        btn[16].setId(Integer.parseInt(String.valueOf(16)));
        btn[17].setId(Integer.parseInt(String.valueOf(17)));
        btn[18].setId(Integer.parseInt(String.valueOf(18)));
        btn[19].setId(Integer.parseInt(String.valueOf(19)));
        btn[20].setId(Integer.parseInt(String.valueOf(20)));
        btn[21].setId(Integer.parseInt(String.valueOf(21)));
        btn[22].setId(Integer.parseInt(String.valueOf(22)));
        li.addView(txt);
        li.addView(li1);

        li1.addView(btn[7]);
        li1.addView(btn[8]);
        li1.addView(btn[9]);
        li1.addView(btn[11]);
        li.addView(li2);
        li2.addView(btn[4]);
        li2.addView(btn[5]);
        li2.addView(btn[6]);
        li2.addView(btn[12]);
        li.addView(li3);
        li3.addView(btn[1]);
        li3.addView(btn[2]);
        li3.addView(btn[3]);
        li3.addView(btn[13]);
        li.addView(li4);
        li4.addView(btn[14]);
        li4.addView(btn[0]);
        li4.addView(btn[10]);
        li4.addView(btn[15]);
        li.addView(li5);
        li5.addView(btn[16]);
        li5.addView(btn[19]);
        li5.addView(btn[20]);
        li5.addView(btn[17]);
        li.addView(li6);
        li6.addView(btn[22]);
        li6.addView(btn[21]);
        li6.addView(btn[18]);
        setContentView(li);

    }

    public double getTextValueFloat() {
        double fValue = 0f;
        String strText = txt.getText().toString();
        fValue = Double.parseDouble(strText);
        return fValue;
    }

//    public void onNumberButton(String strNumber) {
//        String strText = txt.getText().toString();
//        double fValue = getTextValueFloat();
//        if (fValue == 0f)
//            strText = "";
//        strText = strText + strNumber;
//        txt.setText(strText);
//
//    }

    View.OnClickListener listener = new Button.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case 0://7
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("7");
                    } else
                        txt.append("7");
                    break;
                case 1://8
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("8");
                    } else
                        txt.append("8");
                    break;
                case 2://9
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("9");
                    } else
                        txt.append("9");
                    break;
                case 3: {//삭제
                    String strText = txt.getText().toString();
                    int nLength = strText.length();
                    if (nLength > 0) {
                        strText = strText.substring(0, nLength - 1);
                        if (strText.length() == 0)
                            strText = "0";
                        txt.setText(strText);
                    }
                    break;
                }
                case 4://4
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("4");
                    } else
                        txt.append("4");
                    break;
                case 5://5
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("5");
                    } else
                        txt.append("5");
                    break;
                case 6://6
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("6");
                    } else
                        txt.append("6");
                    break;
                case 7://+
                    mValue1 = getTextValueFloat();
                    txt.setText("0");
                    mCalcMode = 1;
                    break;
                case 8://1
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("1");
                    } else
                        txt.append("1");
                    break;
                case 9://2
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("2");
                    } else
                        txt.append("2");
                    break;
                case 10://3
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("3");
                    } else
                        txt.append("3");
                    break;
                case 11://-
                    mValue1 = getTextValueFloat();
                    txt.setText("0");
                    mCalcMode = 2;
                    break;
                case 12://.
                    txt.append(".");
                    break;
                case 13://0
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("0");
                    } else
                        txt.append("0");
                    break;
                case 14://00
                    if (txt.length() == 1 && Integer.parseInt(txt.getText().toString()) == 0) {
                        txt.setText("00");
                    } else
                        txt.append("00");
                    break;
                case 15://*
                    mValue1 = getTextValueFloat();
                    txt.setText("0");
                    mCalcMode = 3;
                    break;
                case 16://C
                    txt.setText("0");
                    break;
                case 19://루트
                    mValue3 = getTextValueFloat();
                    mValue3 = Math.sqrt(mValue3);
                    String strtext = Float.toString((float) mValue3);
                    txt.setText(strtext);
                    break;
                case 20://팩토리얼
                    mValue4 = getTextValueFloat();
                    fact = 1;
                    if (mValue4 < 1000000000000000000l) {
                        for (int i = 1; i <= mValue4; i++) {
                            fact = fact * i;
                        }
                    } else {
                        fact = 0;
                        mValue4 = 0;
                        txt.setText("0");
                        Toast.makeText(MainActivity.this, "수가 초과하였습니다", Toast.LENGTH_SHORT).show();
                    }
                    mValue4 = fact;
                    String strwext = Long.toString((long) mValue4);
                    txt.setText(strwext);
                    mValue4 = 0;
                    fact = 1;
                    break;
                case 17://나누기
                    mValue1 = getTextValueFloat();
                    txt.setText("0");
                    mCalcMode = 4;
                    break;
                case 22://나머지
                    mValue1 = getTextValueFloat();
                    txt.setText("0");
                    mCalcMode = 5;
                    break;
                case 21://분의1
                    mValue5 = getTextValueFloat();
                    mValue5 = 1 / mValue5;
                    String strtexa = Float.toString((float) mValue5);
                    txt.setText(strtexa);
                    break;
                case 18: {//=
                    mValue2 = getTextValueFloat();
                    switch (mCalcMode) {
                        case 1:
                            mValue1 = mValue1 + mValue2;
                            break;
                        case 2:
                            mValue1 = mValue1 - mValue2;
                            break;
                        case 3:
                            mValue1 = mValue1 * mValue2;
                            break;
                        case 4:
                            mValue1 = mValue1 / mValue2;
                            break;
                        case 5:
                            if (mValue1 > mValue2) {
                                mValue1 = mValue1 % mValue2;
                            } else {
                                mValue1 = 0;
                                mValue2 = 0;
                                txt.setText("0");
                                Toast.makeText(MainActivity.this, "수가 알맞지 않습니다", Toast.LENGTH_SHORT).show();
                            }
                            break;
                        default:
                            mValue1 = Float.parseFloat(txt.getText().toString());
                            Toast.makeText(MainActivity.this,"계산식을 사용하세요",Toast.LENGTH_SHORT).show();
                            break;
                    }
                    String strText = String.valueOf(Double.parseDouble(String.valueOf(mValue1)));
                    txt.setText(strText);
                    mCalcMode = 0;
                    break;
                }
            }
        }
    };
}