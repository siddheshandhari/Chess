package com.example.asus_u47a.chess;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int isImage[][]={{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1}};
    int pB1flag,pB2flag,pB3flag,pB4flag,pB5flag,pB6flag,pB7flag,pB8flag = 0;
    int rB1flag,rB2flag = 0;
    int bB1flag,bB2flag = 0;
    int kB1flag,kB2flag = 0;
    int kingBflag,qBflag = 0;
    int pW1flag,pW2flag,pW3flag,pW4flag,pW5flag,pW6flag,pW7flag,pW8flag = 0;
    int rW1flag,rW2flag = 0;
    int bW1flag,bW2flag = 0;
    int kW1flag,kW2flag = 0;
    int kingWflag,qWflag = 0;
    ImageView pB1,pB2,pB3,pB4,pB5,pB6,pB7,pB8;
    ImageView rB1,rB2;
    ImageView bB1,bB2;
    ImageView kB1,kB2;
    ImageView kingB,qB;
    ImageView pW1,pW2,pW3,pW4,pW5,pW6,pW7,pW8;
    ImageView rW1,rW2;
    ImageView bW1,bW2;
    ImageView kW1,kW2;
    ImageView kingW,qW;
    ImageButton b0_0,b0_1,b0_2,b0_3,b0_4,b0_5,b0_6,b0_7;
    ImageButton b1_0,b1_1,b1_2,b1_3,b1_4,b1_5,b1_6,b1_7;
    ImageButton b2_0,b2_1,b2_2,b2_3,b2_4,b2_5,b2_6,b2_7;
    ImageButton b3_0,b3_1,b3_2,b3_3,b3_4,b3_5,b3_6,b3_7;
    ImageButton b4_0,b4_1,b4_2,b4_3,b4_4,b4_5,b4_6,b4_7;
    ImageButton b5_0,b5_1,b5_2,b5_3,b5_4,b5_5,b5_6,b5_7;
    ImageButton b6_0,b6_1,b6_2,b6_3,b6_4,b6_5,b6_6,b6_7;
    ImageButton b7_0,b7_1,b7_2,b7_3,b7_4,b7_5,b7_6,b7_7;
    int row,column;
    int dead;
    int countrow=8;
    int countcolumn=0;
    int player=1;
    int pa=17;//pawn adjustment

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0_0 = (ImageButton) findViewById(R.id.but0_0);
        b0_0.setOnClickListener(b0_0handler);
        b1_0 = (ImageButton)findViewById(R.id.but1_0);
        b1_0.setOnClickListener(b1_0handler);
        b2_0 = (ImageButton)findViewById(R.id.but2_0);
        b2_0.setOnClickListener(b2_0handler);
        b3_0 = (ImageButton)findViewById(R.id.but3_0);
        b3_0.setOnClickListener(b3_0handler);
        b4_0 = (ImageButton)findViewById(R.id.but4_0);
        b4_0.setOnClickListener(b4_0handler);
        b5_0 = (ImageButton)findViewById(R.id.but5_0);
        b5_0.setOnClickListener(b5_0handler);
        b6_0 = (ImageButton)findViewById(R.id.but6_0);
        b6_0.setOnClickListener(b6_0handler);
        b7_0 = (ImageButton)findViewById(R.id.but7_0);
        b7_0.setOnClickListener(b7_0handler);
        b0_1 = (ImageButton) findViewById(R.id.but0_1);
        b0_1.setOnClickListener(b0_1handler);
        b1_1 = (ImageButton)findViewById(R.id.but1_1);
        b1_1.setOnClickListener(b1_1handler);
        b2_1 = (ImageButton)findViewById(R.id.but2_1);
        b2_1.setOnClickListener(b2_1handler);
        b3_1 = (ImageButton)findViewById(R.id.but3_1);
        b3_1.setOnClickListener(b3_1handler);
        b4_1 = (ImageButton)findViewById(R.id.but4_1);
        b4_1.setOnClickListener(b4_1handler);
        b5_1 = (ImageButton)findViewById(R.id.but5_1);
        b5_1.setOnClickListener(b5_1handler);
        b6_1 = (ImageButton)findViewById(R.id.but6_1);
        b6_1.setOnClickListener(b6_1handler);
        b7_1 = (ImageButton)findViewById(R.id.but7_1);
        b7_1.setOnClickListener(b7_1handler);
        b0_2 = (ImageButton) findViewById(R.id.but0_2);
        b0_2.setOnClickListener(b0_2handler);
        b1_2 = (ImageButton)findViewById(R.id.but1_2);
        b1_2.setOnClickListener(b1_2handler);
        b2_2 = (ImageButton)findViewById(R.id.but2_2);
        b2_2.setOnClickListener(b2_2handler);
        b3_2 = (ImageButton)findViewById(R.id.but3_2);
        b3_2.setOnClickListener(b3_2handler);
        b4_2 = (ImageButton)findViewById(R.id.but4_2);
        b4_2.setOnClickListener(b4_2handler);
        b5_2 = (ImageButton)findViewById(R.id.but5_2);
        b5_2.setOnClickListener(b5_2handler);
        b6_2 = (ImageButton)findViewById(R.id.but6_2);
        b6_2.setOnClickListener(b6_2handler);
        b7_2 = (ImageButton)findViewById(R.id.but7_2);
        b7_2.setOnClickListener(b7_2handler);
        b0_3 = (ImageButton) findViewById(R.id.but0_3);
        b0_3.setOnClickListener(b0_3handler);
        b1_3 = (ImageButton)findViewById(R.id.but1_3);
        b1_3.setOnClickListener(b1_3handler);
        b2_3 = (ImageButton)findViewById(R.id.but2_3);
        b2_3.setOnClickListener(b2_3handler);
        b3_3 = (ImageButton)findViewById(R.id.but3_3);
        b3_3.setOnClickListener(b3_3handler);
        b4_3 = (ImageButton)findViewById(R.id.but4_3);
        b4_3.setOnClickListener(b4_3handler);
        b5_3 = (ImageButton)findViewById(R.id.but5_3);
        b5_3.setOnClickListener(b5_3handler);
        b6_3 = (ImageButton)findViewById(R.id.but6_3);
        b6_3.setOnClickListener(b6_3handler);
        b7_3 = (ImageButton)findViewById(R.id.but7_3);
        b7_3.setOnClickListener(b7_3handler);
        b0_4 = (ImageButton) findViewById(R.id.but0_4);
        b0_4.setOnClickListener(b0_4handler);
        b1_4 = (ImageButton)findViewById(R.id.but1_4);
        b1_4.setOnClickListener(b1_4handler);
        b2_4 = (ImageButton)findViewById(R.id.but2_4);
        b2_4.setOnClickListener(b2_4handler);
        b3_4 = (ImageButton)findViewById(R.id.but3_4);
        b3_4.setOnClickListener(b3_4handler);
        b4_4 = (ImageButton)findViewById(R.id.but4_4);
        b4_4.setOnClickListener(b4_4handler);
        b5_4 = (ImageButton)findViewById(R.id.but5_4);
        b5_4.setOnClickListener(b5_4handler);
        b6_4 = (ImageButton)findViewById(R.id.but6_4);
        b6_4.setOnClickListener(b6_4handler);
        b7_4 = (ImageButton)findViewById(R.id.but7_4);
        b7_4.setOnClickListener(b7_4handler);
        b0_5 = (ImageButton) findViewById(R.id.but0_5);
        b0_5.setOnClickListener(b0_5handler);
        b1_5 = (ImageButton)findViewById(R.id.but1_5);
        b1_5.setOnClickListener(b1_5handler);
        b2_5 = (ImageButton)findViewById(R.id.but2_5);
        b2_5.setOnClickListener(b2_5handler);
        b3_5 = (ImageButton)findViewById(R.id.but3_5);
        b3_5.setOnClickListener(b3_5handler);
        b4_5 = (ImageButton)findViewById(R.id.but4_5);
        b4_5.setOnClickListener(b4_5handler);
        b5_5 = (ImageButton)findViewById(R.id.but5_5);
        b5_5.setOnClickListener(b5_5handler);
        b6_5 = (ImageButton)findViewById(R.id.but6_5);
        b6_5.setOnClickListener(b6_5handler);
        b7_5 = (ImageButton)findViewById(R.id.but7_5);
        b7_5.setOnClickListener(b7_5handler);
        b0_6 = (ImageButton) findViewById(R.id.but0_6);
        b0_6.setOnClickListener(b0_6handler);
        b1_6 = (ImageButton)findViewById(R.id.but1_6);
        b1_6.setOnClickListener(b1_6handler);
        b2_6 = (ImageButton)findViewById(R.id.but2_6);
        b2_6.setOnClickListener(b2_6handler);
        b3_6 = (ImageButton)findViewById(R.id.but3_6);
        b3_6.setOnClickListener(b3_6handler);
        b4_6 = (ImageButton)findViewById(R.id.but4_6);
        b4_6.setOnClickListener(b4_6handler);
        b5_6 = (ImageButton)findViewById(R.id.but5_6);
        b5_6.setOnClickListener(b5_6handler);
        b6_6 = (ImageButton)findViewById(R.id.but6_6);
        b6_6.setOnClickListener(b6_6handler);
        b7_6 = (ImageButton)findViewById(R.id.but7_6);
        b7_6.setOnClickListener(b7_6handler);
        b0_7 = (ImageButton) findViewById(R.id.but0_7);
        b0_7.setOnClickListener(b0_7handler);
        b1_7 = (ImageButton)findViewById(R.id.but1_7);
        b1_7.setOnClickListener(b1_7handler);
        b2_7 = (ImageButton)findViewById(R.id.but2_7);
        b2_7.setOnClickListener(b2_7handler);
        b3_7 = (ImageButton)findViewById(R.id.but3_7);
        b3_7.setOnClickListener(b3_7handler);
        b4_7 = (ImageButton)findViewById(R.id.but4_7);
        b4_7.setOnClickListener(b4_7handler);
        b5_7 = (ImageButton)findViewById(R.id.but5_7);
        b5_7.setOnClickListener(b5_7handler);
        b6_7 = (ImageButton)findViewById(R.id.but6_7);
        b6_7.setOnClickListener(b6_7handler);
        b7_7 = (ImageButton)findViewById(R.id.but7_7);
        b7_7.setOnClickListener(b7_7handler);

        pB1 = (ImageView) findViewById(R.id.pawnb1);
        pB1.setOnClickListener(pB1handler);
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB1.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=pa;
        pB1.setLayoutParams(params);
        pB2 = (ImageView) findViewById(R.id.pawnb2);
        pB2.setOnClickListener(pB2handler);
        params = (RelativeLayout.LayoutParams) pB2.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=120+pa;
        pB2.setLayoutParams(params);
        pB3 = (ImageView) findViewById(R.id.pawnb3);
        pB3.setOnClickListener(pB3handler);
        params = (RelativeLayout.LayoutParams) pB3.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=240+pa;
        pB3.setLayoutParams(params);
        pB4 = (ImageView) findViewById(R.id.pawnb4);
        pB4.setOnClickListener(pB4handler);
        params = (RelativeLayout.LayoutParams) pB4.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=360+pa;
        pB4.setLayoutParams(params);
        pB5 = (ImageView) findViewById(R.id.pawnb5);
        pB5.setOnClickListener(pB5handler);
        params = (RelativeLayout.LayoutParams) pB5.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=480+pa;
        pB5.setLayoutParams(params);
        pB6 = (ImageView) findViewById(R.id.pawnb6);
        pB6.setOnClickListener(pB6handler);
        params = (RelativeLayout.LayoutParams) pB6.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=600+pa;
        pB6.setLayoutParams(params);
        pB7 = (ImageView) findViewById(R.id.pawnb7);
        pB7.setOnClickListener(pB7handler);
        params = (RelativeLayout.LayoutParams) pB7.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=720+pa;
        pB7.setLayoutParams(params);
        pB8 = (ImageView) findViewById(R.id.pawnb8);
        pB8.setOnClickListener(pB8handler);
        params = (RelativeLayout.LayoutParams) pB8.getLayoutParams();
        params.topMargin=120+pa;
        params.leftMargin=840+pa;
        pB8.setLayoutParams(params);
        rB1 = (ImageView) findViewById(R.id.rookb1);
        rB1.setOnClickListener(rB1handler);
        params = (RelativeLayout.LayoutParams) rB1.getLayoutParams();
        params.topMargin=pa;
        params.leftMargin=pa;
        rB1.setLayoutParams(params);
        rB2 = (ImageView) findViewById(R.id.rookb2);
        rB2.setOnClickListener(rB2handler);
        params = (RelativeLayout.LayoutParams) rB2.getLayoutParams();
        params.leftMargin=840+pa;
        params.topMargin= pa;
        rB2.setLayoutParams(params);
        bB1 = (ImageView) findViewById(R.id.bishopb1);
        bB1.setOnClickListener(bB1handler);
        params = (RelativeLayout.LayoutParams) bB1.getLayoutParams();
        params.leftMargin=240+pa;
        params.topMargin= pa;
        bB1.setLayoutParams(params);
        bB2 = (ImageView) findViewById(R.id.bishopb2);
        bB2.setOnClickListener(bB2handler);
        params = (RelativeLayout.LayoutParams) bB2.getLayoutParams();
        params.leftMargin=600+pa;
        params.topMargin=pa;
        bB2.setLayoutParams(params);
        kB1 = (ImageView) findViewById(R.id.knightb1);
        kB1.setOnClickListener(kB1handler);
        params = (RelativeLayout.LayoutParams) kB1.getLayoutParams();
        params.leftMargin=120+pa;
        params.topMargin = pa;
        kB1.setLayoutParams(params);
        kB2 = (ImageView) findViewById(R.id.knightb2);
        kB2.setOnClickListener(kB2handler);
        params = (RelativeLayout.LayoutParams) kB2.getLayoutParams();
        params.leftMargin=720+pa;
        params.topMargin=pa;
        kB2.setLayoutParams(params);
        kingB = (ImageView) findViewById(R.id.kingb);
        kingB.setOnClickListener(kingBhandler);
        params = (RelativeLayout.LayoutParams) kingB.getLayoutParams();
        params.leftMargin=480+pa;
        params.topMargin=pa;
        kingB.setLayoutParams(params);
        qB = (ImageView) findViewById(R.id.queenb);
        qB.setOnClickListener(qBhandler);
        params = (RelativeLayout.LayoutParams) qB.getLayoutParams();
        params.leftMargin=360+pa;
        params.topMargin=pa;
        qB.setLayoutParams(params);

        pW1 = (ImageView) findViewById(R.id.pawnw1);
        pW1.setOnClickListener(pW1handler);
        params = (RelativeLayout.LayoutParams) pW1.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=pa;
        pW1.setLayoutParams(params);
        pW2 = (ImageView) findViewById(R.id.pawnw2);
        pW2.setOnClickListener(pW2handler);
        params = (RelativeLayout.LayoutParams) pW2.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=120+pa;
        pW2.setLayoutParams(params);
        pW3 = (ImageView) findViewById(R.id.pawnw3);
        pW3.setOnClickListener(pW3handler);
        params = (RelativeLayout.LayoutParams) pW3.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=240+pa;
        pW3.setLayoutParams(params);
        pW4 = (ImageView) findViewById(R.id.pawnw4);
        pW4.setOnClickListener(pW4handler);
        params = (RelativeLayout.LayoutParams) pW4.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=360+pa;
        pW4.setLayoutParams(params);
        pW5 = (ImageView) findViewById(R.id.pawnw5);
        pW5.setOnClickListener(pW5handler);
        params = (RelativeLayout.LayoutParams) pW5.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=480+pa;
        pW5.setLayoutParams(params);
        pW6 = (ImageView) findViewById(R.id.pawnw6);
        pW6.setOnClickListener(pW6handler);
        params = (RelativeLayout.LayoutParams) pW6.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=600+pa;
        pW6.setLayoutParams(params);
        pW7 = (ImageView) findViewById(R.id.pawnw7);
        pW7.setOnClickListener(pW7handler);
        params = (RelativeLayout.LayoutParams) pW7.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=720+pa;
        pW7.setLayoutParams(params);
        pW8 = (ImageView) findViewById(R.id.pawnw8);
        pW8.setOnClickListener(pW8handler);
        params = (RelativeLayout.LayoutParams) pW8.getLayoutParams();
        params.topMargin=720+pa;
        params.leftMargin=840+pa;
        pW8.setLayoutParams(params);
        rW1 = (ImageView) findViewById(R.id.rookw1);
        rW1.setOnClickListener(rW1handler);
        params = (RelativeLayout.LayoutParams) rW1.getLayoutParams();
        params.topMargin=840+pa;
        params.leftMargin=pa;
        rW1.setLayoutParams(params);
        rW2 = (ImageView) findViewById(R.id.rookw2);
        rW2.setOnClickListener(rW2handler);
        params = (RelativeLayout.LayoutParams) rW2.getLayoutParams();
        params.topMargin=840+pa;
        params.leftMargin=840+pa;
        rW2.setLayoutParams(params);
        bW1 = (ImageView) findViewById(R.id.bishopw1);
        bW1.setOnClickListener(bW1handler);
        params = (RelativeLayout.LayoutParams) bW1.getLayoutParams();
        params.leftMargin=240+pa;
        params.topMargin=840+pa;
        bW1.setLayoutParams(params);
        bW2 = (ImageView) findViewById(R.id.bishopw2);
        bW2.setOnClickListener(bW2handler);
        params = (RelativeLayout.LayoutParams) bW2.getLayoutParams();
        params.leftMargin=600+pa;
        params.topMargin=840+pa;
        bW2.setLayoutParams(params);
        kW1 = (ImageView) findViewById(R.id.knightw1);
        kW1.setOnClickListener(kW1handler);
        params = (RelativeLayout.LayoutParams) kW1.getLayoutParams();
        params.leftMargin=120+pa;
        params.topMargin=840+pa;
        kW1.setLayoutParams(params);
        kW2 = (ImageView) findViewById(R.id.knightw2);
        kW2.setOnClickListener(kW2handler);
        params = (RelativeLayout.LayoutParams) kW2.getLayoutParams();
        params.leftMargin=720+pa;
        params.topMargin=840+pa;
        kW2.setLayoutParams(params);
        kingW = (ImageView) findViewById(R.id.kingw);
        kingW.setOnClickListener(kingWhandler);
        params = (RelativeLayout.LayoutParams) kingW.getLayoutParams();
        params.leftMargin=480+pa;
        params.topMargin=840+pa;
        kingW.setLayoutParams(params);
        qW = (ImageView) findViewById(R.id.queenw);
        qW.setOnClickListener(qWhandler);
        params = (RelativeLayout.LayoutParams) qW.getLayoutParams();
        params.leftMargin=360+pa;
        params.topMargin=840+pa;
        qW.setLayoutParams(params);
    }

    View.OnClickListener pB1handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB1.getLayoutParams();
            int rowbutton = params.topMargin / 120;
            int columnbutton = params.leftMargin / 120;
            if (pB1flag == 1 || pB1flag==3) {
                if(pB1flag==1){
                    pB1flag = 0;
                    params.leftMargin-=17;
                    pB1.setLayoutParams(params);
                }
                else if(pB1flag==3){
                    pB1flag = 4;
                    params.leftMargin-=17;
                    pB1.setLayoutParams(params);
                }
            } else {

                if (rW1flag == 1) {
                    dead = rookMotion(rW1, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (rW2flag == 1) {
                    dead = rookMotion(rW2, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (bW1flag == 1) {
                    dead = bishopmotion(bW1, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (bW2flag == 1) {
                    dead = bishopmotion(bW2, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (kW1flag == 1) {
                    dead = knight(kW1, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (kW2flag == 1) {
                    dead = knight(kW2, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (kingWflag == 1) {
                    dead = kingmotion(kingW, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (qWflag == 1) {
                    dead = queenmotion(qW, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW1flag == 1) {
                    dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW2flag == 1) {
                    dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW3flag == 1) {
                    dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW4flag == 1) {
                    dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW5flag == 1) {
                    dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW6flag == 1) {
                    dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW7flag == 1) {
                    dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (pW8flag == 1) {
                    dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                    if (dead == 1) {
                        kill(pB1);
                    }
                    unselect();
                } else if (player==2 && (pB1flag == 0 || pB1flag == 4)) {
                    if(pB1flag==0) {
                        unselect();
                        pB1flag = 1;
                        params.leftMargin+=17;
                        pB1.setLayoutParams(params);
                    }
                    else if(pB1flag == 4){
                        unselect();
                        pB1flag = 3;
                        params.leftMargin+=17;
                        pB1.setLayoutParams(params);
                    }
                }
            }
        }
    };
        View.OnClickListener pB2handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB2.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB2flag == 1 || pB2flag==3) {
                    if(pB2flag==1){
                        pB2flag = 0;
                        params.leftMargin-=17;
                        pB2.setLayoutParams(params);
                    }
                    else if(pB2flag==3){
                        pB2flag = 4;
                        params.leftMargin-=17;
                        pB2.setLayoutParams(params);
                    }
                } else {

                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB2);
                        }
                        unselect();
                    } else if (player==2 && (pB2flag == 0 || pB2flag == 4)) {
                        if(pB2flag==0) {
                            unselect();
                            pB2flag = 1;
                            params.leftMargin+=17;
                            pB2.setLayoutParams(params);
                        }
                        else if(pB2flag == 4){
                            unselect();
                            pB2flag = 3;
                            params.leftMargin+=17;
                            pB2.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener pB3handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB3.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB3flag == 1 || pB3flag==3) {
                    if(pB3flag==1){
                        pB3flag = 0;
                        params.leftMargin-=17;
                        pB3.setLayoutParams(params);
                    }
                    else if(pB3flag==3){
                        pB3flag = 4;
                        params.leftMargin-=17;
                        pB3.setLayoutParams(params);
                    }
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB3);
                        }
                        unselect();
                    } else if (player==2 && (pB3flag == 0 || pB3flag == 4)) {
                        if(pB3flag==0) {
                            unselect();
                            pB3flag = 1;
                            params.leftMargin+=17;
                            pB3.setLayoutParams(params);
                        }
                        else if(pB3flag == 4){
                            unselect();
                            pB3flag = 3;
                            params.leftMargin+=17;
                            pB3.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener pB4handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB4.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB4flag == 1 || pB4flag==3) {
                    if(pB4flag==1){
                        pB4flag = 0;
                        params.leftMargin-=17;
                        pB4.setLayoutParams(params);
                    }
                    else if(pB4flag==3){
                        pB4flag = 4;
                        params.leftMargin-=17;
                        pB4.setLayoutParams(params);
                    }
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB4);
                        }
                        unselect();
                    } else if (player==2 && (pB4flag == 0 || pB4flag == 4)) {
                        if(pB4flag==0) {
                            unselect();
                            pB4flag = 1;
                            params.leftMargin+=17;
                            pB4.setLayoutParams(params);
                        }
                        else if(pB4flag == 4){
                            unselect();
                            pB4flag = 3;
                            params.leftMargin+=17;
                            pB4.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener pB5handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB5.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB5flag == 1 || pB5flag==3) {
                    if(pB5flag==1){
                        pB5flag = 0;
                        params.leftMargin-=17;
                        pB5.setLayoutParams(params);
                    }
                    else if(pB5flag==3){
                        pB5flag = 4;
                        params.leftMargin-=17;
                        pB5.setLayoutParams(params);
                    }
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB5);
                        }
                        unselect();
                    } else if (player==2 && (pB5flag == 0 || pB5flag == 4)) {
                        if(pB5flag==0) {
                            unselect();
                            pB5flag = 1;
                            params.leftMargin+=17;
                            pB5.setLayoutParams(params);
                        }
                        else if(pB5flag == 4){
                            unselect();
                            pB5flag = 3;
                            params.leftMargin+=17;
                            pB5.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener pB6handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB6.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB6flag == 1 || pB6flag==3) {
                    if(pB6flag==1){
                        pB6flag = 0;
                        params.leftMargin-=17;
                        pB6.setLayoutParams(params);
                    }
                    else if(pB6flag==3){
                        pB6flag = 4;
                        params.leftMargin-=17;
                        pB6.setLayoutParams(params);
                    }
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB6);
                        }
                        unselect();
                    } else if (player==2 && (pB6flag == 0 || pB6flag == 4)) {
                        if(pB6flag==0) {
                            unselect();
                            pB6flag = 1;
                            params.leftMargin+=17;
                            pB6.setLayoutParams(params);
                        }
                        else if(pB6flag == 4){
                            unselect();
                            pB6flag = 3;
                            params.leftMargin+=17;
                            pB6.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener pB7handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB7.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB7flag == 1 || pB7flag==3) {
                    if(pB7flag==1){
                        pB7flag = 0;
                        params.leftMargin-=17;
                        pB7.setLayoutParams(params);
                    }
                    else if(pB7flag==3){
                        pB7flag = 4;
                        params.leftMargin-=17;
                        pB7.setLayoutParams(params);
                    }
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB7);
                        }
                        unselect();
                    } else if (player==2 && (pB7flag == 0 || pB7flag == 4)) {
                        if(pB7flag==0) {
                            unselect();
                            pB7flag = 1;
                            params.leftMargin+=17;
                            pB7.setLayoutParams(params);
                        }
                        else if(pB7flag == 4){
                            unselect();
                            pB7flag = 3;
                            params.leftMargin+=17;
                            pB7.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener pB8handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB8.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (pB8flag == 1 || pB8flag==3) {
                    if(pB8flag==1){
                        pB8flag = 0;
                        params.leftMargin-=17;
                        pB8.setLayoutParams(params);
                    }
                    else if(pB8flag==3){
                        pB8flag = 4;
                        params.leftMargin-=17;
                        pB8.setLayoutParams(params);
                    }
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                            pB8flag = 2;
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                            pB8flag = 2;
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(pB8);
                        }
                        unselect();
                    } else if (player==2 && (pB8flag == 0 || pB8flag == 4)) {
                        if(pB8flag==0) {
                            unselect();
                            pB8flag = 1;
                            params.leftMargin+=17;
                            pB8.setLayoutParams(params);
                        }
                        else if(pB8flag == 4){
                            unselect();
                            pB8flag = 3;
                            params.leftMargin+=17;
                            pB8.setLayoutParams(params);
                        }
                    }
                }
            }
        };
        View.OnClickListener rB1handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) rB1.getLayoutParams();
                int rowbutton = params.topMargin / 120;
                int columnbutton = params.leftMargin / 120;
                if (rB1flag == 1) {
                    rB1flag = 0;
                    params.leftMargin-=17;
                    rB1.setLayoutParams(params);
                } else {
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                            rB1flag = 2;
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB1);
                        }
                        unselect();
                    } else if (player==2 && rB1flag == 0) {
                        unselect();
                        rB1flag = 1;
                        params.leftMargin+=17;
                        rB1.setLayoutParams(params);
                    }
                }
            }
        };
        View.OnClickListener rB2handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) rB2.getLayoutParams();
                if (rB2flag == 1) {
                    rB2flag = 0;
                    params.leftMargin-=17;
                    rB2.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(rB2);
                        }
                        unselect();
                    } else if (player==2 && rB2flag == 0) {
                        unselect();
                        rB2flag = 1;
                        params.leftMargin+=17;
                        rB2.setLayoutParams(params);
                    }
                }
            }
        };
        View.OnClickListener bB1handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) bB1.getLayoutParams();
                if (bB1flag == 1) {
                    bB1flag = 0;
                    params.leftMargin-=17;
                    bB1.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB1);
                        }
                        unselect();
                    } else if (player==2 && bB1flag == 0) {
                        unselect();
                        bB1flag = 1;
                        params.leftMargin+=17;
                        bB1.setLayoutParams(params);
                    }
                }
            }
        };
        View.OnClickListener bB2handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) bB2.getLayoutParams();
                if (bB2flag == 1) {
                    bB2flag = 0;
                    params.leftMargin-=17;
                    bB2.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(bB2);
                        }
                        unselect();
                    } else if (player==2 && bB2flag == 0) {
                        unselect();
                        bB2flag = 1;
                        params.leftMargin+=17;
                        bB2.setLayoutParams(params);
                    }
                }
            }
        };
        View.OnClickListener kB1handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) kB1.getLayoutParams();
                if (kB1flag == 1) {
                    kB1flag = 0;
                    params.leftMargin-=17;
                    kB1.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB1);
                        }
                        unselect();
                    } else if (player==2 && kB1flag == 0) {
                        unselect();
                        kB1flag = 1;
                        params.leftMargin+=17;
                        kB1.setLayoutParams(params);
                    }
                }
            }
        };
        View.OnClickListener kB2handler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) kB2.getLayoutParams();
                if (kB2flag == 1) {
                    kB2flag = 0;
                    params.leftMargin-=17;
                    kB2.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kB2);
                        }
                        unselect();
                    } else if (player==2 && kB2flag == 0) {
                        unselect();
                        kB2flag = 1;
                        params.leftMargin+=17;
                        kB2.setLayoutParams(params);
                    }
                }
            }
        };
        View.OnClickListener kingBhandler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) kingB.getLayoutParams();
                if (kingBflag == 1) {
                    kingBflag = 0;
                    params.leftMargin-=17;
                    kingB.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(kingB);
                        }
                        unselect();
                    } else if (player==2 && kingBflag == 0) {
                        unselect();
                        kingBflag = 1;
                        params.leftMargin+=17;
                        kingB.setLayoutParams(params);
                    }
                }
            }
        };

        View.OnClickListener qBhandler = new View.OnClickListener() {
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) qB.getLayoutParams();
                if (qBflag == 1) {
                    qBflag = 0;
                    params.leftMargin-=17;
                    qB.setLayoutParams(params);
                } else {
                    int rowbutton = params.topMargin / 120;
                    int columnbutton = params.leftMargin / 120;
                    if (rW1flag == 1) {
                        dead = rookMotion(rW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (rW2flag == 1) {
                        dead = rookMotion(rW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (bW1flag == 1) {
                        dead = bishopmotion(bW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (bW2flag == 1) {
                        dead = bishopmotion(bW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (kW1flag == 1) {
                        dead = knight(kW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (kW2flag == 1) {
                        dead = knight(kW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (kingWflag == 1) {
                        dead = kingmotion(kingW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (qWflag == 1) {
                        dead = queenmotion(qW, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW1flag == 1) {
                        dead = whitepawncrossmotion(pW1, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW2flag == 1) {
                        dead = whitepawncrossmotion(pW2, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW3flag == 1) {
                        dead = whitepawncrossmotion(pW3, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW4flag == 1) {
                        dead = whitepawncrossmotion(pW4, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW5flag == 1) {
                        dead = whitepawncrossmotion(pW5, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW6flag == 1) {
                        dead = whitepawncrossmotion(pW6, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW7flag == 1) {
                        dead = whitepawncrossmotion(pW7, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (pW8flag == 1) {
                        dead = whitepawncrossmotion(pW8, rowbutton, columnbutton);
                        if (dead == 1) {
                            kill(qB);
                        }
                        unselect();
                    } else if (player==2 && qBflag == 0) {
                        unselect();
                        qBflag = 1;
                        params.leftMargin+=17;
                        qB.setLayoutParams(params);
                    }
                }
            }
        };

    View.OnClickListener pW1handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW1.getLayoutParams();
            if (pW1flag == 1 || pW1flag==3) {
                if(pW1flag==1){
                    pW1flag = 0;
                    params.leftMargin-=17;
                    pW1.setLayoutParams(params);
                }
                else if(pW1flag==3){
                    pW1flag = 4;
                    params.leftMargin-=17;
                    pW1.setLayoutParams(params);
                }
            } else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW1);
                    }
                    unselect();
                }else if (player==1 && (pW1flag == 0 || pW1flag == 4)) {
                    if(pW1flag==0) {
                        unselect();
                        pW1flag = 1;
                        params.leftMargin+=17;
                        pW1.setLayoutParams(params);
                    }
                    else if(pW1flag == 4){
                        unselect();
                        pW1flag = 3;
                        params.leftMargin+=17;
                        pW1.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW2handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW2.getLayoutParams();
            if (pW2flag == 1 || pW2flag==3) {
                if(pW2flag==1){
                    pW2flag = 0;
                    params.leftMargin-=17;
                    pW2.setLayoutParams(params);
                }
                else if(pW2flag==3){
                    pW2flag = 4;
                    params.leftMargin-=17;
                    pW2.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW2);
                    }
                    unselect();
                }else if (player==1 && (pW2flag == 0 || pW2flag == 4)) {
                    if(pW2flag==0) {
                        unselect();
                        pW2flag = 1;
                        params.leftMargin+=17;
                        pW2.setLayoutParams(params);
                    }
                    else if(pW2flag == 4){
                        unselect();
                        pW2flag = 3;
                        params.leftMargin+=17;
                        pW2.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW3handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW3.getLayoutParams();
            if (pW3flag == 1 || pW3flag==3) {
                if(pW3flag==1){
                    pW3flag = 0;
                    params.leftMargin-=17;
                    pW3.setLayoutParams(params);
                }
                else if(pW3flag==3){
                    pW3flag = 4;
                    params.leftMargin-=17;
                    pW3.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW3);
                    }
                    unselect();
                }else if (player==1 && (pW3flag == 0 || pW3flag == 4)) {
                    if(pW3flag==0) {
                        unselect();
                        pW3flag = 1;
                        params.leftMargin+=17;
                        pW3.setLayoutParams(params);
                    }
                    else if(pW3flag == 4){
                        unselect();
                        pW3flag = 3;
                        params.leftMargin+=17;
                        pW3.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW4handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW4.getLayoutParams();
            if (pW4flag == 1 || pW4flag==3) {
                if(pW4flag==1){
                    pW4flag = 0;
                    params.leftMargin-=17;
                    pW4.setLayoutParams(params);
                }
                else if(pW4flag==3){
                    pW4flag = 4;
                    params.leftMargin-=17;
                    pW4.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW4);
                    }
                    unselect();
                }else if (player==1 && (pW4flag == 0 || pW4flag == 4)) {
                    if(pW4flag==0) {
                        unselect();
                        pW4flag = 1;
                        params.leftMargin+=17;
                        pW4.setLayoutParams(params);
                    }
                    else if(pW4flag == 4){
                        unselect();
                        pW4flag = 3;
                        params.leftMargin+=17;
                        pW4.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW5handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW5.getLayoutParams();
            if (pW5flag == 1 || pW5flag==3) {
                if(pW5flag==1){
                    pW5flag = 0;
                    params.leftMargin-=17;
                    pW5.setLayoutParams(params);
                }
                else if(pW5flag==3){
                    pW5flag = 4;
                    params.leftMargin-=17;
                    pW5.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW5);
                    }
                    unselect();
                }else if (player==1 && (pW5flag == 0 || pW5flag == 4)) {
                    if(pW5flag==0) {
                        unselect();
                        pW5flag = 1;
                        params.leftMargin+=17;
                        pW5.setLayoutParams(params);
                    }
                    else if(pW5flag == 4){
                        unselect();
                        pW5flag = 3;
                        params.leftMargin+=17;
                        pW5.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW6handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW6.getLayoutParams();
            if (pW6flag == 1 || pW6flag==3) {
                if(pW6flag==1){
                    pW6flag = 0;
                    params.leftMargin-=17;
                    pW6.setLayoutParams(params);
                }
                else if(pW6flag==3){
                    pW6flag = 4;
                    params.leftMargin-=17;
                    pW6.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW6);
                    }
                    unselect();
                }else if (player==1 && (pW6flag == 0 || pW6flag == 4)) {
                    if(pW6flag==0) {
                        unselect();
                        pW6flag = 1;
                        params.leftMargin+=17;
                        pW6.setLayoutParams(params);
                    }
                    else if(pW6flag == 4){
                        unselect();
                        pW6flag = 3;
                        params.leftMargin+=17;
                        pW6.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW7handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW7.getLayoutParams();
            if (pW7flag == 1 || pW7flag==3) {
                if(pW7flag==1){
                    pW7flag = 0;
                    params.leftMargin-=17;
                    pW7.setLayoutParams(params);
                }
                else if(pW7flag==3){
                    pW7flag = 4;
                    params.leftMargin-=17;
                    pW7.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW7);
                    }
                    unselect();
                }else if (player==1 && (pW7flag == 0 || pW7flag == 4)) {
                    if(pW7flag==0) {
                        unselect();
                        pW7flag = 1;
                        params.leftMargin+=17;
                        pW7.setLayoutParams(params);
                    }
                    else if(pW7flag == 4){
                        unselect();
                        pW7flag = 3;
                        params.leftMargin+=17;
                        pW7.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener pW8handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pW8.getLayoutParams();
            if (pW8flag == 1 || pW8flag==3) {
                if(pW8flag==1){
                    pW8flag = 0;
                    params.leftMargin-=17;
                    pW8.setLayoutParams(params);
                }
                else if(pW8flag==3){
                    pW8flag = 4;
                    params.leftMargin-=17;
                    pW8.setLayoutParams(params);
                }
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(pW8);
                    }
                    unselect();
                }else if (player==1 && (pW8flag == 0 || pW8flag == 4)) {
                    if(pW8flag==0) {
                        unselect();
                        pW8flag = 1;
                        params.leftMargin+=17;
                        pW8.setLayoutParams(params);
                    }
                    else if(pW8flag == 4){
                        unselect();
                        pW8flag = 3;
                        params.leftMargin+=17;
                        pW8.setLayoutParams(params);
                    }
                }
            }
        }
    };
    View.OnClickListener rW1handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) rW1.getLayoutParams();
            if(rW1flag==1)
            {
                rW1flag=0;
                params.leftMargin-=17;
                rW1.setLayoutParams(params);
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW1);
                    }
                    unselect();
                }
                else if(player==1 && rW1flag==0) {
                    unselect();
                    rW1flag=1;
                    params.leftMargin+=17;
                    rW1.setLayoutParams(params);
                }
            }
        }
    };
    View.OnClickListener rW2handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) rW2.getLayoutParams();
            if(rW2flag==1)
            {
                rW2flag=0;
                params.leftMargin-=17;
                rW2.setLayoutParams(params);
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(rW2);
                    }
                    unselect();
                }
                else if(player==1 && rW2flag==0) {
                    unselect();
                    rW2flag=1;
                    params.leftMargin+=17;
                    rW2.setLayoutParams(params);
                }
            }
        }
    };
    View.OnClickListener bW1handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) bW1.getLayoutParams();
            if(bW1flag==1)
            {
                bW1flag=0;
                params.leftMargin-=17;
                bW1.setLayoutParams(params);
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW1);
                    }
                    unselect();
                }
                else if(player==1 && bW1flag==0) {
                    unselect();
                    bW1flag=1;
                    params.leftMargin+=17;
                    bW1.setLayoutParams(params);
                }
            }
        }
    };
    View.OnClickListener bW2handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) bW2.getLayoutParams();
            if(bW2flag==1)
            {
                bW2flag=0;
                params.leftMargin-=17;
                bW2.setLayoutParams(params);
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(bW2);
                    }
                    unselect();
                }
                else if(player==1 && bW2flag==0) {
                    unselect();
                    bW2flag=1;
                    params.leftMargin+=17;
                    bW2.setLayoutParams(params);
                }
            }
        }
    };
    View.OnClickListener kW1handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) kW1.getLayoutParams();
            if(kW1flag==1)
            {
                kW1flag=0;
                params.leftMargin-=17;
                kW1.setLayoutParams(params);
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW1);
                    }
                    unselect();
                }
                else if(player==1 && kW1flag==0) {
                    unselect();
                    kW1flag=1;
                    params.leftMargin+=17;
                    kW1.setLayoutParams(params);
                }
            }
        }
    };
    View.OnClickListener kW2handler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) kW2.getLayoutParams();
            if(kW2flag==1)
            {
                kW2flag=0;
                params.leftMargin-=17;
                kW2.setLayoutParams(params);
            }
            else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kW2);
                    }
                    unselect();
                }
                else if(player==1 && kW2flag==0) {
                    unselect();
                    kW2flag=1;
                    params.leftMargin+=17;
                    kW2.setLayoutParams(params);
                }
            }
        }
    };
    View.OnClickListener kingWhandler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) kingW.getLayoutParams();
            if (kingWflag == 1) {
                kingWflag = 0;
                params.leftMargin-=17;
                kingW.setLayoutParams(params);
            } else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(kingW);
                    }
                    unselect();
                }
                else if(player==1 && kingWflag==0) {
                    unselect();
                    kingWflag=1;
                    params.leftMargin+=17;
                    kingW.setLayoutParams(params);
                }
            }
        }
    };

    View.OnClickListener qWhandler = new View.OnClickListener() {
        public void onClick(View v) {
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) qW.getLayoutParams();
            if (qWflag == 1) {
                qWflag = 0;
                params.leftMargin-=17;
                qW.setLayoutParams(params);
            } else {
                int rowbutton = params.topMargin/120;
                int columnbutton = params.leftMargin/120;
                if(rB1flag==1)
                {
                    dead=rookMotion(rB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(rB2flag==1)
                {
                    dead=rookMotion(rB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(bB1flag==1){
                    dead=bishopmotion(bB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(bB2flag==1){
                    dead=bishopmotion(bB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(kB1flag==1){
                    dead=knight(kB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(kB2flag==1){
                    dead=knight(kB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(kingBflag==1){
                    dead=kingmotion(kingB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(qBflag==1){
                    dead=queenmotion(qB,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB1flag==1){
                    dead=blackpawncrossmotion(pB1,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB2flag==1){
                    dead=blackpawncrossmotion(pB2,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB3flag==1){
                    dead=blackpawncrossmotion(pB3,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB4flag==1){
                    dead=blackpawncrossmotion(pB4,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB5flag==1){
                    dead=blackpawncrossmotion(pB5,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB6flag==1){
                    dead=blackpawncrossmotion(pB6,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB7flag==1){
                    dead=blackpawncrossmotion(pB7,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(pB8flag==1){
                    dead=blackpawncrossmotion(pB8,rowbutton,columnbutton);
                    if(dead==1){
                        kill(qW);
                    }
                    unselect();
                }
                else if(player==1 && qWflag==0) {
                    unselect();
                    qWflag=1;
                    params.leftMargin+=17;
                    qW.setLayoutParams(params);
                }
            }
        }
    };

    View.OnClickListener b0_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,0,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,0);
            }
            if(kB1flag==1){
                knight(kB1,0,0);
            }
            if(kB2flag==1){
                knight(kB2,0,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,0);
            }
            if(kW1flag==1){
                knight(kW1,0,0);
            }
            if(kW2flag==1){
                knight(kW2,0,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,0);
            }
            if(qWflag==1){
                queenmotion(qW,0,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,0);
            }
            if(qBflag==1){
                queenmotion(qB,0,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,0);
            }
            unselect();
        }
    };
    View.OnClickListener b1_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,1,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,0);
            }
            if(kB1flag==1){
                knight(kB1,1,0);
            }
            if(kB2flag==1){
                knight(kB2,1,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,0);
            }
            if(qBflag==1){
                queenmotion(qB,1,0);
            }if(rW1flag==1)
            {
                rookMotion(rW1,1,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,0);
            }
            if(kW1flag==1){
                knight(kW1,1,0);
            }
            if(kW2flag==1){
                knight(kW2,1,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,0);
            }
            if(qWflag==1){
                queenmotion(qW,1,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,0);
            }
            unselect();
        }
    };
    View.OnClickListener b2_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,2,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,0);
            }
            if(kB1flag==1){
                knight(kB1,2,0);
            }
            if(kB2flag==1){
                knight(kB2,2,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,0);
            }
            if(qBflag==1){
                queenmotion(qB,2,0);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,0);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,0);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,0);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,0);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,0);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,0);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,0);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,0);
            }
            if(kW1flag==1){
                knight(kW1,2,0);
            }
            if(kW2flag==1){
                knight(kW2,2,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,0);
            }
            if(qWflag==1){
                queenmotion(qW,2,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,0);
            }
            unselect();
        }
    };
    View.OnClickListener b3_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,3,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,0);
            }
            if(kB1flag==1){
                knight(kB1,3,0);
            }
            if(kB2flag==1){
                knight(kB2,3,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,0);
            }
            if(qBflag==1){
                queenmotion(qB,3,0);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,0);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,0);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,0);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,0);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,0);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,0);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,0);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,0);
            }
            if(kW1flag==1){
                knight(kW1,3,0);
            }
            if(kW2flag==1){
                knight(kW2,3,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,0);
            }
            if(qWflag==1){
                queenmotion(qW,3,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,0);
            }
            unselect();
        }
    };
    View.OnClickListener b4_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,4,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,0);
            }
            if(kB1flag==1){
                knight(kB1,4,0);
            }
            if(kB2flag==1){
                knight(kB2,4,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,0);
            }
            if(qBflag==1){
                queenmotion(qB,4,0);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,0);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,0);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,0);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,0);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,0);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,0);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,0);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,0);
            }
            if(kW1flag==1){
                knight(kW1,4,0);
            }
            if(kW2flag==1){
                knight(kW2,4,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,0);
            }
            if(qWflag==1){
                queenmotion(qW,4,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,0);
            }
            unselect();
        }
    };
    View.OnClickListener b5_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,5,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,0);
            }
            if(kB1flag==1){
                knight(kB1,5,0);
            }
            if(kB2flag==1){
                knight(kB2,5,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,0);
            }
            if(qBflag==1){
                queenmotion(qB,5,0);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,0);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,0);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,0);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,0);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,0);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,0);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,0);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,0);
            }
            if(kW1flag==1){
                knight(kW1,5,0);
            }
            if(kW2flag==1){
                knight(kW2,5,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,0);
            }
            if(qWflag==1){
                queenmotion(qW,5,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,0);
            }
            unselect();
        }
    };
    View.OnClickListener b6_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,6,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,0);
            }
            if(kB1flag==1){
                knight(kB1,6,0);
            }
            if(kB2flag==1){
                knight(kB2,6,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,0);
            }
            if(qBflag==1){
                queenmotion(qB,6,0);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,0);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,0);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,0);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,0);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,0);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,0);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,0);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,0);
            }
            if(kW1flag==1){
                knight(kW1,6,0);
            }
            if(kW2flag==1){
                knight(kW2,6,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,0);
            }
            if(qWflag==1){
                queenmotion(qW,6,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,6,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,6,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,6,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,6,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,6,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,6,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,6,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,6,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,0);
            }
            unselect();
        }
    };
    View.OnClickListener b7_0handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,0);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,7,0);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,0);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,0);
            }
            if(kB1flag==1){
                knight(kB1,7,0);
            }
            if(kB2flag==1){
                knight(kB2,7,0);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,0);
            }
            if(qBflag==1){
                queenmotion(qB,7,0);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,0);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,0);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,0);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,0);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,0);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,0);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,0);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,0);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,0);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,0);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,0);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,0);
            }
            if(kW1flag==1){
                knight(kW1,7,0);
            }
            if(kW2flag==1){
                knight(kW2,7,0);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,0);
            }
            if(qWflag==1){
                queenmotion(qW,7,0);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,7,0);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,7,0);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,7,0);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,7,0);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,7,0);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,7,0);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,7,0);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,7,0);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,0);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,0);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,0);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,0);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,0);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,0);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,0);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,0);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,0);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,0);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,0);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,0);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,0);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,0);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,0);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,0);
            }
            unselect();
        }
    };

    View.OnClickListener b0_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,1);
                rB1flag=0;
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,0,1);
                unselect();
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,1);
            }
            if(kB1flag==1){
                knight(kB1,0,1);
            }
            if(kB2flag==1){
                knight(kB2,0,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,1);
            }
            if(qBflag==1){
                queenmotion(qB,0,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,1);
            }
            if(kW1flag==1){
                knight(kW1,0,1);
            }
            if(kW2flag==1){
                knight(kW2,0,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,1);
            }
            if(qWflag==1){
                queenmotion(qW,0,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,1);
            }
            unselect();
        }
    };
    View.OnClickListener b1_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,1,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,1);
            }
            if(kB1flag==1){
                knight(kB1,1,1);
            }
            if(kB2flag==1){
                knight(kB2,1,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,1);
            }
            if(qBflag==1){
                queenmotion(qB,1,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,1,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,1);
            }
            if(kW1flag==1){
                knight(kW1,1,1);
            }
            if(kW2flag==1){
                knight(kW2,1,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,1);
            }
            if(qWflag==1){
                queenmotion(qW,1,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,1);
            }
            unselect();
        }
    };
    View.OnClickListener b2_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,2,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,1);
            }
            if(kB1flag==1){
                knight(kB1,2,1);
            }
            if(kB2flag==1){
                knight(kB2,2,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,1);
            }
            if(qBflag==1){
                queenmotion(qB,2,1);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,1);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,1);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,1);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,1);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,1);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,1);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,1);
            }
            if(kW1flag==1){
                knight(kW1,2,1);
            }
            if(kW2flag==1){
                knight(kW2,2,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,1);
            }
            if(qWflag==1){
                queenmotion(qW,2,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,1);
            }
            unselect();
        }
    };
    View.OnClickListener b3_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,3,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,1);
            }
            if(kB1flag==1){
                knight(kB1,3,1);
            }
            if(kB2flag==1){
                knight(kB2,3,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,1);
            }
            if(qBflag==1){
                queenmotion(qB,3,1);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,1);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,1);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,1);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,1);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,1);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,1);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,1);
            }
            if(kW1flag==1){
                knight(kW1,3,1);
            }
            if(kW2flag==1){
                knight(kW2,3,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,1);
            }
            if(qWflag==1){
                queenmotion(qW,3,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,1);
            }
            unselect();
        }
    };
    View.OnClickListener b4_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,4,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,1);
            }
            if(kB1flag==1){
                knight(kB1,4,1);
            }
            if(kB2flag==1){
                knight(kB2,4,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,1);
            }
            if(qBflag==1){
                queenmotion(qB,4,1);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,1);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,1);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,1);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,1);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,1);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,1);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,1);
            }
            if(kW1flag==1){
                knight(kW1,4,1);
            }
            if(kW2flag==1){
                knight(kW2,4,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,1);
            }
            if(qWflag==1){
                queenmotion(qW,4,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,1);
            }
            unselect();
        }
    };
    View.OnClickListener b5_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,5,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,1);
            }
            if(kB1flag==1){
                knight(kB1,5,1);
            }
            if(kB2flag==1){
                knight(kB2,5,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,1);
            }
            if(qBflag==1){
                queenmotion(qB,5,1);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,1);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,1);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,1);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,1);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,1);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,1);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,1);
            }
            if(kW1flag==1){
                knight(kW1,5,1);
            }
            if(kW2flag==1){
                knight(kW2,5,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,1);
            }
            if(qWflag==1){
                queenmotion(qW,5,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,1);
            }
            unselect();
        }
    };
    View.OnClickListener b6_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,6,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,1);
            }
            if(kB1flag==1){
                knight(kB1,6,1);
            }
            if(kB2flag==1){
                knight(kB2,6,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,1);
            }
            if(qBflag==1){
                queenmotion(qB,6,1);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,1);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,1);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,1);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,1);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,1);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,1);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,1);
            }
            if(kW1flag==1){
                knight(kW1,6,1);
            }
            if(kW2flag==1){
                knight(kW2,6,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,1);
            }
            if(qWflag==1){
                queenmotion(qW,6,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,6,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,6,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,6,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,6,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,6,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,6,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,6,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,6,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,1);
            }
            unselect();
        }
    };
    View.OnClickListener b7_1handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,1);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,7,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,1);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,1);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,1);
            }
            if(kB1flag==1){
                knight(kB1,7,1);
            }
            if(kB2flag==1){
                knight(kB2,7,1);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,1);
            }
            if(qBflag==1){
                queenmotion(qB,7,1);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,1);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,1);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,1);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,1);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,1);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,1);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,1);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,1);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,1);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,1);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,1);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,1);
            }
            if(kW1flag==1){
                knight(kW1,7,1);
            }
            if(kW2flag==1){
                knight(kW2,7,1);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,1);
            }
            if(qWflag==1){
                queenmotion(qW,7,1);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,7,1);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,7,1);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,7,1);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,7,1);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,7,1);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,7,1);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,7,1);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,7,1);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,1);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,1);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,1);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,1);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,1);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,1);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,1);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,1);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,1);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,1);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,1);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,1);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,1);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,1);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,1);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,1);
            }
            unselect();
        }
    };
    View.OnClickListener b0_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,0,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,2);
            }
            if(kB1flag==1){
                knight(kB1,0,2);
            }
            if(kB2flag==1){
                knight(kB2,0,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,2);
            }
            if(qBflag==1){
                queenmotion(qB,0,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,2);
            }
            if(kW1flag==1){
                knight(kW1,0,2);
            }
            if(kW2flag==1){
                knight(kW2,0,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,2);
            }
            if(qWflag==1){
                queenmotion(qW,0,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,2);
            }
            unselect();
        }
    };
    View.OnClickListener b1_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,1,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,2);
            }
            if(kB1flag==1){
                knight(kB1,1,2);
            }
            if(kB2flag==1){
                knight(kB2,1,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,2);
            }
            if(qBflag==1){
                queenmotion(qB,1,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,1,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,2);
            }
            if(kW1flag==1){
                knight(kW1,1,2);
            }
            if(kW2flag==1){
                knight(kW2,1,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,2);
            }
            if(qWflag==1){
                queenmotion(qW,1,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,2);
            }
            unselect();
        }
    };
    View.OnClickListener b2_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,2,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,2);
            }
            if(kB1flag==1){
                knight(kB1,2,2);
            }
            if(kB2flag==1){
                knight(kB2,2,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,2);
            }
            if(qBflag==1){
                queenmotion(qB,2,2);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,2);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,2);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,2);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,2);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,2);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,2);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,2);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,2);
            }
            if(kW1flag==1){
                knight(kW1,2,2);
            }
            if(kW2flag==1){
                knight(kW2,2,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,2);
            }
            if(qWflag==1){
                queenmotion(qW,2,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,2);
            }
            unselect();
        }
    };
    View.OnClickListener b3_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,3,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,2);
            }
            if(kB1flag==1){
                knight(kB1,3,2);
            }
            if(kB2flag==1){
                knight(kB2,3,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,2);
            }
            if(qBflag==1){
                queenmotion(qB,3,2);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,2);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,2);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,2);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,2);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,2);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,2);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,2);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,2);
            }
            if(kW1flag==1){
                knight(kW1,3,2);
            }
            if(kW2flag==1){
                knight(kW2,3,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,2);
            }
            if(qWflag==1){
                queenmotion(qW,3,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,2);
            }
            unselect();
        }
    };
    View.OnClickListener b4_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,4,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,2);
            }
            if(kB1flag==1){
                knight(kB1,4,2);
            }
            if(kB2flag==1){
                knight(kB2,4,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,2);
            }
            if(qBflag==1){
                queenmotion(qB,4,2);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,2);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,2);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,2);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,2);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,2);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,2);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,2);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,2);
            }
            if(kW1flag==1){
                knight(kW1,4,2);
            }
            if(kW2flag==1){
                knight(kW2,4,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,2);
            }
            if(qWflag==1){
                queenmotion(qW,4,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,2);
            }
            unselect();
        }
    };
    View.OnClickListener b5_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,5,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,2);
            }
            if(kB1flag==1){
                knight(kB1,5,2);
            }
            if(kB2flag==1){
                knight(kB2,5,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,2);
            }
            if(qBflag==1){
                queenmotion(qB,5,2);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,2);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,2);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,2);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,2);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,2);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,2);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,2);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,2);
            }
            if(kW1flag==1){
                knight(kW1,5,2);
            }
            if(kW2flag==1){
                knight(kW2,5,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,2);
            }
            if(qWflag==1){
                queenmotion(qW,5,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,2);
            }
            unselect();
        }
    };
    View.OnClickListener b6_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,6,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,2);
            }
            if(kB1flag==1){
                knight(kB1,6,2);
            }
            if(kB2flag==1){
                knight(kB2,6,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,2);
            }
            if(qBflag==1){
                queenmotion(qB,6,2);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,2);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,2);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,2);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,2);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,2);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,2);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,2);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,2);
            }
            if(kW1flag==1){
                knight(kW1,6,2);
            }
            if(kW2flag==1){
                knight(kW2,6,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,2);
            }
            if(qWflag==1){
                queenmotion(qW,6,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,6,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,6,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,6,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,6,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,6,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,6,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,6,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,6,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,2);
            }
            unselect();
        }
    };
    View.OnClickListener b7_2handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,2);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,7,2);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,2);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,2);
            }
            if(kB1flag==1){
                knight(kB1,7,2);
            }
            if(kB2flag==1){
                knight(kB2,7,2);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,2);
            }
            if(qBflag==1){
                queenmotion(qB,7,2);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,2);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,2);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,2);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,2);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,2);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,2);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,2);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,2);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,2);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,2);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,2);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,2);
            }
            if(kW1flag==1){
                knight(kW1,7,2);
            }
            if(kW2flag==1){
                knight(kW2,7,2);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,2);
            }
            if(qWflag==1){
                queenmotion(qW,7,2);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,7,2);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,7,2);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,7,2);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,7,2);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,7,2);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,7,2);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,7,2);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,7,2);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,2);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,2);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,2);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,2);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,2);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,2);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,2);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,2);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,2);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,2);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,2);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,2);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,2);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,2);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,2);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,2);
            }
            unselect();
        }
    };
    View.OnClickListener b0_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,0,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,3);
            }
            if(kB1flag==1){
                knight(kB1,0,3);
            }
            if(kB2flag==1){
                knight(kB2,0,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,3);
            }
            if(qBflag==1){
                queenmotion(qB,0,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,3);
            }
            if(kW1flag==1){
                knight(kW1,0,3);
            }
            if(kW2flag==1){
                knight(kW2,0,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,3);
            }
            if(qWflag==1){
                queenmotion(qW,0,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,3);
            }
            unselect();
        }
    };
    View.OnClickListener b1_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,1,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,3);
            }
            if(kB1flag==1){
                knight(kB1,1,3);
            }
            if(kB2flag==1){
                knight(kB2,1,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,3);
            }
            if(qBflag==1){
                queenmotion(qB,1,3);
            }
            if(rW1flag==1) {
                rookMotion(rW1,1,3);
            }
            if(rW2flag==1) {
                rookMotion(rW2,1,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,3);
            }
            if(kW1flag==1){
                knight(kW1,1,3);
            }
            if(kW2flag==1){
                knight(kW2,1,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,3);
            }
            if(qWflag==1){
                queenmotion(qW,1,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,3);
            }
            unselect();
        }
    };
    View.OnClickListener b2_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,2,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,3);
            }
            if(kB1flag==1){
                knight(kB1,2,3);
            }
            if(kB2flag==1){
                knight(kB2,2,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,3);
            }
            if(qBflag==1){
                queenmotion(qB,2,3);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,3);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,3);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,3);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,3);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,3);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,3);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,3);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,3);
            }
            if(kW1flag==1){
                knight(kW1,2,3);
            }
            if(kW2flag==1){
                knight(kW2,2,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,3);
            }
            if(qWflag==1){
                queenmotion(qW,2,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,3);
            }
            unselect();
        }
    };
    View.OnClickListener b3_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,3,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,3);
            }
            if(kB1flag==1){
                knight(kB1,3,3);
            }
            if(kB2flag==1){
                knight(kB2,3,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,3);
            }
            if(qBflag==1){
                queenmotion(qB,3,3);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,3);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,3);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,3);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,3);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,3);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,3);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,3);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,3);
            }
            if(kW1flag==1){
                knight(kW1,3,3);
            }
            if(kW2flag==1){
                knight(kW2,3,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,3);
            }
            if(qWflag==1){
                queenmotion(qW,3,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,3);
            }
            unselect();
        }
    };
    View.OnClickListener b4_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,4,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,3);
            }
            if(kB1flag==1){
                knight(kB1,4,3);
            }
            if(kB2flag==1){
                knight(kB2,4,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,3);
            }
            if(qBflag==1){
                queenmotion(qB,4,3);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,3);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,3);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,3);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,3);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,3);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,3);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,3);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,3);
            }
            if(kW1flag==1){
                knight(kW1,4,3);
            }
            if(kW2flag==1){
                knight(kW2,4,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,3);
            }
            if(qWflag==1){
                queenmotion(qW,4,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,3);
            }
            unselect();
        }
    };
    View.OnClickListener b5_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,5,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,3);
            }
            if(kB1flag==1){
                knight(kB1,5,3);
            }
            if(kB2flag==1){
                knight(kB2,5,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,3);
            }
            if(qBflag==1){
                queenmotion(qB,5,3);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,3);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,3);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,3);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,3);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,3);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,3);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,3);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,3);
            }
            if(kW1flag==1){
                knight(kW1,5,3);
            }
            if(kW2flag==1){
                knight(kW2,5,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,3);
            }
            if(qWflag==1){
                queenmotion(qW,5,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,3);
            }
            unselect();
        }
    };
    View.OnClickListener b6_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,6,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,3);
            }
            if(kB1flag==1){
                knight(kB1,6,3);
            }
            if(kB2flag==1){
                knight(kB2,6,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,3);
            }
            if(qBflag==1){
                queenmotion(qB,6,3);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,3);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,3);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,3);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,3);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,3);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,3);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,3);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,3);
            }
            if(kW1flag==1){
                knight(kW1,6,3);
            }
            if(kW2flag==1){
                knight(kW2,6,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,3);
            }
            if(qWflag==1){
                queenmotion(qW,6,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,6,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,6,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,6,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,6,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,6,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,6,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,6,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,6,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,3);
            }
            unselect();
        }
    };
    View.OnClickListener b7_3handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,3);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,7,3);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,3);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,3);
            }
            if(kB1flag==1){
                knight(kB1,7,3);
            }
            if(kB2flag==1){
                knight(kB2,7,3);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,3);
            }
            if(qBflag==1){
                queenmotion(qB,7,3);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,3);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,3);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,3);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,3);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,3);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,3);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,3);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,3);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,3);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,3);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,3);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,3);
            }
            if(kW1flag==1){
                knight(kW1,7,3);
            }
            if(kW2flag==1){
                knight(kW2,7,3);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,3);
            }
            if(qWflag==1){
                queenmotion(qW,7,3);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,7,3);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,7,3);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,7,3);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,7,3);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,7,3);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,7,3);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,7,3);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,7,3);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,3);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,3);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,3);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,3);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,3);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,3);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,3);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,3);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,3);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,3);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,3);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,3);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,3);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,3);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,3);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,3);
            }
            unselect();
        }
    };
    View.OnClickListener b0_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,0,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,4);
            }
            if(kB1flag==1){
                knight(kB1,0,4);
            }
            if(kB2flag==1){
                knight(kB2,0,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,4);
            }
            if(qBflag==1){
                queenmotion(qB,0,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,0,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,0,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,0,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,0,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,0,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,0,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,0,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,0,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,4);
            }
            if(kW1flag==1){
                knight(kW1,0,4);
            }
            if(kW2flag==1){
                knight(kW2,0,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,4);
            }
            if(qWflag==1){
                queenmotion(qW,0,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,4);
            }
            unselect();
        }
    };
    View.OnClickListener b1_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,1,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,4);
            }
            if(kB1flag==1){
                knight(kB1,1,4);
            }
            if(kB2flag==1){
                knight(kB2,1,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,4);
            }
            if(qBflag==1){
                queenmotion(qB,1,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,1,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,1,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,1,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,1,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,1,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,1,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,1,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,1,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,1,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,4);
            }
            if(kW1flag==1){
                knight(kW1,1,4);
            }
            if(kW2flag==1){
                knight(kW2,1,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,4);
            }
            if(qWflag==1){
                queenmotion(qW,1,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,4);
            }
            unselect();
        }
    };
    View.OnClickListener b2_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,2,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,4);
            }
            if(kB1flag==1){
                knight(kB1,2,4);
            }
            if(kB2flag==1){
                knight(kB2,2,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,4);
            }
            if(qBflag==1){
                queenmotion(qB,2,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,4);
            }
            if(kW1flag==1){
                knight(kW1,2,4);
            }
            if(kW2flag==1){
                knight(kW2,2,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,4);
            }
            if(qWflag==1){
                queenmotion(qW,2,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,4);
            }
            unselect();
        }
    };
    View.OnClickListener b3_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,3,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,4);
            }
            if(kB1flag==1){
                knight(kB1,3,4);
            }
            if(kB2flag==1){
                knight(kB2,3,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,4);
            }
            if(qBflag==1){
                queenmotion(qB,3,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,4);
            }
            if(kW1flag==1){
                knight(kW1,3,4);
            }
            if(kW2flag==1){
                knight(kW2,3,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,4);
            }
            if(qWflag==1){
                queenmotion(qW,3,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,4);
            }
            unselect();
        }
    };
    View.OnClickListener b4_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,4,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,4);
            }
            if(kB1flag==1){
                knight(kB1,4,4);
            }
            if(kB2flag==1){
                knight(kB2,4,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,4);
            }
            if(qBflag==1){
                queenmotion(qB,4,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,4);
            }
            if(kW1flag==1){
                knight(kW1,4,4);
            }
            if(kW2flag==1){
                knight(kW2,4,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,4);
            }
            if(qWflag==1){
                queenmotion(qW,4,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,4);
            }
            unselect();
        }
    };
    View.OnClickListener b5_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,5,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,4);
            }
            if(kB1flag==1){
                knight(kB1,5,4);
            }
            if(kB2flag==1){
                knight(kB2,5,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,4);
            }
            if(qBflag==1){
                queenmotion(qB,5,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,4);
            }
            if(kW1flag==1){
                knight(kW1,5,4);
            }
            if(kW2flag==1){
                knight(kW2,5,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,4);
            }
            if(qWflag==1){
                queenmotion(qW,5,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,4);
            }
            unselect();
        }
    };
    View.OnClickListener b6_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,6,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,4);
            }
            if(kB1flag==1){
                knight(kB1,6,4);
            }
            if(kB2flag==1){
                knight(kB2,6,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,4);
            }
            if(qBflag==1){
                queenmotion(qB,6,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,4);
            }
            if(kW1flag==1){
                knight(kW1,6,4);
            }
            if(kW2flag==1){
                knight(kW2,6,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,4);
            }
            if(qWflag==1){
                queenmotion(qW,6,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,6,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,6,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,6,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,6,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,6,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,6,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,6,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,6,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,4);
            }
            unselect();
        }
    };
    View.OnClickListener b7_4handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,4);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,7,4);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,4);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,4);
            }
            if(kB1flag==1){
                knight(kB1,7,4);
            }
            if(kB2flag==1){
                knight(kB2,7,4);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,4);
            }
            if(qBflag==1){
                queenmotion(qB,7,4);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,4);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,4);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,4);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,4);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,4);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,4);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,4);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,4);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,4);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,4);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,4);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,4);
            }
            if(kW1flag==1){
                knight(kW1,7,4);
            }
            if(kW2flag==1){
                knight(kW2,7,4);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,4);
            }
            if(qWflag==1){
                queenmotion(qW,7,4);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,7,4);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,7,4);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,7,4);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,7,4);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,7,4);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,7,4);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,7,4);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,7,4);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,4);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,4);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,4);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,4);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,4);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,4);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,4);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,4);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,4);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,4);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,4);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,4);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,4);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,4);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,4);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,4);
            }
            unselect();
        }
    };
    View.OnClickListener b0_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,5);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,0,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,5);
            }
            if(kB1flag==1){
                knight(kB1,0,5);
            }
            if(kB2flag==1){
                knight(kB2,0,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,5);
            }
            if(qBflag==1){
                queenmotion(qB,0,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,5);
            }
            if(kW1flag==1){
                knight(kW1,0,5);
            }
            if(kW2flag==1){
                knight(kW2,0,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,5);
            }
            if(qWflag==1){
                queenmotion(qW,0,5);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,5);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,5);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,5);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,5);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,5);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,5);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,5);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,5);
            }
            unselect();
        }
    };
    View.OnClickListener b1_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,5);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,1,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,5);
            }
            if(kB1flag==1){
                knight(kB1,1,5);
            }
            if(kB2flag==1){
                knight(kB2,1,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,5);
            }
            if(qBflag==1){
                queenmotion(qB,1,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,1,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,5);
            }
            if(kW1flag==1){
                knight(kW1,1,5);
            }
            if(kW2flag==1){
                knight(kW2,1,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,5);
            }
            if(qWflag==1){
                queenmotion(qW,1,5);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,5);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,5);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,5);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,5);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,5);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,5);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,5);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,5);
            }
            unselect();
        }
    };
    View.OnClickListener b2_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,5);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,2,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,5);
            }
            if(kB1flag==1){
                knight(kB1,2,5);
            }
            if(kB2flag==1){
                knight(kB2,2,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,5);
            }
            if(qBflag==1){
                queenmotion(qB,2,5);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,5);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,5);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,5);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,5);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,5);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,5);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,5);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,5);
            }
            if(kW1flag==1){
                knight(kW1,2,5);
            }
            if(kW2flag==1){
                knight(kW2,2,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,5);
            }
            if(qWflag==1){
                queenmotion(qW,2,5);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,5);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,5);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,5);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,5);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,5);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,5);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,5);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,5);
            }
            unselect();
        }
    };
    View.OnClickListener b3_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1) {
                rookMotion(rB1,3,5);
            }
            if(rB2flag==1) {
                rookMotion(rB2,3,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,5);
            }
            if(kB1flag==1){
                knight(kB1,3,5);
            }
            if(kB2flag==1){
                knight(kB2,3,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,5);
            }
            if(qBflag==1){
                queenmotion(qB,3,5);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,5);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,5);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,5);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,5);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,5);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,5);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,5);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,5);
            }
            if(kW1flag==1){
                knight(kW1,3,5);
            }
            if(kW2flag==1){
                knight(kW2,3,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,5);
            }
            if(qWflag==1){
                queenmotion(qW,3,5);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,5);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,5);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,5);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,5);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,5);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,5);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,5);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,5);
            }
            unselect();
        }
    };
    View.OnClickListener b4_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,5);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,4,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,5);
            }
            if(kB1flag==1){
                knight(kB1,4,5);
            }
            if(kB2flag==1){
                knight(kB2,4,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,5);
            }
            if(qBflag==1){
                queenmotion(qB,4,5);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,5);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,5);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,5);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,5);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,5);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,5);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,5);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,5);
            }
            if(kW1flag==1){
                knight(kW1,4,5);
            }
            if(kW2flag==1){
                knight(kW2,4,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,5);
            }
            if(qWflag==1){
                queenmotion(qW,4,5);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,5);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,5);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,5);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,5);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,5);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,5);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,5);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,5);
            }
            unselect();
        }
    };
    View.OnClickListener b5_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,5);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,5,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,5);
            }
            if(kB1flag==1){
                knight(kB1,5,5);
            }
            if(kB2flag==1){
                knight(kB2,5,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,5);
            }
            if(qBflag==1){
                queenmotion(qB,5,5);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,5);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,5);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,5);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,5);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,5);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,5);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,5);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,5);
            }
            if(kW1flag==1){
                knight(kW1,5,5);
            }
            if(kW2flag==1){
                knight(kW2,5,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,5);
            }
            if(qWflag==1){
                queenmotion(qW,5,5);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,5);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,5);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,5);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,5);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,5);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,5);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,5);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,5);
            }
            unselect();
        }
    };
    View.OnClickListener b6_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,5);
            }

            if(rB2flag==1)
            {
                rookMotion(rB2,6,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,5);
            }
            if(kB1flag==1){
                knight(kB1,6,5);
            }
            if(kB2flag==1){
                knight(kB2,6,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,5);
            }
            if(qBflag==1){
                queenmotion(qB,6,5);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,5);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,5);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,5);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,5);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,5);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,5);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,5);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,5);
            }
            if(kW1flag==1){
                knight(kW1,6,5);
            }
            if(kW2flag==1){
                knight(kW2,6,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,5);
            }
            if(qWflag==1){
                queenmotion(qW,6,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,5);
            }
            unselect();
        }
    };
    View.OnClickListener b7_5handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,5);
            }
            if(rB2flag==1)
            {
                rookMotion(rB2,7,5);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,5);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,5);
            }
            if(kB1flag==1){
                knight(kB1,7,5);
            }
            if(kB2flag==1){
                knight(kB2,7,5);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,5);
            }
            if(qBflag==1){
                queenmotion(qB,7,5);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,5);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,5);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,5);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,5);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,5);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,5);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,5);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,5);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,5);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,5);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,5);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,5);
            }
            if(kW1flag==1){
                knight(kW1,7,5);
            }
            if(kW2flag==1){
                knight(kW2,7,5);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,5);
            }
            if(qWflag==1){
                queenmotion(qW,7,5);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,5);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,5);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,5);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,5);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,5);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,5);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,5);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,5);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,5);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,5);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,5);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,5);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,5);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,5);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,5);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,5);
            }
            unselect();
        }
    };

    View.OnClickListener b0_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,0,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,6);
            }
            if(kB1flag==1){
                knight(kB1,0,6);
            }
            if(kB2flag==1){
                knight(kB2,0,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,6);
            }
            if(qBflag==1){
                queenmotion(qB,0,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,6);
            }
            if(kW1flag==1){
                knight(kW1,0,6);
            }
            if(kW2flag==1){
                knight(kW2,0,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,6);
            }
            if(qWflag==1){
                queenmotion(qW,0,6);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,6);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,6);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,6);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,6);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,6);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,6);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,6);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,6);
            }
            unselect();
        }
    };
    View.OnClickListener b1_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,1,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,6);
            }
            if(kB1flag==1){
                knight(kB1,1,6);
            }
            if(kB2flag==1){
                knight(kB2,1,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,6);
            }
            if(qBflag==1){
                queenmotion(qB,1,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,1,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,6);
            }
            if(kW1flag==1){
                knight(kW1,1,6);
            }
            if(kW2flag==1){
                knight(kW2,1,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,6);
            }
            if(qWflag==1){
                queenmotion(qW,1,6);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,6);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,6);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,6);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,6);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,6);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,6);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,6);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,6);
            }
            unselect();
        }
    };
    View.OnClickListener b2_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,2,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,6);
            }
            if(kB1flag==1){
                knight(kB1,2,6);
            }
            if(kB2flag==1){
                knight(kB2,2,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,6);
            }
            if(qBflag==1){
                queenmotion(qB,2,6);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,6);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,6);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,6);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,6);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,6);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,6);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,6);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,6);
            }
            if(kW1flag==1){
                knight(kW1,2,6);
            }
            if(kW2flag==1){
                knight(kW2,2,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,6);
            }
            if(qWflag==1){
                queenmotion(qW,2,6);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,6);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,6);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,6);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,6);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,6);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,6);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,6);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,6);
            }
            unselect();
        }
    };
    View.OnClickListener b3_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,3,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,6);
            }
            if(kB1flag==1){
                knight(kB1,3,6);
            }
            if(kB2flag==1){
                knight(kB2,3,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,6);
            }
            if(qBflag==1){
                queenmotion(qB,3,6);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,6);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,6);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,6);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,6);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,6);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,6);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,6);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,6);
            }
            if(kW1flag==1){
                knight(kW1,3,6);
            }
            if(kW2flag==1){
                knight(kW2,3,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,6);
            }
            if(qWflag==1){
                queenmotion(qW,3,6);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,6);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,6);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,6);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,6);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,6);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,6);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,6);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,6);
            }
            unselect();
        }
    };
    View.OnClickListener b4_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,4,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,6);
            }
            if(kB1flag==1){
                knight(kB1,4,6);
            }
            if(kB2flag==1){
                knight(kB2,4,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,6);
            }
            if(qBflag==1){
                queenmotion(qB,4,6);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,6);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,6);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,6);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,6);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,6);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,6);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,6);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,6);
            }
            if(kW1flag==1){
                knight(kW1,4,6);
            }
            if(kW2flag==1){
                knight(kW2,4,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,6);
            }
            if(qWflag==1){
                queenmotion(qW,4,6);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,6);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,6);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,6);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,6);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,6);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,6);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,6);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,6);
            }
            unselect();
        }
    };
    View.OnClickListener b5_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,5,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,6);
            }
            if(kB1flag==1){
                knight(kB1,5,6);
            }
            if(kB2flag==1){
                knight(kB2,5,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,6);
            }
            if(qBflag==1){
                queenmotion(qB,5,6);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,6);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,6);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,6);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,6);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,6);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,6);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,6);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,6);
            }
            if(kW1flag==1){
                knight(kW1,5,6);
            }
            if(kW2flag==1){
                knight(kW2,5,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,6);
            }
            if(qWflag==1){
                queenmotion(qW,5,6);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,6);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,6);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,6);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,6);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,6);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,6);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,6);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,6);
            }
            unselect();
        }
    };
    View.OnClickListener b6_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,6,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,6);
            }
            if(kB1flag==1){
                knight(kB1,6,6);
            }
            if(kB2flag==1){
                knight(kB2,6,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,6);
            }
            if(qBflag==1){
                queenmotion(qB,6,6);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,6);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,6);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,6);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,6);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,6);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,6);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,6);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,6);
            }
            if(kW1flag==1){
                knight(kW1,6,6);
            }
            if(kW2flag==1){
                knight(kW2,6,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,6);
            }
            if(qWflag==1){
                queenmotion(qW,6,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,6);
            }
            unselect();
        }
    };
    View.OnClickListener b7_6handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,6);
            }
            if(rB2flag==1) {
                rookMotion(rB2,7,6);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,6);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,6);
            }
            if(kB1flag==1){
                knight(kB1,7,6);
            }
            if(kB2flag==1){
                knight(kB2,7,6);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,6);
            }
            if(qBflag==1){
                queenmotion(qB,7,6);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,6);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,6);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,6);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,6);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,6);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,6);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,6);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,6);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,6);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,6);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,6);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,6);
            }
            if(kW1flag==1){
                knight(kW1,7,6);
            }
            if(kW2flag==1){
                knight(kW2,7,6);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,6);
            }
            if(qWflag==1){
                queenmotion(qW,7,6);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,6);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,6);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,6);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,6);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,6);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,6);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,6);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,6);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,6);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,6);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,6);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,6);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,6);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,6);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,6);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,6);
            }
            unselect();
        }
    };

    View.OnClickListener b0_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,0,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,0,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,0,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,0,7);
            }
            if(kB1flag==1){
                knight(kB1,0,7);
            }
            if(kB2flag==1){
                knight(kB2,0,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,0,7);
            }
            if(qBflag==1){
                queenmotion(qB,0,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,0,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,0,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,0,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,0,7);
            }
            if(kW1flag==1){
                knight(kW1,0,7);
            }
            if(kW2flag==1){
                knight(kW2,0,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,0,7);
            }
            if(qWflag==1){
                queenmotion(qW,0,7);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,0,7);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,0,7);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,0,7);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,0,7);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,0,7);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,0,7);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,0,7);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,0,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,0,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,0,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,0,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,0,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,0,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,0,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,0,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,0,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,0,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,0,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,0,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,0,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,0,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,0,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,0,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,0,7);
            }
            unselect();
        }
    };
    View.OnClickListener b1_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,1,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,1,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,1,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,1,7);
            }
            if(kB1flag==1){
                knight(kB1,1,7);
            }
            if(kB2flag==1){
                knight(kB2,1,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,1,7);
            }
            if(qBflag==1){
                queenmotion(qB,1,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,1,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,1,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,1,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,1,7);
            }
            if(kW1flag==1){
                knight(kW1,1,7);
            }
            if(kW2flag==1){
                knight(kW2,1,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,1,7);
            }
            if(qWflag==1){
                queenmotion(qW,1,7);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,1,7);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,1,7);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,1,7);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,1,7);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,1,7);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,1,7);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,1,7);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,1,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,1,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,1,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,1,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,1,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,1,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,1,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,1,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,1,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,1,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,1,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,1,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,1,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,1,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,1,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,1,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,1,7);
            }
            unselect();
        }
    };
    View.OnClickListener b2_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,2,7);
            }

            if(rB2flag==1) {
                rookMotion(rB2,2,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,2,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,2,7);
            }
            if(kB1flag==1){
                knight(kB1,2,7);
            }
            if(kB2flag==1){
                knight(kB2,2,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,2,7);
            }
            if(qBflag==1){
                queenmotion(qB,2,7);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,2,7);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,2,7);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,2,7);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,2,7);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,2,7);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,2,7);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,2,7);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,2,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,2,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,2,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,2,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,2,7);
            }
            if(kW1flag==1){
                knight(kW1,2,7);
            }
            if(kW2flag==1){
                knight(kW2,2,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,2,7);
            }
            if(qWflag==1){
                queenmotion(qW,2,7);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,2,7);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,2,7);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,2,7);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,2,7);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,2,7);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,2,7);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,2,7);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,2,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,2,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,2,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,2,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,2,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,2,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,2,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,2,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,2,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,2,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,2,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,2,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,2,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,2,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,2,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,2,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,2,7);
            }
            unselect();
        }
    };
    View.OnClickListener b3_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,3,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,3,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,3,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,3,7);
            }
            if(kB1flag==1){
                knight(kB1,3,7);
            }
            if(kB2flag==1){
                knight(kB2,3,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,3,7);
            }
            if(qBflag==1){
                queenmotion(qB,3,7);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,3,7);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,3,7);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,3,7);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,3,7);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,3,7);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,3,7);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,3,7);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,3,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,3,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,3,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,3,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,3,7);
            }
            if(kW1flag==1){
                knight(kW1,3,7);
            }
            if(kW2flag==1){
                knight(kW2,3,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,3,7);
            }
            if(qWflag==1){
                queenmotion(qW,3,7);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,3,7);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,3,7);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,3,7);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,3,7);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,3,7);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,3,7);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,3,7);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,3,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,3,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,3,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,3,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,3,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,3,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,3,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,3,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,3,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,3,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,3,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,3,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,3,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,3,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,3,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,3,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,3,7);
            }
            unselect();
        }
    };
    View.OnClickListener b4_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,4,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,4,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,4,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,4,7);
            }
            if(kB1flag==1){
                knight(kB1,4,7);
            }
            if(kB2flag==1){
                knight(kB2,4,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,4,7);
            }
            if(qBflag==1){
                queenmotion(qB,4,7);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,4,7);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,4,7);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,4,7);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,4,7);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,4,7);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,4,7);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,4,7);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,4,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,4,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,4,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,4,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,4,7);
            }
            if(kW1flag==1){
                knight(kW1,4,7);
            }
            if(kW2flag==1){
                knight(kW2,4,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,4,7);
            }
            if(qWflag==1){
                queenmotion(qW,4,7);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,4,7);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,4,7);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,4,7);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,4,7);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,4,7);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,4,7);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,4,7);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,4,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,4,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,4,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,4,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,4,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,4,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,4,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,4,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,4,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,4,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,4,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,4,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,4,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,4,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,4,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,4,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,4,7);
            }
            unselect();
        }
    };
    View.OnClickListener b5_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,5,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,5,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,5,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,5,7);
            }
            if(kB1flag==1){
                knight(kB1,5,7);
            }
            if(kB2flag==1){
                knight(kB2,5,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,5,7);
            }
            if(qBflag==1){
                queenmotion(qB,5,7);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,5,7);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,5,7);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,5,7);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,5,7);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,5,7);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,5,7);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,5,7);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,5,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,5,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,5,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,5,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,5,7);
            }
            if(kW1flag==1){
                knight(kW1,5,7);
            }
            if(kW2flag==1){
                knight(kW2,5,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,5,7);
            }
            if(qWflag==1){
                queenmotion(qW,5,7);
            }
            if(pW1flag==1){
                whitepawnmotion(pW1,5,7);
            }
            if(pW2flag==1){
                whitepawnmotion(pW2,5,7);
            }
            if(pW3flag==1){
                whitepawnmotion(pW3,5,7);
            }
            if(pW4flag==1){
                whitepawnmotion(pW4,5,7);
            }
            if(pW5flag==1){
                whitepawnmotion(pW5,5,7);
            }
            if(pW6flag==1){
                whitepawnmotion(pW6,5,7);
            }
            if(pW7flag==1){
                whitepawnmotion(pW7,5,7);
            }
            if(pW8flag==1){
                whitepawnmotion(pW8,5,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,5,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,5,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,5,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,5,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,5,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,5,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,5,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,5,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,5,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,5,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,5,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,5,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,5,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,5,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,5,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,5,7);
            }
            unselect();
        }
    };
    View.OnClickListener b6_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,6,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,6,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,6,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,6,7);
            }
            if(kB1flag==1){
                knight(kB1,6,7);
            }
            if(kB2flag==1){
                knight(kB2,6,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,6,7);
            }
            if(qBflag==1){
                queenmotion(qB,6,7);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,6,7);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,6,7);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,6,7);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,6,7);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,6,7);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,6,7);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,6,7);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,6,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,6,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,6,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,6,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,6,7);
            }
            if(kW1flag==1){
                knight(kW1,6,7);
            }
            if(kW2flag==1){
                knight(kW2,6,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,6,7);
            }
            if(qWflag==1){
                queenmotion(qW,6,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,6,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,6,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,6,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,6,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,6,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,6,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,6,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,6,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,6,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,6,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,6,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,6,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,6,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,6,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,6,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,6,7);
            }
            unselect();
        }
    };
    View.OnClickListener b7_7handler = new View.OnClickListener() {
        public void onClick(View v) {
            if(rB1flag==1)
            {
                rookMotion(rB1,7,7);
            }
            if(rB2flag==1) {
                rookMotion(rB2,7,7);
            }
            if(bB1flag==1){
                bishopmotion(bB1,7,7);
            }
            if(bB2flag==1){
                bishopmotion(bB2,7,7);
            }
            if(kB1flag==1){
                knight(kB1,7,7);
            }
            if(kB2flag==1){
                knight(kB2,7,7);
            }
            if(kingBflag==1){
                kingmotion(kingB,7,7);
            }
            if(qBflag==1){
                queenmotion(qB,7,7);
            }
            if(pB1flag==1)
            {
                pawnmotion(pB1,7,7);
            }
            if(pB2flag==1)
            {
                pawnmotion(pB2,7,7);
            }
            if(pB3flag==1)
            {
                pawnmotion(pB3,7,7);
            }
            if(pB4flag==1)
            {
                pawnmotion(pB4,7,7);
            }
            if(pB5flag==1)
            {
                pawnmotion(pB5,7,7);
            }
            if(pB6flag==1)
            {
                pawnmotion(pB6,7,7);
            }
            if(pB7flag==1)
            {
                pawnmotion(pB7,7,7);
            }
            if(pB8flag==1)
            {
                pawnmotion(pB8,7,7);
            }
            if(rW1flag==1)
            {
                rookMotion(rW1,7,7);
            }
            if(rW2flag==1)
            {
                rookMotion(rW2,7,7);
            }
            if(bW1flag==1){
                bishopmotion(bW1,7,7);
            }
            if(bW2flag==1){
                bishopmotion(bW2,7,7);
            }
            if(kW1flag==1){
                knight(kW1,7,7);
            }
            if(kW2flag==1){
                knight(kW2,7,7);
            }
            if(kingWflag==1){
                kingmotion(kingW,7,7);
            }
            if(qWflag==1){
                queenmotion(qW,7,7);
            }
            if(pB1flag==3)
            {
                queenmotion(pB1,7,7);
            }
            if(pB2flag==3)
            {
                queenmotion(pB2,7,7);
            }
            if(pB3flag==3)
            {
                queenmotion(pB3,7,7);
            }
            if(pB4flag==3)
            {
                queenmotion(pB4,7,7);
            }
            if(pB5flag==3)
            {
                queenmotion(pB5,7,7);
            }
            if(pB6flag==3)
            {
                queenmotion(pB6,7,7);
            }
            if(pB7flag==3)
            {
                queenmotion(pB7,7,7);
            }
            if(pB8flag==3)
            {
                queenmotion(pB8,7,7);
            }
            if(pW1flag==3)
            {
                queenmotion(pW1,7,7);
            }
            if(pW2flag==3)
            {
                queenmotion(pW2,7,7);
            }
            if(pW3flag==3)
            {
                queenmotion(pW3,7,7);
            }
            if(pW4flag==3)
            {
                queenmotion(pW4,7,7);
            }
            if(pW5flag==3)
            {
                queenmotion(pW5,7,7);
            }
            if(pW6flag==3)
            {
                queenmotion(pW6,7,7);
            }
            if(pW7flag==3)
            {
                queenmotion(pW7,7,7);
            }
            if(pW8flag==3)
            {
                queenmotion(pW8,7,7);
            }
            unselect();
        }
    };

    //function for unselecting every piece
    //0 and 4 for unselected piece
    int unselect()
    {
        System.out.println("call to unselect");
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) pB1.getLayoutParams();
        dead=0;
        if(rB1flag==1) {
            params = (RelativeLayout.LayoutParams) rB1.getLayoutParams();
            params.leftMargin-=17;
            rB1.setLayoutParams(params);
            rB1flag = 0;
        }
        if(rB2flag==1) {
            params = (RelativeLayout.LayoutParams) rB2.getLayoutParams();
            params.leftMargin-=17;
            rB2.setLayoutParams(params);
            rB2flag = 0;
        }
        if(kB1flag==1) {
            params = (RelativeLayout.LayoutParams) kB1.getLayoutParams();
            params.leftMargin-=17;
            kB1.setLayoutParams(params);
            kB1flag = 0;
        }
        if(kB2flag==1) {
            params = (RelativeLayout.LayoutParams) kB2.getLayoutParams();
            params.leftMargin-=17;
            kB2.setLayoutParams(params);
            kB2flag = 0;
        }
        if(bB1flag==1) {
            params = (RelativeLayout.LayoutParams) bB1.getLayoutParams();
            params.leftMargin-=17;
            bB1.setLayoutParams(params);
            bB1flag = 0;
        }
        if(bB2flag==1) {
            params = (RelativeLayout.LayoutParams) bB2.getLayoutParams();
            params.leftMargin-=17;
            bB2.setLayoutParams(params);
            bB2flag = 0;
        }
        if(kingBflag==1) {
            params = (RelativeLayout.LayoutParams) kingB.getLayoutParams();
            params.leftMargin-=17;
            kingB.setLayoutParams(params);
            kingBflag = 0;
        }
        if(qBflag==1) {
            params = (RelativeLayout.LayoutParams) qB.getLayoutParams();
            params.leftMargin-=17;
            qB.setLayoutParams(params);
            qBflag = 0;
        }
        if(rW1flag==1) {
            params = (RelativeLayout.LayoutParams) rW1.getLayoutParams();
            params.leftMargin-=17;
            rW1.setLayoutParams(params);
            rW1flag = 0;
        }
        if(rW2flag==1) {
            params = (RelativeLayout.LayoutParams) rW2.getLayoutParams();
            params.leftMargin-=17;
            rW2.setLayoutParams(params);
            rW2flag = 0;
        }
        if(kW1flag==1) {
            params = (RelativeLayout.LayoutParams) kW1.getLayoutParams();
            params.leftMargin-=17;
            kW1.setLayoutParams(params);
            kW1flag = 0;
        }
        if(kW2flag==1) {
            params = (RelativeLayout.LayoutParams) kW2.getLayoutParams();
            params.leftMargin-=17;
            kW2.setLayoutParams(params);
            kW2flag = 0;
        }
        if(bW1flag==1) {
            params = (RelativeLayout.LayoutParams) bW1.getLayoutParams();
            params.leftMargin-=17;
            bW1.setLayoutParams(params);
            bW1flag = 0;
        }
        if(bW2flag==1) {
            params = (RelativeLayout.LayoutParams) bW2.getLayoutParams();
            params.leftMargin-=17;
            bW2.setLayoutParams(params);
            bW2flag = 0;
        }
        if(kingWflag==1) {
            params = (RelativeLayout.LayoutParams) kingW.getLayoutParams();
            params.leftMargin-=17;
            kingW.setLayoutParams(params);
            kingWflag = 0;
        }
        if(qWflag==1) {
            params = (RelativeLayout.LayoutParams) qW.getLayoutParams();
            params.leftMargin-=17;
            qW.setLayoutParams(params);
            qWflag = 0;
        }
        if(pB1flag==1) {
            params = (RelativeLayout.LayoutParams) rB1.getLayoutParams();
            params.leftMargin-=17;
            pB1.setLayoutParams(params);
            pB1flag = 0;
        }
        else if(pB1flag==3){
            params.leftMargin-=17;
            pB1.setLayoutParams(params);
            pB1flag = 4;
        }
        if(pB2flag==1) {
            params = (RelativeLayout.LayoutParams) pB2.getLayoutParams();
            params.leftMargin-=17;
            pB2.setLayoutParams(params);
            pB2flag = 0;
        }
        else if(pB2flag==3){
            params = (RelativeLayout.LayoutParams) pB2.getLayoutParams();
            params.leftMargin-=17;
            pB2.setLayoutParams(params);
            pB2flag = 4;
        }
        if(pB3flag==1) {
            params = (RelativeLayout.LayoutParams) pB3.getLayoutParams();
            params.leftMargin-=17;
            pB3.setLayoutParams(params);
            pB3flag = 0;
        }
        else if(pB3flag==3){
            params = (RelativeLayout.LayoutParams) pB3.getLayoutParams();
            params.leftMargin-=17;
            pB3.setLayoutParams(params);
            pB3flag = 4;
        }
        if(pB4flag==1) {
            params = (RelativeLayout.LayoutParams) pB4.getLayoutParams();
            params.leftMargin-=17;
            pB4.setLayoutParams(params);
            pB4flag = 0;
        }
        else if(pB4flag==3){
            params = (RelativeLayout.LayoutParams) pB4.getLayoutParams();
            params.leftMargin-=17;
            pB4.setLayoutParams(params);
            pB4flag = 4;
        }
        if(pB5flag==1) {
            params = (RelativeLayout.LayoutParams) pB5.getLayoutParams();
            params.leftMargin-=17;
            pB5.setLayoutParams(params);
            pB5flag = 0;
        }
        else if(pB5flag==3){
            params = (RelativeLayout.LayoutParams) pB5.getLayoutParams();
            params.leftMargin-=17;
            pB5.setLayoutParams(params);
            pB5flag = 4;
        }
        if(pB6flag==1) {
            params = (RelativeLayout.LayoutParams) pB6.getLayoutParams();
            params.leftMargin-=17;
            pB6.setLayoutParams(params);
            pB6flag = 0;
        }
        else if(pB6flag==3){
            params = (RelativeLayout.LayoutParams) pB6.getLayoutParams();
            params.leftMargin-=17;
            pB6.setLayoutParams(params);
            pB6flag = 4;
        }
        if(pB7flag==1) {
            params = (RelativeLayout.LayoutParams) pB7.getLayoutParams();
            params.leftMargin-=17;
            pB7.setLayoutParams(params);
            pB7flag = 0;
        }
        else if(pB7flag==3){
            params = (RelativeLayout.LayoutParams) pB7.getLayoutParams();
            params.leftMargin-=17;
            pB7.setLayoutParams(params);
            pB7flag = 4;
        }
        if(pB8flag==1) {
            params = (RelativeLayout.LayoutParams) pB8.getLayoutParams();
            params.leftMargin-=17;
            pB8.setLayoutParams(params);
            pB8flag = 0;
        }
        else if(pB8flag==3){
            params = (RelativeLayout.LayoutParams) pB8.getLayoutParams();
            params.leftMargin-=17;
            pB8.setLayoutParams(params);
            pB8flag = 4;
        }
        if(pW1flag==1) {
            params = (RelativeLayout.LayoutParams) pW1.getLayoutParams();
            params.leftMargin-=17;
            pW1.setLayoutParams(params);
            pW1flag = 0;
        }
        else if(pW1flag==3){
            params = (RelativeLayout.LayoutParams) pW1.getLayoutParams();
            params.leftMargin-=17;
            pW1.setLayoutParams(params);
            pW1flag = 4;
        }
        if(pW2flag==1) {
            params = (RelativeLayout.LayoutParams) pW2.getLayoutParams();
            params.leftMargin-=17;
            pW2.setLayoutParams(params);
            pW2flag = 0;
        }
        else if(pW2flag==3){
            params = (RelativeLayout.LayoutParams) pW2.getLayoutParams();
            params.leftMargin-=17;
            pW2.setLayoutParams(params);
            pW2flag = 4;
        }
        if(pW3flag==1) {
            params = (RelativeLayout.LayoutParams) pW3.getLayoutParams();
            params.leftMargin-=17;
            pW3.setLayoutParams(params);
            pW3flag = 0;
        }
        else if(pW3flag==3){
            params = (RelativeLayout.LayoutParams) pW3.getLayoutParams();
            params.leftMargin-=17;
            pW3.setLayoutParams(params);
            pW3flag = 4;
        }
        if(pW4flag==1) {
            params = (RelativeLayout.LayoutParams) pW4.getLayoutParams();
            params.leftMargin-=17;
            pW4.setLayoutParams(params);
            pW4flag = 0;
        }
        else if(pW4flag==3){
            params = (RelativeLayout.LayoutParams) pW4.getLayoutParams();
            params.leftMargin-=17;
            pW4.setLayoutParams(params);
            pW4flag = 4;
        }
        if(pW5flag==1) {
            params = (RelativeLayout.LayoutParams) pW5.getLayoutParams();
            params.leftMargin-=17;
            pW5.setLayoutParams(params);
            pW5flag = 0;
        }
        else if(pW5flag==3){
            params = (RelativeLayout.LayoutParams) pW5.getLayoutParams();
            params.leftMargin-=17;
            pW5.setLayoutParams(params);
            pW5flag = 4;
        }
        if(pW6flag==1) {
            params = (RelativeLayout.LayoutParams) pW6.getLayoutParams();
            params.leftMargin-=17;
            pW6.setLayoutParams(params);
            pW6flag = 0;
        }
        else if(pW6flag==3){
            params = (RelativeLayout.LayoutParams) pW6.getLayoutParams();
            params.leftMargin-=17;
            pW6.setLayoutParams(params);
            pW6flag = 4;
        }
        if(pW7flag==1) {
            params = (RelativeLayout.LayoutParams) pW7.getLayoutParams();
            params.leftMargin-=17;
            pW7.setLayoutParams(params);
            pW7flag = 0;
        }
        else if(pW7flag==3){
            params = (RelativeLayout.LayoutParams) pW7.getLayoutParams();
            params.leftMargin-=17;
            pW7.setLayoutParams(params);
            pW7flag = 4;
        }
        if(pW8flag==1) {
            params = (RelativeLayout.LayoutParams) pW8.getLayoutParams();
            params.leftMargin-=17;
            pW8.setLayoutParams(params);
            pW8flag = 0;
        }
        else if(pW8flag==3){
            params = (RelativeLayout.LayoutParams) pW8.getLayoutParams();
            params.leftMargin-=17;
            pW8.setLayoutParams(params);
            pW8flag = 4;
        }
        return 1;
    }

    //function for setting values and moving image
    int moveImage(ImageView x,int row,int column,int rowbutton,int columnbutton)
    {
        if(x==pB1){
            if(rowbutton==7){
                pB1.setImageResource(R.drawable.queen_black);
                pB1flag=4;
             }
        }
        if(x==pB2){
            if(rowbutton==7){
                pB2.setImageResource(R.drawable.queen_black);
                pB2flag=4;
            }
        }
        if(x==pB3){
            if(rowbutton==7){
                pB3.setImageResource(R.drawable.queen_black);
                pB3flag=4;
            }
        }
        if(x==pB4){
            if(rowbutton==7){
                pB4.setImageResource(R.drawable.queen_black);
                pB4flag=4;
            }
        }
        if(x==pB5){
            if(rowbutton==7){
                pB5.setImageResource(R.drawable.queen_black);
                pB5flag=4;
            }
        }
        if(x==pB6){
            if(rowbutton==7){
                pB6.setImageResource(R.drawable.queen_black);
                pB6flag=4;
            }
        }
        if(x==pB7){
            if(rowbutton==7){
                pB7.setImageResource(R.drawable.queen_black);
                pB7flag=4;
            }
        }
        if(x==pB8){
            if(rowbutton==7){
                pB8.setImageResource(R.drawable.queen_black);
                pB8flag=4;
            }
        }
        if(x==pW1){
            if(rowbutton==0){
                pW1.setImageResource(R.drawable.queen_white);
                pW1flag=4;
            }
        }
        if(x==pW2){
            if(rowbutton==0){
                pW2.setImageResource(R.drawable.queen_white);
                pW2flag=4;
            }
        }
        if(x==pW3){
            if(rowbutton==0){
                pW3.setImageResource(R.drawable.queen_white);
                pW3flag=4;
            }
        }
        if(x==pW4){
            if(rowbutton==0){
                pW4.setImageResource(R.drawable.queen_white);
                pW4flag=4;
            }
        }
        if(x==pW5){
            if(rowbutton==0){
                pW5.setImageResource(R.drawable.queen_white);
                pW5flag=4;
            }
        }
        if(x==pW6){
            if(rowbutton==0){
                pW6.setImageResource(R.drawable.queen_white);
                pW6flag=4;
            }
        }
        if(x==pW7){
            if(rowbutton==0){
                pW7.setImageResource(R.drawable.queen_white);
                pW7flag=4;
            }
        }
        if(x==pW8){
            if(rowbutton==0){
                pW8.setImageResource(R.drawable.queen_white);
                pW8flag=4;
            }
        }
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        params1.topMargin=rowbutton*120+pa;
        params1.leftMargin = columnbutton*120+pa+pa;
        isImage[row][column] = 0;
        isImage[rowbutton][columnbutton] = 1;
        x.setLayoutParams(params1);
        if(player==1){
            player=2;
        }
        else{
            player=1;
        }
        return 1;
    }
    //function for black pawn motion
    int pawnmotion(ImageView x,int rowbutton,int columnbutton)
    {
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params1.topMargin/120;
        column = params1.leftMargin/120;
        if(row == 1) {
            if ((rowbutton > row) && (rowbutton < row+3) && (column == columnbutton)){
                if (isImage[row + 1][column] == 0) {
                    moveImage(x, row, column, rowbutton, columnbutton);
                    return 1;
                }
            }
        }
        else{
            if(rowbutton== row+1 && columnbutton== column){
                moveImage(x, row, column, rowbutton, columnbutton);
                return 1;
            }
        }
        return 0;
    }

    //function for cross motion of black pawn
    int blackpawncrossmotion(ImageView x, int rowbutton, int columnbutton){
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params.topMargin/120;
        column = params.leftMargin/120;
        if((rowbutton== row+1)&&(column==columnbutton+1 || column==columnbutton-1))
        {
            moveImage(x,row,column,rowbutton,columnbutton);
            return 1;
        }
        return 0;
    }

    //function for white pawn motion
    int whitepawnmotion(ImageView x,int rowbutton,int columnbutton)
    {
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params1.topMargin/120;
        column = params1.leftMargin/120;
        if(row == 6) {
            if ((rowbutton < row) && (rowbutton > row-3) && (column == columnbutton)){
                if (isImage[row - 1][column] == 0) {
                    moveImage(x, row, column, rowbutton, columnbutton);
                    return 1;
                }
            }
        }
        else{
            if(rowbutton== row-1 && columnbutton== column){
                moveImage(x, row, column, rowbutton, columnbutton);
                return 1;
            }
        }
        return 0;
    }

    //function for cross motion of white pawn
    int whitepawncrossmotion(ImageView x, int rowbutton, int columnbutton){
        RelativeLayout.LayoutParams params = params = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params.topMargin/120;
        column = params.leftMargin/120;
        if((rowbutton== row-1)&&(column==columnbutton+1 || column==columnbutton-1))
        {
            moveImage(x,row,column,rowbutton,columnbutton);
            return 1;
        }
        return 0;
    }
    //function for rook motion
    int rookMotion(ImageView x,int rowbutton,int columnbutton){
        int temp;
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params1.topMargin/120;
        column = params1.leftMargin/120;
        if((row==rowbutton)) {
                if((column>columnbutton)) {
                    for (temp = column - 1; temp > columnbutton; temp--) {
                        if (isImage[row][temp]!= 0) {
                         break;
                        }
                    }
                    if(temp==columnbutton) {
                        moveImage(x, row, column, rowbutton, columnbutton);
                        return 1;
                    }
                }
                else if((column<columnbutton)){
                    for (temp = column + 1; temp < columnbutton; temp++) {
                        if (isImage[row][temp] != 0) {
                            break;
                        }
                    }
                    if(temp==columnbutton) {
                        moveImage(x, row, column, rowbutton, columnbutton);
                        return 1;
                    }
                }
            }
            else if((column==columnbutton)) {
                if((row>rowbutton)) {
                    for (temp = row - 1; temp > rowbutton; temp--) {
                        if (isImage[temp][column] != 0) {
                            break;
                        }
                    }if(temp==rowbutton) {
                        moveImage(x, row, column, rowbutton, columnbutton);
                        return 1;
                    }
                }
                else if((row<rowbutton)){
                    for (temp = row + 1; temp < rowbutton; temp++) {
                        if (isImage[temp][column] != 0) {
                            break;
                        }
                    }
                    if(temp==rowbutton) {
                        moveImage(x, row, column, rowbutton, columnbutton);
                        return 1;
                    }
                }
            }
        return 0;
    }
    int bishopmotion(ImageView x, int rowbutton, int columnbutton){
        int diff,temp;
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params1.topMargin/120;
        column = params1.leftMargin/120;
        diff=row-rowbutton;
        if(columnbutton==column+diff) {
            if(column<columnbutton) {
                for (temp = 1; row-temp > rowbutton; temp++) {
                    if (isImage[row - temp][column + temp] != 0) {
                        break;
                    }
                }
                if(row-temp==rowbutton) {
                    moveImage(x, row, column, rowbutton, columnbutton);
                    return 1;
                }
            }
            else{
                for (temp = 1; row+temp < rowbutton; temp++) {
                    if (isImage[row + temp][column - temp] != 0) {
                        break;
                    }
                }
                if(row+temp==rowbutton) {
                    moveImage(x, row, column, rowbutton, columnbutton);
                    return 1;
                }
            }
        }
        else if(columnbutton==column-diff){
            if(column>columnbutton) {
                for (temp = 1; row-temp > rowbutton; temp++) {
                    if (isImage[row - temp][column - temp] != 0) {
                        break;
                    }
                }
                if(row-temp==rowbutton) {
                    moveImage(x, row, column, rowbutton, columnbutton);
                    return 1;
                }
            }
            else{
                for (temp = 1; row+temp < rowbutton; temp++) {
                    if (isImage[row + temp][column + temp] != 0) {
                        break;
                    }
                }
                if(row+temp==rowbutton) {
                    moveImage(x, row, column, rowbutton, columnbutton);
                    return 1;
                }
            }
        }
        return 0;
    }
    int knight(ImageView x, int rowbutton, int columnbutton){
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params1.topMargin/120;
        column = params1.leftMargin/120;
        if(row==rowbutton+2 && column==columnbutton+1){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton-2 && column==columnbutton-1){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton+2 && column==columnbutton-1){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton-2 && column==columnbutton+1){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton+1 && column==columnbutton-2){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton-1 && column==columnbutton+2){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton-1 && column==columnbutton-2){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        else if(row==rowbutton+1 && column==columnbutton+2){
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        return 0;
    }
    int kingmotion(ImageView x,int rowbutton,int columnbutton){
        int diffr,diffc;
        RelativeLayout.LayoutParams params1 = (RelativeLayout.LayoutParams) x.getLayoutParams();
        row = params1.topMargin/120;
        column = params1.leftMargin/120;
        diffr=row-rowbutton;
        diffc=column-columnbutton;
        if((diffr==-1 || diffr==0 || diffr==1) && (diffc==-1 || diffc==0 || diffc==1)) {
            moveImage(x, row, column, rowbutton, columnbutton);
            return 1;
        }
        return 0;
    }
    int queenmotion(ImageView x,int rowbutton,int columnbutton){
        int temp = rookMotion(x,rowbutton,columnbutton);
        if(temp==0){
            temp=bishopmotion(x,rowbutton,columnbutton);
        }
        if(temp==1)
            return 1;
        return 0;
    }
    int kill(ImageView x){
        if(x==kingW){
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Restart the game").setTitle("player 2 won");
            builder.setPositiveButton(R.string.restart, new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog,int id){
                    restart();
                }
            });
            AlertDialog dialog= builder.create();
            dialog.show();
        }
        if(x==kingB){
            AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Restart the game?").setTitle("player 1 won");
            builder.setPositiveButton(R.string.restart, new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface dialog,int id){
                    restart();
                }
            });
            AlertDialog dialog= builder.create();
            dialog.show();
        }
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) x.getLayoutParams();
        params.topMargin=countrow*120;
        params.leftMargin =countcolumn*120;
        x.setLayoutParams(params);
        countcolumn++;
        if(countcolumn==9){
            countcolumn=0;
            countrow++;
        }
        if(x==pB1){
            pB1flag=2;
        }
        if(x==pB2){
            pB2flag=2;
        }
        if(x==pB3){
            pB3flag=2;
        }
        if(x==pB4){
            pB4flag=2;
        }
        if(x==pB5){
            pB5flag=2;
        }
        if(x==pB6){
            pB6flag=2;
        }
        if(x==pB7){
            pB7flag=2;
        }
        if(x==pB8){
            pB8flag=2;
        }
        if(x==pW1){
            pW1flag=2;
        }
        if(x==pW2){
            pW2flag=2;
        }
        if(x==pW3){
            pW3flag=2;
        }
        if(x==pW4){
            pW4flag=2;
        }
        if(x==pW5){
            pW5flag=2;
        }
        if(x==pW6){
            pW6flag=2;
        }
        if(x==pW7){
            pW7flag=2;
        }
        if(x==pW8){
            pW8flag=2;
        }
        if(x==rB1){
            rB1flag=2;
        }
        if(x==rB2){
            rB2flag=2;
        }
        if(x==kB1){
            kB1flag=2;
        }
        if(x==kB2){
            kB2flag=2;
        }
        if(x==bB1){
            bB1flag=2;
        }
        if(x==bB2){
            bB2flag=2;
        }
        if(x==qB){
            qBflag=2;
        }
        if(x==rW1){
            rW1flag=2;
        }
        if(x==rW2){
            rW2flag=2;
        }
        if(x==kW1){
            kW1flag=2;
        }
        if(x==kW2){
            kW2flag=2;
        }
        if(x==bW1){
            bW1flag=2;
        }
        if(x==bW2){
            bW2flag=2;
        }
        if(x==qW){
            qWflag=2;
        }
        return 1;
    }
    int restart(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return 0;
    }
}

