package com.hackaton.orar_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrgOrarDisplay extends Activity {

    private DBHelper mydb;

    TextView day ;
    TextView hour;
    TextView prof;
    TextView schoolclass;
    TextView subject;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_orgorar);

        mydb = new DBHelper(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_orar, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id){
            case R.id.menu_edit_orar_item:
                Button b = (Button)findViewById(R.id.save_button);
                b.setVisibility(View.VISIBLE);

                day.setEnabled(true);
                day.setFocusableInTouchMode(true);
                day.setClickable(true);


            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void run(View view){
        for(int i = 0; i < 7; i++){
            switch (i){
                case 0:
                    day = findViewById(R.id.textview1);
                    for(int j = 0; j < 7; j++){
                        switch (j){
                            case 0:
                                schoolclass = findViewById(R.id.editText);
                                break;
                            case 1:
                                schoolclass = findViewById(R.id.editText2);
                                break;
                            case 2:
                                schoolclass = findViewById(R.id.editText3);
                                break;
                            case 3:
                                schoolclass = findViewById(R.id.editText4);
                                break;
                            case 4:
                                schoolclass = findViewById(R.id.editText5);
                                break;
                            case 5:
                                schoolclass = findViewById(R.id.editText6);
                                break;
                            case 6:
                                schoolclass = findViewById(R.id.editText7);
                                break;
                        }

                        mydb.insertOrar(day.getText().toString(), 7+j + ":30", "N/A", schoolclass.getText().toString(), "N/A" );
                    }
                    break;

                case 1:
                    day = findViewById(R.id.textview2);
                    for(int j = 0; j < 7; j++){
                        switch (j){
                            case 0:
                                schoolclass = findViewById(R.id.editText12);
                                break;
                            case 1:
                                schoolclass = findViewById(R.id.editText22);
                                break;
                            case 2:
                                schoolclass = findViewById(R.id.editText32);
                                break;
                            case 3:
                                schoolclass = findViewById(R.id.editText42);
                                break;
                            case 4:
                                schoolclass = findViewById(R.id.editText52);
                                break;
                            case 5:
                                schoolclass = findViewById(R.id.editText62);
                                break;
                            case 6:
                                schoolclass = findViewById(R.id.editText72);
                                break;
                        }

                        mydb.insertOrar(day.getText().toString(), 7+j + ":30", "N/A", schoolclass.getText().toString(), "N/A" );
                    }
                    break;

                case 2:
                    day = findViewById(R.id.textview3);
                    for(int j = 0; j < 7; j++){
                        switch (j){
                            case 0:
                                schoolclass = findViewById(R.id.editText13);
                                break;
                            case 1:
                                schoolclass = findViewById(R.id.editText23);
                                break;
                            case 2:
                                schoolclass = findViewById(R.id.editText33);
                                break;
                            case 3:
                                schoolclass = findViewById(R.id.editText43);
                                break;
                            case 4:
                                schoolclass = findViewById(R.id.editText53);
                                break;
                            case 5:
                                schoolclass = findViewById(R.id.editText63);
                                break;
                            case 6:
                                schoolclass = findViewById(R.id.editText73);
                                break;
                        }

                        mydb.insertOrar(day.getText().toString(), 7+j + ":30", "N/A", schoolclass.getText().toString(), "N/A" );
                    }
                    break;

                case 3:
                    day = findViewById(R.id.textview4);
                    for(int j = 0; j < 7; j++){
                        switch (j){
                            case 0:
                                schoolclass = findViewById(R.id.editText14);
                                break;
                            case 1:
                                schoolclass = findViewById(R.id.editText24);
                                break;
                            case 2:
                                schoolclass = findViewById(R.id.editText34);
                                break;
                            case 3:
                                schoolclass = findViewById(R.id.editText44);
                                break;
                            case 4:
                                schoolclass = findViewById(R.id.editText54);
                                break;
                            case 5:
                                schoolclass = findViewById(R.id.editText64);
                                break;
                            case 6:
                                schoolclass = findViewById(R.id.editText74);
                                break;
                        }

                        mydb.insertOrar(day.getText().toString(), 7+j + ":30", "N/A", schoolclass.getText().toString(), "N/A" );
                    }
                    break;

                case 4:
                    day = findViewById(R.id.textview5);
                    for(int j = 0; j < 7; j++){
                        switch (j){
                            case 0:
                                schoolclass = findViewById(R.id.editText15);
                                break;
                            case 1:
                                schoolclass = findViewById(R.id.editText25);
                                break;
                            case 2:
                                schoolclass = findViewById(R.id.editText35);
                                break;
                            case 3:
                                schoolclass = findViewById(R.id.editText45);
                                break;
                            case 4:
                                schoolclass = findViewById(R.id.editText55);
                                break;
                            case 5:
                                schoolclass = findViewById(R.id.editText65);
                                break;
                            case 6:
                                schoolclass = findViewById(R.id.editText75);
                                break;
                        }

                        mydb.insertOrar(day.getText().toString(), 7+j + ":30", "N/A", schoolclass.getText().toString(), "N/A" );
                    }
                    break;

                case 5:
                    break;

                case 6:
                    break;
            }
        }

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
