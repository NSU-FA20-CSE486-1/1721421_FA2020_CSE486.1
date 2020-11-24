/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import com.example.android.twoactivities.R;


public class MainActivity extends AppCompatActivity {
    public static final int ITEM_REQUEST = 1;
    private final TextView[] item = new TextView[10];
    private ArrayList<String> itemsList = new ArrayList<>(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item[0] = findViewById(R.id.item1);
        item[1] = findViewById(R.id.item2);
        item[2] = findViewById(R.id.item3);
        item[3] = findViewById(R.id.item4);
        item[4] = findViewById(R.id.item5);
        item[5] = findViewById(R.id.item6);
        item[6] = findViewById(R.id.item7);
        item[7] = findViewById(R.id.item8);
        item[8] = findViewById(R.id.item9);
        item[9] = findViewById(R.id.item10);

        if (savedInstanceState != null) {
            itemsList = savedInstanceState.getStringArrayList("ItemsListStringArray");
            int i;
            if (itemsList != null && itemsList.size() > 0) {
                for (i = 0; i < itemsList.size(); i++) {
                    if (itemsList.size() > 10) {
                        Toast.makeText(MainActivity.this, "No more items allowed :(", Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemsList.get(i));
                }
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (itemsList.size() != 0) {
            outState.putStringArrayList("ItemsListStringArray", itemsList);
        }
    }

    public void addItem(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, ITEM_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                String itemString = data.getStringExtra(SecondActivity.EXTRA_ITEMS);
                itemsList.add(itemString);
                int i;
                for (i = 0; i < itemsList.size(); i++) {
                    if (itemsList.size() > 10) {
                        Toast.makeText(MainActivity.this, "No more items allowed :(", Toast.LENGTH_LONG).show();
                        break;
                    }
                    item[i].setVisibility(View.VISIBLE);
                    item[i].setText(itemsList.get(i));
                }

            }
        }
    }
}
