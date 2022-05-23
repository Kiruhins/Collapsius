package com.example.collapsius;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class SelectMode extends AppCompatActivity {

    private ImageButton bt_classic;
    private ImageButton bt_peklo;
    private ImageButton bt_editable;
    private ImageButton bt_5in1;
    private ImageButton bt_triangle;
    private ImageButton bt_back1;
    private ImageButton question;
    private ImageButton question2;
    private ImageButton question3;
    private ImageButton question4;
    private ImageButton question6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow();
        w.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        setContentView(R.layout.activity_select_mode);

        bt_classic=findViewById(R.id.bt_classic);
        bt_peklo=findViewById(R.id.bt_peklo);
        bt_editable=findViewById(R.id.bt_editable);
        bt_5in1=findViewById(R.id.bt_5in1);
        bt_triangle=findViewById(R.id.bt_triangle);
        bt_back1=findViewById(R.id.bt_back1);
        question=findViewById(R.id.question);
        question2=findViewById(R.id.question2);
        question3=findViewById(R.id.question3);
        question4=findViewById(R.id.question4);
        question6=findViewById(R.id.question6);

        Intent intent=getIntent();
        Integer Gametime=intent.getIntExtra("Gametime",0);
        Integer Roundtime=intent.getIntExtra("Roundtime",0);
        Integer Mountain=intent.getIntExtra("Mountain",0);
        Integer Infinity=intent.getIntExtra("Infinity",0);

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_5in1.setImageResource(R.drawable.animation2_2);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_5in1.setImageResource(R.drawable.animation2_3);
                    }
                }, 300);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_5in1.setImageResource(R.drawable.animation2_4);

                    }
                },600);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_5in1.setImageResource(R.drawable.animation2_5);
                    }
                },900);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_5in1.setImageResource(R.drawable.animation2_6);
                    }
                },1200);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_5in1.setImageResource(R.drawable.animation2_1);

                    }
                },1500);
            }
        });

        question2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_classic.setImageResource(R.drawable.animation2_2);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_classic.setImageResource(R.drawable.animation2_3);
                    }
                }, 300);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_classic.setImageResource(R.drawable.animation2_4);

                    }
                },600);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_classic.setImageResource(R.drawable.animation1_5);
                    }
                },900);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_classic.setImageResource(R.drawable.animation2_1);
                    }
                },1200);

            }
        });

        question3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_peklo.setImageResource(R.drawable.bg2);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_peklo.setImageResource(R.drawable.bg3);
                    }
                }, 300);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_peklo.setImageResource(R.drawable.bg4);
                    }
                },600);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_peklo.setImageResource(R.drawable.bg5);
                    }
                },900);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_peklo.setImageResource(R.drawable.bg1);
                    }
                },1200);
            }
        });

        question4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_triangle.setImageResource(R.drawable.animtrigon2);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_triangle.setImageResource(R.drawable.animtrigon3);
                    }
                }, 300);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_triangle.setImageResource(R.drawable.animtrigon4);
                    }
                },600);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_triangle.setImageResource(R.drawable.animtrigon1);
                    }
                },900);
            }
        });

        question6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_editable.setImageResource(R.drawable.animportal1);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animportal2);
                    }
                }, 400);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animwall1);
                    }
                },900);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animwall2);
                    }
                },1300);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animwall3);

                    }
                },1700);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animwall4);

                    }
                },2100);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animmountain1);

                    }
                },2600);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animmountain2);

                    }
                },3000);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animmountain3);

                    }
                },3400);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animmountain4);

                    }
                },3800);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animmountain5);

                    }
                },4200);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animescape1);

                    }
                },4700);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.animescape2);

                    }
                },5100);

                handler.postDelayed(new Runnable() {
                    public void run() {
                        bt_editable.setImageResource(R.drawable.hard);

                    }
                },5900);
            }


        });
        bt_triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                intent.putExtra("mode",5);

                startActivity(intent);
                bt_triangle.setImageResource(R.drawable.trigontk1);
            }
        });

        bt_peklo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                intent.putExtra("mode",2);

                startActivity(intent);
                bt_peklo.setImageResource(R.drawable.bgtk);
            }
        });

        bt_5in1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                intent.putExtra("mode",3);

                startActivity(intent);
                bt_5in1.setImageResource(R.drawable.animation2_6tk);
            }
        });

        bt_editable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                intent.putExtra("mode",4);
                intent.putExtra("Gametime", Gametime);
                intent.putExtra("Roundtime", Roundtime);
                intent.putExtra("Mountain", Mountain);
                intent.putExtra("Infinity", Infinity);
                bt_editable.setImageResource(R.drawable.takehard);
                startActivity(intent);
            }
        });

        bt_classic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,FieldConfiguration.class);
                intent.putExtra("mode",1);
                startActivity(intent);
                bt_classic.setImageResource(R.drawable.anipation1tk);
            }
        });

        bt_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SelectMode.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}